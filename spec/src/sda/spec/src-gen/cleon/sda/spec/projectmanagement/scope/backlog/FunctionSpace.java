package cleon.sda.spec.projectmanagement.scope.backlog;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[28bf0b25-c4e2-11e5-b41d-5d67443850a2,imports]] */

/* End Protected Region   [[28bf0b25-c4e2-11e5-b41d-5d67443850a2,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[28bf0b25-c4e2-11e5-b41d-5d67443850a2]] */
  
  /* End Protected Region   [[28bf0b25-c4e2-11e5-b41d-5d67443850a2]] */


  public static interface IBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2e5b3403-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumEstimate();

    @IDynamicResourceExtension.MethodId("2e5b3405-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Integer SumPlannedEstimate();

  }
  
  public static interface IBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2e5b3403-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog);

    @IDynamicResourceExtension.MethodId("2e5b3405-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog);

  }
  
  public static class BacklogFunctionsImpl implements IBacklogFunctionsImpl {

    public static final IBacklogFunctionsImpl INSTANCE = new BacklogFunctionsImpl();

    private BacklogFunctionsImpl() {}

    @Override
    public java.lang.Double SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[2e5b3403-c4e2-11e5-b41d-5d67443850a2]] */
    	return backlog.selectFeatureGroups().stream().mapToDouble(p -> FeatureGroupFunctionsImpl.INSTANCE.SumEstimate(p)).sum();
      /* End Protected Region   [[2e5b3403-c4e2-11e5-b41d-5d67443850a2]] */
    }

    @Override
    public java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[2e5b3405-c4e2-11e5-b41d-5d67443850a2]] */
    	return backlog.selectFeatureGroups().stream().mapToInt(p -> FeatureGroupFunctionsImpl.INSTANCE.SumPlannedEstimate(p)).sum();  
      /* End Protected Region   [[2e5b3405-c4e2-11e5-b41d-5d67443850a2]] */
    }

  }
  
  public static class BacklogFunctions {

    private BacklogFunctions() {}

    public static java.lang.Double SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).SumEstimate(backlog);
    }

    public static java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).SumPlannedEstimate(backlog);
    }

  }

  public static interface IFeatureGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2e5b81ba-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumEstimate();

    @IDynamicResourceExtension.MethodId("2e5b81bc-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Integer SumPlannedEstimate();

  }
  
  public static interface IFeatureGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2e5b81ba-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Double SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup);

    @IDynamicResourceExtension.MethodId("2e5b81bc-c4e2-11e5-b41d-5d67443850a2")
    public java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup);

  }
  
  public static class FeatureGroupFunctionsImpl implements IFeatureGroupFunctionsImpl {

    public static final IFeatureGroupFunctionsImpl INSTANCE = new FeatureGroupFunctionsImpl();

    private FeatureGroupFunctionsImpl() {}

    @Override
    public java.lang.Double SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup) {
      /* Begin Protected Region [[2e5b81ba-c4e2-11e5-b41d-5d67443850a2]] */
    	double sum = featureGroup.selectSubfeatureGroup().stream().mapToDouble(p -> SumEstimate(p)).sum();
    	return sum + featureGroup.selectWorkItems().stream().mapToDouble(p -> {
	    		if (p.selectEstimate() == null)
	    			return 0;
	    		return Double.parseDouble(p.selectEstimate().selectName());
    		}).sum();
      /* End Protected Region   [[2e5b81ba-c4e2-11e5-b41d-5d67443850a2]] */
    }

    @Override
    public java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup) {
      /* Begin Protected Region [[2e5b81bc-c4e2-11e5-b41d-5d67443850a2]] */
    	int sum = featureGroup.selectSubfeatureGroup().stream().mapToInt(p -> SumPlannedEstimate(p)).sum();
    	Integer plannedEstimate = featureGroup.selectPlannedEstimate();
    	if (plannedEstimate != null)
    	{
    		return sum + plannedEstimate; 	
    	}
    	return sum;
      /* End Protected Region   [[2e5b81bc-c4e2-11e5-b41d-5d67443850a2]] */
    }

  }
  
  public static class FeatureGroupFunctions {

    private FeatureGroupFunctions() {}

    public static java.lang.Double SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup) {
      return DynamicResourceUtil.invoke(IFeatureGroupFunctionsImpl.class, FeatureGroupFunctionsImpl.INSTANCE, featureGroup).SumEstimate(featureGroup);
    }

    public static java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup) {
      return DynamicResourceUtil.invoke(IFeatureGroupFunctionsImpl.class, FeatureGroupFunctionsImpl.INSTANCE, featureGroup).SumPlannedEstimate(featureGroup);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,28bf0b25-c4e2-11e5-b41d-5d67443850a2,cCe5xlQtMZVRe8ZM549hmDlFi9c=] */
