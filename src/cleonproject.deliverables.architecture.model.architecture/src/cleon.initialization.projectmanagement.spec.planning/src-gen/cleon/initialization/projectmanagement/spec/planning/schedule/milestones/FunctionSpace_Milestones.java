package cleon.initialization.projectmanagement.spec.planning.schedule.milestones;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7833baaa-349b-11e6-8839-1f6631cc77ac,imports]] */
import cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.*;
import cleon.common.resources.spec.calendar.FunctionSpace.DayFunctionsImpl;
/* End Protected Region   [[7833baaa-349b-11e6-8839-1f6631cc77ac,imports]] */

public class FunctionSpace_Milestones {

  /* Begin Protected Region [[7833baaa-349b-11e6-8839-1f6631cc77ac]] */
  
  /* End Protected Region   [[7833baaa-349b-11e6-8839-1f6631cc77ac]] */


  public static interface ISprintFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8077838f-349b-11e6-8839-1f6631cc77ac")
    public List<cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItem> GetWorkItems();

    @IDynamicResourceExtension.MethodId("da3e9b8e-8a0e-11e6-8085-d9bdba2de943")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases GetRelasePlanning();

    @IDynamicResourceExtension.MethodId("4f0e534b-8a0f-11e6-8085-d9bdba2de943")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint LastSprint();

    @IDynamicResourceExtension.MethodId("031358b3-8a13-11e6-8085-d9bdba2de943")
    public cleon.common.resources.spec.calendar.javamodel.ICalendar GetCalendar();

    @IDynamicResourceExtension.MethodId("8c24f837-8a18-11e6-8085-d9bdba2de943")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IRelease GetMilestone();

    @IDynamicResourceExtension.MethodId("f6a0163b-d66b-11e6-ad1f-c967b4caaf09")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases GetMilestones();

    @IDynamicResourceExtension.MethodId("455700f4-d71a-11e6-a422-8b5491da3f30")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IPhase GetPhase();

    @IDynamicResourceExtension.MethodId("0e3853a4-d71b-11e6-a422-8b5491da3f30")
    public List<cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IRelease> GetMilestoneList();

  }
  
  public static interface ISprintFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4f0e534b-8a0f-11e6-8085-d9bdba2de943")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint LastSprint(final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint sprint);

  }
  
  public static class SprintFunctionsImpl implements ISprintFunctionsImpl {

    public static final ISprintFunctionsImpl INSTANCE = new SprintFunctionsImpl();

    private SprintFunctionsImpl() {}

    @Override
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint LastSprint(final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint sprint) {
      /* Begin Protected Region [[4f0e534b-8a0f-11e6-8085-d9bdba2de943]] */
		List<IRelease> milestones = sprint.extension(ISprintFunctions.class).GetMilestoneList();
		
		int lastSprint = sprint.selectIdentifier() - 1;
		for (IRelease releasePlanning1 : milestones) {
			for (ISprint iterSprint : releasePlanning1.selectSprints()) {
				if (iterSprint.selectIdentifier() == lastSprint) {
					return iterSprint;
				}
			}
		}
		
		return null;
      /* End Protected Region   [[4f0e534b-8a0f-11e6-8085-d9bdba2de943]] */
    }

  }
  
  public static class SprintFunctions {

    private SprintFunctions() {}

    public static cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint LastSprint(final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint sprint) {
      return DynamicResourceUtil.invoke(ISprintFunctionsImpl.class, SprintFunctionsImpl.INSTANCE, sprint).LastSprint(sprint);
    }

  }

  public static interface IReleasesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9f89e48d-2f1d-11e6-8bd9-a77b8d2a3a0e")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint CurrentSprint();

    @IDynamicResourceExtension.MethodId("9cc04b4c-2f22-11e6-8bd9-a77b8d2a3a0e")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint BeforeCurrentSprint();

    @IDynamicResourceExtension.MethodId("59a78067-34a0-11e6-8839-1f6631cc77ac")
    public List<cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint> GetAllSprints();

    @IDynamicResourceExtension.MethodId("80ddb44e-36c1-11e6-ba0a-8d94de7675ef")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetSprint(final java.lang.Integer sprintId);

    @IDynamicResourceExtension.MethodId("6986f5c4-d71b-11e6-a422-8b5491da3f30")
    public List<cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IRelease> GetMilestoneList();

    @IDynamicResourceExtension.MethodId("b2800c16-aaa2-11e8-b25a-7dd9f85a27ad")
    public java.lang.String GetVelocity();

  }
  
  public static interface IReleasesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9f89e48d-2f1d-11e6-8bd9-a77b8d2a3a0e")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint CurrentSprint(final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases releases);

    @IDynamicResourceExtension.MethodId("9cc04b4c-2f22-11e6-8bd9-a77b8d2a3a0e")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint BeforeCurrentSprint(final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases releases);

    @IDynamicResourceExtension.MethodId("80ddb44e-36c1-11e6-ba0a-8d94de7675ef")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetSprint(final java.lang.Integer sprintId, final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases releases);

  }
  
  public static class ReleasesFunctionsImpl implements IReleasesFunctionsImpl {

    public static final IReleasesFunctionsImpl INSTANCE = new ReleasesFunctionsImpl();

    private ReleasesFunctionsImpl() {}

    @Override
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint CurrentSprint(final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases releases) {
      /* Begin Protected Region [[9f89e48d-2f1d-11e6-8bd9-a77b8d2a3a0e]] */
        java.util.Date now = new java.util.Date();
        List<IRelease> milestonesList = releases.extension(IReleasesFunctions.class).GetMilestoneList();
        
        for( IRelease releasePlanning1 : milestonesList)
        {
      	  for( ISprint sprint : releasePlanning1.selectSprints())
      	  {
          	  java.util.Date startDateOfSprint = DayFunctionsImpl.INSTANCE.GetDate(sprint.selectStart());
          	  java.util.Date endDateOfSprint = DayFunctionsImpl.INSTANCE.GetDate(sprint.selectEnd());
          	  if( startDateOfSprint.before(now) && endDateOfSprint.after(now))
          	  {
          		  return sprint;
          	  }    		  
      	  }
        }
        return null;
      /* End Protected Region   [[9f89e48d-2f1d-11e6-8bd9-a77b8d2a3a0e]] */
    }

    @Override
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint BeforeCurrentSprint(final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases releases) {
      /* Begin Protected Region [[9cc04b4c-2f22-11e6-8bd9-a77b8d2a3a0e]] */
        ISprint currentSprint = CurrentSprint(releases);
        if(currentSprint == null)
        {
      	  return null;
        }
        
        int lastSprint = currentSprint.selectIdentifier() - 1;
        List<IRelease> milestonesList = releases.extension(IReleasesFunctions.class).GetMilestoneList();
        for( IRelease releasePlanning1 : milestonesList)
        {
      	  for( ISprint sprint : releasePlanning1.selectSprints())
      	  {
      		  if( sprint.selectIdentifier() == lastSprint)
      		  {
          		  return sprint;
          	  }    		  
      	  }
        } 
        return null;
      /* End Protected Region   [[9cc04b4c-2f22-11e6-8bd9-a77b8d2a3a0e]] */
    }

    @Override
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetSprint(final java.lang.Integer sprintId, final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases releases) {
      /* Begin Protected Region [[80ddb44e-36c1-11e6-ba0a-8d94de7675ef]] */
      List<IRelease> milestonesList = releases.extension(IReleasesFunctions.class).GetMilestoneList();
      return milestonesList.stream().flatMap(x -> x.selectSprints().stream()).filter(x -> x.selectIdentifier() == sprintId).findFirst().orElse(null);
      /* End Protected Region   [[80ddb44e-36c1-11e6-ba0a-8d94de7675ef]] */
    }

  }
  
  public static class ReleasesFunctions {

    private ReleasesFunctions() {}

    public static cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint CurrentSprint(final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases releases) {
      return DynamicResourceUtil.invoke(IReleasesFunctionsImpl.class, ReleasesFunctionsImpl.INSTANCE, releases).CurrentSprint(releases);
    }

    public static cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint BeforeCurrentSprint(final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases releases) {
      return DynamicResourceUtil.invoke(IReleasesFunctionsImpl.class, ReleasesFunctionsImpl.INSTANCE, releases).BeforeCurrentSprint(releases);
    }

    public static cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetSprint(final java.lang.Integer sprintId, final cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases releases) {
      return DynamicResourceUtil.invoke(IReleasesFunctionsImpl.class, ReleasesFunctionsImpl.INSTANCE, releases).GetSprint(sprintId, releases);
    }

  }

  public static interface IReleaseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("653a6870-d66b-11e6-ad1f-c967b4caaf09")
    public cleon.common.resources.spec.calendar.javamodel.IDay StartDate();

    @IDynamicResourceExtension.MethodId("8078e4d7-d66b-11e6-ad1f-c967b4caaf09")
    public cleon.common.resources.spec.calendar.javamodel.IDay EndDate();

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
    public cleon.common.resources.spec.calendar.javamodel.IDay StartDate();

    @IDynamicResourceExtension.MethodId("f3727eb7-d719-11e6-a422-8b5491da3f30")
    public cleon.common.resources.spec.calendar.javamodel.IDay EndDate();

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
    public cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule GetModule();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7833baaa-349b-11e6-8839-1f6631cc77ac,Fh6Z0vyGmgSAagMpu5MJsN73ZZU=] */
