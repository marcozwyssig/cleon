package cleon.sda.template.asciidoc.project.protocols;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[2143ad53-b468-11e5-a3f4-497fd75158dc,imports]] */

/* End Protected Region   [[2143ad53-b468-11e5-a3f4-497fd75158dc,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[2143ad53-b468-11e5-a3f4-497fd75158dc]] */
  
  /* End Protected Region   [[2143ad53-b468-11e5-a3f4-497fd75158dc]] */


  public static interface IAgendaItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5db4da80-b468-11e5-a3f4-497fd75158dc")
    public java.lang.String RenderContent();

  }
  
  public static interface IAgendaItemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AgendaItemFunctionsImpl implements IAgendaItemFunctionsImpl {

    public static final IAgendaItemFunctionsImpl INSTANCE = new AgendaItemFunctionsImpl();

    private AgendaItemFunctionsImpl() {}

  }
  
  public static class AgendaItemFunctions {

    private AgendaItemFunctions() {}

  }

  public static interface IProtocolFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("942a546a-c6aa-11e5-a68d-835c1648a4d8")
    public java.lang.String GetDocumentPath();

  }
  
  public static interface IProtocolFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolFunctionsImpl implements IProtocolFunctionsImpl {

    public static final IProtocolFunctionsImpl INSTANCE = new ProtocolFunctionsImpl();

    private ProtocolFunctionsImpl() {}

  }
  
  public static class ProtocolFunctions {

    private ProtocolFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2143ad53-b468-11e5-a3f4-497fd75158dc,8i/YoRmhQjmRYi6j0vqUwbjE1BA=] */
