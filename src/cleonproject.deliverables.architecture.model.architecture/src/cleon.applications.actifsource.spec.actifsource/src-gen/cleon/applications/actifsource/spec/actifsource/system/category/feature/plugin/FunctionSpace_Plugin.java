package cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7106baaa-3c77-11e6-aafa-bd565efc0ead,imports]] */
import cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.actifsource.javamodel.IActifsource;
/* End Protected Region   [[7106baaa-3c77-11e6-aafa-bd565efc0ead,imports]] */

public class FunctionSpace_Plugin {

  /* Begin Protected Region [[7106baaa-3c77-11e6-aafa-bd565efc0ead]] */
  
  /* End Protected Region   [[7106baaa-3c77-11e6-aafa-bd565efc0ead]] */


  public static interface IAbstractPluginFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5fac0a17-8983-11e6-9315-e9960ca482c6")
    public List<cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin> GetDirectDependingProjectBuildingBlocks();

    @IDynamicResourceExtension.MethodId("40333452-c10a-11e6-8f58-ad3c6ee7602f")
    public List<cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin> GetDirectDependingBuiltinBuildingBlocks();

    @IDynamicResourceExtension.MethodId("bd765b2f-c10b-11e6-8f58-ad3c6ee7602f")
    public List<cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin> GetAllDuplicatedBuiltinDependencies();

    @IDynamicResourceExtension.MethodId("3e804d3f-95a8-11e8-8990-bba75387a1ab")
    public List<cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin> GetAllDuplicatedProjectDependencies();

    @IDynamicResourceExtension.MethodId("1e20244f-c10c-11e6-8f58-ad3c6ee7602f")
    public List<cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin> GetAllBuiltinDependencies();

    @IDynamicResourceExtension.MethodId("32cb0426-95a8-11e8-8990-bba75387a1ab")
    public List<cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin> GetAllProjectDependencies();

    @IDynamicResourceExtension.MethodId("3e2a64a5-5b56-11e7-9702-abdab196c2a1")
    public java.lang.String GetFullBuildingBlockName();

    @IDynamicResourceExtension.MethodId("22956d62-5b57-11e7-9702-abdab196c2a1")
    public java.lang.Boolean UseSimpleName();

    @IDynamicResourceExtension.MethodId("18ec0402-41a5-11e8-81d0-774e4d9334dd")
    public List<cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.INature> ListNatures();

    @IDynamicResourceExtension.MethodId("6062fd26-d093-11e8-b005-f7630e4c29c0")
    public List<cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin> GetDirectDependingBuildingBlocks();

    @IDynamicResourceExtension.MethodId("1f04e30a-6f63-11e9-ad7a-a97bad6ad10a")
    public java.lang.String GetBuildingBlockName();

  }
  
  public static interface IAbstractPluginFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("22956d62-5b57-11e7-9702-abdab196c2a1")
    public java.lang.Boolean UseSimpleName(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin abstractPlugin);

  }
  
  public static class AbstractPluginFunctionsImpl implements IAbstractPluginFunctionsImpl {

    public static final IAbstractPluginFunctionsImpl INSTANCE = new AbstractPluginFunctionsImpl();

    private AbstractPluginFunctionsImpl() {}

    @Override
    public java.lang.Boolean UseSimpleName(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin abstractPlugin) {
      /* Begin Protected Region [[22956d62-5b57-11e7-9702-abdab196c2a1]] */
    	IActifsource actifsource = abstractPlugin.selectActifsource();
    	if( actifsource == null)
    	{
    		return false;
    	}
    	Boolean useSimpleName = actifsource.selectUseSimpleNameForBinding();
    	if( useSimpleName == null)
    	{
    		return false;
    	}
    	return useSimpleName;
      /* End Protected Region   [[22956d62-5b57-11e7-9702-abdab196c2a1]] */
    }

  }
  
  public static class AbstractPluginFunctions {

    private AbstractPluginFunctions() {}

    public static java.lang.Boolean UseSimpleName(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin abstractPlugin) {
      return DynamicResourceUtil.invoke(IAbstractPluginFunctionsImpl.class, AbstractPluginFunctionsImpl.INSTANCE, abstractPlugin).UseSimpleName(abstractPlugin);
    }

  }

  public static interface IModelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7d9d3c83-3c77-11e6-aafa-bd565efc0ead")
    public java.lang.String GetBuildingBlockName();

  }
  
  public static interface IModelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ModelFunctionsImpl implements IModelFunctionsImpl {

    public static final IModelFunctionsImpl INSTANCE = new ModelFunctionsImpl();

    private ModelFunctionsImpl() {}

  }
  
  public static class ModelFunctions {

    private ModelFunctions() {}

  }

  public static interface ITemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("96d10a22-3c79-11e6-aafa-bd565efc0ead")
    public java.lang.String GetBuildingBlockName();

  }
  
  public static interface ITemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TemplateFunctionsImpl implements ITemplateFunctionsImpl {

    public static final ITemplateFunctionsImpl INSTANCE = new TemplateFunctionsImpl();

    private TemplateFunctionsImpl() {}

  }
  
  public static class TemplateFunctions {

    private TemplateFunctions() {}

  }

  public static interface IMetaModelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d0ee34b5-3c79-11e6-aafa-bd565efc0ead")
    public java.lang.String GetBuildingBlockName();

  }
  
  public static interface IMetaModelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MetaModelFunctionsImpl implements IMetaModelFunctionsImpl {

    public static final IMetaModelFunctionsImpl INSTANCE = new MetaModelFunctionsImpl();

    private MetaModelFunctionsImpl() {}

  }
  
  public static class MetaModelFunctions {

    private MetaModelFunctions() {}

  }

  public static interface IDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f6381a3f-3c79-11e6-aafa-bd565efc0ead")
    public java.lang.String GetBuildingBlockName();

  }
  
  public static interface IDiagramFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DiagramFunctionsImpl implements IDiagramFunctionsImpl {

    public static final IDiagramFunctionsImpl INSTANCE = new DiagramFunctionsImpl();

    private DiagramFunctionsImpl() {}

  }
  
  public static class DiagramFunctions {

    private DiagramFunctions() {}

  }

  public static interface ISampleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7bd8212a-2637-11ea-8c59-871562e3b5c4")
    public java.lang.String GetBuildingBlockName();

  }
  
  public static interface ISampleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SampleFunctionsImpl implements ISampleFunctionsImpl {

    public static final ISampleFunctionsImpl INSTANCE = new SampleFunctionsImpl();

    private SampleFunctionsImpl() {}

  }
  
  public static class SampleFunctions {

    private SampleFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7106baaa-3c77-11e6-aafa-bd565efc0ead,mU0G7KwTOnIavnBnYjzf9FXW5Xs=] */
