package cleon.initialization.projectmanagement.spec.planning.scope.outcomes;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[afa77083-349b-11e6-8839-1f6631cc77ac,imports]] */
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.Backlog;
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog;
import cleon.initialization.projectmanagement.spec.planning.schedule.releases.javamodel.ISprint;
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.FunctionSpace_Backlog.IBacklogFunctions;

/* End Protected Region   [[afa77083-349b-11e6-8839-1f6631cc77ac,imports]] */

public class FunctionSpace_Outcome {

  /* Begin Protected Region [[afa77083-349b-11e6-8839-1f6631cc77ac]] */
  
  /* End Protected Region   [[afa77083-349b-11e6-8839-1f6631cc77ac]] */


  public static interface IOutcomeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e197d504-349e-11e6-8839-1f6631cc77ac")
    public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog GetBacklog();

    @IDynamicResourceExtension.MethodId("3782abdf-36c0-11e6-ba0a-8d94de7675ef")
    public cleon.initialization.projectmanagement.spec.planning.schedule.releases.javamodel.IReleases GetReleasePlanning();

    @IDynamicResourceExtension.MethodId("3782abe8-36c0-11e6-ba0a-8d94de7675ef")
    public cleon.initialization.projectmanagement.spec.planning.schedule.javamodel.ISchedule GetSchedule();

    @IDynamicResourceExtension.MethodId("3782abf4-36c0-11e6-ba0a-8d94de7675ef")
    public cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings GetSprintPlannings();

    @IDynamicResourceExtension.MethodId("b7a8e864-c13b-11e6-8f58-ad3c6ee7602f")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("49fdb4ab-d69a-11e6-93e6-6fab9694fc9f")
    public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage GetWorkpackage();

    @IDynamicResourceExtension.MethodId("87caceb9-3fc2-11e7-9016-2b91d722d429")
    public cleon.common.resources.spec.calendar.javamodel.IDay GetStartDay();

    @IDynamicResourceExtension.MethodId("93062c5c-3fc2-11e7-9016-2b91d722d429")
    public cleon.common.resources.spec.calendar.javamodel.IDay GetEndDay();

    @IDynamicResourceExtension.MethodId("f4fa7823-3fc2-11e7-9016-2b91d722d429")
    public cleon.initialization.projectmanagement.spec.planning.schedule.releases.javamodel.ISprint GetStartSprint();

    @IDynamicResourceExtension.MethodId("fde15e4d-3fc2-11e7-9016-2b91d722d429")
    public cleon.initialization.projectmanagement.spec.planning.schedule.releases.javamodel.ISprint GetEndSprint();

  }
  
  public static interface IOutcomeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b7a8e864-c13b-11e6-8f58-ad3c6ee7602f")
    public java.lang.String GetId(final cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome outcome);

    @IDynamicResourceExtension.MethodId("87caceb9-3fc2-11e7-9016-2b91d722d429")
    public cleon.common.resources.spec.calendar.javamodel.IDay GetStartDay(final cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome outcome);

    @IDynamicResourceExtension.MethodId("93062c5c-3fc2-11e7-9016-2b91d722d429")
    public cleon.common.resources.spec.calendar.javamodel.IDay GetEndDay(final cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome outcome);

  }
  
  public static class OutcomeFunctionsImpl implements IOutcomeFunctionsImpl {

    public static final IOutcomeFunctionsImpl INSTANCE = new OutcomeFunctionsImpl();

    private OutcomeFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome outcome) {
      return String.format("LO%02d", outcome.selectIdentifier());
    }

    @Override
    public cleon.common.resources.spec.calendar.javamodel.IDay GetStartDay(final cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome outcome) {
      /* Begin Protected Region [[87caceb9-3fc2-11e7-9016-2b91d722d429]] */
    	ISprint sprint = outcome.extension(IOutcomeFunctions.class).GetStartSprint();
    	if( sprint == null)
    	{
    		return null;
    	}
    	return sprint.selectStart();
      /* End Protected Region   [[87caceb9-3fc2-11e7-9016-2b91d722d429]] */
    }

    @Override
    public cleon.common.resources.spec.calendar.javamodel.IDay GetEndDay(final cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome outcome) {
      /* Begin Protected Region [[93062c5c-3fc2-11e7-9016-2b91d722d429]] */
    	ISprint sprint = outcome.extension(IOutcomeFunctions.class).GetEndSprint();
    	if( sprint == null)
    	{
    		return null;
    	}
    	return sprint.selectEnd(); 
      /* End Protected Region   [[93062c5c-3fc2-11e7-9016-2b91d722d429]] */
    }

  }
  
  public static class OutcomeFunctions {

    private OutcomeFunctions() {}

    public static java.lang.String GetId(final cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome outcome) {
      return DynamicResourceUtil.invoke(IOutcomeFunctionsImpl.class, OutcomeFunctionsImpl.INSTANCE, outcome).GetId(outcome);
    }

    public static cleon.common.resources.spec.calendar.javamodel.IDay GetStartDay(final cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome outcome) {
      return DynamicResourceUtil.invoke(IOutcomeFunctionsImpl.class, OutcomeFunctionsImpl.INSTANCE, outcome).GetStartDay(outcome);
    }

    public static cleon.common.resources.spec.calendar.javamodel.IDay GetEndDay(final cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome outcome) {
      return DynamicResourceUtil.invoke(IOutcomeFunctionsImpl.class, OutcomeFunctionsImpl.INSTANCE, outcome).GetEndDay(outcome);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,afa77083-349b-11e6-8839-1f6631cc77ac,RhhhNoZS9vvDLu7y7CK+6i60YzU=] */
