//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.05.23 at 12:36:13 PM IDT 
//

package extensionTools.opl2.generated.impl.runtime;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.JAXBException;
import javax.xml.bind.MarshalException;
import javax.xml.bind.PropertyException;
import javax.xml.bind.helpers.AbstractMarshallerImpl;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.LocatorImpl;

import com.sun.xml.bind.DatatypeConverterImpl;
import com.sun.xml.bind.JAXBAssertionError;
import com.sun.xml.bind.marshaller.CharacterEscapeHandler;
import com.sun.xml.bind.marshaller.DataWriter;
import com.sun.xml.bind.marshaller.DumbEscapeHandler;
import com.sun.xml.bind.marshaller.Messages;
import com.sun.xml.bind.marshaller.MinimumEscapeHandler;
import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import com.sun.xml.bind.marshaller.NioEscapeHandler;
import com.sun.xml.bind.marshaller.SAX2DOMEx;
import com.sun.xml.bind.marshaller.SchemaLocationFilter;
import com.sun.xml.bind.marshaller.XMLWriter;

/**
 * Implementation of {@link Marshaller} interface for JAXB RI.
 * 
 * @author Kohsuke Kawaguchi
 * @author Vivek Pandey
 */
public class MarshallerImpl extends AbstractMarshallerImpl
{
    /** Indentation string. Default is four whitespaces. */
    private String indent = "    ";
    
    /** Used to assign prefixes to namespace URIs. */
    private NamespacePrefixMapper prefixMapper = null;
    
    /** Object that handles character escaping. */
    private CharacterEscapeHandler escapeHandler = null; 
    
    /** Whether the xml declaration will be printed or not. */
    private boolean printXmlDeclaration = true;
    
    /** XML BLOB written after the XML declaration. */
    private String header=null;
    
    /** reference to the context that created this object */
    final DefaultJAXBContextImpl context;
    
    public MarshallerImpl( DefaultJAXBContextImpl c ) {
        // initialize datatype converter with ours
        DatatypeConverter.setDatatypeConverter(DatatypeConverterImpl.theInstance);
        
        this.context = c;
    }
    
    public void marshal(Object obj, Result result) throws JAXBException {
        //XMLSerializable so = Util.toXMLSerializable(obj);
        XMLSerializable so = this.context.getGrammarInfo().castToXMLSerializable(obj);

        if(so==null) {
			throw new MarshalException( 
                Messages.format( Messages.NOT_MARSHALLABLE ) );
		}


        if (result instanceof SAXResult) {
            this.write(so, ((SAXResult) result).getHandler());
            return;
        }
        if (result instanceof DOMResult) {
            Node node = ((DOMResult) result).getNode();

            if (node == null) {
                try {
                    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                    dbf.setNamespaceAware(true);
                    DocumentBuilder db = dbf.newDocumentBuilder();
                    Document doc = db.newDocument();
                    ((DOMResult) result).setNode(doc);
                    this.write(so, new SAX2DOMEx(doc));
                } catch (ParserConfigurationException pce) {
                    throw new JAXBAssertionError(pce);
                }
            } else {
                this.write(so, new SAX2DOMEx(node));
            }

            return;
        }
        if (result instanceof StreamResult) {
            StreamResult sr = (StreamResult) result;
            XMLWriter w = null;

            if (sr.getWriter() != null) {
				w = this.createWriter(sr.getWriter());
			} else if (sr.getOutputStream() != null) {
				w = this.createWriter(sr.getOutputStream());
			} else if (sr.getSystemId() != null) {
                String fileURL = sr.getSystemId();

                if (fileURL.startsWith("file:///")) {
                    if (fileURL.substring(8).indexOf(":") > 0) {
						fileURL = fileURL.substring(8);
					} else {
						fileURL = fileURL.substring(7);
					}
                } // otherwise assume that it's a file name

                try {
                    w = this.createWriter(new FileOutputStream(fileURL));
                } catch (IOException e) {
                    throw new MarshalException(e);
                }
            }

            if (w == null) {
				throw new IllegalArgumentException();
			}

            this.write(so, w);
            return;
        }

        // unsupported parameter type
        throw new MarshalException( 
            Messages.format( Messages.UNSUPPORTED_RESULT ) );
    }
    
    private void write( XMLSerializable obj, ContentHandler writer )
        throws JAXBException {

        try {
            if( (this.getSchemaLocation()!=null) || (this.getNoNSSchemaLocation()!=null) ) {
                // if we need to add xsi:schemaLocation or its brother,
                // throw in the component to do that.
                writer = new SchemaLocationFilter(
                    this.getSchemaLocation(),
                    this.getNoNSSchemaLocation(),
                    writer );
            }
            
            SAXMarshaller serializer = new SAXMarshaller(writer,this.prefixMapper,this);
        
            // set a DocumentLocator that doesn't provide any information
            writer.setDocumentLocator( new LocatorImpl() );
            writer.startDocument();
            serializer.childAsBody(obj,null);
            writer.endDocument();
            
            serializer.reconcileID();   // extra check
        } catch( SAXException e ) {
            throw new MarshalException(e);
        }
    }
    
    
    //
    //
    // create XMLWriter by specifing various type of output.
    //
    //
    
    protected CharacterEscapeHandler createEscapeHandler( String encoding ) {
        if( this.escapeHandler!=null ) {
			// user-specified one takes precedence.
            return this.escapeHandler;
		}
        
        if( encoding.startsWith("UTF") ) {
			// no need for character reference. Use the handler
            // optimized for that pattern.
            return MinimumEscapeHandler.theInstance;
		}
        
        // otherwise try to find one from the encoding
        try {
            // try new JDK1.4 NIO
            return new NioEscapeHandler( this.getJavaEncoding(encoding) );
        } catch( Throwable e ) {
            // if that fails, fall back to the dumb mode
            return DumbEscapeHandler.theInstance;
        }
    }
            
    public XMLWriter createWriter( Writer w, String encoding ) throws JAXBException {
        
        // buffering improves the performance
        w = new BufferedWriter(w);
        
        CharacterEscapeHandler ceh = this.createEscapeHandler(encoding);
        XMLWriter xw;
        
        if(this.isFormattedOutput()) {
            DataWriter d = new DataWriter(w,encoding,ceh);
            d.setIndentStep(this.indent);
            xw=d;
        } else {
			xw = new XMLWriter(w,encoding,ceh);
		}
            
        xw.setXmlDecl(this.printXmlDeclaration);
        xw.setHeader(this.header);
        return xw;
    }

    public XMLWriter createWriter(Writer w) throws JAXBException{
        return this.createWriter(w, this.getEncoding());
    }
    
    public XMLWriter createWriter( OutputStream os ) throws JAXBException {
        return this.createWriter(os, this.getEncoding());
    }
    
    public XMLWriter createWriter( OutputStream os, String encoding ) throws JAXBException {
        try {
            return this.createWriter(
                new OutputStreamWriter(os,this.getJavaEncoding(encoding)),
                encoding );
        } catch( UnsupportedEncodingException e ) {
            throw new MarshalException(
                Messages.format( Messages.UNSUPPORTED_ENCODING, encoding ),
                e );
        }
    }
    
    
    public Object getProperty(String name) throws PropertyException {
        if( INDENT_STRING.equals(name) ) {
			return this.indent;
		}
        if( ENCODING_HANDLER.equals(name) ) {
			return this.escapeHandler;
		}
        if( PREFIX_MAPPER.equals(name) ) {
			return this.prefixMapper;
		}
        if( XMLDECLARATION.equals(name) ) {
			return this.printXmlDeclaration ? Boolean.TRUE : Boolean.FALSE;
		}
        if( XML_HEADERS.equals(name) ) {
			return this.header;
		}
        
        return super.getProperty(name);
    }

    public void setProperty(String name, Object value) throws PropertyException {
        if( INDENT_STRING.equals(name) && (value instanceof String) ) {
            this.indent = (String)value;
            return;
        }
        if( ENCODING_HANDLER.equals(name) ) {
            this.escapeHandler = (CharacterEscapeHandler)value;
            return;
        }
        if( PREFIX_MAPPER.equals(name) ) {
            this.prefixMapper = (NamespacePrefixMapper)value;
            return;
        }
        if( XMLDECLARATION.equals(name) ) {
            this.printXmlDeclaration = ((Boolean)value).booleanValue();
            return;
        }
        if( XML_HEADERS.equals(name) ) {
            this.header = (String)value;
            return;
        }
            
        super.setProperty(name, value);
    }
    
    private static final String INDENT_STRING = "com.sun.xml.bind.indentString"; 
    private static final String PREFIX_MAPPER = "com.sun.xml.bind.namespacePrefixMapper"; 
    private static final String ENCODING_HANDLER = "com.sun.xml.bind.characterEscapeHandler"; 
    private static final String XMLDECLARATION = "com.sun.xml.bind.xmlDeclaration"; 
    private static final String XML_HEADERS = "com.sun.xml.bind.xmlHeaders";
}
