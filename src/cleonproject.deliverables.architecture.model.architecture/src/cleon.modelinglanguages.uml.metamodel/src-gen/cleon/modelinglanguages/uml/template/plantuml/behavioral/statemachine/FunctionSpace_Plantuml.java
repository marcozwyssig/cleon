package cleon.modelinglanguages.uml.template.plantuml.behavioral.statemachine;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fd8e4392-fa40-11e8-af47-e5bdd8100025,imports]] */

/* End Protected Region   [[fd8e4392-fa40-11e8-af47-e5bdd8100025,imports]] */

public class FunctionSpace_Plantuml {

  /* Begin Protected Region [[fd8e4392-fa40-11e8-af47-e5bdd8100025]] */
  
  /* End Protected Region   [[fd8e4392-fa40-11e8-af47-e5bdd8100025]] */


  public static interface IStateMachineDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fc072c5c-3537-11e5-909a-4bcced25d7ee")
    public java.lang.String RenderUmlElement();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fd8e4392-fa40-11e8-af47-e5bdd8100025,b5Jf5jMZZfoGtGihX1jTvU05hy0=] */
