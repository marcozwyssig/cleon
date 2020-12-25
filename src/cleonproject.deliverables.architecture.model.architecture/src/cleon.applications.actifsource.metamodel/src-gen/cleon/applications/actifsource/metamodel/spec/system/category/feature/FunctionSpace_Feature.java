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
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject> AllProjects();

  }
  
  public static interface IFeatureFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FeatureFunctionsImpl implements IFeatureFunctionsImpl {

    public static final IFeatureFunctionsImpl INSTANCE = new FeatureFunctionsImpl();

    private FeatureFunctionsImpl() {}

  }
  
  public static class FeatureFunctions {

    private FeatureFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,9a3756e7-7e75-11e6-95c9-39c2ade57f78,w1Lxf6Uz8IHO7Nb2wE3/Ib8TZWE=] */
