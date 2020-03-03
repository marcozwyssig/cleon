package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8bc3420c-035a-11e9-a251-e3767b78f69f,imports]] */
import java.util.stream.Collectors;
/* End Protected Region   [[8bc3420c-035a-11e9-a251-e3767b78f69f,imports]] */

public class FunctionSpace_SystemArc42_BuildingBlock {

  /* Begin Protected Region [[8bc3420c-035a-11e9-a251-e3767b78f69f]] */
  
  /* End Protected Region   [[8bc3420c-035a-11e9-a251-e3767b78f69f]] */


  public static interface ISystemComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3b7918e0-035b-11e9-a251-e3767b78f69f")
    public java.lang.String GetTypeName();

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

  public static interface ISystemWithLayerFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("70bfbfae-9c97-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemComponent> AllSystemComponents();

    @IDynamicResourceExtension.MethodId("85e60694-9c97-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurations();

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> GetAllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("0c70d2c9-8798-11e9-bb4b-c57da735262b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> SortedAllSystemConfigurations();

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> GetAllSystemConfigurations();

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

  public static interface ISystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("661c4575-879b-11e9-bb4b-c57da735262b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> GetAllDependsOn();

    @IDynamicResourceExtension.MethodId("a30c72d2-883f-11e9-80ce-fbaba21c141b")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem System();

    @IDynamicResourceExtension.MethodId("691c183c-92b7-11e9-b2b4-f340ae70802c")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> GetAllRequires();

    @IDynamicResourceExtension.MethodId("53f316dd-a93d-11e9-bf83-7bacdb6991f7")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> GetAllDependsOnWithSelf();

    @IDynamicResourceExtension.MethodId("a340ae54-b200-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> GetAllDependsFromWithSelf();

    @IDynamicResourceExtension.MethodId("5e4b2dd6-b200-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> GetAllDependsFrom();

    @IDynamicResourceExtension.MethodId("afece5a6-b9e8-11e9-828c-091526d036b6")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> GetSubzonesAllDependsFromWithSelf();

    @IDynamicResourceExtension.MethodId("b38a2bca-de1f-11e9-b0cf-dd86691e664c")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts> AllUsedTNsDistinct();

    @IDynamicResourceExtension.MethodId("eb2a2ff7-05ed-11ea-9b1e-558d1275d95e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts> AllUsedTNsDistinctWithEnvironment(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment environment);

    @IDynamicResourceExtension.MethodId("014a8f50-deae-11e9-b714-478bec98e62d")
    public java.lang.String GroupName(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env);

    @IDynamicResourceExtension.MethodId("ae3f2508-dec8-11e9-b714-478bec98e62d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts> AllUsedTNs();

    @IDynamicResourceExtension.MethodId("10e575cf-05ee-11ea-9b1e-558d1275d95e")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts> AllUsedTNsWithEnvironment(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment environment);

    @IDynamicResourceExtension.MethodId("2a51e529-df6d-11e9-9827-a1514ee8d06a")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface InterfaceType(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone);

    @IDynamicResourceExtension.MethodId("6e5748b2-e075-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunication> GetCommunications();

    @IDynamicResourceExtension.MethodId("0432a013-e076-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunication> GetCommunicationsDistinct();

    @IDynamicResourceExtension.MethodId("1e2f66c0-06bd-11ea-8f17-2da21adc8e34")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> OnlyToGenerate();

    @IDynamicResourceExtension.MethodId("74b26bdc-09fc-11ea-baed-218c3e076b56")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration GetOnlyDependsFrom();

    @IDynamicResourceExtension.MethodId("492b3b22-14d9-11ea-a57d-f9a0d62ee07e")
    public java.lang.Boolean DependsOnWindows();

  }
  
  public static interface ISystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2a51e529-df6d-11e9-9827-a1514ee8d06a")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface InterfaceType(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone, final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("1e2f66c0-06bd-11ea-8f17-2da21adc8e34")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> OnlyToGenerate(final List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> systemConfigurationList);

    @IDynamicResourceExtension.MethodId("492b3b22-14d9-11ea-a57d-f9a0d62ee07e")
    public java.lang.Boolean DependsOnWindows(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration);

  }
  
  public static class SystemConfigurationFunctionsImpl implements ISystemConfigurationFunctionsImpl {

    public static final ISystemConfigurationFunctionsImpl INSTANCE = new SystemConfigurationFunctionsImpl();

    private SystemConfigurationFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface InterfaceType(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone, final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[2a51e529-df6d-11e9-9827-a1514ee8d06a]] */
    	return systemConfiguration.selectInterface().values().stream().filter(x -> x.selectInterfaceInSecuritySubZone().equals(subzone)).findFirst().orElse(null);   
      /* End Protected Region   [[2a51e529-df6d-11e9-9827-a1514ee8d06a]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> OnlyToGenerate(final List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> systemConfigurationList) {
      /* Begin Protected Region [[1e2f66c0-06bd-11ea-8f17-2da21adc8e34]] */
    	return systemConfigurationList.stream().filter(x -> x.selectSkipGenerate() == null || !x.selectSkipGenerate().booleanValue()).collect(Collectors.toList());   
      /* End Protected Region   [[1e2f66c0-06bd-11ea-8f17-2da21adc8e34]] */
    }

    @Override
    public java.lang.Boolean DependsOnWindows(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
      /* Begin Protected Region [[492b3b22-14d9-11ea-a57d-f9a0d62ee07e]] */
    	return systemConfiguration.extension(ISystemConfigurationFunctions.class).GetAllDependsOnWithSelf().stream().anyMatch(x -> x.selectName().equalsIgnoreCase("WIN"));   
      /* End Protected Region   [[492b3b22-14d9-11ea-a57d-f9a0d62ee07e]] */
    }

  }
  
  public static class SystemConfigurationFunctions {

    private SystemConfigurationFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.IInterface InterfaceType(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone, final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).InterfaceType(subzone, systemConfiguration);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> OnlyToGenerate(final List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> systemConfigurationList) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfigurationList).OnlyToGenerate(systemConfigurationList);
    }

    public static java.lang.Boolean DependsOnWindows(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration) {
      return DynamicResourceUtil.invoke(ISystemConfigurationFunctionsImpl.class, SystemConfigurationFunctionsImpl.INSTANCE, systemConfiguration).DependsOnWindows(systemConfiguration);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8bc3420c-035a-11e9-a251-e3767b78f69f,JWICqn2poO5y/AIEnewcMVxS5YQ=] */
