package cleon.initialization.projectmanagement.spec.planning.goals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[98d71cef-bc87-11e6-b169-a12bde5a1c7c,imports]] */

/* End Protected Region   [[98d71cef-bc87-11e6-b169-a12bde5a1c7c,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[98d71cef-bc87-11e6-b169-a12bde5a1c7c]] */
  
  /* End Protected Region   [[98d71cef-bc87-11e6-b169-a12bde5a1c7c]] */


  public static interface IGoalFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("98d74401-bc87-11e6-b169-a12bde5a1c7c")
    public java.lang.String GetId();

  }
  
  public static interface IGoalFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("98d74401-bc87-11e6-b169-a12bde5a1c7c")
    public java.lang.String GetId(final cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoal goal);

  }
  
  public static class GoalFunctionsImpl implements IGoalFunctionsImpl {

    public static final IGoalFunctionsImpl INSTANCE = new GoalFunctionsImpl();

    private GoalFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoal goal) {
      return String.format("Z%02d", goal.selectIdentifier());  
    }

  }
  
  public static class GoalFunctions {

    private GoalFunctions() {}

    public static java.lang.String GetId(final cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoal goal) {
      return DynamicResourceUtil.invoke(IGoalFunctionsImpl.class, GoalFunctionsImpl.INSTANCE, goal).GetId(goal);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,98d71cef-bc87-11e6-b169-a12bde5a1c7c,sUfa5nLePUqGG5keDv88PNGW1NA=] */
