package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d422151a-4607-11ea-857e-99d5aa1ed1cd,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.FunctionSpace_SubzonePolicy.ISubZoneAccessPolicyFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISourceSubZone;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.FunctionSpace_SystemConfiguration.ISystemConfigurationFunctions;;
/* End Protected Region   [[d422151a-4607-11ea-857e-99d5aa1ed1cd,imports]] */

public class FunctionSpace_Segmentation {

  /* Begin Protected Region [[d422151a-4607-11ea-857e-99d5aa1ed1cd]] */

  /* End Protected Region   [[d422151a-4607-11ea-857e-99d5aa1ed1cd]] */


  public static interface ISegmentationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dac350e2-4607-11ea-857e-99d5aa1ed1cd")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone> GetAllZones();

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
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> AllSystemConfigurationsWithDepedendsOnWith();

    @IDynamicResourceExtension.MethodId("a1e84ca9-0ab8-11ee-a86d-478d6a2bb65d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> AllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("df2d7303-b9ce-11e9-828c-091526d036b6")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.network_segmentation.subzonepolicy.javamodel.ISourceSubZone SourcePolicy();

    @IDynamicResourceExtension.MethodId("c0a412fe-deac-11e9-b714-478bec98e62d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> AllHostNodesWhereSystemConfigurationAndSite(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts site);

    @IDynamicResourceExtension.MethodId("08dbad82-df9b-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> AllHostNodesWhereSystemConfiguration(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg);

    @IDynamicResourceExtension.MethodId("77400f34-0ab0-11ea-b1a6-0524b035bd98")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> AllHostNodesWhereSystemConfigurationAndEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode env);

    @IDynamicResourceExtension.MethodId("a449369e-517b-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> AllHostNodesWhereSystemConfigurationAndEnvironmentAndSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg);

    @IDynamicResourceExtension.MethodId("9bf9949c-09ef-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> AllHostsWhereSystemConfiguration(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg);

    @IDynamicResourceExtension.MethodId("99990cc8-0a05-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> AllHostsWhereSystemConfigurationAndEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env);

    @IDynamicResourceExtension.MethodId("a3a7f3f8-09f2-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> AllSystemConfigurationWhereSystemConfiguration(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg);

    @IDynamicResourceExtension.MethodId("ba947b1f-09f2-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> AllSystemConfigurationWhereSystemConfigurationDistinct(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg);

    @IDynamicResourceExtension.MethodId("24927129-0aa5-11ea-97f4-9d91b2097bad")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> AllSystemConfigurationWhereSystemConfigurationAndEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env);

    @IDynamicResourceExtension.MethodId("39e2d53a-0aa5-11ea-97f4-9d91b2097bad")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> AllSystemConfigurationWhereSystemConfigurationAndEnvironmentDistinct(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env);

    @IDynamicResourceExtension.MethodId("e02913cf-09f4-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllSitesWhereSystemConfiguration(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("4f4ff93a-09f5-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllSitesWhereSystemConfigurationDistinct(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("7be9152a-09fd-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllSitesWhereSystemConfigurationEnvironment(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("7bad0d79-517a-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllSitesWhereSystemConfigurationAndEnvironmentAndSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("5cb568b4-09fd-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllSiteWhereSystemConfigurationAndEnvironmentDistinct(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("4cd3f372-517a-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllSiteWhereSystemConfigurationAndEnvironmentAndSiteDistinct(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("ce929a6f-51a1-11ea-a946-13c393300b57")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts> AllSiteWhereSystemConfigurationAndAbstractHostWithSite(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("5db9e341-df72-11e9-9827-a1514ee8d06a")
    public java.lang.String Guid(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration sysCfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts nd);

    @IDynamicResourceExtension.MethodId("f4d72be1-e9e7-11e9-92e5-e15beb25e0f4")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyWithHosts(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts nd);

    @IDynamicResourceExtension.MethodId("348a6c2d-094d-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource> AllSources();

    @IDynamicResourceExtension.MethodId("cd1b6dc4-094d-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource> AllSourcesDistinct();

    @IDynamicResourceExtension.MethodId("e99aad2f-a965-11e9-bf83-7bacdb6991f7")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source);

    /**
     * 
     */
    @IDynamicResourceExtension.MethodId("e641276b-51a3-11ea-a946-13c393300b57")
    public java.lang.String GroupName(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts abstractSiteWithHosts, final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

    @IDynamicResourceExtension.MethodId("f44b9356-0aa0-11ea-97f4-9d91b2097bad")
    public java.lang.String GroupNameAll(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration sysCfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment env);

    @IDynamicResourceExtension.MethodId("88247d98-e2d8-11ee-bcaf-bf4e173adc8d")
    public java.lang.String TypeName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration);

  }
  
  public static interface ISecuritySubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f4d72be1-e9e7-11e9-92e5-e15beb25e0f4")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyWithHosts(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts nd, final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> securitySubZoneList);

    @IDynamicResourceExtension.MethodId("e99aad2f-a965-11e9-bf83-7bacdb6991f7")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

    @IDynamicResourceExtension.MethodId("88247d98-e2d8-11ee-bcaf-bf4e173adc8d")
    public java.lang.String TypeName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

  }
  
  public static class SecuritySubZoneFunctionsImpl implements ISecuritySubZoneFunctionsImpl {

    public static final ISecuritySubZoneFunctionsImpl INSTANCE = new SecuritySubZoneFunctionsImpl();

    private SecuritySubZoneFunctionsImpl() {}

    @Override
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyWithHosts(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts nd, final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> securitySubZoneList) {
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
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone) {
      /* Begin Protected Region [[e99aad2f-a965-11e9-bf83-7bacdb6991f7]] */
      final var sourceFunctions = source.extension(ISecuritySubZoneFunctions.class);
      final ISourceSubZone sourceSubZone = sourceFunctions.SourcePolicy();
      if( sourceSubZone == null ) {
      	return "R";
      }

      final ISubZoneAccessPolicy accesspolicy = sourceSubZone.selectDestinationSubZonePolicy().get(securitySubZone.getResource());
      if( accesspolicy == null) {
      	return "R";
      }
      final var accessPolicy = accesspolicy.extension(ISubZoneAccessPolicyFunctions.class);
      return accessPolicy.EvaluatePolicy(source);
      /* End Protected Region   [[e99aad2f-a965-11e9-bf83-7bacdb6991f7]] */
    }

    @Override
    public java.lang.String TypeName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone) {
      /* Begin Protected Region [[88247d98-e2d8-11ee-bcaf-bf4e173adc8d]] */
    	final var sysCfgFunction = systemConfiguration.extension(ISystemConfigurationFunctions.class);
    	return sysCfgFunction.TypeName(securitySubZone);
      // XXX implement template function here   
      /* End Protected Region   [[88247d98-e2d8-11ee-bcaf-bf4e173adc8d]] */
    }

  }
  
  public static class SecuritySubZoneFunctions {

    private SecuritySubZoneFunctions() {}

    public static List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyWithHosts(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts nd, final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> securitySubZoneList) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZoneList).OnlyWithHosts(syscfg, nd, securitySubZoneList);
    }

    public static java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZone).EvaluatePolicy(source, securitySubZone);
    }

    public static java.lang.String TypeName(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration systemConfiguration, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZone).TypeName(systemConfiguration, securitySubZone);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d422151a-4607-11ea-857e-99d5aa1ed1cd,pgDdwjkOUvQAgFWZYdY0SalCHWA=] */
