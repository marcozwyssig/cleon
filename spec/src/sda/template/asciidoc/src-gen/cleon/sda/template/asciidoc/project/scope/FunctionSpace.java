package cleon.sda.template.asciidoc.project.scope;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d5ca7de4-b540-11e5-bc0c-f35b68c3609a,imports]] */

/* End Protected Region   [[d5ca7de4-b540-11e5-bc0c-f35b68c3609a,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[d5ca7de4-b540-11e5-bc0c-f35b68c3609a]] */
  
  /* End Protected Region   [[d5ca7de4-b540-11e5-bc0c-f35b68c3609a]] */


  public static interface IOutcomeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eefa8d32-b540-11e5-bc0c-f35b68c3609a")
    public java.lang.String RenderChapterContent();

  }
  
  public static interface IOutcomeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OutcomeFunctionsImpl implements IOutcomeFunctionsImpl {

    public static final IOutcomeFunctionsImpl INSTANCE = new OutcomeFunctionsImpl();

    private OutcomeFunctionsImpl() {}

  }
  
  public static class OutcomeFunctions {

    private OutcomeFunctions() {}

  }

  public static interface IBacklogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("94204bbc-ba81-11e5-b56d-4f524d402f4b")
    public java.lang.String GetDocumentPath();

    @IDynamicResourceExtension.MethodId("98424cb2-bdff-11e5-bc2e-0b46afe7c3c9")
    public java.lang.String RenderDocumentContent();

    @IDynamicResourceExtension.MethodId("67c88b0e-be08-11e5-ad6f-979cbb78853e")
    public java.lang.Integer SumEstimate();

    @IDynamicResourceExtension.MethodId("67c88b10-be08-11e5-ad6f-979cbb78853e")
    public java.lang.Integer SumPlannedEstimate();

  }
  
  public static interface IBacklogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("67c88b0e-be08-11e5-ad6f-979cbb78853e")
    public java.lang.Integer SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog);

    @IDynamicResourceExtension.MethodId("67c88b10-be08-11e5-ad6f-979cbb78853e")
    public java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog);

  }
  
  public static class BacklogFunctionsImpl implements IBacklogFunctionsImpl {

    public static final IBacklogFunctionsImpl INSTANCE = new BacklogFunctionsImpl();

    private BacklogFunctionsImpl() {}

    @Override
    public java.lang.Integer SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[67c88b0e-be08-11e5-ad6f-979cbb78853e]] */
    	return backlog.selectFeatureGroups().stream().mapToInt(p -> FeatureGroupFunctionsImpl.INSTANCE.SumEstimate(p)).sum();
      // XXX implement template function here   
      /* End Protected Region   [[67c88b0e-be08-11e5-ad6f-979cbb78853e]] */
    }

    @Override
    public java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog) {
      /* Begin Protected Region [[67c88b10-be08-11e5-ad6f-979cbb78853e]] */
    	return backlog.selectFeatureGroups().stream().mapToInt(p -> FeatureGroupFunctionsImpl.INSTANCE.SumPlannedEstimate(p)).sum();
      /* End Protected Region   [[67c88b10-be08-11e5-ad6f-979cbb78853e]] */
    }

  }
  
  public static class BacklogFunctions {

    private BacklogFunctions() {}

    public static java.lang.Integer SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).SumEstimate(backlog);
    }

    public static java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog backlog) {
      return DynamicResourceUtil.invoke(IBacklogFunctionsImpl.class, BacklogFunctionsImpl.INSTANCE, backlog).SumPlannedEstimate(backlog);
    }

  }

  public static interface IFeatureGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c63c4412-bdfa-11e5-bc2e-0b46afe7c3c9")
    public java.lang.String RenderChapterContent();

    @IDynamicResourceExtension.MethodId("68513a1f-bdfc-11e5-bc2e-0b46afe7c3c9")
    public java.lang.Integer SumEstimate();

    @IDynamicResourceExtension.MethodId("537350d0-be08-11e5-ad6f-979cbb78853e")
    public java.lang.Integer SumPlannedEstimate();

  }
  
  public static interface IFeatureGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("68513a1f-bdfc-11e5-bc2e-0b46afe7c3c9")
    public java.lang.Integer SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup);

    @IDynamicResourceExtension.MethodId("537350d0-be08-11e5-ad6f-979cbb78853e")
    public java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup);

  }
  
  public static class FeatureGroupFunctionsImpl implements IFeatureGroupFunctionsImpl {

    public static final IFeatureGroupFunctionsImpl INSTANCE = new FeatureGroupFunctionsImpl();

    private FeatureGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup) {
      /* Begin Protected Region [[68513a1f-bdfc-11e5-bc2e-0b46afe7c3c9]] */
    	int sum = featureGroup.selectSubfeatureGroup().stream().mapToInt(p -> SumEstimate(p)).sum();
    	return sum + featureGroup.selectWorkItems().stream().mapToInt(p -> Integer.parseInt(p.selectEstimate().selectName())).sum();
      /* End Protected Region   [[68513a1f-bdfc-11e5-bc2e-0b46afe7c3c9]] */
    }

    @Override
    public java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup) {
      /* Begin Protected Region [[537350d0-be08-11e5-ad6f-979cbb78853e]] */
    	int sum = featureGroup.selectSubfeatureGroup().stream().mapToInt(p -> SumPlannedEstimate(p)).sum();
    	Integer plannedEstimate = featureGroup.selectPlannedEstimate();
    	if (plannedEstimate != null)
    	{
    		return sum + plannedEstimate; 	
    	}
    	return sum;
      /* End Protected Region   [[537350d0-be08-11e5-ad6f-979cbb78853e]] */
    }

  }
  
  public static class FeatureGroupFunctions {

    private FeatureGroupFunctions() {}

    public static java.lang.Integer SumEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup) {
      return DynamicResourceUtil.invoke(IFeatureGroupFunctionsImpl.class, FeatureGroupFunctionsImpl.INSTANCE, featureGroup).SumEstimate(featureGroup);
    }

    public static java.lang.Integer SumPlannedEstimate(final cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup featureGroup) {
      return DynamicResourceUtil.invoke(IFeatureGroupFunctionsImpl.class, FeatureGroupFunctionsImpl.INSTANCE, featureGroup).SumPlannedEstimate(featureGroup);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d5ca7de4-b540-11e5-bc0c-f35b68c3609a,NQoVign+u4N81imyYnFn2i/gmCU=] */
