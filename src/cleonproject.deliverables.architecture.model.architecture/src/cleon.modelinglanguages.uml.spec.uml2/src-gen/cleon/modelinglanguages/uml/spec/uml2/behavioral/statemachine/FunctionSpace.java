package cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8a042bd0-345d-11e5-909a-4bcced25d7ee,imports]] */

/* End Protected Region   [[8a042bd0-345d-11e5-909a-4bcced25d7ee,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[8a042bd0-345d-11e5-909a-4bcced25d7ee]] */
  
  /* End Protected Region   [[8a042bd0-345d-11e5-909a-4bcced25d7ee]] */


  public static interface IStateMachineFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9215e73b-345d-11e5-909a-4bcced25d7ee")
    public List<cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IState> GetStates();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8a042bd0-345d-11e5-909a-4bcced25d7ee,AFgzsbpTgSM2MrapDg0VUEanbvY=] */
