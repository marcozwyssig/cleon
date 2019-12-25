package cleon.common.xml.metamodel.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4ceeb741-2a25-11e9-b49d-072e4afacfc7,imports]] */

/* End Protected Region   [[4ceeb741-2a25-11e9-b49d-072e4afacfc7,imports]] */

public class FunctionSpace_Xml {

  /* Begin Protected Region [[4ceeb741-2a25-11e9-b49d-072e4afacfc7]] */
  
  /* End Protected Region   [[4ceeb741-2a25-11e9-b49d-072e4afacfc7]] */


  public static interface IXmlDocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("591d74ed-2a25-11e9-b49d-072e4afacfc7")
    public java.lang.String RenderXmlEncoding();

    @IDynamicResourceExtension.MethodId("acfdca1f-2a29-11e9-aa36-8939fe6e654c")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("bca1f481-2aad-11e9-b83f-8be423c00623")
    public java.lang.String RenderXmlElement();

  }
  
  public static interface IXmlDocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class XmlDocumentFunctionsImpl implements IXmlDocumentFunctionsImpl {

    public static final IXmlDocumentFunctionsImpl INSTANCE = new XmlDocumentFunctionsImpl();

    private XmlDocumentFunctionsImpl() {}

  }
  
  public static class XmlDocumentFunctions {

    private XmlDocumentFunctions() {}

  }

  public static interface IXmlNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6c2e2cbd-2a26-11e9-b49d-072e4afacfc7")
    public java.lang.String RenderXml();

    @IDynamicResourceExtension.MethodId("9e0df042-2a29-11e9-aa36-8939fe6e654c")
    public java.lang.String RenderXmlElement();

  }
  
  public static interface IXmlNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class XmlNodeFunctionsImpl implements IXmlNodeFunctionsImpl {

    public static final IXmlNodeFunctionsImpl INSTANCE = new XmlNodeFunctionsImpl();

    private XmlNodeFunctionsImpl() {}

  }
  
  public static class XmlNodeFunctions {

    private XmlNodeFunctions() {}

  }

  public static interface IXmlAttributeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("90675342-2aad-11e9-b83f-8be423c00623")
    public java.lang.String RenderXmlElement();

  }
  
  public static interface IXmlAttributeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class XmlAttributeFunctionsImpl implements IXmlAttributeFunctionsImpl {

    public static final IXmlAttributeFunctionsImpl INSTANCE = new XmlAttributeFunctionsImpl();

    private XmlAttributeFunctionsImpl() {}

  }
  
  public static class XmlAttributeFunctions {

    private XmlAttributeFunctions() {}

  }

  public static interface IXmlElementFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a496688c-2aad-11e9-b83f-8be423c00623")
    public java.lang.String RenderXmlElement();

  }
  
  public static interface IXmlElementFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class XmlElementFunctionsImpl implements IXmlElementFunctionsImpl {

    public static final IXmlElementFunctionsImpl INSTANCE = new XmlElementFunctionsImpl();

    private XmlElementFunctionsImpl() {}

  }
  
  public static class XmlElementFunctions {

    private XmlElementFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4ceeb741-2a25-11e9-b49d-072e4afacfc7,fWOlCw3FX8Xa37FQfa0XRrupsIU=] */
