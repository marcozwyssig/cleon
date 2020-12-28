package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[ce1ac3ff-491a-11eb-9bd7-6114c4f17e0c,imports]] */

/* End Protected Region   [[ce1ac3ff-491a-11eb-9bd7-6114c4f17e0c,imports]] */

public class FunctionSpace_Nature {

  /* Begin Protected Region [[ce1ac3ff-491a-11eb-9bd7-6114c4f17e0c]] */
  
  /* End Protected Region   [[ce1ac3ff-491a-11eb-9bd7-6114c4f17e0c]] */


  public static interface IPluginFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e0bf1aa6-491a-11eb-9bd7-6114c4f17e0c")
    public List<cleon.applications.actifsource.metamodel.spec.system.javamodel.IPackage> FindPackages();

  }
  
  public static interface IPluginFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PluginFunctionsImpl implements IPluginFunctionsImpl {

    public static final IPluginFunctionsImpl INSTANCE = new PluginFunctionsImpl();

    private PluginFunctionsImpl() {}

  }
  
  public static class PluginFunctions {

    private PluginFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,ce1ac3ff-491a-11eb-9bd7-6114c4f17e0c,gD1l5UV8JzqGIlFan9AxrFMyxss=] */
