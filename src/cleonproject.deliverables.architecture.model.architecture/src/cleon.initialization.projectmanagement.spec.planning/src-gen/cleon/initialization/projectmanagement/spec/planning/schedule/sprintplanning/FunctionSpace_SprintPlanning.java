package cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c,imports]] */
import cleon.initialization.projectmanagement.spec.planning.schedule.milestones.FunctionSpace_Milestones.IReleasesFunctions;
import cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases;
import cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint;
import cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog;
import cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlanning;
import cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.SprintPlanning;
import cleon.initialization.projectmanagement.spec.planning.scope.module.FunctionSpace_Module.IModuleFunctions;
import cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule;
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.FunctionSpace.IBacklogFunctions;
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.FunctionSpace.IWorkItemFunctions;
import cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog;
import cleon.common.resources.spec.calendar.FunctionSpace.DayFunctions;
/* End Protected Region   [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c,imports]] */

public class FunctionSpace_SprintPlanning {

  /* Begin Protected Region [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c]] */
  
  /* End Protected Region   [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c]] */


  public static interface ISprintBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bedae007-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Double SumEffort();

    @IDynamicResourceExtension.MethodId("ea25b46f-8974-11e6-9315-e9960ca482c6")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint GetSprint();

  }
  
  public static interface ISprintBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bedae007-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Double SumEffort(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog sprintBacklog);

  }
  
  public static class SprintBacklogFunctionsImpl implements ISprintBacklogFunctionsImpl {

    public static final ISprintBacklogFunctionsImpl INSTANCE = new SprintBacklogFunctionsImpl();

    private SprintBacklogFunctionsImpl() {}

    @Override
    public java.lang.Double SumEffort(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog sprintBacklog) {
      /* Begin Protected Region [[bedae007-c02b-11e5-b927-b1b055d0575f]] */
        return sprintBacklog.selectWorkItems().stream().filter(x -> x.selectEstimate() != null).mapToDouble(p -> Double.parseDouble(p.selectEstimate().selectName())).sum();   
      /* End Protected Region   [[bedae007-c02b-11e5-b927-b1b055d0575f]] */
    }

  }
  
  public static class SprintBacklogFunctions {

    private SprintBacklogFunctions() {}

    public static java.lang.Double SumEffort(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog sprintBacklog) {
      return DynamicResourceUtil.invoke(ISprintBacklogFunctionsImpl.class, SprintBacklogFunctionsImpl.INSTANCE, sprintBacklog).SumEffort(sprintBacklog);
    }

  }

  public static interface ISprintCapacityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("935a66c2-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Integer SumBruttoCapacity();

    @IDynamicResourceExtension.MethodId("fb93c4d2-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity();

    @IDynamicResourceExtension.MethodId("3bb4378c-cb95-11e5-b911-69bd21f5af67")
    public java.lang.Double CalculatePace();

    @IDynamicResourceExtension.MethodId("6418a382-cb95-11e5-b911-69bd21f5af67")
    public java.lang.String SumEffort();

  }
  
  public static interface ISprintCapacityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("935a66c2-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Integer SumBruttoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity sprintCapacity);

    @IDynamicResourceExtension.MethodId("fb93c4d2-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity sprintCapacity);

    @IDynamicResourceExtension.MethodId("3bb4378c-cb95-11e5-b911-69bd21f5af67")
    public java.lang.Double CalculatePace(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity sprintCapacity);

  }
  
  public static class SprintCapacityFunctionsImpl implements ISprintCapacityFunctionsImpl {

    public static final ISprintCapacityFunctionsImpl INSTANCE = new SprintCapacityFunctionsImpl();

    private SprintCapacityFunctionsImpl() {}

    @Override
    public java.lang.Integer SumBruttoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      /* Begin Protected Region [[935a66c2-c02b-11e5-b927-b1b055d0575f]] */
        return sprintCapacity.selectPersonCapacity().values().stream().mapToInt(p -> PersonCapacityFunctionsImpl.INSTANCE.SumBruttoCapacity(p)).sum();     
      /* End Protected Region   [[935a66c2-c02b-11e5-b927-b1b055d0575f]] */
    }

    @Override
    public java.lang.Integer SumNettoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      /* Begin Protected Region [[fb93c4d2-cb91-11e5-b911-69bd21f5af67]] */
    	return sprintCapacity.selectPersonCapacity().values().stream().mapToInt(p -> PersonCapacityFunctionsImpl.INSTANCE.SumNettoCapacity(p)).sum();    
      /* End Protected Region   [[fb93c4d2-cb91-11e5-b911-69bd21f5af67]] */
    }

    @Override
    public java.lang.Double CalculatePace(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      /* Begin Protected Region [[3bb4378c-cb95-11e5-b911-69bd21f5af67]] */
    	ISprintBacklog backlog = SprintPlanning.selectToMeSprintCapacity(sprintCapacity).selectSprintBacklog();
    	double effort = SprintBacklogFunctionsImpl.INSTANCE.SumEffort(backlog);
    	return effort / SumNettoCapacity(sprintCapacity); 
      /* End Protected Region   [[3bb4378c-cb95-11e5-b911-69bd21f5af67]] */
    }

  }
  
  public static class SprintCapacityFunctions {

    private SprintCapacityFunctions() {}

    public static java.lang.Integer SumBruttoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).SumBruttoCapacity(sprintCapacity);
    }

    public static java.lang.Integer SumNettoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).SumNettoCapacity(sprintCapacity);
    }

    public static java.lang.Double CalculatePace(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).CalculatePace(sprintCapacity);
    }

  }

  public static interface IPersonCapacityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8f9bac0a-c4ca-11e5-8558-4b8affb7767c")
    public java.lang.Integer SumBruttoCapacity();

    @IDynamicResourceExtension.MethodId("5b617cb5-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity();

  }
  
  public static interface IPersonCapacityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8f9bac0a-c4ca-11e5-8558-4b8affb7767c")
    public java.lang.Integer SumBruttoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity personCapacity);

    @IDynamicResourceExtension.MethodId("5b617cb5-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity personCapacity);

  }
  
  public static class PersonCapacityFunctionsImpl implements IPersonCapacityFunctionsImpl {

    public static final IPersonCapacityFunctionsImpl INSTANCE = new PersonCapacityFunctionsImpl();

    private PersonCapacityFunctionsImpl() {}

    @Override
    public java.lang.Integer SumBruttoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity personCapacity) {
      /* Begin Protected Region [[8f9bac0a-c4ca-11e5-8558-4b8affb7767c]] */
        return personCapacity.selectCapacityPerDay().values().stream().mapToInt(y -> y.selectCapacity()).sum();     
 
      /* End Protected Region   [[8f9bac0a-c4ca-11e5-8558-4b8affb7767c]] */
    }

    @Override
    public java.lang.Integer SumNettoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity personCapacity) {
      /* Begin Protected Region [[5b617cb5-cb91-11e5-b911-69bd21f5af67]] */
    	java.lang.Integer sumCapacity = SumBruttoCapacity(personCapacity);
    	return (sumCapacity*personCapacity.selectProductivity())/100;

      /* End Protected Region   [[5b617cb5-cb91-11e5-b911-69bd21f5af67]] */
    }

  }
  
  public static class PersonCapacityFunctions {

    private PersonCapacityFunctions() {}

    public static java.lang.Integer SumBruttoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity personCapacity) {
      return DynamicResourceUtil.invoke(IPersonCapacityFunctionsImpl.class, PersonCapacityFunctionsImpl.INSTANCE, personCapacity).SumBruttoCapacity(personCapacity);
    }

    public static java.lang.Integer SumNettoCapacity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity personCapacity) {
      return DynamicResourceUtil.invoke(IPersonCapacityFunctionsImpl.class, PersonCapacityFunctionsImpl.INSTANCE, personCapacity).SumNettoCapacity(personCapacity);
    }

  }

  public static interface ISprintPlanningsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("079398d0-33b1-11e6-94cd-fbf6c8ccd08d")
    public java.lang.Double CalculateVelocity();

    @IDynamicResourceExtension.MethodId("d139e02f-33bf-11e6-94cd-fbf6c8ccd08d")
    public java.lang.Double CalculateVelocityForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module);

    @IDynamicResourceExtension.MethodId("80511a71-349c-11e6-8839-1f6631cc77ac")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint ActualSprintForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module);

    @IDynamicResourceExtension.MethodId("aeb46814-349c-11e6-8839-1f6631cc77ac")
    public java.lang.Integer LastSprintForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module);

    @IDynamicResourceExtension.MethodId("92cde438-349f-11e6-8839-1f6631cc77ac")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.IReleases GetReleasePlanning();

  }
  
  public static interface ISprintPlanningsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("079398d0-33b1-11e6-94cd-fbf6c8ccd08d")
    public java.lang.Double CalculateVelocity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings);

    @IDynamicResourceExtension.MethodId("d139e02f-33bf-11e6-94cd-fbf6c8ccd08d")
    public java.lang.Double CalculateVelocityForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module, final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings);

    @IDynamicResourceExtension.MethodId("80511a71-349c-11e6-8839-1f6631cc77ac")
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint ActualSprintForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module, final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings);

    @IDynamicResourceExtension.MethodId("aeb46814-349c-11e6-8839-1f6631cc77ac")
    public java.lang.Integer LastSprintForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module, final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings);

  }
  
  public static class SprintPlanningsFunctionsImpl implements ISprintPlanningsFunctionsImpl {

    public static final ISprintPlanningsFunctionsImpl INSTANCE = new SprintPlanningsFunctionsImpl();

    private SprintPlanningsFunctionsImpl() {}

    @Override
    public java.lang.Double CalculateVelocity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings) {
      /* Begin Protected Region [[079398d0-33b1-11e6-94cd-fbf6c8ccd08d]] */
        int sprintCount = 0;
        double sprintDoneWork = 0;
        for( ISprintPlanning planning : sprintPlannings.selectSprintplannings().values())
        {
        	if(!planning.selectSprint().selectState().isDone())
        	{
        		continue;
        	}
        	
        	sprintCount++;
        	ISprintBacklog sprintBacklog = planning.selectSprintBacklog();
        	if( sprintBacklog != null)
        	{
        		double sum = sprintBacklog.selectWorkItems().stream().mapToDouble(x -> {
        			if( x.selectEstimate() == null)
        				return 0;
        			return Double.parseDouble(x.selectEstimate().selectName());
        		}).sum();
        		sprintDoneWork += sum;
        	}
        }
        if( sprintCount == 0)
        {
        	return 0.0;
        }
 
        
        return sprintDoneWork / sprintCount;
      /* End Protected Region   [[079398d0-33b1-11e6-94cd-fbf6c8ccd08d]] */
    }

    @Override
    public java.lang.Double CalculateVelocityForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module, final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings) {
      /* Begin Protected Region [[d139e02f-33bf-11e6-94cd-fbf6c8ccd08d]] */
        int sprintCount = 0;
        double sprintDoneWork = 0;
                
        ISprint actualSprint = ActualSprintForModule(module, sprintPlannings);
        if( actualSprint == null)
        	return new Integer(0).doubleValue();
        
        IReleases releasePlanning = module.extension(IModuleFunctions.class).GetReleasePlanning();
        IReleasesFunctions planningFunctions = releasePlanning.extension(IReleasesFunctions.class);
        ISprint currentSprint = planningFunctions.CurrentSprint();
        if( currentSprint == null)
        	return new Integer(0).doubleValue();
       
        
        for(int sprintId = actualSprint.selectIdentifier(); sprintId <= currentSprint.selectIdentifier(); ++sprintId )
        {
        	ISprint sprint = planningFunctions.GetSprint(sprintId);
        	if( sprint != null && sprint.selectState().isDone())
        	{
        		ISprintPlanning planning = sprintPlannings.selectSprintplannings().get(sprint.getResource());
      
        		if( planning == null)
        			continue;
        		
            	ISprintBacklog sprintBacklog = planning.selectSprintBacklog();
            	if( sprintBacklog == null)
            		continue;
            	
        		++sprintCount;
        		double sum = sprintBacklog.selectWorkItems().stream().mapToDouble(x -> {
        			if( x.selectEstimate() == null)
        				return 0;
        			
        			IBacklog backlog = x.extension(IWorkItemFunctions.class).GetBacklog();
        			IModule workItemModule = backlog.extension(IBacklogFunctions.class).GetModule();
        			if( workItemModule.equals(module))
        			{
            			return Double.parseDouble(x.selectEstimate().selectName());        				
        			}
        			return 0;
        		}).sum();
        		sprintDoneWork += sum;
        	}
        }
        
        return sprintDoneWork / sprintCount;
      /* End Protected Region   [[d139e02f-33bf-11e6-94cd-fbf6c8ccd08d]] */
    }

    @Override
    public cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint ActualSprintForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module, final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings) {
      /* Begin Protected Region [[80511a71-349c-11e6-8839-1f6631cc77ac]] */
        ISprint lastSprint = null;
        for( ISprintPlanning planning : sprintPlannings.selectSprintplannings().values())
        {
        	ISprintBacklog sprintBacklog = planning.selectSprintBacklog();
        	if( sprintBacklog != null)
        	{
        		boolean hasWorkItem = sprintBacklog.selectWorkItems().stream().anyMatch(x -> {
         			IBacklog backlog = x.extension(IWorkItemFunctions.class).GetBacklog();
        			IModule workItemModule = backlog.extension(IBacklogFunctions.class).GetModule();
        			return workItemModule.equals(module);
        		});
        		
        		if( !hasWorkItem)
        		{
        			continue;
        		}
        			
        		if( lastSprint == null)
        		{
        			lastSprint = planning.selectSprint();
        		}
        		else
        		{
        			ISprint sprint = planning.selectSprint();
        			if( lastSprint.selectIdentifier() > sprint.selectIdentifier())
        			{
            			lastSprint = sprint;        				
        			}
        		}
        	}
        }
        
        return lastSprint;
      /* End Protected Region   [[80511a71-349c-11e6-8839-1f6631cc77ac]] */
    }

    @Override
    public java.lang.Integer LastSprintForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module, final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings) {
      /* Begin Protected Region [[aeb46814-349c-11e6-8839-1f6631cc77ac]] */
        double velocity = CalculateVelocityForModule(module, sprintPlannings);
        IBacklog backlog = module.extension(IModuleFunctions.class).GetBacklog();
        if( backlog == null)
        	return null;

        double sumEstimate = backlog.extension(IBacklogFunctions.class).SumOpenEstimates();
        IReleases releasePlanning = sprintPlannings.extension(ISprintPlanningsFunctions.class).GetReleasePlanning();
        ISprint currentSprint = releasePlanning.extension(IReleasesFunctions.class).CurrentSprint();
        if( currentSprint == null)
        	return null;
        
        int requiredSprints = new Double(sumEstimate / velocity).intValue();
        return currentSprint.selectIdentifier() + requiredSprints;
      /* End Protected Region   [[aeb46814-349c-11e6-8839-1f6631cc77ac]] */
    }

  }
  
  public static class SprintPlanningsFunctions {

    private SprintPlanningsFunctions() {}

    public static java.lang.Double CalculateVelocity(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings) {
      return DynamicResourceUtil.invoke(ISprintPlanningsFunctionsImpl.class, SprintPlanningsFunctionsImpl.INSTANCE, sprintPlannings).CalculateVelocity(sprintPlannings);
    }

    public static java.lang.Double CalculateVelocityForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module, final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings) {
      return DynamicResourceUtil.invoke(ISprintPlanningsFunctionsImpl.class, SprintPlanningsFunctionsImpl.INSTANCE, sprintPlannings).CalculateVelocityForModule(module, sprintPlannings);
    }

    public static cleon.initialization.projectmanagement.spec.planning.schedule.milestones.javamodel.ISprint ActualSprintForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module, final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings) {
      return DynamicResourceUtil.invoke(ISprintPlanningsFunctionsImpl.class, SprintPlanningsFunctionsImpl.INSTANCE, sprintPlannings).ActualSprintForModule(module, sprintPlannings);
    }

    public static java.lang.Integer LastSprintForModule(final cleon.initialization.projectmanagement.spec.planning.scope.module.javamodel.IModule module, final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintPlannings sprintPlannings) {
      return DynamicResourceUtil.invoke(ISprintPlanningsFunctionsImpl.class, SprintPlanningsFunctionsImpl.INSTANCE, sprintPlannings).LastSprintForModule(module, sprintPlannings);
    }

  }

  public static interface ICapacityPerDayFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("67f7685c-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAFullDay();

    @IDynamicResourceExtension.MethodId("a5cc92a3-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsANoDay();

    @IDynamicResourceExtension.MethodId("aca49591-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAHalfDay();

    @IDynamicResourceExtension.MethodId("f0ba8e2d-0d63-11e6-9f44-9d0000bae4df")
    public java.lang.Boolean IsWeekend();

  }
  
  public static interface ICapacityPerDayFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("67f7685c-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAFullDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("a5cc92a3-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsANoDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("aca49591-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAHalfDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("f0ba8e2d-0d63-11e6-9f44-9d0000bae4df")
    public java.lang.Boolean IsWeekend(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay);

  }
  
  public static class CapacityPerDayFunctionsImpl implements ICapacityPerDayFunctionsImpl {

    public static final ICapacityPerDayFunctionsImpl INSTANCE = new CapacityPerDayFunctionsImpl();

    private CapacityPerDayFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsAFullDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() >= 8;
    }

    @Override
    public java.lang.Boolean IsANoDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() == 0 && !DayFunctions.IsWeekend(capacityPerDay.selectDay());
    }

    @Override
    public java.lang.Boolean IsAHalfDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() > 0 && capacityPerDay.selectCapacity() < 8;
    }

    @Override
    public java.lang.Boolean IsWeekend(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() == 0 && DayFunctions.IsWeekend(capacityPerDay.selectDay());
    }

  }
  
  public static class CapacityPerDayFunctions {

    private CapacityPerDayFunctions() {}

    public static java.lang.Boolean IsAFullDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsAFullDay(capacityPerDay);
    }

    public static java.lang.Boolean IsANoDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsANoDay(capacityPerDay);
    }

    public static java.lang.Boolean IsAHalfDay(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsAHalfDay(capacityPerDay);
    }

    public static java.lang.Boolean IsWeekend(final cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsWeekend(capacityPerDay);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5bd4d1da-c4ca-11e5-8558-4b8affb7767c,iesBs39rouTDNmWdnJrU+oDpQrI=] */
