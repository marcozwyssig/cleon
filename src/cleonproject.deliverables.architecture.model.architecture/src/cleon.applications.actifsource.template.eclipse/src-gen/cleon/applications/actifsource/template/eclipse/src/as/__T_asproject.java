package cleon.applications.actifsource.template.eclipse.src.as;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[a9f07baf-11e9-11e5-b568-55f5f05bd6f6,imports]] */
import cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource;
import cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IJava;

/* End Protected Region   [[a9f07baf-11e9-11e5-b568-55f5f05bd6f6,imports]] */

public class __T_asproject {

  /* Begin Protected Region [[a9f07baf-11e9-11e5-b568-55f5f05bd6f6]] */
  
  /* End Protected Region   [[a9f07baf-11e9-11e5-b568-55f5f05bd6f6]] */


  public static interface IPluginFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("88e4db85-41a1-11e8-81d0-774e4d9334dd")
    public java.lang.Boolean GenerateJavaModel();

  }
  
  public static interface IPluginFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("88e4db85-41a1-11e8-81d0-774e4d9334dd")
    public java.lang.Boolean GenerateJavaModel(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin plugin);

  }
  
  public static class PluginFunctionsImpl implements IPluginFunctionsImpl {

    public static final IPluginFunctionsImpl INSTANCE = new PluginFunctionsImpl();

    private PluginFunctionsImpl() {}

    @Override
    public java.lang.Boolean GenerateJavaModel(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin plugin) {
      /* Begin Protected Region [[88e4db85-41a1-11e8-81d0-774e4d9334dd]] */
    	IActifsource actifsource = plugin.selectActifsource();
    	if( actifsource == null)
    	{
    		return false;
    	}
    	
    	IJava java = plugin.selectJava();
    	if( java == null)
    	{
    		return false;
    	}
		return true;
      /* End Protected Region   [[88e4db85-41a1-11e8-81d0-774e4d9334dd]] */
    }

  }
  
  public static class PluginFunctions {

    private PluginFunctions() {}

    public static java.lang.Boolean GenerateJavaModel(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPlugin plugin) {
      return DynamicResourceUtil.invoke(IPluginFunctionsImpl.class, PluginFunctionsImpl.INSTANCE, plugin).GenerateJavaModel(plugin);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,a9f07baf-11e9-11e5-b568-55f5f05bd6f6,GJx9xtWkpbnozATf61wW6w7FUFo=] */
