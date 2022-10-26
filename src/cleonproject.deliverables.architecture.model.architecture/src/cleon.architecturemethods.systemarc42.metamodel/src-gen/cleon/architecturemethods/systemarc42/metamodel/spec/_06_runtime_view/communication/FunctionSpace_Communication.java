package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[536f3fea-8833-11e9-80ce-fbaba21c141b,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.FunctionSpace_Access.IAccessConceptFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.AccessConcept;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.FunctionSpace_Segmentation.ISecuritySubZoneFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.FunctionSpace_SubzonePolicy.ISubZoneAccessPolicyFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.SourceSubZone;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.SystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractHostFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.TopologyEnvironment;
import cleon.modelinglanguages.segmentation.metamodel.spec.FunctionSpace_Segmentation.IZoneFunctions;
import ch.actifsource.util.character.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
/* End Protected Region   [[536f3fea-8833-11e9-80ce-fbaba21c141b,imports]] */

public class FunctionSpace_Communication {

  /* Begin Protected Region [[536f3fea-8833-11e9-80ce-fbaba21c141b]] */
  public static class ListUtil {
  	@SafeVarargs
  	private static <T> Predicate<T> distinctByKeys(final Function<? super T, ?>... keyExtractors) {
  		final Map<List<?>, Boolean> seen = new ConcurrentHashMap<>();

  		return t -> {
  			final List<?> keys = Arrays.stream(keyExtractors).map(ke -> ke.apply(t)).collect(Collectors.toList());

  			return seen.putIfAbsent(keys, Boolean.TRUE) == null;
  		};
  	}
  }

  public static final int MAX_COLUMNS = 90;
  /* End Protected Region   [[536f3fea-8833-11e9-80ce-fbaba21c141b]] */


  public static interface IDestinationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("58d69bff-8833-11e9-80ce-fbaba21c141b")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystem System();

    @IDynamicResourceExtension.MethodId("c788343a-883f-11e9-80ce-fbaba21c141b")
    public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("795a998b-88f0-11e9-9b22-1b5fbbd90cc8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> AllSources();

    @IDynamicResourceExtension.MethodId("ed28063b-b203-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllAllowedSystemConfigurations();

    @IDynamicResourceExtension.MethodId("044ab964-b204-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationsFromDependsFrom();

    @IDynamicResourceExtension.MethodId("24774474-b204-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurationsDependsOn();

    @IDynamicResourceExtension.MethodId("d19f4a17-e07a-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInterSourcesDistinct();

    @IDynamicResourceExtension.MethodId("18fdb44b-0b15-11ea-b483-3fffd745ba7d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInterSources();

    @IDynamicResourceExtension.MethodId("00b7e96c-e07c-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntraSources();

    @IDynamicResourceExtension.MethodId("00b7e976-e07c-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntraSourcesDistinct();

    @IDynamicResourceExtension.MethodId("834d67d8-0b18-11ea-b483-3fffd745ba7d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInterSourcesDistinctByService();

    @IDynamicResourceExtension.MethodId("7c66a18d-0b19-11ea-b483-3fffd745ba7d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyInter();

    @IDynamicResourceExtension.MethodId("66ad1d73-0b72-11ea-891d-81e208cfce61")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyIntra();

    @IDynamicResourceExtension.MethodId("32c46ff9-80bd-11ea-b18a-9db09f26536a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> AccessAsSource();

    @IDynamicResourceExtension.MethodId("3b4a84ba-f738-11ea-b8c1-41c5952fbbbb")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllAbstractServices();

    @IDynamicResourceExtension.MethodId("93726bb6-f738-11ea-b8c1-41c5952fbbbb")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllAbstractServicesDistinct();

    @IDynamicResourceExtension.MethodId("5d6a255f-8bde-11eb-a832-91f5636963f2")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IService> AllServices();

    @IDynamicResourceExtension.MethodId("72386078-8bde-11eb-a832-91f5636963f2")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IService> AllServicesDistinct();

    @IDynamicResourceExtension.MethodId("5532725a-a5f6-11ec-9968-b970a72504b8")
    public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone GetDestinationPolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone);

  }
  
  public static interface IDestinationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7c66a18d-0b19-11ea-b483-3fffd745ba7d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList);

    @IDynamicResourceExtension.MethodId("66ad1d73-0b72-11ea-891d-81e208cfce61")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList);

    @IDynamicResourceExtension.MethodId("5532725a-a5f6-11ec-9968-b970a72504b8")
    public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone GetDestinationPolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination destination);

  }
  
  public static class DestinationFunctionsImpl implements IDestinationFunctionsImpl {

    public static final IDestinationFunctionsImpl INSTANCE = new DestinationFunctionsImpl();

    private DestinationFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList) {
      /* Begin Protected Region [[7c66a18d-0b19-11ea-b483-3fffd745ba7d]] */
      return destinationList.stream()
      		.filter(x -> !x.extension(IDestinationFunctions.class).OnlyInterSourcesDistinct().isEmpty())
      		.collect(Collectors.toList());
      /* End Protected Region   [[7c66a18d-0b19-11ea-b483-3fffd745ba7d]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList) {
      /* Begin Protected Region [[66ad1d73-0b72-11ea-891d-81e208cfce61]] */
      return destinationList.stream()
      		.filter(x -> !x.extension(IDestinationFunctions.class).OnlyIntraSourcesDistinct().isEmpty())
      		.collect(Collectors.toList());
      /* End Protected Region   [[66ad1d73-0b72-11ea-891d-81e208cfce61]] */
    }

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone GetDestinationPolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination destination) {
      /* Begin Protected Region [[5532725a-a5f6-11ec-9968-b970a72504b8]] */
      final var interface_ = destination.selectDestinationSystemConfiguration().selectInterface().get(subzone.getResource());
      return destination.selectDestinationSubSecurityZone().get(interface_.getResource());
      /* End Protected Region   [[5532725a-a5f6-11ec-9968-b970a72504b8]] */
    }

  }
  
  public static class DestinationFunctions {

    private DestinationFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList) {
      return DynamicResourceUtil.invoke(IDestinationFunctionsImpl.class, DestinationFunctionsImpl.INSTANCE, destinationList).OnlyInter(destinationList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination> destinationList) {
      return DynamicResourceUtil.invoke(IDestinationFunctionsImpl.class, DestinationFunctionsImpl.INSTANCE, destinationList).OnlyIntra(destinationList);
    }

    public static cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone GetDestinationPolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone subzone, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination destination) {
      return DynamicResourceUtil.invoke(IDestinationFunctionsImpl.class, DestinationFunctionsImpl.INSTANCE, destination).GetDestinationPolicy(subzone, destination);
    }

  }

  public static interface ISourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("645ee604-b886-11e9-8760-2d4a9d15ec14")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> GetAllSecuritySubzones();

    @IDynamicResourceExtension.MethodId("71ac43f8-a998-11eb-8f9b-01c801f6a12b")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> SourceSecuritySubzones();

    @IDynamicResourceExtension.MethodId("85bc9b26-df87-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInter();

    @IDynamicResourceExtension.MethodId("820fd60a-e042-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntra();

    @IDynamicResourceExtension.MethodId("ff2ddc87-df89-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy> GetInterConnection();

    @IDynamicResourceExtension.MethodId("983f4fe1-e042-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> GetIntraConnection();

    @IDynamicResourceExtension.MethodId("28012e2a-dfa3-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllServices();

    @IDynamicResourceExtension.MethodId("9593f53a-bfcb-11eb-af9a-7dff6e60ee1f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllServicesFlatten();

    @IDynamicResourceExtension.MethodId("c71161b1-e03e-11e9-aa67-4505845acdbd")
    public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination Destination();

    @IDynamicResourceExtension.MethodId("db988228-e03e-11e9-aa67-4505845acdbd")
    public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZoneByHost DestinationSubSecurityZone();

    @IDynamicResourceExtension.MethodId("55674b0d-e07c-11e9-aa67-4505845acdbd")
    public java.lang.String SubLayerName();

    @IDynamicResourceExtension.MethodId("859b1670-051f-11ea-83f8-cdeda7a40e11")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> GetAllIntraConnection();

    @IDynamicResourceExtension.MethodId("11651668-04c4-11ea-8fff-bb311a3ad127")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctBySourceAndService();

    @IDynamicResourceExtension.MethodId("130d994a-f346-11ea-9268-b5c52a12d7f9")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByDestinationAndService();

    @IDynamicResourceExtension.MethodId("9d900304-3d2f-11eb-986d-0d884ba5cf53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByDestination();

    @IDynamicResourceExtension.MethodId("bcff4b1e-1a08-11eb-818d-6dbd3a659d3c")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyMgmt(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom src);

    @IDynamicResourceExtension.MethodId("a74e1baf-0adf-11ea-bf24-ff0f7ff0bb53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByService();

    @IDynamicResourceExtension.MethodId("3489ae51-0ae8-11ea-bf24-ff0f7ff0bb53")
    public java.lang.String RenderInterSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst);

    @IDynamicResourceExtension.MethodId("81c86001-0b16-11ea-b483-3fffd745ba7d")
    public java.lang.String RenderInterDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst);

    @IDynamicResourceExtension.MethodId("5e8db34c-0b82-11ea-ab86-a9f1f5c47ebb")
    public java.lang.String RenderIntraSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst);

    @IDynamicResourceExtension.MethodId("66f3d07d-0b82-11ea-ab86-a9f1f5c47ebb")
    public java.lang.String RenderIntraDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst);

    @IDynamicResourceExtension.MethodId("cfcd27c4-0b71-11ea-891d-81e208cfce61")
    public java.lang.String Tag(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination destination);

    @IDynamicResourceExtension.MethodId("cfcd4eec-0b71-11ea-891d-81e208cfce61")
    public java.lang.String InterRuleName(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZoneByHost dstSz);

    @IDynamicResourceExtension.MethodId("28d5e66c-0b74-11ea-afff-b52fab62d0fd")
    public java.lang.String IntraRuleName(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dstSz);

    @IDynamicResourceExtension.MethodId("cfcd4efd-0b71-11ea-891d-81e208cfce61")
    public java.lang.String ServiceName();

    @IDynamicResourceExtension.MethodId("bab45d01-c78d-11ea-b0b6-e5df79e86bc2")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> SelectAllowedServices();

    @IDynamicResourceExtension.MethodId("21fa0b77-1eb9-11eb-9eef-0dadb2b460da")
    public java.lang.Boolean CanCommunicate(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost dst, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService);

    @IDynamicResourceExtension.MethodId("a67840f7-308e-11eb-9149-f1e36a7322e5")
    public java.lang.String SourceVLAN();

  }
  
  public static interface ISourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("85bc9b26-df87-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("820fd60a-e042-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("983f4fe1-e042-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> GetIntraConnection(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("11651668-04c4-11ea-8fff-bb311a3ad127")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctBySourceAndService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("130d994a-f346-11ea-9268-b5c52a12d7f9")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByDestinationAndService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("9d900304-3d2f-11eb-986d-0d884ba5cf53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByDestination(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("bcff4b1e-1a08-11eb-818d-6dbd3a659d3c")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyMgmt(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom src, final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("a74e1baf-0adf-11ea-bf24-ff0f7ff0bb53")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList);

    @IDynamicResourceExtension.MethodId("3489ae51-0ae8-11ea-bf24-ff0f7ff0bb53")
    public java.lang.String RenderInterSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("81c86001-0b16-11ea-b483-3fffd745ba7d")
    public java.lang.String RenderInterDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("5e8db34c-0b82-11ea-ab86-a9f1f5c47ebb")
    public java.lang.String RenderIntraSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("66f3d07d-0b82-11ea-ab86-a9f1f5c47ebb")
    public java.lang.String RenderIntraDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("21fa0b77-1eb9-11eb-9eef-0dadb2b460da")
    public java.lang.Boolean CanCommunicate(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost dst, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

  }
  
  public static class SourceFunctionsImpl implements ISourceFunctionsImpl {

    public static final ISourceFunctionsImpl INSTANCE = new SourceFunctionsImpl();

    private SourceFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[85bc9b26-df87-11e9-9827-a1514ee8d06a]] */
      final List<ISource> result = new ArrayList<>();
      for (final ISource source : sourceList) {
      	final var functions = source.extension(ISourceFunctions.class);
      	if (!functions.GetInterConnection().isEmpty()) {
      		result.add(source);
      	}
      }

      return result;
      /* End Protected Region   [[85bc9b26-df87-11e9-9827-a1514ee8d06a]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[820fd60a-e042-11e9-aa67-4505845acdbd]] */
      final List<ISource> result = new ArrayList<>();
      for (final ISource source : sourceList) {
      	final var functions = source.extension(ISourceFunctions.class);
      	if (!functions.GetIntraConnection().isEmpty()) {
      		result.add(source);
      	}
      }

      return result;
      /* End Protected Region   [[820fd60a-e042-11e9-aa67-4505845acdbd]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> GetIntraConnection(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[983f4fe1-e042-11e9-aa67-4505845acdbd]] */
      final var sourceFunctions = source.extension(ISourceFunctions.class);
      if (!sourceFunctions.GetInterConnection().isEmpty()) {
      	return null;
      }

      return sourceFunctions.GetAllIntraConnection();
      /* End Protected Region   [[983f4fe1-e042-11e9-aa67-4505845acdbd]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctBySourceAndService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[11651668-04c4-11ea-8fff-bb311a3ad127]] */
      final Predicate<ISource> distinctByKeys = ListUtil.distinctByKeys(ISource::selectSourceSystemConfiguration,
      		ISource::selectCommunicatesWith);
      return sourceList.stream().filter(distinctByKeys).collect(Collectors.toList());
      /* End Protected Region   [[11651668-04c4-11ea-8fff-bb311a3ad127]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByDestinationAndService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[130d994a-f346-11ea-9268-b5c52a12d7f9]] */
      final Predicate<ISource> distinctByKeys = ListUtil.distinctByKeys(x -> {
      	final var functions = x.extension(ISourceFunctions.class);
      	return functions.Destination();
      }, ISource::selectCommunicatesWith);
      return sourceList.stream().filter(distinctByKeys).collect(Collectors.toList());
      /* End Protected Region   [[130d994a-f346-11ea-9268-b5c52a12d7f9]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByDestination(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[9d900304-3d2f-11eb-986d-0d884ba5cf53]] */
      final Predicate<ISource> distinctByKeys = ListUtil.distinctByKeys(x -> {
      	final var functions = x.extension(ISourceFunctions.class);
      	return functions.Destination();
      });
      return sourceList.stream().filter(distinctByKeys).collect(Collectors.toList());
      /* End Protected Region   [[9d900304-3d2f-11eb-986d-0d884ba5cf53]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyMgmt(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom src, final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[bcff4b1e-1a08-11eb-818d-6dbd3a659d3c]] */
      final var accessConceptFunctions = AccessConcept.selectToMeAccessFrom(src)
      		.extension(IAccessConceptFunctions.class);
      final var portServices = accessConceptFunctions.AllCommunicationServices();

      return sourceList.stream().filter(x -> {
      	final var functions = x.extension(ISourceFunctions.class);
      	return functions.AllServices().stream().filter(IPortService.class::isInstance)
      			.map(IPortService.class::cast).anyMatch(y -> portServices.contains(y));
      }).collect(Collectors.toList());
      /* End Protected Region   [[bcff4b1e-1a08-11eb-818d-6dbd3a659d3c]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      /* Begin Protected Region [[a74e1baf-0adf-11ea-bf24-ff0f7ff0bb53]] */
      final Predicate<ISource> distinctByKeys = ListUtil.distinctByKeys(ISource::selectCommunicatesWith);
      return sourceList.stream().filter(distinctByKeys).collect(Collectors.toList());
      /* End Protected Region   [[a74e1baf-0adf-11ea-bf24-ff0f7ff0bb53]] */
    }

    @Override
    public java.lang.String RenderInterSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[3489ae51-0ae8-11ea-bf24-ff0f7ff0bb53]] */
      final var results = new HashSet<String>();
      final var destinationfunctions = dst
      		.extension(IDestinationSubSecurityZoneFunctions.class);
      for (final ISource src : destinationfunctions.AllInterSourceDistinctByService()) {
      	if (src.selectCommunicatesWith().equals(source.selectCommunicatesWith())) {
      		for (final ISourceInSubSecurityZone sourceSubsecurity : src.selectAccessAllowed().values()) {
      			final var functions = sourceSubsecurity
      					.extension(ISourceInSubSecurityZoneFunctions.class);
      			final var grpResults = functions.RenderSourceGroups(src, env);
      			for (final String result : Arrays.asList(StringUtil.getNewLinePattern().split(grpResults))) {
      				if (result.length() != 0) {
      					results.add(result);
      				}
      			}
      		}
      	}
      }

      final var builder = new StringBuilder();
      for (final String result : results) {
      	builder.append(result + ",");
      }
      return builder.toString();
      /* End Protected Region   [[3489ae51-0ae8-11ea-bf24-ff0f7ff0bb53]] */
    }

    @Override
    public java.lang.String RenderInterDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[81c86001-0b16-11ea-b483-3fffd745ba7d]] */
      final var results = new HashSet<String>();
      final var destinationfunctions = dst
      		.extension(IDestinationSubSecurityZoneFunctions.class);
      for (final ISource src : destinationfunctions.AllInterSourceDistinctByService()) {
      	if (src.selectCommunicatesWith().equals(source.selectCommunicatesWith())) {
      		for (final ISourceInSubSecurityZone sourceSubsecurity : src.selectAccessAllowed().values()) {
      			final var functions = sourceSubsecurity
      					.extension(ISourceInSubSecurityZoneFunctions.class);
      			final var grpResults = functions.RenderDestinationGroups(src, env);
      			for (final String result : Arrays.asList(StringUtil.getNewLinePattern().split(grpResults))) {
      				if (result.length() != 0) {
      					results.add(result);
      				}
      			}
      		}
      	}
      }
      final var builder = new StringBuilder();
      for (final String result : results) {
      	builder.append(result + ",");
      }
      return builder.toString();
      /* End Protected Region   [[81c86001-0b16-11ea-b483-3fffd745ba7d]] */
    }

    @Override
    public java.lang.String RenderIntraSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[5e8db34c-0b82-11ea-ab86-a9f1f5c47ebb]] */
      final var results = new HashSet<String>();
      final var destinationfunctions = dst
      		.extension(IDestinationSubSecurityZoneFunctions.class);
      for (final ISource src : destinationfunctions.AllIntraSourceDistinctByService()) {
      	if (src.selectCommunicatesWith().equals(source.selectCommunicatesWith())) {
      		for (final ISourceInSubSecurityZone sourceSubsecurity : src.selectAccessAllowed().values()) {
      			final var functions = sourceSubsecurity
      					.extension(ISourceInSubSecurityZoneFunctions.class);
      			final var grpResults = functions.RenderSourceGroups(src, env);
      			for (final String result : Arrays.asList(StringUtil.getNewLinePattern().split(grpResults))) {
      				if (result.length() != 0) {
      					results.add(result);
      				}
      			}
      		}
      	}
      }

      final var builder = new StringBuilder();
      for (final String result : results) {
      	builder.append(result + ",");
      }
      return builder.toString();
      /* End Protected Region   [[5e8db34c-0b82-11ea-ab86-a9f1f5c47ebb]] */
    }

    @Override
    public java.lang.String RenderIntraDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[66f3d07d-0b82-11ea-ab86-a9f1f5c47ebb]] */
      final var results = new HashSet<String>();
      final var destinationfunctions = dst
      		.extension(IDestinationSubSecurityZoneFunctions.class);
      for (final ISource src : destinationfunctions.AllIntraSourceDistinctByService()) {
      	if (src.selectCommunicatesWith().equals(source.selectCommunicatesWith())) {
      		for (final ISourceInSubSecurityZone sourceSubsecurity : src.selectAccessAllowed().values()) {
      			final var functions = sourceSubsecurity
      					.extension(ISourceInSubSecurityZoneFunctions.class);
      			final var grpResults = functions.RenderDestinationGroups(src, env);
      			for (final String result : Arrays.asList(StringUtil.getNewLinePattern().split(grpResults))) {
      				if (result.length() != 0) {
      					results.add(result);
      				}
      			}
      		}
      	}
      }
      final var builder = new StringBuilder();
      for (final String result : results) {
      	builder.append(result + ",");
      }
      return builder.toString();
      /* End Protected Region   [[66f3d07d-0b82-11ea-ab86-a9f1f5c47ebb]] */
    }

    @Override
    public java.lang.Boolean CanCommunicate(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost dst, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      /* Begin Protected Region [[21fa0b77-1eb9-11eb-9eef-0dadb2b460da]] */
      final var srcSubzones = src.extension(IAbstractHostFunctions.class).Subzones();
      final var dstSubzones = dst.extension(IAbstractHostFunctions.class).Subzones();

      final var dstService = accessConfigurationService.selectService();

      return source.selectAccessAllowed().values().stream().anyMatch(x -> {
      	final var abstractServices = x.extension(ISourceInSubSecurityZoneFunctions.class)
      			.CommunicatesWithFlatten();
      	if (!abstractServices.stream().anyMatch(svc -> svc.equals(dstService))) {
      		return false;
      	}

      	final var dstSecuritySubZone = x.selectSubZoneAccessPolicy()
      			.selectPolicyForDestinationSecuritySubZone();
      	final var isInDst = dstSubzones.stream().anyMatch(y -> y.equals(dstSecuritySubZone));
      	if (isInDst) {
      		final var sourceSubSone = SourceSubZone
      				.selectToMeDestinationSubZonePolicy(x.selectSubZoneAccessPolicy());
      		return srcSubzones.stream().anyMatch(y -> y.equals(sourceSubSone.selectSourceSecuritySubZone()));
      	}
      	return false;
      });
      /* End Protected Region   [[21fa0b77-1eb9-11eb-9eef-0dadb2b460da]] */
    }

  }
  
  public static class SourceFunctions {

    private SourceFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).OnlyInter(sourceList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyIntra(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).OnlyIntra(sourceList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy> GetIntraConnection(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).GetIntraConnection(source);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctBySourceAndService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).distinctBySourceAndService(sourceList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByDestinationAndService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).distinctByDestinationAndService(sourceList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByDestination(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).distinctByDestination(sourceList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> OnlyMgmt(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.ISystemConfigurationAccessFrom src, final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).OnlyMgmt(src, sourceList);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> distinctByService(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> sourceList) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, sourceList).distinctByService(sourceList);
    }

    public static java.lang.String RenderInterSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).RenderInterSourceHostGroups(env, dst, source);
    }

    public static java.lang.String RenderInterDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).RenderInterDestinationHostGroups(env, dst, source);
    }

    public static java.lang.String RenderIntraSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).RenderIntraSourceHostGroups(env, dst, source);
    }

    public static java.lang.String RenderIntraDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone dst, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).RenderIntraDestinationHostGroups(env, dst, source);
    }

    public static java.lang.Boolean CanCommunicate(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost src, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost dst, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access.javamodel.IAccessConfigurationService accessConfigurationService, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source) {
      return DynamicResourceUtil.invoke(ISourceFunctionsImpl.class, SourceFunctionsImpl.INSTANCE, source).CanCommunicate(src, dst, accessConfigurationService, source);
    }

  }

  public static interface IDestinationSubSecurityZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3e382b18-c862-11ea-b1f9-8da009c98a7a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> SelectAllowedSystemConfigurationsOnlyConcrete();

    @IDynamicResourceExtension.MethodId("46eb2383-9f4b-11ea-bb18-b13480f8c543")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> SelectAllowedSystemConfigurations();

    @IDynamicResourceExtension.MethodId("36af6bc0-dfa3-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllServices();

    @IDynamicResourceExtension.MethodId("41d7b661-dfa3-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> AllServicesDistinct();

    @IDynamicResourceExtension.MethodId("10be3e5b-e041-11e9-aa67-4505845acdbd")
    public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestination Destination();

    @IDynamicResourceExtension.MethodId("7af335a7-e077-11e9-aa67-4505845acdbd")
    public java.lang.String SubLayerName(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunicationSystem communication);

    @IDynamicResourceExtension.MethodId("fb35f7dd-0b62-11ea-bef6-75a700135135")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> AllInterSourceDistinctByService();

    @IDynamicResourceExtension.MethodId("03f7288e-0b75-11ea-afff-b52fab62d0fd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> AllIntraSourceDistinctByService();

    @IDynamicResourceExtension.MethodId("155945af-552b-11ed-a5a9-572b13f613fe")
    public java.lang.String RenderDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

  }
  
  public static interface IDestinationSubSecurityZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DestinationSubSecurityZoneFunctionsImpl implements IDestinationSubSecurityZoneFunctionsImpl {

    public static final IDestinationSubSecurityZoneFunctionsImpl INSTANCE = new DestinationSubSecurityZoneFunctionsImpl();

    private DestinationSubSecurityZoneFunctionsImpl() {}

  }
  
  public static class DestinationSubSecurityZoneFunctions {

    private DestinationSubSecurityZoneFunctions() {}

  }

  public static interface IDestinationSubSecurityZoneByHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1d37e39a-552b-11ed-a5a9-572b13f613fe")
    public java.lang.String RenderDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

  }
  
  public static interface IDestinationSubSecurityZoneByHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1d37e39a-552b-11ed-a5a9-572b13f613fe")
    public java.lang.String RenderDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZoneByHost destinationSubSecurityZoneByHost);

  }
  
  public static class DestinationSubSecurityZoneByHostFunctionsImpl implements IDestinationSubSecurityZoneByHostFunctionsImpl {

    public static final IDestinationSubSecurityZoneByHostFunctionsImpl INSTANCE = new DestinationSubSecurityZoneByHostFunctionsImpl();

    private DestinationSubSecurityZoneByHostFunctionsImpl() {}

    @Override
    public java.lang.String RenderDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZoneByHost destinationSubSecurityZoneByHost) {
      /* Begin Protected Region [[1d37e39a-552b-11ed-a5a9-572b13f613fe]] */
      if( destinationSubSecurityZoneByHost != null && destinationSubSecurityZoneByHost.selectOverrideDestinationGroupName() != null) {
      	return destinationSubSecurityZoneByHost.selectOverrideDestinationGroupName();
      }

      final var result = new StringBuilder();

      final var sourceInSubSecurityZoneFunctions = sourceInSubSecurityZone.extension(ISourceInSubSecurityZoneFunctions.class);
      final var destinationSubZone = subZoneAccessPolicy.selectPolicyForDestinationSecuritySubZone();
      final var destinationSubZoneFunctions = destinationSubZone.extension(ISecuritySubZoneFunctions.class);
      final var zoneFunctions = destinationSubZone.extension(IZoneFunctions.class);
      final var sourceFunctions = src.extension(ISourceFunctions.class);
      final var destination = sourceFunctions.Destination();

      final var sysCfgFunction = destination.selectDestinationSystemConfiguration()
      		.extension(ISystemConfigurationFunctions.class);

      final List<ISystemConfiguration> sysCfgs = sysCfgFunction.GetAllDependsFromWithSelf().stream().filter(x -> SystemConfiguration.selectToMeInheritServices(x).isEmpty()).collect(Collectors.toList());

      for (final ISystemConfiguration sysCfg : sysCfgs) {
      	final var configurationFunctions = sysCfg.extension(ISystemConfigurationFunctions.class);

      	if( sourceInSubSecurityZoneFunctions.RestricteHostGroupForSiteToDestination() != null ) {
      		result.append(configurationFunctions.HostGroupName(sourceInSubSecurityZoneFunctions.RestricteHostGroupForSiteToDestination(), destinationSubZone));
      		result.append(System.lineSeparator());
      	} else if (zoneFunctions.IsSingleUsed()) {
      		for (final var hosts : destinationSubZoneFunctions
      				.AllSiteWhereSystemConfigurationAndEnvironmentDistinct(TopologyEnvironment.selectToMeEnvironmentForTopology(env), sysCfg)) {
      			result.append("GRP-HOS-" + configurationFunctions.TypeName() + "-" + hosts.selectName() + "-" +
      					destinationSubZone.selectVLAN_No());
      			result.append(System.lineSeparator());
      		}
      	} else {
      		final var hosts = destinationSubZoneFunctions.AllSystemConfigurationWhereSystemConfigurationAndEnvironmentDistinct(sysCfg, TopologyEnvironment.selectToMeEnvironmentForTopology(env));
      		for( final var concreteSysCfg : hosts ) {
      			final var concreteSysCfgFunctions = concreteSysCfg.extension(ISystemConfigurationFunctions.class);
      			result.append(concreteSysCfgFunctions.AllHostGroupName(env, destinationSubZone));
      			result.append(System.lineSeparator());
      		}
      	}
      }

      return result.toString();
      /* End Protected Region   [[1d37e39a-552b-11ed-a5a9-572b13f613fe]] */
    }

  }
  
  public static class DestinationSubSecurityZoneByHostFunctions {

    private DestinationSubSecurityZoneByHostFunctions() {}

    public static java.lang.String RenderDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZoneByHost destinationSubSecurityZoneByHost) {
      return DynamicResourceUtil.invoke(IDestinationSubSecurityZoneByHostFunctionsImpl.class, DestinationSubSecurityZoneByHostFunctionsImpl.INSTANCE, destinationSubSecurityZoneByHost).RenderDestinationGroups(sourceInSubSecurityZone, subZoneAccessPolicy, src, env, destinationSubSecurityZoneByHost);
    }

  }

  public static interface IDestinationSubSecurityZoneByNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c0881815-5537-11ed-a5a9-572b13f613fe")
    public java.lang.String RenderDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

  }
  
  public static interface IDestinationSubSecurityZoneByNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DestinationSubSecurityZoneByNetworkFunctionsImpl implements IDestinationSubSecurityZoneByNetworkFunctionsImpl {

    public static final IDestinationSubSecurityZoneByNetworkFunctionsImpl INSTANCE = new DestinationSubSecurityZoneByNetworkFunctionsImpl();

    private DestinationSubSecurityZoneByNetworkFunctionsImpl() {}

  }
  
  public static class DestinationSubSecurityZoneByNetworkFunctions {

    private DestinationSubSecurityZoneByNetworkFunctions() {}

  }

  public static interface ITextLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("885686bf-0ae2-11ea-bf24-ff0f7ff0bb53")
    public java.lang.String includeMissingCommas();

  }
  
  public static interface ITextLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("885686bf-0ae2-11ea-bf24-ff0f7ff0bb53")
    public java.lang.String includeMissingCommas(final java.lang.String textLiteral);

  }
  
  public static class TextLiteralFunctionsImpl implements ITextLiteralFunctionsImpl {

    public static final ITextLiteralFunctionsImpl INSTANCE = new TextLiteralFunctionsImpl();

    private TextLiteralFunctionsImpl() {}

    @Override
    public java.lang.String includeMissingCommas(final java.lang.String textLiteral) {
      /* Begin Protected Region [[885686bf-0ae2-11ea-bf24-ff0f7ff0bb53]] */
      final var maxSize = MAX_COLUMNS - 2;
      if (textLiteral.length() == 0) {
      	return StringUtil.repeat(",", maxSize);
      }

      final var size = textLiteral.split(",").length;
      if (maxSize - size < 0) {
      	throw new RuntimeException(String.format("Size %d for missingCommas to high", size));
      }
      return textLiteral + StringUtil.repeat(",", maxSize - size);
      /* End Protected Region   [[885686bf-0ae2-11ea-bf24-ff0f7ff0bb53]] */
    }

  }
  
  public static class TextLiteralFunctions {

    private TextLiteralFunctions() {}

    public static java.lang.String includeMissingCommas(final java.lang.String textLiteral) {
      return DynamicResourceUtil.invoke(ITextLiteralFunctionsImpl.class, TextLiteralFunctionsImpl.INSTANCE, textLiteral).includeMissingCommas(textLiteral);
    }

  }

  public static interface ISourceInSubSecurityZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("73e2a655-e05b-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone> OnlyInter();

    @IDynamicResourceExtension.MethodId("3b514034-e065-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> UsedSystemConfigurationDistinct(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("2ed88ad2-e066-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> UsedSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("16752bad-09f0-11ea-baed-218c3e076b56")
    public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone SourceSubZone();

    @IDynamicResourceExtension.MethodId("f69afda7-ff49-11eb-982b-5da7cd501019")
    public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone DestinationSubZone();

    @IDynamicResourceExtension.MethodId("b3fe9d43-0a0a-11ea-baed-218c3e076b56")
    public java.lang.String RenderSourceGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

    @IDynamicResourceExtension.MethodId("e3ffdf58-0a36-11ea-baed-218c3e076b56")
    public java.lang.String RenderDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

    @IDynamicResourceExtension.MethodId("b1f1ebfa-69cf-11ea-a748-452677f0eb7c")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> CommunicatesWith();

    @IDynamicResourceExtension.MethodId("2ce0f2c5-242d-11eb-83b1-3d2a97975978")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> CommunicatesWithFlatten();

    @IDynamicResourceExtension.MethodId("29249a94-b9e7-11ea-b29c-1fc1209c2c7a")
    public java.lang.Boolean IsAny();

    @IDynamicResourceExtension.MethodId("e2b85ad2-a5e1-11ec-9968-b970a72504b8")
    public java.lang.Boolean HasDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

    @IDynamicResourceExtension.MethodId("b6e3ddf4-f1ee-11ec-9189-dd1b3a325f2e")
    public java.lang.String RestricteHostGroupForSiteToDestination();

  }
  
  public static interface ISourceInSubSecurityZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("73e2a655-e05b-11e9-aa67-4505845acdbd")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone> sourceInSubSecurityZoneList);

    @IDynamicResourceExtension.MethodId("e3ffdf58-0a36-11ea-baed-218c3e076b56")
    public java.lang.String RenderDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone);

    @IDynamicResourceExtension.MethodId("e2b85ad2-a5e1-11ec-9968-b970a72504b8")
    public java.lang.Boolean HasDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone);

    @IDynamicResourceExtension.MethodId("b6e3ddf4-f1ee-11ec-9189-dd1b3a325f2e")
    public java.lang.String RestricteHostGroupForSiteToDestination(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone);

  }
  
  public static class SourceInSubSecurityZoneFunctionsImpl implements ISourceInSubSecurityZoneFunctionsImpl {

    public static final ISourceInSubSecurityZoneFunctionsImpl INSTANCE = new SourceInSubSecurityZoneFunctionsImpl();

    private SourceInSubSecurityZoneFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone> sourceInSubSecurityZoneList) {
      /* Begin Protected Region [[73e2a655-e05b-11e9-aa67-4505845acdbd]] */
      return sourceInSubSecurityZoneList.stream()
      		.filter(x -> x.selectSubZoneAccessPolicy() instanceof IInterSubZoneAccessPolicy)
      		.collect(Collectors.toList());
      /* End Protected Region   [[73e2a655-e05b-11e9-aa67-4505845acdbd]] */
    }

    @Override
    public java.lang.String RenderDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone) {
      /* Begin Protected Region [[e3ffdf58-0a36-11ea-baed-218c3e076b56]] */
      final var subZoneAccessPolicy = sourceInSubSecurityZone.selectSubZoneAccessPolicy();
      final var accessPolicyFunctions = subZoneAccessPolicy.extension(ISubZoneAccessPolicyFunctions.class);
      if( accessPolicyFunctions != null && accessPolicyFunctions.AllowRestrictedAccess() ) {
      	return "Restricted";
      }

      final var destinationSubZone = subZoneAccessPolicy.selectPolicyForDestinationSecuritySubZone();
      final var sourceFunctions = src.extension(ISourceFunctions.class);
      final var destination = sourceFunctions.Destination();
      final var destinationFunction = destination.extension(IDestinationFunctions.class);
      final var destinationSubSecurityZone = destinationFunction.GetDestinationPolicy(destinationSubZone);

      final var destinationSubSecurityZoneFunctions = destinationSubSecurityZone.extension(IDestinationSubSecurityZoneFunctions.class);
      return destinationSubSecurityZoneFunctions.RenderDestinationGroups(sourceInSubSecurityZone, subZoneAccessPolicy, src, env);
      /* End Protected Region   [[e3ffdf58-0a36-11ea-baed-218c3e076b56]] */
    }

    @Override
    public java.lang.Boolean HasDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone) {
      /* Begin Protected Region [[e2b85ad2-a5e1-11ec-9968-b970a72504b8]] */
      return !sourceInSubSecurityZone.extension(ISourceInSubSecurityZoneFunctions.class).RenderDestinationGroups(src, env).isEmpty() && !sourceInSubSecurityZone.extension(ISourceInSubSecurityZoneFunctions.class).RenderSourceGroups(src, env).isEmpty();
      /* End Protected Region   [[e2b85ad2-a5e1-11ec-9968-b970a72504b8]] */
    }

    @Override
    public java.lang.String RestricteHostGroupForSiteToDestination(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone) {
      return null;
    }

  }
  
  public static class SourceInSubSecurityZoneFunctions {

    private SourceInSubSecurityZoneFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone> OnlyInter(final List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone> sourceInSubSecurityZoneList) {
      return DynamicResourceUtil.invoke(ISourceInSubSecurityZoneFunctionsImpl.class, SourceInSubSecurityZoneFunctionsImpl.INSTANCE, sourceInSubSecurityZoneList).OnlyInter(sourceInSubSecurityZoneList);
    }

    public static java.lang.String RenderDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone) {
      return DynamicResourceUtil.invoke(ISourceInSubSecurityZoneFunctionsImpl.class, SourceInSubSecurityZoneFunctionsImpl.INSTANCE, sourceInSubSecurityZone).RenderDestinationGroups(src, env, sourceInSubSecurityZone);
    }

    public static java.lang.Boolean HasDestinationGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone) {
      return DynamicResourceUtil.invoke(ISourceInSubSecurityZoneFunctionsImpl.class, SourceInSubSecurityZoneFunctionsImpl.INSTANCE, sourceInSubSecurityZone).HasDestinationGroups(src, env, sourceInSubSecurityZone);
    }

    public static java.lang.String RestricteHostGroupForSiteToDestination(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone) {
      return DynamicResourceUtil.invoke(ISourceInSubSecurityZoneFunctionsImpl.class, SourceInSubSecurityZoneFunctionsImpl.INSTANCE, sourceInSubSecurityZone).RestricteHostGroupForSiteToDestination(sourceInSubSecurityZone);
    }

  }

  public static interface ISourceInSubSecurityZoneByHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e0f3afa5-c77c-11ea-b0b6-e5df79e86bc2")
    public java.lang.String RenderSourceGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

    @IDynamicResourceExtension.MethodId("cba23bb6-f1ee-11ec-9189-dd1b3a325f2e")
    public java.lang.String RestricteHostGroupForSiteToDestination();

  }
  
  public static interface ISourceInSubSecurityZoneByHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e0f3afa5-c77c-11ea-b0b6-e5df79e86bc2")
    public java.lang.String RenderSourceGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZoneByHost sourceInSubSecurityZoneByHost);

  }
  
  public static class SourceInSubSecurityZoneByHostFunctionsImpl implements ISourceInSubSecurityZoneByHostFunctionsImpl {

    public static final ISourceInSubSecurityZoneByHostFunctionsImpl INSTANCE = new SourceInSubSecurityZoneByHostFunctionsImpl();

    private SourceInSubSecurityZoneByHostFunctionsImpl() {}

    @Override
    public java.lang.String RenderSourceGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZoneByHost sourceInSubSecurityZoneByHost) {
      /* Begin Protected Region [[e0f3afa5-c77c-11ea-b0b6-e5df79e86bc2]] */
      final var sysCfgFunction = src
      		.selectSourceSystemConfiguration().extension(
      				cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions.class);
      final var sysCfgs = sysCfgFunction.GetAllDependsFromWithSelfOnlyConcrete();

      final var functions = sourceInSubSecurityZoneByHost
      		.extension(ISourceInSubSecurityZoneFunctions.class);

      final var sourceSubZone = functions.SourceSubZone();
      final var sourceSubZoneFunctions = sourceSubZone
      		.extension(ISecuritySubZoneFunctions.class);

      final var result = new StringBuilder();
      for (final var sysCfg : sysCfgs) {
      	final var configurationFunctions = sysCfg
      			.extension(
      					cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions.class);

      	final var zoneFunctions = sourceSubZone.extension(IZoneFunctions.class);
      	if (zoneFunctions.IsSingleUsed()) {
      		for (final var hosts : sourceSubZoneFunctions
      				.AllSiteWhereSystemConfigurationAndEnvironmentDistinct(
      						TopologyEnvironment.selectToMeEnvironmentForTopology(env), sysCfg)) {
      			result.append(configurationFunctions.HostGroupName(hosts, sourceSubZone));
      			result.append("\n");
      		}
      	} else {
      		final var hosts = sourceSubZoneFunctions
      				.AllSystemConfigurationWhereSystemConfigurationAndEnvironmentDistinct(sysCfg,
      						TopologyEnvironment.selectToMeEnvironmentForTopology(env));

      		for (final var concreteSysCfg : hosts) {
      			final var concreteSysCfgFunctions = concreteSysCfg
      					.extension(
      							cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions.class);
      			result.append(concreteSysCfgFunctions.AllHostGroupName(env, sourceSubZone));
      			result.append("\n");
      		}
      	}
      }

      return result.toString();
      /* End Protected Region   [[e0f3afa5-c77c-11ea-b0b6-e5df79e86bc2]] */
    }

  }
  
  public static class SourceInSubSecurityZoneByHostFunctions {

    private SourceInSubSecurityZoneByHostFunctions() {}

    public static java.lang.String RenderSourceGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZoneByHost sourceInSubSecurityZoneByHost) {
      return DynamicResourceUtil.invoke(ISourceInSubSecurityZoneByHostFunctionsImpl.class, SourceInSubSecurityZoneByHostFunctionsImpl.INSTANCE, sourceInSubSecurityZoneByHost).RenderSourceGroups(src, env, sourceInSubSecurityZoneByHost);
    }

  }

  public static interface ISourceInSubSecurityZoneByNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("166205cf-c782-11ea-b0b6-e5df79e86bc2")
    public java.lang.String RenderSourceGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

  }
  
  public static interface ISourceInSubSecurityZoneByNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceInSubSecurityZoneByNetworkFunctionsImpl implements ISourceInSubSecurityZoneByNetworkFunctionsImpl {

    public static final ISourceInSubSecurityZoneByNetworkFunctionsImpl INSTANCE = new SourceInSubSecurityZoneByNetworkFunctionsImpl();

    private SourceInSubSecurityZoneByNetworkFunctionsImpl() {}

  }
  
  public static class SourceInSubSecurityZoneByNetworkFunctions {

    private SourceInSubSecurityZoneByNetworkFunctions() {}

  }

  public static interface ISourceInSubSecurityZoneCustomFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("245514fa-ad95-11eb-a3eb-5dbdee6f3a54")
    public java.lang.String RenderSourceGroups(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

  }
  
  public static interface ISourceInSubSecurityZoneCustomFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceInSubSecurityZoneCustomFunctionsImpl implements ISourceInSubSecurityZoneCustomFunctionsImpl {

    public static final ISourceInSubSecurityZoneCustomFunctionsImpl INSTANCE = new SourceInSubSecurityZoneCustomFunctionsImpl();

    private SourceInSubSecurityZoneCustomFunctionsImpl() {}

  }
  
  public static class SourceInSubSecurityZoneCustomFunctions {

    private SourceInSubSecurityZoneCustomFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,536f3fea-8833-11e9-80ce-fbaba21c141b,AcTKgj3mChJzwFMmSDI4EPe7+SI=] */
