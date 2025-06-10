package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[98d71cef-bc87-11e6-b169-a12bde5a1c7c,imports]] */

/* End Protected Region   [[98d71cef-bc87-11e6-b169-a12bde5a1c7c,imports]] */

public class FunctionSpace_Goals {

  /* Begin Protected Region [[98d71cef-bc87-11e6-b169-a12bde5a1c7c]] */
  
  /* End Protected Region   [[98d71cef-bc87-11e6-b169-a12bde5a1c7c]] */


  public static interface IGoalFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("98d74401-bc87-11e6-b169-a12bde5a1c7c")
    public java.lang.String GetId();

  }
  
  public static interface IGoalFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("98d74401-bc87-11e6-b169-a12bde5a1c7c")
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals.javamodel.IGoal goal);

  }
  
  public static class GoalFunctionsImpl implements IGoalFunctionsImpl {

    public static final IGoalFunctionsImpl INSTANCE = new GoalFunctionsImpl();

    private GoalFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals.javamodel.IGoal goal) {
      return String.format("Z%02d", goal.selectIdentifier());  
    }

  }
  
  public static class GoalFunctions {

    private GoalFunctions() {}

    public static java.lang.String GetId(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals.javamodel.IGoal goal) {
      return DynamicResourceUtil.invoke(IGoalFunctionsImpl.class, GoalFunctionsImpl.INSTANCE, goal).GetId(goal);
    }

  }

  public static interface IGoalsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("35ce6d9b-bfef-11e8-a3d0-5394fd9291a1")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.goals.javamodel.IGoal> GetAllGoals();

  }
  
  public static interface IGoalsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GoalsFunctionsImpl implements IGoalsFunctionsImpl {

    public static final IGoalsFunctionsImpl INSTANCE = new GoalsFunctionsImpl();

    private GoalsFunctionsImpl() {}

  }
  
  public static class GoalsFunctions {

    private GoalsFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,98d71cef-bc87-11e6-b169-a12bde5a1c7c,nBk22d0/ig3s5tomI75+rHHJK0w=] */
