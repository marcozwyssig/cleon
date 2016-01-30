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


  public static interface IProtocolFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("942a546a-c6aa-11e5-a68d-835c1648a4d8")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("4f02765e-c75f-11e5-b3f9-43c5a0896ea1")
    public java.lang.String RenderDocumentContent();

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

  public static interface IAgendaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9c31d862-c763-11e5-b3f9-43c5a0896ea1")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface IAgendaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AgendaFunctionsImpl implements IAgendaFunctionsImpl {

    public static final IAgendaFunctionsImpl INSTANCE = new AgendaFunctionsImpl();

    private AgendaFunctionsImpl() {}

  }
  
  public static class AgendaFunctions {

    private AgendaFunctions() {}

  }

  public static interface IProtocolItemsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fdfcac8b-c764-11e5-b3f9-43c5a0896ea1")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface IProtocolItemsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolItemsFunctionsImpl implements IProtocolItemsFunctionsImpl {

    public static final IProtocolItemsFunctionsImpl INSTANCE = new ProtocolItemsFunctionsImpl();

    private ProtocolItemsFunctionsImpl() {}

  }
  
  public static class ProtocolItemsFunctions {

    private ProtocolItemsFunctions() {}

  }

  public static interface IProtocolItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f4a5dbbd-c766-11e5-b3f9-43c5a0896ea1")
    public java.lang.String GetType();

  }
  
  public static interface IProtocolItemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ProtocolItemFunctionsImpl implements IProtocolItemFunctionsImpl {

    public static final IProtocolItemFunctionsImpl INSTANCE = new ProtocolItemFunctionsImpl();

    private ProtocolItemFunctionsImpl() {}

  }
  
  public static class ProtocolItemFunctions {

    private ProtocolItemFunctions() {}

  }

  public static interface IDecisionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ff2bf34c-c766-11e5-b3f9-43c5a0896ea1")
    public java.lang.String GetType();

  }
  
  public static interface IDecisionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DecisionFunctionsImpl implements IDecisionFunctionsImpl {

    public static final IDecisionFunctionsImpl INSTANCE = new DecisionFunctionsImpl();

    private DecisionFunctionsImpl() {}

  }
  
  public static class DecisionFunctions {

    private DecisionFunctions() {}

  }

  public static interface ITaskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0d7a3677-c767-11e5-b3f9-43c5a0896ea1")
    public java.lang.String GetType();

  }
  
  public static interface ITaskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TaskFunctionsImpl implements ITaskFunctionsImpl {

    public static final ITaskFunctionsImpl INSTANCE = new TaskFunctionsImpl();

    private TaskFunctionsImpl() {}

  }
  
  public static class TaskFunctions {

    private TaskFunctions() {}

  }

  public static interface IInformationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("133642d7-c767-11e5-b3f9-43c5a0896ea1")
    public java.lang.String GetType();

  }
  
  public static interface IInformationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InformationFunctionsImpl implements IInformationFunctionsImpl {

    public static final IInformationFunctionsImpl INSTANCE = new InformationFunctionsImpl();

    private InformationFunctionsImpl() {}

  }
  
  public static class InformationFunctions {

    private InformationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,2143ad53-b468-11e5-a3f4-497fd75158dc,UZRgc/kNx6anX/5ak+D8su4P8A0=] */
