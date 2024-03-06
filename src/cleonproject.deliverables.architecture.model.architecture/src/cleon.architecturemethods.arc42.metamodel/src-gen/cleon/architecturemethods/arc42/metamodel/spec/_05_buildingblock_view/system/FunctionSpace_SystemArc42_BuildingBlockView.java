package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8bc3420c-035a-11e9-a251-e3767b78f69f,imports]] */

/* End Protected Region   [[8bc3420c-035a-11e9-a251-e3767b78f69f,imports]] */

public class FunctionSpace_SystemArc42_BuildingBlockView {

  /* Begin Protected Region [[8bc3420c-035a-11e9-a251-e3767b78f69f]] */
  
  /* End Protected Region   [[8bc3420c-035a-11e9-a251-e3767b78f69f]] */


  public static interface IAbstractSystemOrSystemComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9c052ed1-4bc1-11ed-9983-274ab90bcd39")
    public java.lang.String ShortnameOrOverride();

  }
  
  public static interface IAbstractSystemOrSystemComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSystemOrSystemComponentFunctionsImpl implements IAbstractSystemOrSystemComponentFunctionsImpl {

    public static final IAbstractSystemOrSystemComponentFunctionsImpl INSTANCE = new AbstractSystemOrSystemComponentFunctionsImpl();

    private AbstractSystemOrSystemComponentFunctionsImpl() {}

  }
  
  public static class AbstractSystemOrSystemComponentFunctions {

    private AbstractSystemOrSystemComponentFunctions() {}

  }

  public static interface IAbstractSystemOrSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c8a093a3-4bd4-11ed-bcee-57344264bda3")
    public java.lang.String GetShortname();

    @IDynamicResourceExtension.MethodId("59dcc048-4bd5-11ed-bcee-57344264bda3")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("d71c7699-4bd4-11ed-bcee-57344264bda3")
    public java.lang.String ShortnameOrOverride();

    @IDynamicResourceExtension.MethodId("4ed56cdc-4e0b-11ed-a85e-ff0e1a36b8ae")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationProperty> SystemConfigurationProperties();

  }
  
  public static interface IAbstractSystemOrSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSystemOrSystemConfigurationFunctionsImpl implements IAbstractSystemOrSystemConfigurationFunctionsImpl {

    public static final IAbstractSystemOrSystemConfigurationFunctionsImpl INSTANCE = new AbstractSystemOrSystemConfigurationFunctionsImpl();

    private AbstractSystemOrSystemConfigurationFunctionsImpl() {}

  }
  
  public static class AbstractSystemOrSystemConfigurationFunctions {

    private AbstractSystemOrSystemConfigurationFunctions() {}

  }

  public static interface ISystemComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3b7918e0-035b-11e9-a251-e3767b78f69f")
    public java.lang.String GetTypeName();

    @IDynamicResourceExtension.MethodId("e8adea82-b5f8-11ea-a2c5-5b1c7f861dd4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetAllDecomposingSystemConfiguration();

    @IDynamicResourceExtension.MethodId("fb06c7e3-394e-11eb-93f1-c3f5ad8bb73f")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem System();

    @IDynamicResourceExtension.MethodId("eadcbef1-4bc1-11ed-9983-274ab90bcd39")
    public java.lang.String ShortnameOrOverride();

  }
  
  public static interface ISystemComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemComponentFunctionsImpl implements ISystemComponentFunctionsImpl {

    public static final ISystemComponentFunctionsImpl INSTANCE = new SystemComponentFunctionsImpl();

    private SystemComponentFunctionsImpl() {}

  }
  
  public static class SystemComponentFunctions {

    private SystemComponentFunctions() {}

  }

  public static interface IAbstractSystemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9d441428-616f-11ea-a72c-c14dab81a029")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("8364e39b-c78b-11ea-b0b6-e5df79e86bc2")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> AllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("5302a03f-94c2-11ec-ab3a-174a15580942")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent> AllSystemComponents();

    @IDynamicResourceExtension.MethodId("da82f449-4bc1-11ed-9983-274ab90bcd39")
    public java.lang.String OverrideOrName();

    @IDynamicResourceExtension.MethodId("efaea1fb-4bd5-11ed-bcee-57344264bda3")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("0c78c830-4bd6-11ed-bcee-57344264bda3")
    public java.lang.String ShortnameOrOverride();

    @IDynamicResourceExtension.MethodId("fa4dc007-4bd5-11ed-bcee-57344264bda3")
    public java.lang.String GetShortname();

    @IDynamicResourceExtension.MethodId("795abda7-4e0b-11ed-a85e-ff0e1a36b8ae")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationProperty> SystemConfigurationProperties();

  }
  
  public static interface IAbstractSystemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("795abda7-4e0b-11ed-a85e-ff0e1a36b8ae")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationProperty> SystemConfigurationProperties(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem abstractSystem);

  }
  
  public static class AbstractSystemFunctionsImpl implements IAbstractSystemFunctionsImpl {

    public static final IAbstractSystemFunctionsImpl INSTANCE = new AbstractSystemFunctionsImpl();

    private AbstractSystemFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationProperty> SystemConfigurationProperties(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem abstractSystem) {
      return null;
    }

  }
  
  public static class AbstractSystemFunctions {

    private AbstractSystemFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfigurationProperty> SystemConfigurationProperties(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem abstractSystem) {
      return DynamicResourceUtil.invoke(IAbstractSystemFunctionsImpl.class, AbstractSystemFunctionsImpl.INSTANCE, abstractSystem).SystemConfigurationProperties(abstractSystem);
    }

  }

  public static interface ISystemWithLayerFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("70bfbfae-9c97-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent> AllSystemComponents();

  }
  
  public static interface ISystemWithLayerFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemWithLayerFunctionsImpl implements ISystemWithLayerFunctionsImpl {

    public static final ISystemWithLayerFunctionsImpl INSTANCE = new SystemWithLayerFunctionsImpl();

    private SystemWithLayerFunctionsImpl() {}

  }
  
  public static class SystemWithLayerFunctions {

    private SystemWithLayerFunctions() {}

  }

  public static interface INamedSystemWithSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fcec324a-8797-11e9-bb4b-c57da735262b")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetAllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("0c70d2c9-8798-11e9-bb4b-c57da735262b")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> SortedAllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("61eaf769-009f-11ea-9b43-0b5ecf12c553")
    public java.lang.String GroupName();

  }
  
  public static interface INamedSystemWithSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NamedSystemWithSystemConfigurationFunctionsImpl implements INamedSystemWithSystemConfigurationFunctionsImpl {

    public static final INamedSystemWithSystemConfigurationFunctionsImpl INSTANCE = new NamedSystemWithSystemConfigurationFunctionsImpl();

    private NamedSystemWithSystemConfigurationFunctionsImpl() {}

  }
  
  public static class NamedSystemWithSystemConfigurationFunctions {

    private NamedSystemWithSystemConfigurationFunctions() {}

  }

  public static interface ISystemOfSystemFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("faa19cf3-deab-11e9-b714-478bec98e62d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetAllSystemConfigurations();

  }
  
  public static interface ISystemOfSystemFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemOfSystemFunctionsImpl implements ISystemOfSystemFunctionsImpl {

    public static final ISystemOfSystemFunctionsImpl INSTANCE = new SystemOfSystemFunctionsImpl();

    private SystemOfSystemFunctionsImpl() {}

  }
  
  public static class SystemOfSystemFunctions {

    private SystemOfSystemFunctions() {}

  }

  public static interface IBuildingBlockFunctions extends IDynamicResourceExtension {

  }
  
  public static interface IBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockFunctionsImpl implements IBuildingBlockFunctionsImpl {

    public static final IBuildingBlockFunctionsImpl INSTANCE = new BuildingBlockFunctionsImpl();

    private BuildingBlockFunctionsImpl() {}

  }
  
  public static class BuildingBlockFunctions {

    private BuildingBlockFunctions() {}

  }

  public static interface ISystemConfigurationPropertyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0c3c6b00-d5d1-11ec-ad12-8d6f8e00bc94")
    public java.lang.String PermissionName();

  }
  
  public static interface ISystemConfigurationPropertyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationPropertyFunctionsImpl implements ISystemConfigurationPropertyFunctionsImpl {

    public static final ISystemConfigurationPropertyFunctionsImpl INSTANCE = new SystemConfigurationPropertyFunctionsImpl();

    private SystemConfigurationPropertyFunctionsImpl() {}

  }
  
  public static class SystemConfigurationPropertyFunctions {

    private SystemConfigurationPropertyFunctions() {}

  }

  public static interface IOverrideShortNameAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4461f4ba-d8e6-11eb-9729-c33fe444cc71")
    public java.lang.String OverrideOrName();

  }
  
  public static interface IOverrideShortNameAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OverrideShortNameAwareFunctionsImpl implements IOverrideShortNameAwareFunctionsImpl {

    public static final IOverrideShortNameAwareFunctionsImpl INSTANCE = new OverrideShortNameAwareFunctionsImpl();

    private OverrideShortNameAwareFunctionsImpl() {}

  }
  
  public static class OverrideShortNameAwareFunctions {

    private OverrideShortNameAwareFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8bc3420c-035a-11e9-a251-e3767b78f69f,EjBeSd/PhUyNgvaKouzVnOzt13o=] */
