package cleon.applications.actifsource.metamodel.template.eclipse;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[30ec7375-11ea-11e5-b568-55f5f05bd6f6,imports]] */
import cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPackage;
import cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin;

/* End Protected Region   [[30ec7375-11ea-11e5-b568-55f5f05bd6f6,imports]] */

public class FunctionSpace_Eclipse {

  /* Begin Protected Region [[30ec7375-11ea-11e5-b568-55f5f05bd6f6]] */
  
  /* End Protected Region   [[30ec7375-11ea-11e5-b568-55f5f05bd6f6]] */


  public static interface IAbstractProjectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("20ee793e-44ca-11e5-93ef-c50f9659357a")
    public java.lang.String RenderEclipseDependencies();

    @IDynamicResourceExtension.MethodId("2649a006-44ca-11e5-93ef-c50f9659357a")
    public java.lang.String RenderJavaDependencies();

    @IDynamicResourceExtension.MethodId("6db5f69b-0bfa-11e6-92b5-27c7a314300c")
    public java.lang.String RenderBuiltinDependencies();

  }
  
  public static interface IAbstractProjectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractProjectFunctionsImpl implements IAbstractProjectFunctionsImpl {

    public static final IAbstractProjectFunctionsImpl INSTANCE = new AbstractProjectFunctionsImpl();

    private AbstractProjectFunctionsImpl() {}

  }
  
  public static class AbstractProjectFunctions {

    private AbstractProjectFunctions() {}

  }

  public static interface IPackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0b35945e-b885-11e5-a463-ff45aa361315")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPackage> GetPackages();

    @IDynamicResourceExtension.MethodId("3bee1cdd-b885-11e5-a463-ff45aa361315")
    public java.lang.String GetPackageName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject project);

    @IDynamicResourceExtension.MethodId("eb83eaf8-2a51-11ea-86bd-67705d589838")
    public java.lang.String GetSpecPackageName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject project);

    @IDynamicResourceExtension.MethodId("cf676a3c-2a51-11ea-86bd-67705d589838")
    public java.lang.String GetTemplatePackageName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject project);

    @IDynamicResourceExtension.MethodId("e9c5a3f5-2a52-11ea-86bd-67705d589838")
    public java.lang.String GetCustomPackageName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject project);

    @IDynamicResourceExtension.MethodId("9cc66988-2a6a-11ea-825d-f7ca5e5684e4")
    public cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPackage GetTopPackage();

    @IDynamicResourceExtension.MethodId("e9141a8e-2a6a-11ea-825d-f7ca5e5684e4")
    public java.lang.String GetGenericPackageName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject project);

  }
  
  public static interface IPackageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e9141a8e-2a6a-11ea-825d-f7ca5e5684e4")
    public java.lang.String GetGenericPackageName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject project, final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPackage package_);

  }
  
  public static class PackageFunctionsImpl implements IPackageFunctionsImpl {

    public static final IPackageFunctionsImpl INSTANCE = new PackageFunctionsImpl();

    private PackageFunctionsImpl() {}

    @Override
    public java.lang.String GetGenericPackageName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject project, final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPackage package_) {
      /* Begin Protected Region [[e9141a8e-2a6a-11ea-825d-f7ca5e5684e4]] */
      IPackageFunctions functions = package_.extension(IPackageFunctions.class);
      IPackage top = functions.GetTopPackage();
      IPlugin plugin = project.selectPlugin();
      if( plugin != null ) {
    	  if( plugin.selectExportSpecPackage().contains(top)) {
    		  return functions.GetSpecPackageName(project);
    	  }
    	  if( plugin.selectExportTemplatePackage().contains(top)) {
    		  return functions.GetTemplatePackageName(project);
    	  }
    	  if( plugin.selectExportCustomPackage().contains(top)) {
    		  return functions.GetCustomPackageName(project);
    	  }
      }
      return null;
      /* End Protected Region   [[e9141a8e-2a6a-11ea-825d-f7ca5e5684e4]] */
    }

  }
  
  public static class PackageFunctions {

    private PackageFunctions() {}

    public static java.lang.String GetGenericPackageName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject project, final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IPackage package_) {
      return DynamicResourceUtil.invoke(IPackageFunctionsImpl.class, PackageFunctionsImpl.INSTANCE, package_).GetGenericPackageName(project, package_);
    }

  }

  public static interface IFeatureFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("486ab14d-08a0-11e6-a630-c5f34c31623f")
    public java.lang.String RenderContainingPlugins();

    @IDynamicResourceExtension.MethodId("fe333144-7e75-11e6-95c9-39c2ade57f78")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("3492c658-be77-11e8-a165-65b4bbad9291")
    public java.lang.String GetFeatureName();

    @IDynamicResourceExtension.MethodId("3b4ede36-be77-11e8-a165-65b4bbad9291")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("ffa885b5-be77-11e8-a165-65b4bbad9291")
    public cleon.common.resources.metamodel.spec.versions.javamodel.ISemanticVersion GetVersion();

    @IDynamicResourceExtension.MethodId("b1d8ac24-be78-11e8-a165-65b4bbad9291")
    public cleon.applications.actifsource.metamodel.spec.system.javamodel.IZoo GetZoo();

    @IDynamicResourceExtension.MethodId("5cc7d343-be79-11e8-a165-65b4bbad9291")
    public java.lang.String RenderFeatureDependencies();

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

  public static interface IZooFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("aa3daa49-342d-11e7-9486-85e29952984a")
    public java.lang.String GetSiteName();

    @IDynamicResourceExtension.MethodId("09628c70-3936-11e7-bdc0-a3f58cf12b73")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("04cab634-8e7d-11e8-bdd7-2510a77680f5")
    public java.lang.String GetAcitfSourceVersion();

  }
  
  public static interface IZooFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ZooFunctionsImpl implements IZooFunctionsImpl {

    public static final IZooFunctionsImpl INSTANCE = new ZooFunctionsImpl();

    private ZooFunctionsImpl() {}

  }
  
  public static class ZooFunctions {

    private ZooFunctions() {}

  }

  public static interface INatureFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("52c5bcfd-41a5-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderNatureName();

    @IDynamicResourceExtension.MethodId("def557c4-41a5-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderBuildCommand();

    @IDynamicResourceExtension.MethodId("973787c9-41a8-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderClassPathEntry();

  }
  
  public static interface INatureFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NatureFunctionsImpl implements INatureFunctionsImpl {

    public static final INatureFunctionsImpl INSTANCE = new NatureFunctionsImpl();

    private NatureFunctionsImpl() {}

  }
  
  public static class NatureFunctions {

    private NatureFunctions() {}

  }

  public static interface IJavaFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("89d7a384-41a5-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderNatureName();

    @IDynamicResourceExtension.MethodId("e668fec4-41a5-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderBuildCommand();

    @IDynamicResourceExtension.MethodId("a78b862e-41a8-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderClassPathEntry();

  }
  
  public static interface IJavaFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class JavaFunctionsImpl implements IJavaFunctionsImpl {

    public static final IJavaFunctionsImpl INSTANCE = new JavaFunctionsImpl();

    private JavaFunctionsImpl() {}

  }
  
  public static class JavaFunctions {

    private JavaFunctions() {}

  }

  public static interface IGradleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b1f8ecf8-41a5-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderNatureName();

    @IDynamicResourceExtension.MethodId("e8776c70-41a5-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderBuildCommand();

    @IDynamicResourceExtension.MethodId("aaabb1fa-41a8-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderClassPathEntry();

  }
  
  public static interface IGradleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GradleFunctionsImpl implements IGradleFunctionsImpl {

    public static final IGradleFunctionsImpl INSTANCE = new GradleFunctionsImpl();

    private GradleFunctionsImpl() {}

  }
  
  public static class GradleFunctions {

    private GradleFunctions() {}

  }

  public static interface IActifsourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b8a6ab6f-41a5-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderNatureName();

    @IDynamicResourceExtension.MethodId("ea0a688c-41a5-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderBuildCommand();

    @IDynamicResourceExtension.MethodId("acaa4126-41a8-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderClassPathEntry();

  }
  
  public static interface IActifsourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActifsourceFunctionsImpl implements IActifsourceFunctionsImpl {

    public static final IActifsourceFunctionsImpl INSTANCE = new ActifsourceFunctionsImpl();

    private ActifsourceFunctionsImpl() {}

  }
  
  public static class ActifsourceFunctions {

    private ActifsourceFunctions() {}

  }

  public static interface IPluginFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0121d453-41aa-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderNatureName();

    @IDynamicResourceExtension.MethodId("45bf98ac-41aa-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderBuildCommand();

    @IDynamicResourceExtension.MethodId("51bbd476-41aa-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderClassPathEntry();

  }
  
  public static interface IPluginFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0121d453-41aa-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderNatureName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin);

    @IDynamicResourceExtension.MethodId("45bf98ac-41aa-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderBuildCommand(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin);

  }
  
  public static class PluginFunctionsImpl implements IPluginFunctionsImpl {

    public static final IPluginFunctionsImpl INSTANCE = new PluginFunctionsImpl();

    private PluginFunctionsImpl() {}

    @Override
    public java.lang.String RenderNatureName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin) {
      return null;
    }

    @Override
    public java.lang.String RenderBuildCommand(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin) {
      return null;
    }

  }
  
  public static class PluginFunctions {

    private PluginFunctions() {}

    public static java.lang.String RenderNatureName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin) {
      return DynamicResourceUtil.invoke(IPluginFunctionsImpl.class, PluginFunctionsImpl.INSTANCE, plugin).RenderNatureName(plugin);
    }

    public static java.lang.String RenderBuildCommand(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.IPlugin plugin) {
      return DynamicResourceUtil.invoke(IPluginFunctionsImpl.class, PluginFunctionsImpl.INSTANCE, plugin).RenderBuildCommand(plugin);
    }

  }

  public static interface ICategoryFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("688f8934-b8c7-11e8-b88f-bd952c44e997")
    public java.lang.String GetFeatureName();

    @IDynamicResourceExtension.MethodId("ed9ea5ed-b8c7-11e8-b88f-bd952c44e997")
    public java.lang.String GetName();

  }
  
  public static interface ICategoryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CategoryFunctionsImpl implements ICategoryFunctionsImpl {

    public static final ICategoryFunctionsImpl INSTANCE = new CategoryFunctionsImpl();

    private CategoryFunctionsImpl() {}

  }
  
  public static class CategoryFunctions {

    private CategoryFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,30ec7375-11ea-11e5-b568-55f5f05bd6f6,vv5u323dC0vE2K9vqp2EclJzsV0=] */
