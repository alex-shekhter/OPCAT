//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.05.23 at 12:36:13 PM IDT 
//


package extensionTools.opl2.generated.impl;

public class ExhibitedObjectTypeImpl implements extensionTools.opl2.generated.ExhibitedObjectType, com.sun.xml.bind.JAXBObject, extensionTools.opl2.generated.impl.runtime.UnmarshallableObject, extensionTools.opl2.generated.impl.runtime.XMLSerializable, extensionTools.opl2.generated.impl.runtime.ValidatableObject
{

    protected java.lang.String _AttributeName;
    protected boolean has_MaximalCardinality;
    protected int _MaximalCardinality;
    protected com.sun.xml.bind.util.ListImpl _Role;
    protected boolean has_MinimalCardinality;
    protected int _MinimalCardinality;
    public final static java.lang.Class version = (extensionTools.opl2.generated.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    public java.lang.String getAttributeName() {
        return this._AttributeName;
    }

    public void setAttributeName(java.lang.String value) {
        this._AttributeName = value;
    }

    public int getMaximalCardinality() {
        return this._MaximalCardinality;
    }

    public void setMaximalCardinality(int value) {
        this._MaximalCardinality = value;
        this.has_MaximalCardinality = true;
    }

    protected com.sun.xml.bind.util.ListImpl _getRole() {
        if (this._Role == null) {
            this._Role = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return this._Role;
    }

    public java.util.List getRole() {
        return this._getRole();
    }

    public int getMinimalCardinality() {
        return this._MinimalCardinality;
    }

    public void setMinimalCardinality(int value) {
        this._MinimalCardinality = value;
        this.has_MinimalCardinality = true;
    }

    public extensionTools.opl2.generated.impl.runtime.UnmarshallingEventHandler createUnmarshaller(extensionTools.opl2.generated.impl.runtime.UnmarshallingContext context) {
        return new extensionTools.opl2.generated.impl.ExhibitedObjectTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(extensionTools.opl2.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!this.has_MaximalCardinality) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "MaximalCardinality"));
        }
        int idx3 = 0;
        final int len3 = ((this._Role == null)? 0 :this._Role.size());
        if (!this.has_MinimalCardinality) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "MinimalCardinality"));
        }
        context.startElement("", "MinimalCardinality");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(javax.xml.bind.DatatypeConverter.printInt(((int) this._MinimalCardinality)), "MinimalCardinality");
        } catch (java.lang.Exception e) {
            extensionTools.opl2.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("", "MaximalCardinality");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(javax.xml.bind.DatatypeConverter.printInt(((int) this._MaximalCardinality)), "MaximalCardinality");
        } catch (java.lang.Exception e) {
            extensionTools.opl2.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        context.startElement("", "AttributeName");
        context.endNamespaceDecls();
        context.endAttributes();
        try {
            context.text(((java.lang.String) this._AttributeName), "AttributeName");
        } catch (java.lang.Exception e) {
            extensionTools.opl2.generated.impl.runtime.Util.handlePrintConversionException(this, e, context);
        }
        context.endElement();
        while (idx3 != len3) {
            if (this._Role.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) this._Role.get(idx3 ++)), "Role");
            } else {
                context.startElement("", "Role");
                int idx_6 = idx3;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) this._Role.get(idx_6 ++)), "Role");
                context.endNamespaceDecls();
                int idx_7 = idx3;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) this._Role.get(idx_7 ++)), "Role");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) this._Role.get(idx3 ++)), "Role");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(extensionTools.opl2.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!this.has_MaximalCardinality) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "MaximalCardinality"));
        }
        int idx3 = 0;
        final int len3 = ((this._Role == null)? 0 :this._Role.size());
        if (!this.has_MinimalCardinality) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "MinimalCardinality"));
        }
        while (idx3 != len3) {
            if (this._Role.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) this._Role.get(idx3 ++)), "Role");
            } else {
                idx3 += 1;
            }
        }
    }

    public void serializeURIs(extensionTools.opl2.generated.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        if (!this.has_MaximalCardinality) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "MaximalCardinality"));
        }
        int idx3 = 0;
        final int len3 = ((this._Role == null)? 0 :this._Role.size());
        if (!this.has_MinimalCardinality) {
            context.reportError(com.sun.xml.bind.serializer.Util.createMissingObjectError(this, "MinimalCardinality"));
        }
        while (idx3 != len3) {
            if (this._Role.get(idx3) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) this._Role.get(idx3 ++)), "Role");
            } else {
                idx3 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (extensionTools.opl2.generated.ExhibitedObjectType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\'com.sun.msv.grammar."
+"trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/gr"
+"ammar/NameClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003pp\u0000s"
+"q\u0000~\u0000\u0000ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLor"
+"g/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun"
+"/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000 com.sun.msv.datatype.xsd.In"
+"tType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000+com.sun.msv.datatype.xsd.IntegerDerivedT"
+"ype\u0099\u00f1]\u0090&6k\u00be\u0002\u0000\u0001L\u0000\nbaseFacetst\u0000)Lcom/sun/msv/datatype/xsd/XSDa"
+"tatypeImpl;xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000"
+"xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnam"
+"espaceUrit\u0000\u0012Ljava/lang/String;L\u0000\btypeNameq\u0000~\u0000\u0017L\u0000\nwhiteSpacet"
+"\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://"
+"www.w3.org/2001/XMLSchemat\u0000\u0003intsr\u00005com.sun.msv.datatype.xsd."
+"WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datat"
+"ype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u0000*com.sun.msv.data"
+"type.xsd.MaxInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com.sun.msv.datatyp"
+"e.xsd.RangeFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\nlimitValuet\u0000\u0012Ljava/lang/Object"
+";xr\u00009com.sun.msv.datatype.xsd.DataTypeWithValueConstraintFac"
+"et\"\u00a7Ro\u00ca\u00c7\u008aT\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.DataTypeWithFacet\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0005Z\u0000\fisFacetFixedZ\u0000\u0012needValueCheckFlagL\u0000\bbaseTypeq\u0000~"
+"\u0000\u0013L\u0000\fconcreteTypet\u0000\'Lcom/sun/msv/datatype/xsd/ConcreteType;L"
+"\u0000\tfacetNameq\u0000~\u0000\u0017xq\u0000~\u0000\u0016ppq\u0000~\u0000\u001e\u0000\u0001sr\u0000*com.sun.msv.datatype.xsd."
+"MinInclusiveFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000 ppq\u0000~\u0000\u001e\u0000\u0000sr\u0000!com.sun.msv.d"
+"atatype.xsd.LongType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0012q\u0000~\u0000\u001at\u0000\u0004longq\u0000~\u0000\u001esq\u0000~\u0000\u001f"
+"ppq\u0000~\u0000\u001e\u0000\u0001sq\u0000~\u0000&ppq\u0000~\u0000\u001e\u0000\u0000sr\u0000$com.sun.msv.datatype.xsd.Integer"
+"Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0012q\u0000~\u0000\u001at\u0000\u0007integerq\u0000~\u0000\u001esr\u0000,com.sun.msv.dat"
+"atype.xsd.FractionDigitsFacet\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I\u0000\u0005scalexr\u0000;com.sun."
+"msv.datatype.xsd.DataTypeWithLexicalConstraintFacetT\u0090\u001c>\u001azb\u00ea\u0002"
+"\u0000\u0000xq\u0000~\u0000#ppq\u0000~\u0000\u001e\u0001\u0000sr\u0000#com.sun.msv.datatype.xsd.NumberType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0014q\u0000~\u0000\u001at\u0000\u0007decimalq\u0000~\u0000\u001eq\u0000~\u00004t\u0000\u000efractionDigits\u0000\u0000\u0000\u0000q"
+"\u0000~\u0000.t\u0000\fminInclusivesr\u0000\u000ejava.lang.Long;\u008b\u00e4\u0090\u00cc\u008f#\u00df\u0002\u0000\u0001J\u0000\u0005valuexr\u0000\u0010"
+"java.lang.Number\u0086\u00ac\u0095\u001d\u000b\u0094\u00e0\u008b\u0002\u0000\u0000xp\u0080\u0000\u0000\u0000\u0000\u0000\u0000\u0000q\u0000~\u0000.t\u0000\fmaxInclusivesq\u0000"
+"~\u00008\u007f\u00ff\u00ff\u00ff\u00ff\u00ff\u00ff\u00ffq\u0000~\u0000)q\u0000~\u00007sr\u0000\u0011java.lang.Integer\u0012\u00e2\u00a0\u00a4\u00f7\u0081\u00878\u0002\u0000\u0001I\u0000\u0005valu"
+"exq\u0000~\u00009\u0080\u0000\u0000\u0000q\u0000~\u0000)q\u0000~\u0000;sq\u0000~\u0000=\u007f\u00ff\u00ff\u00ffsr\u00000com.sun.msv.grammar.Expre"
+"ssion$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003ppsr\u0000\u001bcom.sun.msv.ut"
+"il.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0017L\u0000\fnamespaceURIq\u0000~\u0000"
+"\u0017xpq\u0000~\u0000\u001bq\u0000~\u0000\u001asr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000"
+"~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000"
+"~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\txq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000"
+"\u0005valuexp\u0000psq\u0000~\u0000\rppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0014q\u0000~\u0000\u001at\u0000\u0005QNameq\u0000~\u0000\u001eq\u0000~\u0000Asq\u0000~\u0000Bq\u0000~\u0000Mq\u0000~\u0000\u001asr\u0000#com."
+"sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0017L"
+"\u0000\fnamespaceURIq\u0000~\u0000\u0017xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0000xpt\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instancesr\u00000"
+"com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000\u0003sq\u0000~\u0000H\u0001psq\u0000~\u0000Ot\u0000\u0012MinimalCardinalityt\u0000\u0000sq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0000pp"
+"q\u0000~\u0000\u0010sq\u0000~\u0000Dppsq\u0000~\u0000Fq\u0000~\u0000Ipq\u0000~\u0000Jq\u0000~\u0000Qq\u0000~\u0000Usq\u0000~\u0000Ot\u0000\u0012MaximalCard"
+"inalityq\u0000~\u0000Ysq\u0000~\u0000\bpp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rppsr\u0000#com.sun.msv.datatyp"
+"e.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000\u0014q\u0000~\u0000\u001at\u0000\u0006str"
+"ingsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Preserve"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001d\u0001q\u0000~\u0000Asq\u0000~\u0000Bq\u0000~\u0000eq\u0000~\u0000\u001asq\u0000~\u0000Dppsq\u0000~\u0000Fq\u0000~\u0000Ipq"
+"\u0000~\u0000Jq\u0000~\u0000Qq\u0000~\u0000Usq\u0000~\u0000Ot\u0000\rAttributeNameq\u0000~\u0000Ysq\u0000~\u0000Dppsr\u0000 com.sun"
+".msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar."
+"UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000Ipsq\u0000~\u0000Dq\u0000~\u0000Ipsq\u0000~\u0000\b"
+"q\u0000~\u0000Ip\u0000sq\u0000~\u0000Dppsq\u0000~\u0000nq\u0000~\u0000Ipsq\u0000~\u0000Fq\u0000~\u0000Ipsr\u00002com.sun.msv.gramm"
+"ar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000Vpsr\u0000 "
+"com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Pq\u0000~\u0000Usq\u0000~\u0000O"
+"t\u0000\"extensionTools.opl2.generated.Rolet\u0000+http://java.sun.com/"
+"jaxb/xjc/dummy-elementssq\u0000~\u0000\bq\u0000~\u0000Ip\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\bpp\u0000sq\u0000~\u0000Dp"
+"psq\u0000~\u0000nq\u0000~\u0000Ipsq\u0000~\u0000Fq\u0000~\u0000Ipq\u0000~\u0000wq\u0000~\u0000yq\u0000~\u0000Usq\u0000~\u0000Ot\u0000&extensionTo"
+"ols.opl2.generated.RoleTypeq\u0000~\u0000|sq\u0000~\u0000Dppsq\u0000~\u0000Fq\u0000~\u0000Ipq\u0000~\u0000Jq\u0000~"
+"\u0000Qq\u0000~\u0000Usq\u0000~\u0000Ot\u0000\u0004Roleq\u0000~\u0000Yq\u0000~\u0000Usr\u0000\"com.sun.msv.grammar.Expres"
+"sionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expres"
+"sionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool"
+"$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lc"
+"om/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u0012\u0001pq\u0000~\u0000qq\u0000~\u0000Eq\u0000~\u0000\\q\u0000~"
+"\u0000iq\u0000~\u0000\u0085q\u0000~\u0000~q\u0000~\u0000mq\u0000~\u0000\u0006q\u0000~\u0000aq\u0000~\u0000\u0005q\u0000~\u0000\fq\u0000~\u0000[q\u0000~\u0000pq\u0000~\u0000tq\u0000~\u0000\u0081q\u0000~"
+"\u0000sq\u0000~\u0000\u0080q\u0000~\u0000\u0007x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends extensionTools.opl2.generated.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(extensionTools.opl2.generated.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------");
        }

        protected Unmarshaller(extensionTools.opl2.generated.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            this.state = startState;
        }

        public java.lang.Object owner() {
            return extensionTools.opl2.generated.impl.ExhibitedObjectTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (this.state) {
                    case  3 :
                        if (("MaximalCardinality" == ___local)&&("" == ___uri)) {
                            this.context.pushAttributes(__atts, true);
                            this.state = 4;
                            return ;
                        }
                        break;
                    case  6 :
                        if (("AttributeName" == ___local)&&("" == ___uri)) {
                            this.context.pushAttributes(__atts, true);
                            this.state = 7;
                            return ;
                        }
                        break;
                    case  10 :
                        if (("Role" == ___local)&&("" == ___uri)) {
                            ExhibitedObjectTypeImpl.this._getRole().add(((extensionTools.opl2.generated.impl.RoleImpl) this.spawnChildFromEnterElement((extensionTools.opl2.generated.impl.RoleImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Role" == ___local)&&("" == ___uri)) {
                            this.context.pushAttributes(__atts, false);
                            this.state = 11;
                            return ;
                        }
                        this.revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("MinimalCardinality" == ___local)&&("" == ___uri)) {
                            this.context.pushAttributes(__atts, true);
                            this.state = 1;
                            return ;
                        }
                        break;
                    case  9 :
                        if (("Role" == ___local)&&("" == ___uri)) {
                            ExhibitedObjectTypeImpl.this._getRole().add(((extensionTools.opl2.generated.impl.RoleImpl) this.spawnChildFromEnterElement((extensionTools.opl2.generated.impl.RoleImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Role" == ___local)&&("" == ___uri)) {
                            this.context.pushAttributes(__atts, false);
                            this.state = 11;
                            return ;
                        }
                        this.state = 10;
                        continue outer;
                    case  11 :
                        attIdx = this.context.getAttribute("", "Library");
                        if (attIdx >= 0) {
                            this.context.consumeAttribute(attIdx);
                            this.context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = this.context.getAttribute("", "RoleName");
                        if (attIdx >= 0) {
                            this.context.consumeAttribute(attIdx);
                            this.context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (this.state) {
                    case  8 :
                        if (("AttributeName" == ___local)&&("" == ___uri)) {
                            this.context.popAttributes();
                            this.state = 9;
                            return ;
                        }
                        break;
                    case  5 :
                        if (("MaximalCardinality" == ___local)&&("" == ___uri)) {
                            this.context.popAttributes();
                            this.state = 6;
                            return ;
                        }
                        break;
                    case  10 :
                        this.revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  12 :
                        if (("Role" == ___local)&&("" == ___uri)) {
                            this.context.popAttributes();
                            this.state = 10;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("MinimalCardinality" == ___local)&&("" == ___uri)) {
                            this.context.popAttributes();
                            this.state = 3;
                            return ;
                        }
                        break;
                    case  9 :
                        this.state = 10;
                        continue outer;
                    case  11 :
                        attIdx = this.context.getAttribute("", "Library");
                        if (attIdx >= 0) {
                            this.context.consumeAttribute(attIdx);
                            this.context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = this.context.getAttribute("", "RoleName");
                        if (attIdx >= 0) {
                            this.context.consumeAttribute(attIdx);
                            this.context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            outer:
            while (true) {
                switch (this.state) {
                    case  10 :
                        this.revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        this.state = 10;
                        continue outer;
                    case  11 :
                        if (("Library" == ___local)&&("" == ___uri)) {
                            ExhibitedObjectTypeImpl.this._getRole().add(((extensionTools.opl2.generated.impl.RoleTypeImpl) this.spawnChildFromEnterAttribute((extensionTools.opl2.generated.impl.RoleTypeImpl.class), 12, ___uri, ___local, ___qname)));
                            return ;
                        }
                        if (("RoleName" == ___local)&&("" == ___uri)) {
                            ExhibitedObjectTypeImpl.this._getRole().add(((extensionTools.opl2.generated.impl.RoleTypeImpl) this.spawnChildFromEnterAttribute((extensionTools.opl2.generated.impl.RoleTypeImpl.class), 12, ___uri, ___local, ___qname)));
                            return ;
                        }
                        break;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (this.state) {
                    case  10 :
                        this.revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  9 :
                        this.state = 10;
                        continue outer;
                    case  11 :
                        attIdx = this.context.getAttribute("", "Library");
                        if (attIdx >= 0) {
                            this.context.consumeAttribute(attIdx);
                            this.context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = this.context.getAttribute("", "RoleName");
                        if (attIdx >= 0) {
                            this.context.consumeAttribute(attIdx);
                            this.context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (this.state) {
                        case  4 :
                            this.state = 5;
                            this.eatText1(value);
                            return ;
                        case  10 :
                            this.revertToParentFromText(value);
                            return ;
                        case  9 :
                            this.state = 10;
                            continue outer;
                        case  7 :
                            this.state = 8;
                            this.eatText2(value);
                            return ;
                        case  11 :
                            attIdx = this.context.getAttribute("", "Library");
                            if (attIdx >= 0) {
                                this.context.consumeAttribute(attIdx);
                                this.context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = this.context.getAttribute("", "RoleName");
                            if (attIdx >= 0) {
                                this.context.consumeAttribute(attIdx);
                                this.context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  1 :
                            this.state = 2;
                            this.eatText3(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    this.handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                ExhibitedObjectTypeImpl.this._MaximalCardinality = javax.xml.bind.DatatypeConverter.parseInt(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                ExhibitedObjectTypeImpl.this.has_MaximalCardinality = true;
            } catch (java.lang.Exception e) {
                this.handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                ExhibitedObjectTypeImpl.this._AttributeName = value;
            } catch (java.lang.Exception e) {
                this.handleParseConversionException(e);
            }
        }

        private void eatText3(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                ExhibitedObjectTypeImpl.this._MinimalCardinality = javax.xml.bind.DatatypeConverter.parseInt(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value));
                ExhibitedObjectTypeImpl.this.has_MinimalCardinality = true;
            } catch (java.lang.Exception e) {
                this.handleParseConversionException(e);
            }
        }

    }

}
