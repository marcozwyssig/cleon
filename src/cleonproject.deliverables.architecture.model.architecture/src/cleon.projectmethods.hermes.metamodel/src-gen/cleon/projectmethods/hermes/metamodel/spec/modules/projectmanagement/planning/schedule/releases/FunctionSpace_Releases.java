package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7833baaa-349b-11e6-8839-1f6631cc77ac,imports]] */
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.*;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.*;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.javamodel.Schedule;
import cleon.common.calendar.metamodel.spec.FunctionSpace.DayFunctionsImpl;
import cleon.common.calendar.metamodel.spec.FunctionSpace.IDayFunctions;
/* End Protected Region   [[7833baaa-349b-11e6-8839-1f6631cc77ac,imports]] */

public class FunctionSpace_Releases {

  /* Begin Protected Region [[7833baaa-349b-11e6-8839-1f6631cc77ac]] */
  
  /* End Protected Region   [[7833baaa-349b-11e6-8839-1f6631cc77ac]] */


  public static interface IReleasesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f89e48d-2f1d-11e6-8bd9-a77b8d2a3a0e")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint CurrentSprint();

    @IDynamicResourceExtension.MethodId("9cc04b4c-2f22-11e6-8bd9-a77b8d2a3a0e")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint BeforeCurrentSprint();

    @IDynamicResourceExtension.MethodId("59a78067-34a0-11e6-8839-1f6631cc77ac")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint> GetAllSprints();

    @IDynamicResourceExtension.MethodId("80ddb44e-36c1-11e6-ba0a-8d94de7675ef")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint GetSprint(final java.lang.Integer sprintId);

    @IDynamicResourceExtension.MethodId("6986f5c4-d71b-11e6-a422-8b5491da3f30")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IRelease> GetMilestoneList();

    @IDynamicResourceExtension.MethodId("b2800c16-aaa2-11e8-b25a-7dd9f85a27ad")
    public java.lang.String GetVelocity();

  }
  
  public static interface IReleasesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9f89e48d-2f1d-11e6-8bd9-a77b8d2a3a0e")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint CurrentSprint(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases releases);

    @IDynamicResourceExtension.MethodId("9cc04b4c-2f22-11e6-8bd9-a77b8d2a3a0e")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint BeforeCurrentSprint(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases releases);

    @IDynamicResourceExtension.MethodId("80ddb44e-36c1-11e6-ba0a-8d94de7675ef")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint GetSprint(final java.lang.Integer sprintId, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases releases);

  }
  
  public static class ReleasesFunctionsImpl implements IReleasesFunctionsImpl {

    public static final IReleasesFunctionsImpl INSTANCE = new ReleasesFunctionsImpl();

    private ReleasesFunctionsImpl() {}

    @Override
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint CurrentSprint(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases releases) {
      /* Begin Protected Region [[9f89e48d-2f1d-11e6-8bd9-a77b8d2a3a0e]] */
    	java.util.Date now = new java.util.Date();
   
    	for( ISprint sprint : Schedule.selectToMeReleases(releases).selectSprints().selectSprints())
    	{
		  	java.util.Date startDateOfSprint = sprint.selectStart().extension(IDayFunctions.class).GetDate();
		  	java.util.Date endDateOfSprint = sprint.selectEnd().extension(IDayFunctions.class).GetDate();
		  	if( startDateOfSprint.before(now) && endDateOfSprint.after(now))
		  	{
		  		return sprint;
		  	}    		  
  		}
  		return null;
      /* End Protected Region   [[9f89e48d-2f1d-11e6-8bd9-a77b8d2a3a0e]] */
    }

    @Override
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint BeforeCurrentSprint(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases releases) {
      /* Begin Protected Region [[9cc04b4c-2f22-11e6-8bd9-a77b8d2a3a0e]] */
        ISprint currentSprint = CurrentSprint(releases);
        if(currentSprint == null)
        {
      	  return null;
        }
        
        int lastSprint = currentSprint.selectIdentifier() - 1;
        for( ISprint sprint : Schedule.selectToMeReleases(releases).selectSprints().selectSprints())
        {
        	if( sprint.selectIdentifier() == lastSprint)
        	{
        		return sprint;
        	}    		  
  	  	}

  	  	return null;
      /* End Protected Region   [[9cc04b4c-2f22-11e6-8bd9-a77b8d2a3a0e]] */
    }

    @Override
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint GetSprint(final java.lang.Integer sprintId, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases releases) {
      /* Begin Protected Region [[80ddb44e-36c1-11e6-ba0a-8d94de7675ef]] */
      return Schedule.selectToMeReleases(releases).selectSprints().selectSprints().stream().filter(x -> x.selectIdentifier() == sprintId).findFirst().orElse(null);
      /* End Protected Region   [[80ddb44e-36c1-11e6-ba0a-8d94de7675ef]] */
    }

  }
  
  public static class ReleasesFunctions {

    private ReleasesFunctions() {}

    public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint CurrentSprint(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases releases) {
      return DynamicResourceUtil.invoke(IReleasesFunctionsImpl.class, ReleasesFunctionsImpl.INSTANCE, releases).CurrentSprint(releases);
    }

    public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint BeforeCurrentSprint(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases releases) {
      return DynamicResourceUtil.invoke(IReleasesFunctionsImpl.class, ReleasesFunctionsImpl.INSTANCE, releases).BeforeCurrentSprint(releases);
    }

    public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint GetSprint(final java.lang.Integer sprintId, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases releases) {
      return DynamicResourceUtil.invoke(IReleasesFunctionsImpl.class, ReleasesFunctionsImpl.INSTANCE, releases).GetSprint(sprintId, releases);
    }

  }

  public static interface IReleaseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("653a6870-d66b-11e6-ad1f-c967b4caaf09")
    public cleon.common.calendar.metamodel.spec.javamodel.IDay StartDate();

    @IDynamicResourceExtension.MethodId("8078e4d7-d66b-11e6-ad1f-c967b4caaf09")
    public cleon.common.calendar.metamodel.spec.javamodel.IDay EndDate();

    @IDynamicResourceExtension.MethodId("261a4a3f-d13c-11e8-882b-c9297140cb78")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint> GetSprints();

  }
  
  public static interface IReleaseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReleaseFunctionsImpl implements IReleaseFunctionsImpl {

    public static final IReleaseFunctionsImpl INSTANCE = new ReleaseFunctionsImpl();

    private ReleaseFunctionsImpl() {}

  }
  
  public static class ReleaseFunctions {

    private ReleaseFunctions() {}

  }

  public static interface IPhaseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f3727eac-d719-11e6-a422-8b5491da3f30")
    public cleon.common.calendar.metamodel.spec.javamodel.IDay StartDate();

    @IDynamicResourceExtension.MethodId("f3727eb7-d719-11e6-a422-8b5491da3f30")
    public cleon.common.calendar.metamodel.spec.javamodel.IDay EndDate();

  }
  
  public static interface IPhaseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PhaseFunctionsImpl implements IPhaseFunctionsImpl {

    public static final IPhaseFunctionsImpl INSTANCE = new PhaseFunctionsImpl();

    private PhaseFunctionsImpl() {}

  }
  
  public static class PhaseFunctions {

    private PhaseFunctions() {}

  }

  public static interface ISprintPlanningAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5d180fb5-3fc3-11e7-9016-2b91d722d429")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome GetModule();

  }
  
  public static interface ISprintPlanningAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SprintPlanningAwareFunctionsImpl implements ISprintPlanningAwareFunctionsImpl {

    public static final ISprintPlanningAwareFunctionsImpl INSTANCE = new SprintPlanningAwareFunctionsImpl();

    private SprintPlanningAwareFunctionsImpl() {}

  }
  
  public static class SprintPlanningAwareFunctions {

    private SprintPlanningAwareFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7833baaa-349b-11e6-8839-1f6631cc77ac,7XTTe+H+ldU58q95bGmR22fba0A=] */
