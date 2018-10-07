package cleon.modelinglanguages.uml.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8c99cddc-3525-11e5-909a-4bcced25d7ee,imports]] */

/* End Protected Region   [[8c99cddc-3525-11e5-909a-4bcced25d7ee,imports]] */

public class FunctionSpace_Uml {

  /* Begin Protected Region [[8c99cddc-3525-11e5-909a-4bcced25d7ee]] */
  
  /* End Protected Region   [[8c99cddc-3525-11e5-909a-4bcced25d7ee]] */


  public static interface IStateMachineFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2ebe6934-3529-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderContentElement();

    @IDynamicResourceExtension.MethodId("fc072c5c-3537-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderPlantuml();

    @IDynamicResourceExtension.MethodId("16d8687a-3538-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderEvents();

    @IDynamicResourceExtension.MethodId("1c1e0bc1-3538-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderStates();

    @IDynamicResourceExtension.MethodId("c1f58b65-353d-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderTransitions();

  }
  
  public static interface IStateMachineFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StateMachineFunctionsImpl implements IStateMachineFunctionsImpl {

    public static final IStateMachineFunctionsImpl INSTANCE = new StateMachineFunctionsImpl();

    private StateMachineFunctionsImpl() {}

  }
  
  public static class StateMachineFunctions {

    private StateMachineFunctions() {}

  }

  public static interface IAbstractComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("434ceec8-481f-11e6-82f6-0f210765495b")
    public java.lang.String RenderDocumentContent();

  }
  
  public static interface IAbstractComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractComponentFunctionsImpl implements IAbstractComponentFunctionsImpl {

    public static final IAbstractComponentFunctionsImpl INSTANCE = new AbstractComponentFunctionsImpl();

    private AbstractComponentFunctionsImpl() {}

  }
  
  public static class AbstractComponentFunctions {

    private AbstractComponentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8c99cddc-3525-11e5-909a-4bcced25d7ee,s3jpYMRHm1t0phn7+95T8eusndE=] */
