package cleon.modelinglanguages.uml.template.asciidoc;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8c99cddc-3525-11e5-909a-4bcced25d7ee,imports]] */

/* End Protected Region   [[8c99cddc-3525-11e5-909a-4bcced25d7ee,imports]] */

public class FunctionSpace_Asciidoc_Uml {

  /* Begin Protected Region [[8c99cddc-3525-11e5-909a-4bcced25d7ee]] */
  
  /* End Protected Region   [[8c99cddc-3525-11e5-909a-4bcced25d7ee]] */


  public static interface IAbstractComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("434ceec8-481f-11e6-82f6-0f210765495b")
    public java.lang.String RenderContent();

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

  public static interface IUmlDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("87394b7b-fa40-11e8-af47-e5bdd8100025")
    public java.lang.String RenderContent();

  }
  
  public static interface IUmlDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UmlDiagramFunctionsImpl implements IUmlDiagramFunctionsImpl {

    public static final IUmlDiagramFunctionsImpl INSTANCE = new UmlDiagramFunctionsImpl();

    private UmlDiagramFunctionsImpl() {}

  }
  
  public static class UmlDiagramFunctions {

    private UmlDiagramFunctions() {}

  }

  public static interface IStateMachineDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1e7396a0-fa41-11e8-af47-e5bdd8100025")
    public java.lang.String RenderContent();

    @IDynamicResourceExtension.MethodId("1e73beaa-fa41-11e8-af47-e5bdd8100025")
    public java.lang.String RenderEvents();

    @IDynamicResourceExtension.MethodId("1e73beee-fa41-11e8-af47-e5bdd8100025")
    public java.lang.String RenderStates();

    @IDynamicResourceExtension.MethodId("1e73bef3-fa41-11e8-af47-e5bdd8100025")
    public java.lang.String RenderTransitions();

  }
  
  public static interface IStateMachineDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class StateMachineDiagramFunctionsImpl implements IStateMachineDiagramFunctionsImpl {

    public static final IStateMachineDiagramFunctionsImpl INSTANCE = new StateMachineDiagramFunctionsImpl();

    private StateMachineDiagramFunctionsImpl() {}

  }
  
  public static class StateMachineDiagramFunctions {

    private StateMachineDiagramFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8c99cddc-3525-11e5-909a-4bcced25d7ee,8E8IlfMzVlgicrmgThAvnVSR20w=] */
