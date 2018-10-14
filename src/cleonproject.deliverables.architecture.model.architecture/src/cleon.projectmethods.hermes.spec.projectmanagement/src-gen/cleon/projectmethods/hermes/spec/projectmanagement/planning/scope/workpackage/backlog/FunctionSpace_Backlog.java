package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[28bf0b25-c4e2-11e5-b41d-5d67443850a2,imports]] */
import cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.*;
import cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;
/* End Protected Region   [[28bf0b25-c4e2-11e5-b41d-5d67443850a2,imports]] */

public class FunctionSpace_Backlog {

  /* Begin Protected Region [[28bf0b25-c4e2-11e5-b41d-5d67443850a2]] */
  
  /* End Protected Region   [[28bf0b25-c4e2-11e5-b41d-5d67443850a2]] */


  public static interface IBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2e5b3403-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumEstimate();

    @IDynamicResourceExtension.MethodId("2e5b3405-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumPlannedEstimate();

    @IDynamicResourceExtension.MethodId("8f9873f7-f2ba-11e5-8010-7b34e2b59618")
    public List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> GetAllWorkItems();

    @IDynamicResourceExtension.MethodId("68b6151b-349a-11e6-8839-1f6631cc77ac")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.outcomes.javamodel.IOutcome GetOutcome();

    @IDynamicResourceExtension.MethodId("8d95f53c-34a2-11e6-8839-1f6631cc77ac")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint LastPlannedSprint();

    @IDynamicResourceExtension.MethodId("6bdb7163-3fc5-11e7-9016-2b91d722d429")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint FirstPlannedSprint();

    @IDynamicResourceExtension.MethodId("6ebe51af-36ac-11e6-ba0a-8d94de7675ef")
    public java.lang.Double SumDoneEstimates();

    @IDynamicResourceExtension.MethodId("7aa83ef9-36ac-11e6-ba0a-8d94de7675ef")
    public java.lang.Double SumOpenEstimates();

    @IDynamicResourceExtension.MethodId("39d6b304-36ae-11e6-ba0a-8d94de7675ef")
    public java.lang.String CalculateCompletness();

    @IDynamicResourceExtension.MethodId("663b3ce0-346c-11e7-a759-67451fcdb3cc")
    public List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase> GetAllWorkItemsBase();

  }
  
  public static interface IBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2e5b3403-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog);

    @IDynamicResourceExtension.MethodId("2e5b3405-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumPlannedEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog);

    @IDynamicResourceExtension.MethodId("8d95f53c-34a2-11e6-8839-1f6631cc77ac")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint LastPlannedSprint(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog);

    @IDynamicResourceExtension.MethodId("6bdb7163-3fc5-11e7-9016-2b91d722d429")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint FirstPlannedSprint(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog);

    @IDynamicResourceExtension.MethodId("6ebe51af-36ac-11e6-ba0a-8d94de7675ef")
    public java.lang.Double SumDoneEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog);

    @IDynamicResourceExtension.MethodId("7aa83ef9-36ac-11e6-ba0a-8d94de7675ef")
    public java.lang.Double SumOpenEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog);

    @IDynamicResourceExtension.MethodId("39d6b304-36ae-11e6-ba0a-8d94de7675ef")
    public java.lang.String CalculateCompletness(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog);

  }
  
  public static class BacklogFunctionsImpl implements IBacklogFunctionsImpl {

    public static final IBacklogFunctionsImpl INSTANCE = new BacklogFunctionsImpl();

    private BacklogFunctionsImpl() {}

    @Override
    public java.lang.Double SumEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[2e5b3403-c4e2-11e5-b41d-5d67443850a2]] */
       	return backlog.selectGroups().stream().mapToDouble(p -> WorkItemGroupFunctionsImpl.INSTANCE.SumEstimate(p)).sum();
      /* End Protected Region   [[2e5b3403-c4e2-11e5-b41d-5d67443850a2]] */
    }

    @Override
    public java.lang.Double SumPlannedEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[2e5b3405-c4e2-11e5-b41d-5d67443850a2]] */
       	return backlog.selectGroups().stream().mapToDouble(p -> WorkItemGroupFunctionsImpl.INSTANCE.SumPlannedEstimate(p)).sum();  
      /* End Protected Region   [[2e5b3405-c4e2-11e5-b41d-5d67443850a2]] */
    }

    @Override
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint LastPlannedSprint(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[8d95f53c-34a2-11e6-8839-1f6631cc77ac]] */
      List<IWorkItemBase> workItems = backlog.extension(IBacklogFunctions.class).GetAllWorkItemsBase();
      ISprint latestPlannedSprint = null;
      
      for( IWorkItem workitem : workItems)
      {
    	  ISprint workItemSprint = workitem.extension(IWorkItemBaseFunctions.class).GetSprint();
    	  if( workItemSprint != null)
    	  {
    		  if( latestPlannedSprint == null)
    		  {
    			  latestPlannedSprint = workItemSprint;
    		  }
    		  else
    		  {
    			  if(latestPlannedSprint.selectIdentifier() < workItemSprint.selectIdentifier())
    			  {
        			  latestPlannedSprint = workItemSprint;
    			  }
    		  }
    	  }
      }
      
      return latestPlannedSprint;
      /* End Protected Region   [[8d95f53c-34a2-11e6-8839-1f6631cc77ac]] */
    }

    @Override
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint FirstPlannedSprint(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[6bdb7163-3fc5-11e7-9016-2b91d722d429]] */
        List<IWorkItemBase> workItems = backlog.extension(IBacklogFunctions.class).GetAllWorkItemsBase();
        ISprint latestPlannedSprint = null;
        
        for( IWorkItem workitem : workItems)
        {
      	  ISprint workItemSprint = workitem.extension(IWorkItemBaseFunctions.class).GetSprint();
      	  if( workItemSprint != null)
      	  {
      		  if( latestPlannedSprint == null)
      		  {
      			  latestPlannedSprint = workItemSprint;
      		  }
      		  else
      		  {
      			  if(latestPlannedSprint.selectIdentifier() > workItemSprint.selectIdentifier())
      			  {
          			  latestPlannedSprint = workItemSprint;
      			  }
      		  }
      	  }
        }
        
        return latestPlannedSprint;  
      /* End Protected Region   [[6bdb7163-3fc5-11e7-9016-2b91d722d429]] */
    }

    @Override
    public java.lang.Double SumDoneEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[6ebe51af-36ac-11e6-ba0a-8d94de7675ef]] */
       	return backlog.selectGroups().stream().mapToDouble(p -> WorkItemGroupFunctionsImpl.INSTANCE.SumDoneEstimates(p)).sum();  
      /* End Protected Region   [[6ebe51af-36ac-11e6-ba0a-8d94de7675ef]] */
    }

    @Override
    public java.lang.Double SumOpenEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[7aa83ef9-36ac-11e6-ba0a-8d94de7675ef]] */
       	return backlog.selectGroups().stream().mapToDouble(p -> WorkItemGroupFunctionsImpl.INSTANCE.SumOpenEstimates(p)).sum();  
      /* End Protected Region   [[7aa83ef9-36ac-11e6-ba0a-8d94de7675ef]] */
    }

    @Override
    public java.lang.String CalculateCompletness(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[39d6b304-36ae-11e6-ba0a-8d94de7675ef]] */
    	double openEstimate = SumOpenEstimates(backlog);
    	double doneEstimate = SumDoneEstimates(backlog);
    	double totalEstimate = SumEstimate(backlog);
    	
    	if(totalEstimate == 0)
    	{
    		return "";
    	}
    	
    	double openPercentage = (openEstimate * 100/ totalEstimate);
    	double donePercentage = (doneEstimate * 100/ totalEstimate);
    	NumberFormat formatter = new DecimalFormat("#0.00"); 
    	
    	return formatter.format(openPercentage) + "/" + formatter.format(donePercentage) + "%";
      /* End Protected Region   [[39d6b304-36ae-11e6-ba0a-8d94de7675ef]] */
    }

  }
  
  public static class BacklogFunctions {

    private BacklogFunctions() {}

    public static java.lang.Double SumEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).SumEstimate(backlog);
    }

    public static java.lang.Double SumPlannedEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).SumPlannedEstimate(backlog);
    }

    public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint LastPlannedSprint(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).LastPlannedSprint(backlog);
    }

    public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint FirstPlannedSprint(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).FirstPlannedSprint(backlog);
    }

    public static java.lang.Double SumDoneEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).SumDoneEstimates(backlog);
    }

    public static java.lang.Double SumOpenEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).SumOpenEstimates(backlog);
    }

    public static java.lang.String CalculateCompletness(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).CalculateCompletness(backlog);
    }

  }

  public static interface IWorkItemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0fddddec-f2bc-11e5-8010-7b34e2b59618")
    public java.lang.String GetFeatureGroupName();

    @IDynamicResourceExtension.MethodId("7ca3d3d7-2f27-11e6-8bd9-a77b8d2a3a0e")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog GetBacklog();

    @IDynamicResourceExtension.MethodId("8afab660-36ac-11e6-ba0a-8d94de7675ef")
    public java.lang.Boolean IsDone();

    @IDynamicResourceExtension.MethodId("94b19746-36ac-11e6-ba0a-8d94de7675ef")
    public java.lang.Boolean IsOpen();

    @IDynamicResourceExtension.MethodId("bf2e97fe-23f9-11e7-bec1-4d34b1aea387")
    public java.lang.Double SumEstimate();

    @IDynamicResourceExtension.MethodId("8a7d3d2d-24c5-11e7-90ac-916720a1b370")
    public java.lang.Double SumPlannedEstimate();

    @IDynamicResourceExtension.MethodId("8a7d3d2f-24c5-11e7-90ac-916720a1b370")
    public java.lang.Double SumDoneEstimates();

    @IDynamicResourceExtension.MethodId("8a7d3d31-24c5-11e7-90ac-916720a1b370")
    public java.lang.Double SumOpenEstimates();

    @IDynamicResourceExtension.MethodId("c877351c-346b-11e7-a759-67451fcdb3cc")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint GetSprint();

    @IDynamicResourceExtension.MethodId("4d13ad79-aace-11e8-b25a-7dd9f85a27ad")
    public List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> GetAllWorkItems();

  }
  
  public static interface IWorkItemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8afab660-36ac-11e6-ba0a-8d94de7675ef")
    public java.lang.Boolean IsDone(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem workItem);

    @IDynamicResourceExtension.MethodId("94b19746-36ac-11e6-ba0a-8d94de7675ef")
    public java.lang.Boolean IsOpen(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem workItem);

  }
  
  public static class WorkItemFunctionsImpl implements IWorkItemFunctionsImpl {

    public static final IWorkItemFunctionsImpl INSTANCE = new WorkItemFunctionsImpl();

    private WorkItemFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsDone(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem workItem) {
       IWorkItemState state = workItem.selectState();
       return state.isDone();
    }

    @Override
    public java.lang.Boolean IsOpen(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem workItem) {
      return !IsDone(workItem);
    }

  }
  
  public static class WorkItemFunctions {

    private WorkItemFunctions() {}

    public static java.lang.Boolean IsDone(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem workItem) {
      return DynamicResourceUtil.invoke(IWorkItemFunctionsImpl.class, WorkItemFunctionsImpl.INSTANCE, workItem).IsDone(workItem);
    }

    public static java.lang.Boolean IsOpen(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem workItem) {
      return DynamicResourceUtil.invoke(IWorkItemFunctionsImpl.class, WorkItemFunctionsImpl.INSTANCE, workItem).IsOpen(workItem);
    }

  }

  public static interface IWorkItemGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1013dc97-ef74-11e5-809f-e75b61a27bc0")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IBacklog GetBacklog();

    @IDynamicResourceExtension.MethodId("ac5134f1-f2ba-11e5-8010-7b34e2b59618")
    public List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> GetAllWorkItems();

    @IDynamicResourceExtension.MethodId("b123314f-23f6-11e7-bec1-4d34b1aea387")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("2e5b81ba-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumEstimate();

    @IDynamicResourceExtension.MethodId("2e5b81bc-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumPlannedEstimate();

    @IDynamicResourceExtension.MethodId("5811c3b4-36ad-11e6-ba0a-8d94de7675ef")
    public java.lang.Double SumDoneEstimates();

    @IDynamicResourceExtension.MethodId("5811c3b6-36ad-11e6-ba0a-8d94de7675ef")
    public java.lang.Double SumOpenEstimates();

    @IDynamicResourceExtension.MethodId("d8f9e4cd-346b-11e7-a759-67451fcdb3cc")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint GetSprint();

  }
  
  public static interface IWorkItemGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b123314f-23f6-11e7-bec1-4d34b1aea387")
    public java.lang.String GetId(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup);

    @IDynamicResourceExtension.MethodId("2e5b81ba-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup);

    @IDynamicResourceExtension.MethodId("2e5b81bc-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumPlannedEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup);

    @IDynamicResourceExtension.MethodId("5811c3b4-36ad-11e6-ba0a-8d94de7675ef")
    public java.lang.Double SumDoneEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup);

    @IDynamicResourceExtension.MethodId("5811c3b6-36ad-11e6-ba0a-8d94de7675ef")
    public java.lang.Double SumOpenEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup);

    @IDynamicResourceExtension.MethodId("d8f9e4cd-346b-11e7-a759-67451fcdb3cc")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint GetSprint(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup);

  }
  
  public static class WorkItemGroupFunctionsImpl implements IWorkItemGroupFunctionsImpl {

    public static final IWorkItemGroupFunctionsImpl INSTANCE = new WorkItemGroupFunctionsImpl();

    private WorkItemGroupFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      return String.format("G%03d", workItemGroup.selectIdentifier());
    }

    @Override
    public java.lang.Double SumEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      /* Begin Protected Region [[2e5b81ba-c4e2-11e5-b41d-5d67443850a2]] */
		double sum = workItemGroup.selectItems().stream().mapToDouble(p -> {
			IWorkItemFunctions wif = p.extension(IWorkItemFunctions.class);
			return wif.SumEstimate(); 
		}).sum();
		
		return sum;
      /* End Protected Region   [[2e5b81ba-c4e2-11e5-b41d-5d67443850a2]] */
    }

    @Override
    public java.lang.Double SumPlannedEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      /* Begin Protected Region [[2e5b81bc-c4e2-11e5-b41d-5d67443850a2]] */
		double sum = workItemGroup.selectItems().stream().mapToDouble(p -> {
			IWorkItemFunctions wif = p.extension(IWorkItemFunctions.class);
			return wif.SumPlannedEstimate(); 
		}).sum();
		
		if (workItemGroup.selectPlannedEstimate() != null)
			sum+= workItemGroup.selectPlannedEstimate();
		
		return sum;
      /* End Protected Region   [[2e5b81bc-c4e2-11e5-b41d-5d67443850a2]] */
    }

    @Override
    public java.lang.Double SumDoneEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      /* Begin Protected Region [[5811c3b4-36ad-11e6-ba0a-8d94de7675ef]] */
		double sum = workItemGroup.selectItems().stream().mapToDouble(p -> {
			IWorkItemFunctions wif = p.extension(IWorkItemFunctions.class);
			return wif.SumDoneEstimates(); 
		}).sum();
		
		
		return sum;
      /* End Protected Region   [[5811c3b4-36ad-11e6-ba0a-8d94de7675ef]] */
    }

    @Override
    public java.lang.Double SumOpenEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      /* Begin Protected Region [[5811c3b6-36ad-11e6-ba0a-8d94de7675ef]] */
		double sum = workItemGroup.selectItems().stream().mapToDouble(p -> {
			IWorkItemFunctions wif = p.extension(IWorkItemFunctions.class);
			return wif.SumOpenEstimates(); 
		}).sum();
		return sum;
      /* End Protected Region   [[5811c3b6-36ad-11e6-ba0a-8d94de7675ef]] */
    }

    @Override
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint GetSprint(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      return null;
    }

  }
  
  public static class WorkItemGroupFunctions {

    private WorkItemGroupFunctions() {}

    public static java.lang.String GetId(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      return DynamicResourceUtil.invoke(IWorkItemGroupFunctionsImpl.class, WorkItemGroupFunctionsImpl.INSTANCE, workItemGroup).GetId(workItemGroup);
    }

    public static java.lang.Double SumEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      return DynamicResourceUtil.invoke(IWorkItemGroupFunctionsImpl.class, WorkItemGroupFunctionsImpl.INSTANCE, workItemGroup).SumEstimate(workItemGroup);
    }

    public static java.lang.Double SumPlannedEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      return DynamicResourceUtil.invoke(IWorkItemGroupFunctionsImpl.class, WorkItemGroupFunctionsImpl.INSTANCE, workItemGroup).SumPlannedEstimate(workItemGroup);
    }

    public static java.lang.Double SumDoneEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      return DynamicResourceUtil.invoke(IWorkItemGroupFunctionsImpl.class, WorkItemGroupFunctionsImpl.INSTANCE, workItemGroup).SumDoneEstimates(workItemGroup);
    }

    public static java.lang.Double SumOpenEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      return DynamicResourceUtil.invoke(IWorkItemGroupFunctionsImpl.class, WorkItemGroupFunctionsImpl.INSTANCE, workItemGroup).SumOpenEstimates(workItemGroup);
    }

    public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint GetSprint(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.featuregroup.javamodel.IWorkItemGroup workItemGroup) {
      return DynamicResourceUtil.invoke(IWorkItemGroupFunctionsImpl.class, WorkItemGroupFunctionsImpl.INSTANCE, workItemGroup).GetSprint(workItemGroup);
    }

  }

  public static interface IWorkItemBaseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fa247f35-f2bb-11e5-8010-7b34e2b59618")
    public java.lang.String GetSprintName();

    @IDynamicResourceExtension.MethodId("0109c96a-f2bc-11e5-8010-7b34e2b59618")
    public java.lang.String GetReleaseName();

    @IDynamicResourceExtension.MethodId("2b24e360-34a3-11e6-8839-1f6631cc77ac")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.releases.javamodel.ISprint GetSprint();

    @IDynamicResourceExtension.MethodId("287482d7-3433-11e7-9486-85e29952984a")
    public java.lang.Double SumEstimate();

    @IDynamicResourceExtension.MethodId("287482d9-3433-11e7-9486-85e29952984a")
    public java.lang.Double SumPlannedEstimate();

    @IDynamicResourceExtension.MethodId("287482db-3433-11e7-9486-85e29952984a")
    public java.lang.Double SumDoneEstimates();

    @IDynamicResourceExtension.MethodId("287482dd-3433-11e7-9486-85e29952984a")
    public java.lang.Double SumOpenEstimates();

    @IDynamicResourceExtension.MethodId("667fb415-aace-11e8-b25a-7dd9f85a27ad")
    public List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItem> GetAllWorkItems();

  }
  
  public static interface IWorkItemBaseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("287482d7-3433-11e7-9486-85e29952984a")
    public java.lang.Double SumEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase);

    @IDynamicResourceExtension.MethodId("287482d9-3433-11e7-9486-85e29952984a")
    public java.lang.Double SumPlannedEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase);

    @IDynamicResourceExtension.MethodId("287482db-3433-11e7-9486-85e29952984a")
    public java.lang.Double SumDoneEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase);

    @IDynamicResourceExtension.MethodId("287482dd-3433-11e7-9486-85e29952984a")
    public java.lang.Double SumOpenEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase);

  }
  
  public static class WorkItemBaseFunctionsImpl implements IWorkItemBaseFunctionsImpl {

    public static final IWorkItemBaseFunctionsImpl INSTANCE = new WorkItemBaseFunctionsImpl();

    private WorkItemBaseFunctionsImpl() {}

    @Override
    public java.lang.Double SumEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase) {
      /* Begin Protected Region [[287482d7-3433-11e7-9486-85e29952984a]] */
		if (workItemBase.selectEstimate() != null)
			return Double.parseDouble(workItemBase.selectEstimate().selectName());
		return 0.0;   
      /* End Protected Region   [[287482d7-3433-11e7-9486-85e29952984a]] */
    }

    @Override
    public java.lang.Double SumPlannedEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase) {
      /* Begin Protected Region [[287482d9-3433-11e7-9486-85e29952984a]] */
        return 0.0;   
      /* End Protected Region   [[287482d9-3433-11e7-9486-85e29952984a]] */
    }

    @Override
    public java.lang.Double SumDoneEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase) {
      /* Begin Protected Region [[287482db-3433-11e7-9486-85e29952984a]] */
		if (workItemBase.selectEstimate() != null)
		{
    		IWorkItemFunctions workItemFunctions = workItemBase.extension(IWorkItemFunctions.class);
    		if(workItemFunctions.IsOpen() == false)
    		{
	    		return Double.parseDouble(workItemBase.selectEstimate().selectName());
    		}    
		} 
		return 0.0;   
      /* End Protected Region   [[287482db-3433-11e7-9486-85e29952984a]] */
    }

    @Override
    public java.lang.Double SumOpenEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase) {
      /* Begin Protected Region [[287482dd-3433-11e7-9486-85e29952984a]] */
		if (workItemBase.selectEstimate() != null)
		{
    		IWorkItemFunctions workItemFunctions = workItemBase.extension(IWorkItemFunctions.class);
    		if(workItemFunctions.IsDone() == false)
    		{
	    		return Double.parseDouble(workItemBase.selectEstimate().selectName());
    		}    
		} 
		return 0.0;
      /* End Protected Region   [[287482dd-3433-11e7-9486-85e29952984a]] */
    }

  }
  
  public static class WorkItemBaseFunctions {

    private WorkItemBaseFunctions() {}

    public static java.lang.Double SumEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase) {
      return DynamicResourceUtil.invoke(IWorkItemBaseFunctionsImpl.class, WorkItemBaseFunctionsImpl.INSTANCE, workItemBase).SumEstimate(workItemBase);
    }

    public static java.lang.Double SumPlannedEstimate(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase) {
      return DynamicResourceUtil.invoke(IWorkItemBaseFunctionsImpl.class, WorkItemBaseFunctionsImpl.INSTANCE, workItemBase).SumPlannedEstimate(workItemBase);
    }

    public static java.lang.Double SumDoneEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase) {
      return DynamicResourceUtil.invoke(IWorkItemBaseFunctionsImpl.class, WorkItemBaseFunctionsImpl.INSTANCE, workItemBase).SumDoneEstimates(workItemBase);
    }

    public static java.lang.Double SumOpenEstimates(final cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.backlog.javamodel.IWorkItemBase workItemBase) {
      return DynamicResourceUtil.invoke(IWorkItemBaseFunctionsImpl.class, WorkItemBaseFunctionsImpl.INSTANCE, workItemBase).SumOpenEstimates(workItemBase);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,28bf0b25-c4e2-11e5-b41d-5d67443850a2,nnCifpoA5vpeufxjd1/5wdq/2sE=] */
