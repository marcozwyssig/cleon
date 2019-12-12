package cleon.applications.actifsource.template.eclipse;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[30ec7375-11ea-11e5-b568-55f5f05bd6f6,imports]] */

/* End Protected Region   [[30ec7375-11ea-11e5-b568-55f5f05bd6f6,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[30ec7375-11ea-11e5-b568-55f5f05bd6f6]] */
  
  /* End Protected Region   [[30ec7375-11ea-11e5-b568-55f5f05bd6f6]] */


  public static interface IAbstractPluginFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3c4f08b4-11ea-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("20ee793e-44ca-11e5-93ef-c50f9659357a")
    public java.lang.String RenderEclipseDependencies();

    @IDynamicResourceExtension.MethodId("2649a006-44ca-11e5-93ef-c50f9659357a")
    public java.lang.String RenderJavaDependencies();

    @IDynamicResourceExtension.MethodId("20cd3b09-b885-11e5-a463-ff45aa361315")
    public cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage GetPackages();

    @IDynamicResourceExtension.MethodId("712a859b-f8d6-11e5-bc92-c963417b9cea")
    public cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeature GetFeature();

    @IDynamicResourceExtension.MethodId("6db5f69b-0bfa-11e6-92b5-27c7a314300c")
    public java.lang.String RenderBuiltinDependencies();

    @IDynamicResourceExtension.MethodId("1cd5a723-434f-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetVersion();

    @IDynamicResourceExtension.MethodId("88c4e02e-8e7d-11e8-bdd7-2510a77680f5")
    public java.lang.String GetAcitfSourceVersion();

  }
  
  public static interface IAbstractPluginFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractPluginFunctionsImpl implements IAbstractPluginFunctionsImpl {

    public static final IAbstractPluginFunctionsImpl INSTANCE = new AbstractPluginFunctionsImpl();

    private AbstractPluginFunctionsImpl() {}

  }
  
  public static class AbstractPluginFunctions {

    private AbstractPluginFunctions() {}

  }

  public static interface IPackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0b35945e-b885-11e5-a463-ff45aa361315")
    public cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IPackage GetPackages();

    @IDynamicResourceExtension.MethodId("3bee1cdd-b885-11e5-a463-ff45aa361315")
    public java.lang.String GetPackageName(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IAbstractPlugin project);

  }
  
  public static interface IPackageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PackageFunctionsImpl implements IPackageFunctionsImpl {

    public static final IPackageFunctionsImpl INSTANCE = new PackageFunctionsImpl();

    private PackageFunctionsImpl() {}

  }
  
  public static class PackageFunctions {

    private PackageFunctions() {}

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
    public cleon.common.resources.spec.resources.versions.javamodel.ISemanticVersion GetVersion();

    @IDynamicResourceExtension.MethodId("b1d8ac24-be78-11e8-a165-65b4bbad9291")
    public cleon.applications.actifsource.spec.actifsource.system.javamodel.IZoo GetZoo();

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

  public static interface IPlugin_NatureFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0121d453-41aa-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderNatureName();

    @IDynamicResourceExtension.MethodId("45bf98ac-41aa-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderBuildCommand();

    @IDynamicResourceExtension.MethodId("51bbd476-41aa-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderClassPathEntry();

  }
  
  public static interface IPlugin_NatureFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0121d453-41aa-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderNatureName(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature plugin_Nature);

    @IDynamicResourceExtension.MethodId("45bf98ac-41aa-11e8-81d0-774e4d9334dd")
    public java.lang.String RenderBuildCommand(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature plugin_Nature);

  }
  
  public static class Plugin_NatureFunctionsImpl implements IPlugin_NatureFunctionsImpl {

    public static final IPlugin_NatureFunctionsImpl INSTANCE = new Plugin_NatureFunctionsImpl();

    private Plugin_NatureFunctionsImpl() {}

    @Override
    public java.lang.String RenderNatureName(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature plugin_Nature) {
      return null;
    }

    @Override
    public java.lang.String RenderBuildCommand(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature plugin_Nature) {
      return null;
    }

  }
  
  public static class Plugin_NatureFunctions {

    private Plugin_NatureFunctions() {}

    public static java.lang.String RenderNatureName(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature plugin_Nature) {
      return DynamicResourceUtil.invoke(IPlugin_NatureFunctionsImpl.class, Plugin_NatureFunctionsImpl.INSTANCE, plugin_Nature).RenderNatureName(plugin_Nature);
    }

    public static java.lang.String RenderBuildCommand(final cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.nature.javamodel.IPlugin_Nature plugin_Nature) {
      return DynamicResourceUtil.invoke(IPlugin_NatureFunctionsImpl.class, Plugin_NatureFunctionsImpl.INSTANCE, plugin_Nature).RenderBuildCommand(plugin_Nature);
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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,30ec7375-11ea-11e5-b568-55f5f05bd6f6,SdDsx461IkwdMwjuS/CGag025Y8=] */
