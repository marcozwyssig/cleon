package cleon.applications.actifsource.metamodel.spec.system.category.feature;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[9a3756e7-7e75-11e6-95c9-39c2ade57f78,imports]] */

/* End Protected Region   [[9a3756e7-7e75-11e6-95c9-39c2ade57f78,imports]] */

public class FunctionSpace_Feature {

  /* Begin Protected Region [[9a3756e7-7e75-11e6-95c9-39c2ade57f78]] */
  
  /* End Protected Region   [[9a3756e7-7e75-11e6-95c9-39c2ade57f78]] */


  public static interface IFeatureFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a7d90630-7e75-11e6-95c9-39c2ade57f78")
    public java.lang.String BuildingBlockName();

    @IDynamicResourceExtension.MethodId("ee48be41-2638-11ea-8c59-871562e3b5c4")
    public List<ch.actifsource.core.javamodel.IResource> AllProjects();

    @IDynamicResourceExtension.MethodId("ddccc3a1-7675-11ef-bdb9-ebb368e31a33")
    public java.lang.String FullBuildingBlockName();

    @IDynamicResourceExtension.MethodId("560f970b-7678-11ef-bdb9-ebb368e31a33")
    public java.lang.Boolean UseSimpleName();

  }
  
  public static interface IFeatureFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("560f970b-7678-11ef-bdb9-ebb368e31a33")
    public java.lang.Boolean UseSimpleName(final cleon.applications.actifsource.metamodel.spec.system.javamodel.IUseSimpleNameAware feature);

  }
  
  public static class FeatureFunctionsImpl implements IFeatureFunctionsImpl {

    public static final IFeatureFunctionsImpl INSTANCE = new FeatureFunctionsImpl();

    private FeatureFunctionsImpl() {}

    @Override
    public java.lang.Boolean UseSimpleName(final cleon.applications.actifsource.metamodel.spec.system.javamodel.IUseSimpleNameAware feature) {
      /* Begin Protected Region [[560f970b-7678-11ef-bdb9-ebb368e31a33]] */
    	if( feature.selectUseSimpleName() == null) {
    		return false;
    	}
    	return feature.selectUseSimpleName();
      /* End Protected Region   [[560f970b-7678-11ef-bdb9-ebb368e31a33]] */
    }

  }
  
  public static class FeatureFunctions {

    private FeatureFunctions() {}

    public static java.lang.Boolean UseSimpleName(final cleon.applications.actifsource.metamodel.spec.system.javamodel.IUseSimpleNameAware feature) {
      return DynamicResourceUtil.invoke(IFeatureFunctionsImpl.class, FeatureFunctionsImpl.INSTANCE, feature).UseSimpleName(feature);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9a3756e7-7e75-11e6-95c9-39c2ade57f78,nKotm6vp4yEmav0Ypst0tKnqRdE=] */
