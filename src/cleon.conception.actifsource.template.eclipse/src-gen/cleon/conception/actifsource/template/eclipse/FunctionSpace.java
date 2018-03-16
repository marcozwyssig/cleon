package cleon.conception.actifsource.template.eclipse;

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


  public static interface IPluginFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3c4f08b4-11ea-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("20ee793e-44ca-11e5-93ef-c50f9659357a")
    public java.lang.String RenderEclipseDependencies();

    @IDynamicResourceExtension.MethodId("2649a006-44ca-11e5-93ef-c50f9659357a")
    public java.lang.String RenderJavaDependencies();

    @IDynamicResourceExtension.MethodId("20cd3b09-b885-11e5-a463-ff45aa361315")
    public cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage GetPackages();

    @IDynamicResourceExtension.MethodId("712a859b-f8d6-11e5-bc92-c963417b9cea")
    public cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.javamodel.IFeature GetFeature();

    @IDynamicResourceExtension.MethodId("6db5f69b-0bfa-11e6-92b5-27c7a314300c")
    public java.lang.String RenderBuiltinDependencies();

    @IDynamicResourceExtension.MethodId("1cd5a723-434f-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetVersion();

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

  public static interface IPackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0b35945e-b885-11e5-a463-ff45aa361315")
    public cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPackage GetPackages();

    @IDynamicResourceExtension.MethodId("3bee1cdd-b885-11e5-a463-ff45aa361315")
    public java.lang.String GetPackageName(final cleon.conception.actifsource.spec.actifsource._05_buildingblockview.category.feature.plugin.javamodel.IPlugin project);

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
    public java.lang.String GetFeatureName();

    @IDynamicResourceExtension.MethodId("2b13843d-44ca-11e5-93ef-c50f9659357a")
    public java.lang.String RenderRequiredZooDependencies();

    @IDynamicResourceExtension.MethodId("09628c70-3936-11e7-bdc0-a3f58cf12b73")
    public java.lang.String GetName();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,30ec7375-11ea-11e5-b568-55f5f05bd6f6,iJCWf0nbXthUocIsTBXYAVGbCZg=] */
