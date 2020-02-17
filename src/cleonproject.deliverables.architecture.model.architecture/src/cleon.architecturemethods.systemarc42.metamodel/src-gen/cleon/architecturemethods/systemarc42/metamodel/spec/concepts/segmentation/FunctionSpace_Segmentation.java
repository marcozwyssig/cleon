package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d422151a-4607-11ea-857e-99d5aa1ed1cd,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.FunctionSpace_SubzonePolicy.ISubZoneAccessPolicyFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy;

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
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration> AllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("df2d7303-b9ce-11e9-828c-091526d036b6")
    public cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISourceSubZone SourcePolicy();

    @IDynamicResourceExtension.MethodId("c0a412fe-deac-11e9-b714-478bec98e62d")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.IHostNode> AllHostNodesWhereSystemConfigurationAndNetDomain(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts nd);

    @IDynamicResourceExtension.MethodId("08dbad82-df9b-11e9-9827-a1514ee8d06a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.IHostNode> AllHostNodesWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg);

    @IDynamicResourceExtension.MethodId("77400f34-0ab0-11ea-b1a6-0524b035bd98")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.IHostNode> AllHostNodesWhereSystemConfigurationAndEnvironment(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment env);

    @IDynamicResourceExtension.MethodId("a449369e-517b-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.javamodel.IHostNode> AllHostNodesWhereSystemConfigurationAndEnvironmentAndSite(final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite site, final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg);

    @IDynamicResourceExtension.MethodId("9bf9949c-09ef-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractHost> AllHostsWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg);

    @IDynamicResourceExtension.MethodId("99990cc8-0a05-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractHost> AllHostsWhereSystemConfigurationAndEnvironment(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment env);

    @IDynamicResourceExtension.MethodId("a3a7f3f8-09f2-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration> AllSystemConfigurationWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg);

    @IDynamicResourceExtension.MethodId("ba947b1f-09f2-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration> AllSystemConfigurationWhereSystemConfigurationDistinct(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg);

    @IDynamicResourceExtension.MethodId("24927129-0aa5-11ea-97f4-9d91b2097bad")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration> AllSystemConfigurationWhereSystemConfigurationAndEnvironment(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment env);

    @IDynamicResourceExtension.MethodId("39e2d53a-0aa5-11ea-97f4-9d91b2097bad")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration> AllSystemConfigurationWhereSystemConfigurationAndEnvironmentDistinct(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment env);

    @IDynamicResourceExtension.MethodId("e02913cf-09f4-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> AllNetdomainWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("4f4ff93a-09f5-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> AllNetdomainWhereSystemConfigurationDistinct(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("7be9152a-09fd-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> AllNetdomainWhereSystemConfigurationEnvironment(final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("7bad0d79-517a-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> AllNetdomainWhereSystemConfigurationAndEnvironmentAndSite(final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite site, final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("5cb568b4-09fd-11ea-baed-218c3e076b56")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> AllSiteWhereSystemConfigurationAndEnvironmentDistinct(final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("4cd3f372-517a-11ea-b9cb-85bbdfd861be")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts> AllSiteWhereSystemConfigurationAndEnvironmentAndSiteDistinct(final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ISite site, final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration sysCfg);

    @IDynamicResourceExtension.MethodId("c7688c97-dec2-11e9-b714-478bec98e62d")
    public java.lang.String GroupNameOld(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration sysCfg, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts nd);

    @IDynamicResourceExtension.MethodId("f44b9356-0aa0-11ea-97f4-9d91b2097bad")
    public java.lang.String GroupName(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration sysCfg, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.javamodel.ISystemEnvironment env);

    @IDynamicResourceExtension.MethodId("5db9e341-df72-11e9-9827-a1514ee8d06a")
    public java.lang.String Guid(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration sysCfg, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts nd);

    @IDynamicResourceExtension.MethodId("f4d72be1-e9e7-11e9-92e5-e15beb25e0f4")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyWithHosts(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts nd);

    @IDynamicResourceExtension.MethodId("348a6c2d-094d-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource> AllSources();

    @IDynamicResourceExtension.MethodId("cd1b6dc4-094d-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource> AllSourcesDistinct();

    @IDynamicResourceExtension.MethodId("e99aad2f-a965-11e9-bf83-7bacdb6991f7")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source);

  }
  
  public static interface ISecuritySubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f4d72be1-e9e7-11e9-92e5-e15beb25e0f4")
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyWithHosts(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts nd, final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> securitySubZoneList);

    @IDynamicResourceExtension.MethodId("e99aad2f-a965-11e9-bf83-7bacdb6991f7")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

  }
  
  public static class SecuritySubZoneFunctionsImpl implements ISecuritySubZoneFunctionsImpl {

    public static final ISecuritySubZoneFunctionsImpl INSTANCE = new SecuritySubZoneFunctionsImpl();

    private SecuritySubZoneFunctionsImpl() {}

    @Override
    public List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyWithHosts(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts nd, final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> securitySubZoneList) {
      /* Begin Protected Region [[f4d72be1-e9e7-11e9-92e5-e15beb25e0f4]] */
    	List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> lists = new java.util.ArrayList<>();
    	for( cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone : securitySubZoneList )
    	{
    		ISecuritySubZoneFunctions functions = securitySubZone.extension(ISecuritySubZoneFunctions.class);
    		if( functions.AllHostNodesWhereSystemConfigurationAndNetDomain(syscfg, nd).isEmpty() == false)
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
    	ISecuritySubZoneFunctions sourceFunctions = source.extension(ISecuritySubZoneFunctions.class);
    	ISourceSubZone sourceSubZone = sourceFunctions.SourcePolicy();
    	if( sourceSubZone == null ) {
    		return "R";
    	}
    	
    	ISubZoneAccessPolicy accesspolicy = sourceSubZone.selectTargetSubZonePolicy().get(securitySubZone.getResource());
    	if( accesspolicy == null) {
    		return "R";
    	}
    	ISubZoneAccessPolicyFunctions accessPolicy = accesspolicy.extension(ISubZoneAccessPolicyFunctions.class);
    	return accessPolicy.EvaluatePolicy(source);   
      /* End Protected Region   [[e99aad2f-a965-11e9-bf83-7bacdb6991f7]] */
    }

  }
  
  public static class SecuritySubZoneFunctions {

    private SecuritySubZoneFunctions() {}

    public static List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> OnlyWithHosts(final cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration syscfg, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts nd, final List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> securitySubZoneList) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZoneList).OnlyWithHosts(syscfg, nd, securitySubZoneList);
    }

    public static java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone) {
      return DynamicResourceUtil.invoke(ISecuritySubZoneFunctionsImpl.class, SecuritySubZoneFunctionsImpl.INSTANCE, securitySubZone).EvaluatePolicy(source, securitySubZone);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d422151a-4607-11ea-857e-99d5aa1ed1cd,7mUy4dCkXXTG+9N3GkwBtjgVSSk=] */
