package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c,imports]] */
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.FunctionSpace_Releases.IReleasesFunctions;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintBacklog;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.Sprint;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.Sprints;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.FunctionSpace_Outcome.IOutcomeFunctions;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.FunctionSpace_Backlog.IBacklogFunctions;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.FunctionSpace_Backlog.IWorkItemFunctions;
import cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog;
import cleon.common.calendar.metamodel.spec.FunctionSpace.DayFunctions;
/* End Protected Region   [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c,imports]] */

public class FunctionSpace_Sprints {

  /* Begin Protected Region [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c]] */
  
  /* End Protected Region   [[5bd4d1da-c4ca-11e5-8558-4b8affb7767c]] */


  public static interface ISprintBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bedae007-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Double SumEffort();

    @IDynamicResourceExtension.MethodId("ea25b46f-8974-11e6-9315-e9960ca482c6")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint GetSprint();

  }
  
  public static interface ISprintBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bedae007-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Double SumEffort(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintBacklog sprintBacklog);

  }
  
  public static class SprintBacklogFunctionsImpl implements ISprintBacklogFunctionsImpl {

    public static final ISprintBacklogFunctionsImpl INSTANCE = new SprintBacklogFunctionsImpl();

    private SprintBacklogFunctionsImpl() {}

    @Override
    public java.lang.Double SumEffort(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintBacklog sprintBacklog) {
      /* Begin Protected Region [[bedae007-c02b-11e5-b927-b1b055d0575f]] */
        return sprintBacklog.selectWorkItems().stream().filter(x -> x.selectEstimate() != null).mapToDouble(p -> Double.parseDouble(p.selectEstimate().selectName())).sum();   
      /* End Protected Region   [[bedae007-c02b-11e5-b927-b1b055d0575f]] */
    }

  }
  
  public static class SprintBacklogFunctions {

    private SprintBacklogFunctions() {}

    public static java.lang.Double SumEffort(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintBacklog sprintBacklog) {
      return DynamicResourceUtil.invoke(ISprintBacklogFunctionsImpl.class, SprintBacklogFunctionsImpl.INSTANCE, sprintBacklog).SumEffort(sprintBacklog);
    }

  }

  public static interface ISprintCapacityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("935a66c2-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Integer SumBruttoCapacity();

    @IDynamicResourceExtension.MethodId("fb93c4d2-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity();

    @IDynamicResourceExtension.MethodId("3bb4378c-cb95-11e5-b911-69bd21f5af67")
    public java.lang.Double CalculatePower();

    @IDynamicResourceExtension.MethodId("6418a382-cb95-11e5-b911-69bd21f5af67")
    public java.lang.String SumEffort();

  }
  
  public static interface ISprintCapacityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("935a66c2-c02b-11e5-b927-b1b055d0575f")
    public java.lang.Integer SumBruttoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity sprintCapacity);

    @IDynamicResourceExtension.MethodId("fb93c4d2-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity sprintCapacity);

    @IDynamicResourceExtension.MethodId("3bb4378c-cb95-11e5-b911-69bd21f5af67")
    public java.lang.Double CalculatePower(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity sprintCapacity);

  }
  
  public static class SprintCapacityFunctionsImpl implements ISprintCapacityFunctionsImpl {

    public static final ISprintCapacityFunctionsImpl INSTANCE = new SprintCapacityFunctionsImpl();

    private SprintCapacityFunctionsImpl() {}

    @Override
    public java.lang.Integer SumBruttoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity sprintCapacity) {
      /* Begin Protected Region [[935a66c2-c02b-11e5-b927-b1b055d0575f]] */
        return sprintCapacity.selectPersonCapacity().values().stream().mapToInt(p -> p.extension(IPersonCapacityFunctions.class).SumBruttoCapacity()).sum();     
      /* End Protected Region   [[935a66c2-c02b-11e5-b927-b1b055d0575f]] */
    }

    @Override
    public java.lang.Integer SumNettoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity sprintCapacity) {
      /* Begin Protected Region [[fb93c4d2-cb91-11e5-b911-69bd21f5af67]] */
    	return sprintCapacity.selectPersonCapacity().values().stream().mapToInt(p -> p.extension(IPersonCapacityFunctions.class).SumNettoCapacity()).sum();    
      /* End Protected Region   [[fb93c4d2-cb91-11e5-b911-69bd21f5af67]] */
    }

    @Override
    public java.lang.Double CalculatePower(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity sprintCapacity) {
      /* Begin Protected Region [[3bb4378c-cb95-11e5-b911-69bd21f5af67]] */
    	ISprintBacklog backlog = Sprint.selectToMeSprintCapacity(sprintCapacity).selectSprintBacklog();
    	double effort = backlog.extension(ISprintBacklogFunctions.class).SumEffort();
    	return effort / SumNettoCapacity(sprintCapacity); 
      /* End Protected Region   [[3bb4378c-cb95-11e5-b911-69bd21f5af67]] */
    }

  }
  
  public static class SprintCapacityFunctions {

    private SprintCapacityFunctions() {}

    public static java.lang.Integer SumBruttoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).SumBruttoCapacity(sprintCapacity);
    }

    public static java.lang.Integer SumNettoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).SumNettoCapacity(sprintCapacity);
    }

    public static java.lang.Double CalculatePower(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity sprintCapacity) {
      return DynamicResourceUtil.invoke(ISprintCapacityFunctionsImpl.class, SprintCapacityFunctionsImpl.INSTANCE, sprintCapacity).CalculatePower(sprintCapacity);
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
    public java.lang.Integer SumBruttoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity personCapacity);

    @IDynamicResourceExtension.MethodId("5b617cb5-cb91-11e5-b911-69bd21f5af67")
    public java.lang.Integer SumNettoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity personCapacity);

  }
  
  public static class PersonCapacityFunctionsImpl implements IPersonCapacityFunctionsImpl {

    public static final IPersonCapacityFunctionsImpl INSTANCE = new PersonCapacityFunctionsImpl();

    private PersonCapacityFunctionsImpl() {}

    @Override
    public java.lang.Integer SumBruttoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity personCapacity) {
      /* Begin Protected Region [[8f9bac0a-c4ca-11e5-8558-4b8affb7767c]] */
        return personCapacity.selectCapacityPerDay().values().stream().mapToInt(y -> y.selectCapacity()).sum();     
 
      /* End Protected Region   [[8f9bac0a-c4ca-11e5-8558-4b8affb7767c]] */
    }

    @Override
    public java.lang.Integer SumNettoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity personCapacity) {
      /* Begin Protected Region [[5b617cb5-cb91-11e5-b911-69bd21f5af67]] */
    	java.lang.Integer sumCapacity = SumBruttoCapacity(personCapacity);
    	return (sumCapacity*personCapacity.selectProductivity())/100;

      /* End Protected Region   [[5b617cb5-cb91-11e5-b911-69bd21f5af67]] */
    }

  }
  
  public static class PersonCapacityFunctions {

    private PersonCapacityFunctions() {}

    public static java.lang.Integer SumBruttoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity personCapacity) {
      return DynamicResourceUtil.invoke(IPersonCapacityFunctionsImpl.class, PersonCapacityFunctionsImpl.INSTANCE, personCapacity).SumBruttoCapacity(personCapacity);
    }

    public static java.lang.Integer SumNettoCapacity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity personCapacity) {
      return DynamicResourceUtil.invoke(IPersonCapacityFunctionsImpl.class, PersonCapacityFunctionsImpl.INSTANCE, personCapacity).SumNettoCapacity(personCapacity);
    }

  }

  public static interface ISprintsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("079398d0-33b1-11e6-94cd-fbf6c8ccd08d")
    public java.lang.Double CalculateVelocity();

    @IDynamicResourceExtension.MethodId("d139e02f-33bf-11e6-94cd-fbf6c8ccd08d")
    public java.lang.Double CalculateVelocityForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome);

    @IDynamicResourceExtension.MethodId("80511a71-349c-11e6-8839-1f6631cc77ac")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint ActualSprintForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome);

    @IDynamicResourceExtension.MethodId("aeb46814-349c-11e6-8839-1f6631cc77ac")
    public java.lang.Integer LastSprintForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome);

    @IDynamicResourceExtension.MethodId("92cde438-349f-11e6-8839-1f6631cc77ac")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases GetReleasePlanning();

  }
  
  public static interface ISprintsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("079398d0-33b1-11e6-94cd-fbf6c8ccd08d")
    public java.lang.Double CalculateVelocity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints);

    @IDynamicResourceExtension.MethodId("d139e02f-33bf-11e6-94cd-fbf6c8ccd08d")
    public java.lang.Double CalculateVelocityForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints);

    @IDynamicResourceExtension.MethodId("80511a71-349c-11e6-8839-1f6631cc77ac")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint ActualSprintForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints);

    @IDynamicResourceExtension.MethodId("aeb46814-349c-11e6-8839-1f6631cc77ac")
    public java.lang.Integer LastSprintForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints);

  }
  
  public static class SprintsFunctionsImpl implements ISprintsFunctionsImpl {

    public static final ISprintsFunctionsImpl INSTANCE = new SprintsFunctionsImpl();

    private SprintsFunctionsImpl() {}

    @Override
    public java.lang.Double CalculateVelocity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints) {
      /* Begin Protected Region [[079398d0-33b1-11e6-94cd-fbf6c8ccd08d]] */
        int sprintCount = 0;
        double sprintDoneWork = 0;
        for( ISprint sprint : sprints.selectSprints())
        {
        	if(!sprint.selectState().isDone())
        	{
        		continue;
        	}
        	
        	sprintCount++;
        	ISprintBacklog sprintBacklog = sprint.selectSprintBacklog();
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
    public java.lang.Double CalculateVelocityForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints) {
      /* Begin Protected Region [[d139e02f-33bf-11e6-94cd-fbf6c8ccd08d]] */
        int sprintCount = 0;
        double sprintDoneWork = 0;
                
        ISprint actualSprint = ActualSprintForModule(outcome, sprints);
        if( actualSprint == null)
        	return new Integer(0).doubleValue();
        
        IReleases releasePlanning = outcome.extension(IOutcomeFunctions.class).GetReleasePlanning();
        IReleasesFunctions planningFunctions = releasePlanning.extension(IReleasesFunctions.class);
        ISprint currentSprint = planningFunctions.CurrentSprint();
        if( currentSprint == null)
        	return new Integer(0).doubleValue();
       
        
        for(int sprintId = actualSprint.selectIdentifier(); sprintId <= currentSprint.selectIdentifier(); ++sprintId )
        {
        	ISprint sprint = planningFunctions.GetSprint(sprintId);
        	if( sprint != null && sprint.selectState().isDone())
        	{
        		ISprint planedSprint = sprints.selectSprints().stream().filter(x -> x.selectIdentifier() == sprint.selectIdentifier()).findFirst().get();
      
        		if( planedSprint == null)
        			continue;
        		
            	ISprintBacklog sprintBacklog = planedSprint.selectSprintBacklog();
            	if( sprintBacklog == null)
            		continue;
            	
        		++sprintCount;
        		double sum = sprintBacklog.selectWorkItems().stream().mapToDouble(x -> {
        			if( x.selectEstimate() == null)
        				return 0;
        			
        			IBacklog backlog = x.extension(IWorkItemFunctions.class).GetBacklog();
        			IOutcome workItemModule = backlog.extension(IBacklogFunctions.class).GetOutcome();
        			if( workItemModule.equals(outcome))
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
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint ActualSprintForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints) {
      /* Begin Protected Region [[80511a71-349c-11e6-8839-1f6631cc77ac]] */
        ISprint lastSprint = null;
        for( ISprint planedSprint : sprints.selectSprints())
        {
        	ISprintBacklog sprintBacklog = planedSprint.selectSprintBacklog();
        	if( sprintBacklog != null)
        	{
        		boolean hasWorkItem = sprintBacklog.selectWorkItems().stream().anyMatch(x -> {
         			IBacklog backlog = x.extension(IWorkItemFunctions.class).GetBacklog();
        			IOutcome workItemModule = backlog.extension(IBacklogFunctions.class).GetOutcome();
        			return workItemModule.equals(outcome);
        		});
        		
        		if( !hasWorkItem)
        		{
        			continue;
        		}
        			
        		if( lastSprint == null)
        		{
        			lastSprint = planedSprint;
        		}
        		else
        		{
        			ISprint sprint = planedSprint;
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
    public java.lang.Integer LastSprintForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints) {
      /* Begin Protected Region [[aeb46814-349c-11e6-8839-1f6631cc77ac]] */
        double velocity = CalculateVelocityForModule(outcome, sprints);
        IBacklog backlog = outcome.extension(IOutcomeFunctions.class).GetBacklog();
        if( backlog == null)
        	return null;

        double sumEstimate = backlog.extension(IBacklogFunctions.class).SumOpenEstimates();
        IReleases releasePlanning = sprints.extension(ISprintsFunctions.class).GetReleasePlanning();
        ISprint currentSprint = releasePlanning.extension(IReleasesFunctions.class).CurrentSprint();
        if( currentSprint == null)
        	return null;
        
        int requiredSprints = new Double(sumEstimate / velocity).intValue();
        return currentSprint.selectIdentifier() + requiredSprints;
      /* End Protected Region   [[aeb46814-349c-11e6-8839-1f6631cc77ac]] */
    }

  }
  
  public static class SprintsFunctions {

    private SprintsFunctions() {}

    public static java.lang.Double CalculateVelocity(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints) {
      return DynamicResourceUtil.invoke(ISprintsFunctionsImpl.class, SprintsFunctionsImpl.INSTANCE, sprints).CalculateVelocity(sprints);
    }

    public static java.lang.Double CalculateVelocityForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints) {
      return DynamicResourceUtil.invoke(ISprintsFunctionsImpl.class, SprintsFunctionsImpl.INSTANCE, sprints).CalculateVelocityForModule(outcome, sprints);
    }

    public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint ActualSprintForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints) {
      return DynamicResourceUtil.invoke(ISprintsFunctionsImpl.class, SprintsFunctionsImpl.INSTANCE, sprints).ActualSprintForModule(outcome, sprints);
    }

    public static java.lang.Integer LastSprintForModule(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.outcomes.javamodel.IOutcome outcome, final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints sprints) {
      return DynamicResourceUtil.invoke(ISprintsFunctionsImpl.class, SprintsFunctionsImpl.INSTANCE, sprints).LastSprintForModule(outcome, sprints);
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
    public java.lang.Boolean IsAFullDay(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("a5cc92a3-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsANoDay(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("aca49591-cb8e-11e5-b911-69bd21f5af67")
    public java.lang.Boolean IsAHalfDay(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay);

    @IDynamicResourceExtension.MethodId("f0ba8e2d-0d63-11e6-9f44-9d0000bae4df")
    public java.lang.Boolean IsWeekend(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay);

  }
  
  public static class CapacityPerDayFunctionsImpl implements ICapacityPerDayFunctionsImpl {

    public static final ICapacityPerDayFunctionsImpl INSTANCE = new CapacityPerDayFunctionsImpl();

    private CapacityPerDayFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsAFullDay(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() >= 8;
    }

    @Override
    public java.lang.Boolean IsANoDay(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() == 0 && !DayFunctions.IsWeekend(capacityPerDay.selectDay());
    }

    @Override
    public java.lang.Boolean IsAHalfDay(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() > 0 && capacityPerDay.selectCapacity() < 8;
    }

    @Override
    public java.lang.Boolean IsWeekend(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay) {
      return capacityPerDay.selectCapacity() == 0 && DayFunctions.IsWeekend(capacityPerDay.selectDay());
    }

  }
  
  public static class CapacityPerDayFunctions {

    private CapacityPerDayFunctions() {}

    public static java.lang.Boolean IsAFullDay(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsAFullDay(capacityPerDay);
    }

    public static java.lang.Boolean IsANoDay(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsANoDay(capacityPerDay);
    }

    public static java.lang.Boolean IsAHalfDay(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsAHalfDay(capacityPerDay);
    }

    public static java.lang.Boolean IsWeekend(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ICapacityPerDay capacityPerDay) {
      return DynamicResourceUtil.invoke(ICapacityPerDayFunctionsImpl.class, CapacityPerDayFunctionsImpl.INSTANCE, capacityPerDay).IsWeekend(capacityPerDay);
    }

  }

  public static interface ISprintFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8077838f-349b-11e6-8839-1f6631cc77ac")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> GetWorkItems();

    @IDynamicResourceExtension.MethodId("da3e9b8e-8a0e-11e6-8085-d9bdba2de943")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IReleases GetReleases();

    @IDynamicResourceExtension.MethodId("4f0e534b-8a0f-11e6-8085-d9bdba2de943")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint LastSprint();

    @IDynamicResourceExtension.MethodId("031358b3-8a13-11e6-8085-d9bdba2de943")
    public cleon.common.calendar.metamodel.spec.javamodel.ICalendar GetCalendar();

    @IDynamicResourceExtension.MethodId("8c24f837-8a18-11e6-8085-d9bdba2de943")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IRelease GetRelease();

    @IDynamicResourceExtension.MethodId("455700f4-d71a-11e6-a422-8b5491da3f30")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IPhase GetPhase();

    @IDynamicResourceExtension.MethodId("0e3853a4-d71b-11e6-a422-8b5491da3f30")
    public List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IRelease> GetMilestoneList();

    @IDynamicResourceExtension.MethodId("230c6690-d164-11e8-882b-c9297140cb78")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprints GetSprints();

  }
  
  public static interface ISprintFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4f0e534b-8a0f-11e6-8085-d9bdba2de943")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint LastSprint(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint sprint);

  }
  
  public static class SprintFunctionsImpl implements ISprintFunctionsImpl {

    public static final ISprintFunctionsImpl INSTANCE = new SprintFunctionsImpl();

    private SprintFunctionsImpl() {}

    @Override
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint LastSprint(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint sprint) {
      /* Begin Protected Region [[4f0e534b-8a0f-11e6-8085-d9bdba2de943]] */
		int lastSprint = sprint.selectIdentifier() - 1;
		for (ISprint iterSprint : Sprints.selectToMeSprints(sprint).selectSprints()) {
			if (iterSprint.selectIdentifier() == lastSprint) {
				return iterSprint;
			}
		}
		
		return null;
      /* End Protected Region   [[4f0e534b-8a0f-11e6-8085-d9bdba2de943]] */
    }

  }
  
  public static class SprintFunctions {

    private SprintFunctions() {}

    public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint LastSprint(final cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprint sprint) {
      return DynamicResourceUtil.invoke(ISprintFunctionsImpl.class, SprintFunctionsImpl.INSTANCE, sprint).LastSprint(sprint);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5bd4d1da-c4ca-11e5-8558-4b8affb7767c,6ZDjOw/L9M5MViFVX+BM7sz1juY=] */
