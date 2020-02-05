package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0ea7300c-b846-11e9-8760-2d4a9d15ec14,imports]] */
import java.util.stream.Collectors;

import cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.SystemConfiguration;
import cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.FunctionSpace_System.ISystemConfigurationFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration;

import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.SourceSubZone;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.to_move.segmentation.FunctionSpace_Segmentation.ISecuritySubZoneFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.IAbstractSiteWithHosts;
import cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.FunctionSpace_Communication.ISourceFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.DestinationSubSecurityZone;
import cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.IDestination;
import cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.IDestinationSubSecurityZone;
import cleon.modelinglanguages.segmentation.metamodel.spec.FunctionSpace_Segmentation.IZoneFunctions;
import cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone;

/* End Protected Region   [[0ea7300c-b846-11e9-8760-2d4a9d15ec14,imports]] */

public class FunctionSpace_SubzonePolicy {

  /* Begin Protected Region [[0ea7300c-b846-11e9-8760-2d4a9d15ec14]] */
  
  /* End Protected Region   [[0ea7300c-b846-11e9-8760-2d4a9d15ec14]] */


  public static interface ISubZoneAccessPolicyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("22ab1685-b846-11e9-8760-2d4a9d15ec14")
    public java.lang.String TypeName();

    @IDynamicResourceExtension.MethodId("f9c1ff2d-b9cf-11e9-828c-091526d036b6")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source);

    @IDynamicResourceExtension.MethodId("672a5ec2-b9e5-11e9-828c-091526d036b6")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyFromSource(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource source);

    @IDynamicResourceExtension.MethodId("ba6db6f6-094f-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration> AllSources();

    @IDynamicResourceExtension.MethodId("df365e20-094f-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration> AllSourcesDistinct();

    @IDynamicResourceExtension.MethodId("adfed001-0951-11ea-a9aa-d95ecdaa88c4")
    public java.lang.Boolean HasSources();

    @IDynamicResourceExtension.MethodId("99918128-0a07-11ea-baed-218c3e076b56")
    public java.lang.String RenderSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment env);

    @IDynamicResourceExtension.MethodId("ee9b53cb-0a36-11ea-baed-218c3e076b56")
    public java.lang.String RenderDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment env);

    @IDynamicResourceExtension.MethodId("e5fdbace-0df9-11ea-adc0-d5efa00b40ac")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src);

    @IDynamicResourceExtension.MethodId("299d0f3b-0dfc-11ea-adc0-d5efa00b40ac")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.to_move.system.javamodel.ISystemConfiguration> AllSystemConfigurations();

  }
  
  public static interface ISubZoneAccessPolicyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("672a5ec2-b9e5-11e9-828c-091526d036b6")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyFromSource(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource source, final List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList);

    @IDynamicResourceExtension.MethodId("99918128-0a07-11ea-baed-218c3e076b56")
    public java.lang.String RenderSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy);

    @IDynamicResourceExtension.MethodId("ee9b53cb-0a36-11ea-baed-218c3e076b56")
    public java.lang.String RenderDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy);

    @IDynamicResourceExtension.MethodId("e5fdbace-0df9-11ea-adc0-d5efa00b40ac")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList);

  }
  
  public static class SubZoneAccessPolicyFunctionsImpl implements ISubZoneAccessPolicyFunctionsImpl {

    public static final ISubZoneAccessPolicyFunctionsImpl INSTANCE = new SubZoneAccessPolicyFunctionsImpl();

    private SubZoneAccessPolicyFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyFromSource(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource source, final List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList) {
      /* Begin Protected Region [[672a5ec2-b9e5-11e9-828c-091526d036b6]] */
		ISystemConfiguration sourceCfg = source.selectSourceSystemConfiguration();
		ISystemConfigurationFunctions configurationFunctions = sourceCfg.extension(ISystemConfigurationFunctions.class);
		IDestinationSubSecurityZone destinationSubSecurityZone = DestinationSubSecurityZone
				.selectToMeHasCommunicationFrom(source);
		return subZoneAccessPolicyList.stream()
				.filter(x -> x.selectPolicyForSecuritySubZone()
						.equals(destinationSubSecurityZone.selectUsedInterface().selectInterfaceInSecuritySubZone())
						&& configurationFunctions.GetSubzonesAllDependsFromWithSelf().contains(
								SourceSubZone.selectToMeTargetSubZonePolicy(x).selectSourceSecuritySubZone()))
				.collect(Collectors.toList());
   
      /* End Protected Region   [[672a5ec2-b9e5-11e9-828c-091526d036b6]] */
    }

    @Override
    public java.lang.String RenderSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy) {
      /* Begin Protected Region [[99918128-0a07-11ea-baed-218c3e076b56]] */
		ISecuritySubZone sourceSubZone = SourceSubZone.selectToMeTargetSubZonePolicy(subZoneAccessPolicy)
				.selectSourceSecuritySubZone();
		
		ISecuritySubZoneFunctions sourceSubZoneFunctions = sourceSubZone.extension(ISecuritySubZoneFunctions.class);
		IZoneFunctions zoneFunctions = sourceSubZone.extension(IZoneFunctions.class);
		ISystemConfigurationFunctions sysCfgFunction = src.selectSourceSystemConfiguration()
				.extension(ISystemConfigurationFunctions.class);
		List<ISystemConfiguration> sysCfgs = sysCfgFunction.GetAllDependsFromWithSelf().stream().filter(x -> SystemConfiguration.selectToMeInheritServices(x).isEmpty()).collect(Collectors.toList());
		StringBuilder result = new StringBuilder();
	
		for (ISystemConfiguration sysCfg : sysCfgs) {
			if (zoneFunctions.IsLocalOnly()) {
				for (IAbstractSiteWithHosts hosts : sourceSubZoneFunctions						
						.AllNetdomainWhereSystemConfigurationAndEnvironmentDistinct(env, sysCfg)) {
						result.append("GRP-HOS-" + sysCfg.selectName() + "-" + hosts.selectName() + "-" +
								sourceSubZone.selectVLAN_No());
						result.append("\n");
				}
			}
			else {
				List<ISystemConfiguration> hosts = sourceSubZoneFunctions.AllSystemConfigurationWhereSystemConfigurationAndEnvironmentDistinct(sysCfg, env);
				for( ISystemConfiguration concreteSysCfg : hosts ) {
					result.append("GRP-HOS-" + env.selectHostGroupPrefix() + "-ALL_" + concreteSysCfg.selectName() + "-" + sourceSubZone.selectVLAN_No());
					result.append("\n");					
				}
			}				
		}
	
		return result.toString(); 
   
      /* End Protected Region   [[99918128-0a07-11ea-baed-218c3e076b56]] */
    }

    @Override
    public java.lang.String RenderDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy) {
      /* Begin Protected Region [[ee9b53cb-0a36-11ea-baed-218c3e076b56]] */
		ISecuritySubZone destinationSubZone = subZoneAccessPolicy.selectPolicyForSecuritySubZone();		
		ISecuritySubZoneFunctions destinationSubZoneFunctions = destinationSubZone.extension(ISecuritySubZoneFunctions.class);
		IZoneFunctions zoneFunctions = destinationSubZone.extension(IZoneFunctions.class);
		ISourceFunctions sourceFunctions = src.extension(ISourceFunctions.class);
		IDestination destination = sourceFunctions.Destination();
		ISystemConfigurationFunctions sysCfgFunction = destination.selectDestinationSystemConfiguration()
				.extension(ISystemConfigurationFunctions.class);
		
		List<ISystemConfiguration> sysCfgs = sysCfgFunction.GetAllDependsFromWithSelf().stream().filter(x -> SystemConfiguration.selectToMeInheritServices(x).isEmpty()).collect(Collectors.toList());
		StringBuilder result = new StringBuilder();

		for (ISystemConfiguration sysCfg : sysCfgs) {
			if (zoneFunctions.IsLocalOnly()) {
				for (IAbstractSiteWithHosts hosts : destinationSubZoneFunctions
						.AllNetdomainWhereSystemConfigurationAndEnvironmentDistinct(env, sysCfg)) {				
						result.append("GRP-HOS-" + sysCfg.selectName() + "-" + hosts.selectName() + "-" +
								destinationSubZone.selectVLAN_No());
						result.append(System.lineSeparator());
				}
			}
			else {
				List<ISystemConfiguration> hosts = destinationSubZoneFunctions.AllSystemConfigurationWhereSystemConfigurationAndEnvironmentDistinct(sysCfg, env);
				for( ISystemConfiguration concreteSysCfg : hosts ) {
					result.append("GRP-HOS-" + env.selectHostGroupPrefix() + "-ALL_" + concreteSysCfg.selectName() + "-" + destinationSubZone.selectVLAN_No());					
					result.append(System.lineSeparator());					
				}
			}				
		}
		return result.toString();
      /* End Protected Region   [[ee9b53cb-0a36-11ea-baed-218c3e076b56]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList) {
      /* Begin Protected Region [[e5fdbace-0df9-11ea-adc0-d5efa00b40ac]] */
    	return subZoneAccessPolicyList.stream().filter(x -> x.extension(ISubZoneAccessPolicyFunctions.class).AllSystemConfigurations().contains(src.selectSourceSystemConfiguration())).collect(Collectors.toList());   
      /* End Protected Region   [[e5fdbace-0df9-11ea-adc0-d5efa00b40ac]] */
    }

  }
  
  public static class SubZoneAccessPolicyFunctions {

    private SubZoneAccessPolicyFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyFromSource(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource source, final List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList) {
      return DynamicResourceUtil.invoke(ISubZoneAccessPolicyFunctionsImpl.class, SubZoneAccessPolicyFunctionsImpl.INSTANCE, subZoneAccessPolicyList).OnlyFromSource(source, subZoneAccessPolicyList);
    }

    public static java.lang.String RenderSourceHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(ISubZoneAccessPolicyFunctionsImpl.class, SubZoneAccessPolicyFunctionsImpl.INSTANCE, subZoneAccessPolicy).RenderSourceHostGroups(src, env, subZoneAccessPolicy);
    }

    public static java.lang.String RenderDestinationHostGroups(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final cleon.architecturemethods.systemarc42.metamodel.spec.deployment_view.environment.to_move.environments.javamodel.IEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy subZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(ISubZoneAccessPolicyFunctionsImpl.class, SubZoneAccessPolicyFunctionsImpl.INSTANCE, subZoneAccessPolicy).RenderDestinationHostGroups(src, env, subZoneAccessPolicy);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> OnlyWhereSystemConfiguration(final cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISource src, final List<cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> subZoneAccessPolicyList) {
      return DynamicResourceUtil.invoke(ISubZoneAccessPolicyFunctionsImpl.class, SubZoneAccessPolicyFunctionsImpl.INSTANCE, subZoneAccessPolicyList).OnlyWhereSystemConfiguration(src, subZoneAccessPolicyList);
    }

  }

  public static interface IIntraSubZoneAccessPolicyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2fbe687b-b846-11e9-8760-2d4a9d15ec14")
    public java.lang.String TypeName();

    @IDynamicResourceExtension.MethodId("074d6763-b9d0-11e9-828c-091526d036b6")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source);

    @IDynamicResourceExtension.MethodId("db422f6e-0951-11ea-a9aa-d95ecdaa88c4")
    public java.lang.Boolean HasSources();

  }
  
  public static interface IIntraSubZoneAccessPolicyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("074d6763-b9d0-11e9-828c-091526d036b6")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy);

    @IDynamicResourceExtension.MethodId("db422f6e-0951-11ea-a9aa-d95ecdaa88c4")
    public java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy);

  }
  
  public static class IntraSubZoneAccessPolicyFunctionsImpl implements IIntraSubZoneAccessPolicyFunctionsImpl {

    public static final IIntraSubZoneAccessPolicyFunctionsImpl INSTANCE = new IntraSubZoneAccessPolicyFunctionsImpl();

    private IntraSubZoneAccessPolicyFunctionsImpl() {}

    @Override
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy) {
      /* Begin Protected Region [[074d6763-b9d0-11e9-828c-091526d036b6]] */
    	IZoneFunctions zoneFunctions = intraSubZoneAccessPolicy.selectPolicyForSecuritySubZone().extension(IZoneFunctions.class);
    	if( zoneFunctions.IsLocalOnly()) {
    		if(intraSubZoneAccessPolicy.selectRestriction().isAllowed()) {
    			return "G";
    		} else {
    			return "O";
    		}
    	} else {
    		if(intraSubZoneAccessPolicy.selectRestriction().isAllowed()) {
            	return "G/R";    			
    		} else {
            	return "O/R";    			
    		}
    	}   
      /* End Protected Region   [[074d6763-b9d0-11e9-828c-091526d036b6]] */
    }

    @Override
    public java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy) {
      /* Begin Protected Region [[db422f6e-0951-11ea-a9aa-d95ecdaa88c4]] */
    	if (intraSubZoneAccessPolicy.selectRestriction().isAllowed()) {
    		return true;
    	}
    	
    	return intraSubZoneAccessPolicy.extension(ISubZoneAccessPolicyFunctions.class).AllSourcesDistinct().isEmpty() == false;    		
   
      /* End Protected Region   [[db422f6e-0951-11ea-a9aa-d95ecdaa88c4]] */
    }

  }
  
  public static class IntraSubZoneAccessPolicyFunctions {

    private IntraSubZoneAccessPolicyFunctions() {}

    public static java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(IIntraSubZoneAccessPolicyFunctionsImpl.class, IntraSubZoneAccessPolicyFunctionsImpl.INSTANCE, intraSubZoneAccessPolicy).EvaluatePolicy(source, intraSubZoneAccessPolicy);
    }

    public static java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IIntraSubZoneAccessPolicy intraSubZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(IIntraSubZoneAccessPolicyFunctionsImpl.class, IntraSubZoneAccessPolicyFunctionsImpl.INSTANCE, intraSubZoneAccessPolicy).HasSources(intraSubZoneAccessPolicy);
    }

  }

  public static interface IInterSubZoneAccessPolicyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3d754da6-b846-11e9-8760-2d4a9d15ec14")
    public java.lang.String TypeName();

    @IDynamicResourceExtension.MethodId("16a32f0e-b9d0-11e9-828c-091526d036b6")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source);

    @IDynamicResourceExtension.MethodId("bfada2ac-0951-11ea-a9aa-d95ecdaa88c4")
    public java.lang.Boolean HasSources();

  }
  
  public static interface IInterSubZoneAccessPolicyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("16a32f0e-b9d0-11e9-828c-091526d036b6")
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy);

    @IDynamicResourceExtension.MethodId("bfada2ac-0951-11ea-a9aa-d95ecdaa88c4")
    public java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy);

  }
  
  public static class InterSubZoneAccessPolicyFunctionsImpl implements IInterSubZoneAccessPolicyFunctionsImpl {

    public static final IInterSubZoneAccessPolicyFunctionsImpl INSTANCE = new InterSubZoneAccessPolicyFunctionsImpl();

    private InterSubZoneAccessPolicyFunctionsImpl() {}

    @Override
    public java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy) {
      /* Begin Protected Region [[16a32f0e-b9d0-11e9-828c-091526d036b6]] */
    	IZoneFunctions zoneFunctions = interSubZoneAccessPolicy.selectPolicyForSecuritySubZone().extension(IZoneFunctions.class);
    	if( zoneFunctions.IsLocalOnly()) {
        	return "O";
    	} else {
    		if( source.equals(interSubZoneAccessPolicy.selectPolicyForSecuritySubZone())) {
    			return "G/O";
    		} else {
    			return "O";    			
    		}
    	}
      /* En   
      /* End Protected Region   [[16a32f0e-b9d0-11e9-828c-091526d036b6]] */
    }

    @Override
    public java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy) {
      /* Begin Protected Region [[bfada2ac-0951-11ea-a9aa-d95ecdaa88c4]] */
    	if (interSubZoneAccessPolicy.selectAllowProxySpecificCommunications() != null && interSubZoneAccessPolicy.selectAllowProxySpecificCommunications().booleanValue()) {
    		return true;
    	}
    	
    	return interSubZoneAccessPolicy.extension(ISubZoneAccessPolicyFunctions.class).AllSourcesDistinct().isEmpty() == false;
   
      /* End Protected Region   [[bfada2ac-0951-11ea-a9aa-d95ecdaa88c4]] */
    }

  }
  
  public static class InterSubZoneAccessPolicyFunctions {

    private InterSubZoneAccessPolicyFunctions() {}

    public static java.lang.String EvaluatePolicy(final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone source, final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(IInterSubZoneAccessPolicyFunctionsImpl.class, InterSubZoneAccessPolicyFunctionsImpl.INSTANCE, interSubZoneAccessPolicy).EvaluatePolicy(source, interSubZoneAccessPolicy);
    }

    public static java.lang.Boolean HasSources(final cleon.architecturemethods.systemarc42.metamodel.spec.concepts.segmentation.subzonepolicy.javamodel.IInterSubZoneAccessPolicy interSubZoneAccessPolicy) {
      return DynamicResourceUtil.invoke(IInterSubZoneAccessPolicyFunctionsImpl.class, InterSubZoneAccessPolicyFunctionsImpl.INSTANCE, interSubZoneAccessPolicy).HasSources(interSubZoneAccessPolicy);
    }

  }

  public static interface ISourceSubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b0d1f44b-094e-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration> AllSources();

    @IDynamicResourceExtension.MethodId("d4cd614b-094e-11ea-a9aa-d95ecdaa88c4")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration> AllSourcesDistinct();

  }
  
  public static interface ISourceSubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SourceSubZoneFunctionsImpl implements ISourceSubZoneFunctionsImpl {

    public static final ISourceSubZoneFunctionsImpl INSTANCE = new SourceSubZoneFunctionsImpl();

    private SourceSubZoneFunctionsImpl() {}

  }
  
  public static class SourceSubZoneFunctions {

    private SourceSubZoneFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0ea7300c-b846-11e9-8760-2d4a9d15ec14,OvKh1lvxukJWnZlvRN5kS/dXLUo=] */
