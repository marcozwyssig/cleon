package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d422151a-4607-11ea-857e-99d5aa1ed1cd,imports]] */
import java.util.ArrayList;

import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.FunctionSpace_SubzonePolicy.ISubZoneAccessPolicyFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.FunctionSpace_SystemConfiguration.ISystemConfigurationFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration;;
/* End Protected Region   [[d422151a-4607-11ea-857e-99d5aa1ed1cd,imports]] */

public class FunctionSpace_Segmentation {

  /* Begin Protected Region [[d422151a-4607-11ea-857e-99d5aa1ed1cd]] */

  /* End Protected Region   [[d422151a-4607-11ea-857e-99d5aa1ed1cd]] */


  public static interface ISegmentationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dac350e2-4607-11ea-857e-99d5aa1ed1cd")
    public List<ch.actifsource.core.javamodel.IResource> GetAllZones();

  }
  
  public static interface ISegmentationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SegmentationConceptFunctionsImpl implements ISegmentationConceptFunctionsImpl {

    public static final ISegmentationConceptFunctionsImpl INSTANCE = new SegmentationConceptFunctionsImpl();

    private SegmentationConceptFunctionsImpl() {}

  }
  
  public static class SegmentationConceptFunctions {

    private SegmentationConceptFunctions() {}

  }

  public static interface ISecuritySubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c56d1562-b20d-11e9-b89e-1728aee30149")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware> AllSystemConfigurationsWithDepedendsOnWith();

    @IDynamicResourceExtension.MethodId("a1e84ca9-0ab8-11ee-a86d-478d6a2bb65d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware> AllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("df2d7303-b9ce-11e9-828c-091526d036b6")
    public ch.actifsource.core.javamodel.IDecorator SourcePolicy();

    @IDynamicResourceExtension.MethodId("c0a412fe-deac-11e9-b714-478bec98e62d")
    public List<ch.actifsource.core.javamodel.IDecorator> AllHostNodesWhereSystemConfigurationAndSite(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site);

    @IDynamicResourceExtension.MethodId("a15384f4-151f-11f0-8fa5-ad696b254e17")
    public List<ch.actifsource.core.javamodel.IDecorator> AllHostNodesWhereSystemConfigurationAndSiteAndExclude(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site);

    @IDynamicResourceExtension.MethodId("08dbad82-df9b-11e9-9827-a1514ee8d06a")
    public List<ch.actifsource.core.javamodel.IDecorator> AllHostNodesWhereSystemConfiguration(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg);

    @IDynamicResourceExtension.MethodId("77400f34-0ab0-11ea-b1a6-0524b035bd98")
    public List<ch.actifsource.core.javamodel.IDecorator> AllHostNodesWhereSystemConfigurationAndEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final ch.actifsource.core.javamodel.INamedResource env);

    @IDynamicResourceExtension.MethodId("a449369e-517b-11ea-b9cb-85bbdfd861be")
    public List<ch.actifsource.core.javamodel.IDecorator> AllHostNodesWhereSystemConfigurationAndEnvironmentAndSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg);

    @IDynamicResourceExtension.MethodId("9bf9949c-09ef-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipBookmarkAware> AllHostsWhereSystemConfiguration(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg);

    @IDynamicResourceExtension.MethodId("99990cc8-0a05-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipBookmarkAware> AllHostsWhereSystemConfigurationAndEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env);

    @IDynamicResourceExtension.MethodId("a3a7f3f8-09f2-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware> AllSystemConfigurationWhereSystemConfiguration(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg);

    @IDynamicResourceExtension.MethodId("ba947b1f-09f2-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware> AllSystemConfigurationWhereSystemConfigurationDistinct(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg);

    @IDynamicResourceExtension.MethodId("24927129-0aa5-11ea-97f4-9d91b2097bad")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware> AllSystemConfigurationWhereSystemConfigurationAndEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env);

    @IDynamicResourceExtension.MethodId("39e2d53a-0aa5-11ea-97f4-9d91b2097bad")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware> AllSystemConfigurationWhereSystemConfigurationAndEnvironmentDistinct(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env);

    @IDynamicResourceExtension.MethodId("e02913cf-09f4-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware> AllSitesWhereSystemConfiguration(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware sysCfg);

    @IDynamicResourceExtension.MethodId("4f4ff93a-09f5-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware> AllSitesWhereSystemConfigurationDistinct(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware sysCfg);

    @IDynamicResourceExtension.MethodId("7be9152a-09fd-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware> AllSitesWhereSystemConfigurationEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware sysCfg);

    @IDynamicResourceExtension.MethodId("7bad0d79-517a-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware> AllSitesWhereSystemConfigurationAndEnvironmentAndSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware sysCfg);

    @IDynamicResourceExtension.MethodId("5cb568b4-09fd-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware> AllSiteWhereSystemConfigurationAndEnvironmentDistinct(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware sysCfg);

    @IDynamicResourceExtension.MethodId("4cd3f372-517a-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware> AllSiteWhereSystemConfigurationAndEnvironmentAndSiteDistinct(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware sysCfg);

    @IDynamicResourceExtension.MethodId("ce929a6f-51a1-11ea-a946-13c393300b57")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware> AllSiteWhereSystemConfigurationAndAbstractHostWithSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware sysCfg);

    @IDynamicResourceExtension.MethodId("5db9e341-df72-11e9-9827-a1514ee8d06a")
    public java.lang.String Guid(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware sysCfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware nd);

    @IDynamicResourceExtension.MethodId("f4d72be1-e9e7-11e9-92e5-e15beb25e0f4")
    public List<ch.actifsource.core.javamodel.INamedResource> OnlyWithHosts(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware nd);

    @IDynamicResourceExtension.MethodId("348a6c2d-094d-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IIsTemporaryAware> AllSources();

    @IDynamicResourceExtension.MethodId("cd1b6dc4-094d-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IIsTemporaryAware> AllSourcesDistinct();

    @IDynamicResourceExtension.MethodId("e99aad2f-a965-11e9-bf83-7bacdb6991f7")
    public java.lang.String EvaluatePolicy(final ch.actifsource.core.javamodel.INamedResource source);

    @IDynamicResourceExtension.MethodId("88247d98-e2d8-11ee-bcaf-bf4e173adc8d")
    public java.lang.String TypeName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware systemConfiguration);

    @IDynamicResourceExtension.MethodId("2d13fa53-75bc-11ef-9e73-d7a16eeaf5fd")
    public java.lang.String ContextualGroupName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware systemConfiguration);

    @IDynamicResourceExtension.MethodId("c151fcde-f5eb-11ef-8efc-fdd1fc6fef2d")
    public java.lang.String HostGroupPrefix();

    @IDynamicResourceExtension.MethodId("341599eb-0b2d-11f0-95b9-95d0cc9a328a")
    public List<ch.actifsource.core.javamodel.IResource> UsedVlan(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site);

  }
  
  public static interface ISecuritySubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f4d72be1-e9e7-11e9-92e5-e15beb25e0f4")
    public List<ch.actifsource.core.javamodel.INamedResource> OnlyWithHosts(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware nd, final List<ch.actifsource.core.javamodel.INamedResource> securitySubZoneList);

    @IDynamicResourceExtension.MethodId("e99aad2f-a965-11e9-bf83-7bacdb6991f7")
    public java.lang.String EvaluatePolicy(final ch.actifsource.core.javamodel.INamedResource source, final ch.actifsource.core.javamodel.INamedResource securitySubZone);

    @IDynamicResourceExtension.MethodId("88247d98-e2d8-11ee-bcaf-bf4e173adc8d")
    public java.lang.String TypeName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware systemConfiguration, final ch.actifsource.core.javamodel.INamedResource securitySubZone);

    @IDynamicResourceExtension.MethodId("2d13fa53-75bc-11ef-9e73-d7a16eeaf5fd")
    public java.lang.String ContextualGroupName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware systemConfiguration, final ch.actifsource.core.javamodel.INamedResource securitySubZone);

    @IDynamicResourceExtension.MethodId("341599eb-0b2d-11f0-95b9-95d0cc9a328a")
    public List<ch.actifsource.core.javamodel.IResource> UsedVlan(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site, final ch.actifsource.core.javamodel.INamedResource securitySubZone);

  }
  
  public static class SecuritySubZoneFunctionsImpl implements ISecuritySubZoneFunctionsImpl {

    public static final ISecuritySubZoneFunctionsImpl INSTANCE = new SecuritySubZoneFunctionsImpl();

    private SecuritySubZoneFunctionsImpl() {}

    @Override
    public List<ch.actifsource.core.javamodel.INamedResource> OnlyWithHosts(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware nd, final List<ch.actifsource.core.javamodel.INamedResource> securitySubZoneList) {
      /* Begin Protected Region [[f4d72be1-e9e7-11e9-92e5-e15beb25e0f4]] */
      final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> lists = new java.util.ArrayList<>();
      for( final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone : securitySubZoneList )
      {
      	final var functions = securitySubZone.extension(ISecuritySubZoneFunctions.class);
      	if( !functions.AllHostNodesWhereSystemConfigurationAndSite(syscfg, nd).isEmpty())
      	{
      		lists.add(securitySubZone);
      	}
      }
      return lists;
      /* End Protected Region   [[f4d72be1-e9e7-11e9-92e5-e15beb25e0f4]] */
    }

    @Override
    public java.lang.String EvaluatePolicy(final ch.actifsource.core.javamodel.INamedResource source, final ch.actifsource.core.javamodel.INamedResource securitySubZone) {
      /* Begin Protected Region [[e99aad2f-a965-11e9-bf83-7bacdb6991f7]] */
      final var sourceFunctions = source.extension(ISecuritySubZoneFunctions.class);
      final var sourceSubZone = sourceFunctions.SourcePolicy();
      if( sourceSubZone == null ) {
      	return "R";
      }

      final var accesspolicyKey = sourceSubZone.selectDestinationSubZonePolicy().get(securitySubZone.getResource());
      if( accesspolicyKey.isEmpty()) {
      	return "R";
      }

      final var result = new StringBuilder();
      for( final var accesspolicy : accesspolicyKey) {
      	final var accessPolicy = accesspolicy.extension(ISubZoneAccessPolicyFunctions.class);
      	result.append(accessPolicy.EvaluatePolicy(source));
      }
      return result.toString();

      /* End Protected Region   [[e99aad2f-a965-11e9-bf83-7bacdb6991f7]] */
    }

    @Override
    public java.lang.String TypeName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware systemConfiguration, final ch.actifsource.core.javamodel.INamedResource securitySubZone) {
      /* Begin Protected Region [[88247d98-e2d8-11ee-bcaf-bf4e173adc8d]] */
      final var sysCfgFunction = systemConfiguration.extension(ISystemConfigurationFunctions.class);
      return sysCfgFunction.TypeName(securitySubZone);
      /* End Protected Region   [[88247d98-e2d8-11ee-bcaf-bf4e173adc8d]] */
    }

    @Override
    public java.lang.String ContextualGroupName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware systemConfiguration, final ch.actifsource.core.javamodel.INamedResource securitySubZone) {
      /* Begin Protected Region [[2d13fa53-75bc-11ef-9e73-d7a16eeaf5fd]] */
    	final var sysCfgFunctions = systemConfiguration.extension(ISystemConfigurationFunctions.class);
    	final var ifc = sysCfgFunctions.GetSystemConfigurationInterface(securitySubZone);
    	if( ifc == null) {
    		return null;
    	}
		return ifc.selectContextualGroupName();
      /* End Protected Region   [[2d13fa53-75bc-11ef-9e73-d7a16eeaf5fd]] */
    }

    @Override
    public List<ch.actifsource.core.javamodel.IResource> UsedVlan(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site, final ch.actifsource.core.javamodel.INamedResource securitySubZone) {
      /* Begin Protected Region [[341599eb-0b2d-11f0-95b9-95d0cc9a328a]] */
    	final var networkZones = site.selectNetworkSite().selectNetworkSubZone().get(securitySubZone.getResource());
    	final var results = new ArrayList<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan>();
    	for (final var networkZone : networkZones) {
    		results.add(networkZone.selectVlan());
    	}
    	return results;
      /* End Protected Region   [[341599eb-0b2d-11f0-95b9-95d0cc9a328a]] */
    }

  }
  
  public static class SecuritySubZoneFunctions {

    private SecuritySubZoneFunctions() {}

    public static List<ch.actifsource.core.javamodel.INamedResource> OnlyWithHosts(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware nd, final List<ch.actifsource.core.javamodel.INamedResource> securitySubZoneList) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZoneList).OnlyWithHosts(syscfg, nd, securitySubZoneList);
    }

    public static java.lang.String EvaluatePolicy(final ch.actifsource.core.javamodel.INamedResource source, final ch.actifsource.core.javamodel.INamedResource securitySubZone) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZone).EvaluatePolicy(source, securitySubZone);
    }

    public static java.lang.String TypeName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware systemConfiguration, final ch.actifsource.core.javamodel.INamedResource securitySubZone) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZone).TypeName(systemConfiguration, securitySubZone);
    }

    public static java.lang.String ContextualGroupName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware systemConfiguration, final ch.actifsource.core.javamodel.INamedResource securitySubZone) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZone).ContextualGroupName(systemConfiguration, securitySubZone);
    }

    public static List<ch.actifsource.core.javamodel.IResource> UsedVlan(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site, final ch.actifsource.core.javamodel.INamedResource securitySubZone) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZone).UsedVlan(site, securitySubZone);
    }

  }

  public static interface IVlanFunctions extends IDynamicResourceExtension {

    /**
     * 
     */
    @IDynamicResourceExtension.MethodId("e641276b-51a3-11ea-a946-13c393300b57")
    public java.lang.String GroupName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware systemConfiguration, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware abstractSiteWithHosts, final ch.actifsource.core.javamodel.INamedResource securitySubzone);

    @IDynamicResourceExtension.MethodId("f44b9356-0aa0-11ea-97f4-9d91b2097bad")
    public java.lang.String GroupNameAll(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware sysCfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final ch.actifsource.core.javamodel.INamedResource securitySubzone);

    @IDynamicResourceExtension.MethodId("c4c3ae13-f774-11ef-9619-857aad3ec118")
    public List<ch.actifsource.core.javamodel.IDecorator> AllHostNodesWhereSystemConfigurationAndSite(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware site, final ch.actifsource.core.javamodel.INamedResource securitySubzone);

  }
  
  public static interface IVlanFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VlanFunctionsImpl implements IVlanFunctionsImpl {

    public static final IVlanFunctionsImpl INSTANCE = new VlanFunctionsImpl();

    private VlanFunctionsImpl() {}

  }
  
  public static class VlanFunctions {

    private VlanFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d422151a-4607-11ea-857e-99d5aa1ed1cd,ESTSjS4j3+/CqgHWGoLHVzNbzCo=] */
