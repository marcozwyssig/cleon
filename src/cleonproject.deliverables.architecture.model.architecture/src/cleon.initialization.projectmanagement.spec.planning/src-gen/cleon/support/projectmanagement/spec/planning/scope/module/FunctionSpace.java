package cleon.support.projectmanagement.spec.planning.scope.module;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[afa77083-349b-11e6-8839-1f6631cc77ac,imports]] */
import cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.Backlog;
import cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog;
import cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint;
import cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.FunctionSpace.IBacklogFunctions;

/* End Protected Region   [[afa77083-349b-11e6-8839-1f6631cc77ac,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[afa77083-349b-11e6-8839-1f6631cc77ac]] */
  
  /* End Protected Region   [[afa77083-349b-11e6-8839-1f6631cc77ac]] */


  public static interface IModuleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e197d504-349e-11e6-8839-1f6631cc77ac")
    public cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog GetBacklog();

    @IDynamicResourceExtension.MethodId("3782abdf-36c0-11e6-ba0a-8d94de7675ef")
    public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases GetReleasePlanning();

    @IDynamicResourceExtension.MethodId("3782abe8-36c0-11e6-ba0a-8d94de7675ef")
    public cleon.support.projectmanagement.spec.planning.schedule.javamodel.ISchedule GetSchedule();

    @IDynamicResourceExtension.MethodId("3782abf4-36c0-11e6-ba0a-8d94de7675ef")
    public cleon.support.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings GetSprintPlannings();

    @IDynamicResourceExtension.MethodId("b7a8e864-c13b-11e6-8f58-ad3c6ee7602f")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("49fdb4ab-d69a-11e6-93e6-6fab9694fc9f")
    public cleon.support.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage GetWorkpackage();

    @IDynamicResourceExtension.MethodId("87caceb9-3fc2-11e7-9016-2b91d722d429")
    public cleon.common.resources.spec.calendar.javamodel.IDay GetStartDay();

    @IDynamicResourceExtension.MethodId("93062c5c-3fc2-11e7-9016-2b91d722d429")
    public cleon.common.resources.spec.calendar.javamodel.IDay GetEndDay();

    @IDynamicResourceExtension.MethodId("f4fa7823-3fc2-11e7-9016-2b91d722d429")
    public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetStartSprint();

    @IDynamicResourceExtension.MethodId("fde15e4d-3fc2-11e7-9016-2b91d722d429")
    public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetEndSprint();

  }
  
  public static interface IModuleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b7a8e864-c13b-11e6-8f58-ad3c6ee7602f")
    public java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module);

    @IDynamicResourceExtension.MethodId("87caceb9-3fc2-11e7-9016-2b91d722d429")
    public cleon.common.resources.spec.calendar.javamodel.IDay GetStartDay(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module);

    @IDynamicResourceExtension.MethodId("93062c5c-3fc2-11e7-9016-2b91d722d429")
    public cleon.common.resources.spec.calendar.javamodel.IDay GetEndDay(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module);

    @IDynamicResourceExtension.MethodId("f4fa7823-3fc2-11e7-9016-2b91d722d429")
    public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetStartSprint(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module);

    @IDynamicResourceExtension.MethodId("fde15e4d-3fc2-11e7-9016-2b91d722d429")
    public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetEndSprint(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module);

  }
  
  public static class ModuleFunctionsImpl implements IModuleFunctionsImpl {

    public static final IModuleFunctionsImpl INSTANCE = new ModuleFunctionsImpl();

    private ModuleFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
      return String.format("LE%02d", module.selectIdentifier());
    }

    @Override
    public cleon.common.resources.spec.calendar.javamodel.IDay GetStartDay(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
      /* Begin Protected Region [[87caceb9-3fc2-11e7-9016-2b91d722d429]] */
    	ISprint sprint = module.extension(IModuleFunctions.class).GetStartSprint();
    	if( sprint == null)
    	{
    		return null;
    	}
    	return sprint.selectStart();
      /* End Protected Region   [[87caceb9-3fc2-11e7-9016-2b91d722d429]] */
    }

    @Override
    public cleon.common.resources.spec.calendar.javamodel.IDay GetEndDay(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
      /* Begin Protected Region [[93062c5c-3fc2-11e7-9016-2b91d722d429]] */
    	ISprint sprint = module.extension(IModuleFunctions.class).GetEndSprint();
    	if( sprint == null)
    	{
    		return null;
    	}
    	return sprint.selectEnd(); 
      /* End Protected Region   [[93062c5c-3fc2-11e7-9016-2b91d722d429]] */
    }

    @Override
    public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetStartSprint(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
      /* Begin Protected Region [[f4fa7823-3fc2-11e7-9016-2b91d722d429]] */
    	List<IBacklog> backlogs = Backlog.selectToMeModule(module);
    	ISprint startSprint = null;
    	for( IBacklog backlog : backlogs )
    	{
    		ISprint first = backlog.extension(IBacklogFunctions.class).FirstPlannedSprint();
    		if( first != null)
    		{
    			if( startSprint == null)
    			{
    				startSprint = first;
    			}
    			else
    			{
        			if( first.selectIdentifier() < startSprint.selectIdentifier())
        			{
        				startSprint = first;
        				
        			}
    			}
    		}
    	}    	
    	
    	return startSprint;
      /* End Protected Region   [[f4fa7823-3fc2-11e7-9016-2b91d722d429]] */
    }

    @Override
    public cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetEndSprint(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
      /* Begin Protected Region [[fde15e4d-3fc2-11e7-9016-2b91d722d429]] */
    	List<IBacklog> backlogs = Backlog.selectToMeModule(module);
    	ISprint endSprint = null;
    	for( IBacklog backlog : backlogs )
    	{
    		ISprint last = backlog.extension(IBacklogFunctions.class).LastPlannedSprint();
    		if( last != null)
    		{
    			if( endSprint == null)
    			{
    				endSprint = last;
    			}
    			else
    			{
        			if( last.selectIdentifier() < endSprint.selectIdentifier())
        			{
        				endSprint = last;
        				
        			}
    			}
    		}
    	}    	
    	
    	return endSprint;
      /* End Protected Region   [[fde15e4d-3fc2-11e7-9016-2b91d722d429]] */
    }

  }
  
  public static class ModuleFunctions {

    private ModuleFunctions() {}

    public static java.lang.String GetId(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
      return DynamicResourceUtil.invoke(IModuleFunctionsImpl.class, ModuleFunctionsImpl.INSTANCE, module).GetId(module);
    }

    public static cleon.common.resources.spec.calendar.javamodel.IDay GetStartDay(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
      return DynamicResourceUtil.invoke(IModuleFunctionsImpl.class, ModuleFunctionsImpl.INSTANCE, module).GetStartDay(module);
    }

    public static cleon.common.resources.spec.calendar.javamodel.IDay GetEndDay(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
      return DynamicResourceUtil.invoke(IModuleFunctionsImpl.class, ModuleFunctionsImpl.INSTANCE, module).GetEndDay(module);
    }

    public static cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetStartSprint(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
      return DynamicResourceUtil.invoke(IModuleFunctionsImpl.class, ModuleFunctionsImpl.INSTANCE, module).GetStartSprint(module);
    }

    public static cleon.support.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetEndSprint(final cleon.support.projectmanagement.spec.planning.scope.module.javamodel.IModule module) {
      return DynamicResourceUtil.invoke(IModuleFunctionsImpl.class, ModuleFunctionsImpl.INSTANCE, module).GetEndSprint(module);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,afa77083-349b-11e6-8839-1f6631cc77ac,RtxnWsV9vP779Y4y5mZgOZMAP6Q=] */
