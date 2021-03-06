//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.05.23 at 12:36:13 PM IDT 
//

package extensionTools.opl2.generated.impl.runtime;

import javax.xml.bind.ValidationEvent;
import javax.xml.bind.helpers.ValidationEventImpl;
import javax.xml.bind.helpers.ValidationEventLocatorImpl;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/**
 * Redirects events to another SAX ContentHandler.
 * 
 * <p>
 * Note that the SAXException returned by the ContentHandler is
 * unreported. So we have to catch them and report it, then rethrow
 * it if necessary. 
 * 
 * @author
 *     Kohsuke Kawaguchi (kohsuke.kawaguchi@sun.com)
 */
public class UnmarshallingEventHandlerAdaptor implements UnmarshallingEventHandler {
    
    protected final UnmarshallingContext context;

    /** This handler will receive SAX events. */
    protected final ContentHandler handler;

    public UnmarshallingEventHandlerAdaptor(UnmarshallingContext _ctxt,ContentHandler _handler) throws SAXException {
        this.context = _ctxt;
        this.handler = _handler;
        
        // emulate the start of documents
        try {
            this.handler.setDocumentLocator(this.context.getLocator());
            this.handler.startDocument();
            this.declarePrefixes( this.context.getAllDeclaredPrefixes() );
        } catch( SAXException e ) {
            this.error(e);
        }
    }

    public Object owner() {
        return null;
    }


    // nest level of elements.
    private int depth = 0;
        
    public void enterAttribute(String uri, String local, String qname) throws SAXException {
    }

    public void enterElement(String uri, String local, String qname, Attributes atts) throws SAXException {
        this.depth++;
        this.context.pushAttributes(atts,true);
        try {
            this.declarePrefixes(this.context.getNewlyDeclaredPrefixes());
            this.handler.startElement(uri,local,qname,atts);
        } catch( SAXException e ) {
            this.error(e);
        }
    }

    public void leaveAttribute(String uri, String local, String qname) throws SAXException {
    }

    public void leaveElement(String uri, String local, String qname) throws SAXException {
        try {
            this.handler.endElement(uri,local,qname);
            this.undeclarePrefixes(this.context.getNewlyDeclaredPrefixes());
        } catch( SAXException e ) {
            this.error(e);
        }
        this.context.popAttributes();
        
        this.depth--;
        if(this.depth==0) {
            // emulate the end of the document
            try {
                this.undeclarePrefixes(this.context.getAllDeclaredPrefixes());
                this.handler.endDocument();
            } catch( SAXException e ) {
                this.error(e);
            }
            this.context.popContentHandler();
        }
    }
    
    private void declarePrefixes( String[] prefixes ) throws SAXException {
        for( int i=prefixes.length-1; i>=0; i-- ) {
			this.handler.startPrefixMapping(
                prefixes[i],
                this.context.getNamespaceURI(prefixes[i]) );
		}
    }
    
    private void undeclarePrefixes( String[] prefixes ) throws SAXException {
        for( int i=prefixes.length-1; i>=0; i-- ) {
			this.handler.endPrefixMapping( prefixes[i] );
		}
    }

    public void text(String s) throws SAXException {
        try {
            this.handler.characters(s.toCharArray(),0,s.length());
        } catch( SAXException e ) {
            this.error(e);
        }
    }
    
    private void error( SAXException e ) throws SAXException {
        this.context.handleEvent(new ValidationEventImpl(
            ValidationEvent.ERROR,
            e.getMessage(),
            new ValidationEventLocatorImpl(this.context.getLocator()),
            e
        ), false);
    }

    public void leaveChild(int nextState) throws SAXException {
    }
}
