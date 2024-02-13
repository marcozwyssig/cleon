package cleon.applications.actifsource.metamodel.spec.system.category.feature.project;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7106baaa-3c77-11e6-aafa-bd565efc0ead,imports]] */
import cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.IActifsource;
/* End Protected Region   [[7106baaa-3c77-11e6-aafa-bd565efc0ead,imports]] */

public class FunctionSpace_Project {

  /* Begin Protected Region [[7106baaa-3c77-11e6-aafa-bd565efc0ead]] */
  
  /* End Protected Region   [[7106baaa-3c77-11e6-aafa-bd565efc0ead]] */


  public static interface IAbstractProjectFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5fac0a17-8983-11e6-9315-e9960ca482c6")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject> DirectDependingProjectBuildingBlocks();

    @IDynamicResourceExtension.MethodId("40333452-c10a-11e6-8f58-ad3c6ee7602f")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject> DirectDependingBuiltinBuildingBlocks();

    @IDynamicResourceExtension.MethodId("bd765b2f-c10b-11e6-8f58-ad3c6ee7602f")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject> GetAllDuplicatedBuiltinDependencies();

    @IDynamicResourceExtension.MethodId("3e804d3f-95a8-11e8-8990-bba75387a1ab")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject> GetAllDuplicatedProjectDependencies();

    @IDynamicResourceExtension.MethodId("1e20244f-c10c-11e6-8f58-ad3c6ee7602f")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject> GetAllBuiltinDependencies();

    @IDynamicResourceExtension.MethodId("32cb0426-95a8-11e8-8990-bba75387a1ab")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject> GetAllProjectDependencies();

    @IDynamicResourceExtension.MethodId("3e2a64a5-5b56-11e7-9702-abdab196c2a1")
    public java.lang.String FullBuildingBlockName();

    @IDynamicResourceExtension.MethodId("22956d62-5b57-11e7-9702-abdab196c2a1")
    public java.lang.Boolean UseSimpleName();

    @IDynamicResourceExtension.MethodId("18ec0402-41a5-11e8-81d0-774e4d9334dd")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.INature> ListNatures();

    @IDynamicResourceExtension.MethodId("6062fd26-d093-11e8-b005-f7630e4c29c0")
    public List<cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject> DirectDependingBuildingBlocks();

    @IDynamicResourceExtension.MethodId("1f04e30a-6f63-11e9-ad7a-a97bad6ad10a")
    public java.lang.String BuildingBlockName();

    @IDynamicResourceExtension.MethodId("3c4f08b4-11ea-11e5-b568-55f5f05bd6f6")
    public java.lang.String Path();

    @IDynamicResourceExtension.MethodId("1cd5a723-434f-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetVersion();

    @IDynamicResourceExtension.MethodId("88c4e02e-8e7d-11e8-bdd7-2510a77680f5")
    public java.lang.String GetActifSourceVersion();

    @IDynamicResourceExtension.MethodId("231ce01b-d7c7-11ea-ae00-5518e944c256")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("ee7e9c00-d7c7-11ea-ae00-5518e944c256")
    public java.lang.String BuiltinFullBuildingBlockName();

    @IDynamicResourceExtension.MethodId("9278a354-ca53-11ee-9333-85190b249041")
    public java.lang.String GetJavaVersion();

  }
  
  public static interface IAbstractProjectFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("22956d62-5b57-11e7-9702-abdab196c2a1")
    public java.lang.Boolean UseSimpleName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject abstractProject);

  }
  
  public static class AbstractProjectFunctionsImpl implements IAbstractProjectFunctionsImpl {

    public static final IAbstractProjectFunctionsImpl INSTANCE = new AbstractProjectFunctionsImpl();

    private AbstractProjectFunctionsImpl() {}

    @Override
    public java.lang.Boolean UseSimpleName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject abstractProject) {
      /* Begin Protected Region [[22956d62-5b57-11e7-9702-abdab196c2a1]] */
    	IActifsource actifsource = abstractProject.selectActifsource();
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
  
  public static class AbstractProjectFunctions {

    private AbstractProjectFunctions() {}

    public static java.lang.Boolean UseSimpleName(final cleon.applications.actifsource.metamodel.spec.system.category.feature.project.javamodel.IAbstractProject abstractProject) {
      return DynamicResourceUtil.invoke(IAbstractProjectFunctionsImpl.class, AbstractProjectFunctionsImpl.INSTANCE, abstractProject).UseSimpleName(abstractProject);
    }

  }

  public static interface IModelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7d9d3c83-3c77-11e6-aafa-bd565efc0ead")
    public java.lang.String BuildingBlockName();

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
    public java.lang.String BuildingBlockName();

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
    public java.lang.String BuildingBlockName();

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

  public static interface INamedMetaModelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("56140881-2703-11ea-8c59-871562e3b5c4")
    public java.lang.String BuildingBlockName();

  }
  
  public static interface INamedMetaModelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedMetaModelFunctionsImpl implements INamedMetaModelFunctionsImpl {

    public static final INamedMetaModelFunctionsImpl INSTANCE = new NamedMetaModelFunctionsImpl();

    private NamedMetaModelFunctionsImpl() {}

  }
  
  public static class NamedMetaModelFunctions {

    private NamedMetaModelFunctions() {}

  }

  public static interface IDiagramFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f6381a3f-3c79-11e6-aafa-bd565efc0ead")
    public java.lang.String BuildingBlockName();

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
    public java.lang.String BuildingBlockName();

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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7106baaa-3c77-11e6-aafa-bd565efc0ead,i8U3Eefrv79PvkwFL0mOtg3r1Yg=] */
