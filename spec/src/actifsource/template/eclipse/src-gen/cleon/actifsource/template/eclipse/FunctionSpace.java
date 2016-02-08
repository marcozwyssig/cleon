package cleon.actifsource.template.eclipse;

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


  public static interface IPluginProjectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3c4f08b4-11ea-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("996113d4-11ef-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetProjectName();

    @IDynamicResourceExtension.MethodId("20ee793e-44ca-11e5-93ef-c50f9659357a")
    public java.lang.String RenderEclipseDependencies();

    @IDynamicResourceExtension.MethodId("2649a006-44ca-11e5-93ef-c50f9659357a")
    public java.lang.String RenderJavaDependencies();

    @IDynamicResourceExtension.MethodId("2b13843d-44ca-11e5-93ef-c50f9659357a")
    public java.lang.String RenderPluginDependencies();

    @IDynamicResourceExtension.MethodId("20cd3b09-b885-11e5-a463-ff45aa361315")
    public cleon.actifsource.spec._05_buildingblockview.javamodel.IPackage GetPackages();

  }
  
  public static interface IPluginProjectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PluginProjectFunctionsImpl implements IPluginProjectFunctionsImpl {

    public static final IPluginProjectFunctionsImpl INSTANCE = new PluginProjectFunctionsImpl();

    private PluginProjectFunctionsImpl() {}

  }
  
  public static class PluginProjectFunctions {

    private PluginProjectFunctions() {}

  }

  public static interface ISpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("523e1dc6-11ea-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("a94e60f7-11ef-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetProjectName();

    @IDynamicResourceExtension.MethodId("f46fedeb-11ef-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetRootProjectName();

  }
  
  public static interface ISpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SpecificationFunctionsImpl implements ISpecificationFunctionsImpl {

    public static final ISpecificationFunctionsImpl INSTANCE = new SpecificationFunctionsImpl();

    private SpecificationFunctionsImpl() {}

  }
  
  public static class SpecificationFunctions {

    private SpecificationFunctions() {}

  }

  public static interface ITemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6229e3a9-11ea-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("cb7f4648-11ef-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetProjectName();

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

  public static interface IModelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("751073e2-11ea-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("cd977824-11ef-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetProjectName();

    @IDynamicResourceExtension.MethodId("fbcc508c-a7d2-11e5-82dd-3b995d9c840c")
    public java.lang.String GetParentDirectoryName();

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

  public static interface ISampleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("75d74661-11ea-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("cf878890-11ef-11e5-b568-55f5f05bd6f6")
    public java.lang.String GetProjectName();

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

  public static interface IDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2a125abd-3f8e-11e5-9616-473ab9b9a1f3")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("26a2b039-3f8e-11e5-9616-473ab9b9a1f3")
    public java.lang.String GetProjectName();

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

  public static interface IPackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0b35945e-b885-11e5-a463-ff45aa361315")
    public cleon.actifsource.spec._05_buildingblockview.javamodel.IPackage GetPackages();

    @IDynamicResourceExtension.MethodId("3bee1cdd-b885-11e5-a463-ff45aa361315")
    public java.lang.String GetPackageName(final cleon.actifsource.spec._05_buildingblockview.javamodel.IPluginProject project);

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,30ec7375-11ea-11e5-b568-55f5f05bd6f6,QSzpGLc3uKbTfIwyI2ofdAj/csQ=] */
