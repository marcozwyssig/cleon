package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[82e8262a-0024-11f0-945c-87b19aec41f4,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.security.iam.javamodel.IActiveDirectorySystemConfiguration;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.FunctionSpace_SystemConfiguration.ISystemConfigurationFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.IOperatingSystemConfiguration;

/* End Protected Region   [[82e8262a-0024-11f0-945c-87b19aec41f4,imports]] */

public class FunctionSpace_Configuration {

  /* Begin Protected Region [[82e8262a-0024-11f0-945c-87b19aec41f4]] */
  
  /* End Protected Region   [[82e8262a-0024-11f0-945c-87b19aec41f4]] */


  public static interface IAbstractConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9411f961-001e-11f0-945c-87b19aec41f4")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> AllPuppetConfigurations();

    @IDynamicResourceExtension.MethodId("22b362ac-0015-11f0-945c-87b19aec41f4")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> OnlyWithPuppetConfiguration();

    @IDynamicResourceExtension.MethodId("94a9e507-0024-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileName();

  }
  
  public static interface IAbstractConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("22b362ac-0015-11f0-945c-87b19aec41f4")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> OnlyWithPuppetConfiguration(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList);

  }
  
  public static class AbstractConfigurationFunctionsImpl implements IAbstractConfigurationFunctionsImpl {

    public static final IAbstractConfigurationFunctionsImpl INSTANCE = new AbstractConfigurationFunctionsImpl();

    private AbstractConfigurationFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> OnlyWithPuppetConfiguration(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList) {
      /* Begin Protected Region [[22b362ac-0015-11f0-945c-87b19aec41f4]] */
    	return abstractConfigurationList.stream().filter(x -> x.extension(IAbstractConfigurationFunctions.class).AllPuppetConfigurations().isEmpty() == false).toList();
      /* End Protected Region   [[22b362ac-0015-11f0-945c-87b19aec41f4]] */
    }

  }
  
  public static class AbstractConfigurationFunctions {

    private AbstractConfigurationFunctions() {}

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> OnlyWithPuppetConfiguration(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList) {
      return DynamicResourceUtil.invoke(IAbstractConfigurationFunctionsImpl.class, AbstractConfigurationFunctionsImpl.INSTANCE, abstractConfigurationList).OnlyWithPuppetConfiguration(abstractConfigurationList);
    }

  }

  public static interface ISysCmpSpecificationAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("addf2f8d-059b-11f0-a294-67d88c30f2e4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetSystemConfigurations();

    @IDynamicResourceExtension.MethodId("0f4148b3-05a3-11f0-a294-67d88c30f2e4")
    public java.lang.String CmpFolder();

    @IDynamicResourceExtension.MethodId("28aebf7d-07f8-11f0-bc12-1bbda1d7028e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> Sites();

  }
  
  public static interface ISysCmpSpecificationAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCmpSpecificationAwareFunctionsImpl implements ISysCmpSpecificationAwareFunctionsImpl {

    public static final ISysCmpSpecificationAwareFunctionsImpl INSTANCE = new SysCmpSpecificationAwareFunctionsImpl();

    private SysCmpSpecificationAwareFunctionsImpl() {}

  }
  
  public static class SysCmpSpecificationAwareFunctions {

    private SysCmpSpecificationAwareFunctions() {}

  }

  public static interface IAbstractEnvironmentSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("47f35586-0023-11f0-945c-87b19aec41f4")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> AllPuppetConfigurations();

  }
  
  public static interface IAbstractEnvironmentSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractEnvironmentSpecificationFunctionsImpl implements IAbstractEnvironmentSpecificationFunctionsImpl {

    public static final IAbstractEnvironmentSpecificationFunctionsImpl INSTANCE = new AbstractEnvironmentSpecificationFunctionsImpl();

    private AbstractEnvironmentSpecificationFunctionsImpl() {}

  }
  
  public static class AbstractEnvironmentSpecificationFunctions {

    private AbstractEnvironmentSpecificationFunctions() {}

  }

  public static interface ISysCfgSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d4bc5ec2-0025-11f0-945c-87b19aec41f4")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> AllPuppetConfigurations();

    @IDynamicResourceExtension.MethodId("08187956-0015-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileName();

    @IDynamicResourceExtension.MethodId("5df45a9a-42ed-11ec-905e-258a812affa7")
    public java.lang.String GetSystemComponentName();

    @IDynamicResourceExtension.MethodId("6845a5e7-42ed-11ec-905e-258a812affa7")
    public java.lang.String GetSystemConfigurationName();

    @IDynamicResourceExtension.MethodId("671e20f8-0630-11f0-ad7c-c72b7a763977")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> NoDCAndOnlyWindows();

    @IDynamicResourceExtension.MethodId("9ccb5cfb-0632-11f0-ad7c-c72b7a763977")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscmp.javamodel.ISysCmpSpecification SysCmpSpecific();

    @IDynamicResourceExtension.MethodId("757b3ddf-07f8-11f0-bc12-1bbda1d7028e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> Sites();

  }
  
  public static interface ISysCfgSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("671e20f8-0630-11f0-ad7c-c72b7a763977")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> NoDCAndOnlyWindows(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> sysCfgSpecificationList);

  }
  
  public static class SysCfgSpecificationFunctionsImpl implements ISysCfgSpecificationFunctionsImpl {

    public static final ISysCfgSpecificationFunctionsImpl INSTANCE = new SysCfgSpecificationFunctionsImpl();

    private SysCfgSpecificationFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> NoDCAndOnlyWindows(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> sysCfgSpecificationList) {
      /* Begin Protected Region [[671e20f8-0630-11f0-ad7c-c72b7a763977]] */
    	return sysCfgSpecificationList.stream().filter(x -> {
    		final var isAD = x.selectSpecificationForSystemConfiguration() instanceof IActiveDirectorySystemConfiguration;
    		if (isAD) {
    			return false;
    		}
    		if (x.extension(ISysCfgSpecificationFunctions.class).SysCmpSpecific() == null) {
    			return false;
    		}
    		return x.selectSpecificationForSystemConfiguration().extension(ISystemConfigurationFunctions.class).IsDependsOnWindows() || x.selectSpecificationForSystemConfiguration() instanceof IOperatingSystemConfiguration;
     		
    	}).toList();

      /* End Protected Region   [[671e20f8-0630-11f0-ad7c-c72b7a763977]] */
    }

  }
  
  public static class SysCfgSpecificationFunctions {

    private SysCfgSpecificationFunctions() {}

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> NoDCAndOnlyWindows(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification> sysCfgSpecificationList) {
      return DynamicResourceUtil.invoke(ISysCfgSpecificationFunctionsImpl.class, SysCfgSpecificationFunctionsImpl.INSTANCE, sysCfgSpecificationList).NoDCAndOnlyWindows(sysCfgSpecificationList);
    }

  }

  public static interface ISysCmpSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c1e75b91-059b-11f0-a294-67d88c30f2e4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetSystemConfigurations();

    @IDynamicResourceExtension.MethodId("1db6c3ea-d21f-11ee-8171-1959ddc2a1e5")
    public java.lang.String GetComponentPath();

    @IDynamicResourceExtension.MethodId("b1e135fa-05a3-11f0-a294-67d88c30f2e4")
    public java.lang.String CmpFolder();

    @IDynamicResourceExtension.MethodId("8d8f6008-07f9-11f0-bc12-1bbda1d7028e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> Sites();

  }
  
  public static interface ISysCmpSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCmpSpecificationFunctionsImpl implements ISysCmpSpecificationFunctionsImpl {

    public static final ISysCmpSpecificationFunctionsImpl INSTANCE = new SysCmpSpecificationFunctionsImpl();

    private SysCmpSpecificationFunctionsImpl() {}

  }
  
  public static class SysCmpSpecificationFunctions {

    private SysCmpSpecificationFunctions() {}

  }

  public static interface IDataCenterSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("47f35569-0023-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileName();

    @IDynamicResourceExtension.MethodId("2d615d0e-0029-11f0-945c-87b19aec41f4")
    public java.lang.String FileName();

    @IDynamicResourceExtension.MethodId("182a313c-002a-11f0-945c-87b19aec41f4")
    public java.lang.String FolderName();

  }
  
  public static interface IDataCenterSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DataCenterSpecificationsFunctionsImpl implements IDataCenterSpecificationsFunctionsImpl {

    public static final IDataCenterSpecificationsFunctionsImpl INSTANCE = new DataCenterSpecificationsFunctionsImpl();

    private DataCenterSpecificationsFunctionsImpl() {}

  }
  
  public static class DataCenterSpecificationsFunctions {

    private DataCenterSpecificationsFunctions() {}

  }

  public static interface IEnvironmentSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4fec0b49-0023-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileName();

    @IDynamicResourceExtension.MethodId("b9cac23e-0028-11f0-945c-87b19aec41f4")
    public java.lang.String FileName();

    @IDynamicResourceExtension.MethodId("d1f1826f-0029-11f0-945c-87b19aec41f4")
    public java.lang.String FolderName();

    @IDynamicResourceExtension.MethodId("6434e306-059c-11f0-a294-67d88c30f2e4")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetSystemConfigurations();

    @IDynamicResourceExtension.MethodId("b3ffda9e-05a4-11f0-a294-67d88c30f2e4")
    public java.lang.String CmpFolder();

    @IDynamicResourceExtension.MethodId("37a96f0c-07f8-11f0-bc12-1bbda1d7028e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> Sites();

  }
  
  public static interface IEnvironmentSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnvironmentSpecificationsFunctionsImpl implements IEnvironmentSpecificationsFunctionsImpl {

    public static final IEnvironmentSpecificationsFunctionsImpl INSTANCE = new EnvironmentSpecificationsFunctionsImpl();

    private EnvironmentSpecificationsFunctionsImpl() {}

  }
  
  public static class EnvironmentSpecificationsFunctions {

    private EnvironmentSpecificationsFunctions() {}

  }

  public static interface ISiteSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("58bde294-0023-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileName();

    @IDynamicResourceExtension.MethodId("08ce1d22-0029-11f0-945c-87b19aec41f4")
    public java.lang.String FileName();

    @IDynamicResourceExtension.MethodId("e74fa194-0029-11f0-945c-87b19aec41f4")
    public java.lang.String FolderName();

    @IDynamicResourceExtension.MethodId("b28544b2-07f7-11f0-bc12-1bbda1d7028e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> GetSystemConfigurations();

    @IDynamicResourceExtension.MethodId("67370cc5-07f8-11f0-bc12-1bbda1d7028e")
    public java.lang.String CmpFolder();

    @IDynamicResourceExtension.MethodId("520ad284-07f8-11f0-bc12-1bbda1d7028e")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> Sites();

  }
  
  public static interface ISiteSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SiteSpecificationsFunctionsImpl implements ISiteSpecificationsFunctionsImpl {

    public static final ISiteSpecificationsFunctionsImpl INSTANCE = new SiteSpecificationsFunctionsImpl();

    private SiteSpecificationsFunctionsImpl() {}

  }
  
  public static class SiteSpecificationsFunctions {

    private SiteSpecificationsFunctions() {}

  }

  public static interface IHostSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ef7cd1d8-0025-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileName();

    @IDynamicResourceExtension.MethodId("be9900d1-00a4-11f0-945c-87b19aec41f4")
    public java.lang.String FileName();

    @IDynamicResourceExtension.MethodId("caf3b153-00a4-11f0-945c-87b19aec41f4")
    public java.lang.String FolderName();

  }
  
  public static interface IHostSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HostSpecificationFunctionsImpl implements IHostSpecificationFunctionsImpl {

    public static final IHostSpecificationFunctionsImpl INSTANCE = new HostSpecificationFunctionsImpl();

    private HostSpecificationFunctionsImpl() {}

  }
  
  public static class HostSpecificationFunctions {

    private HostSpecificationFunctions() {}

  }

  public static interface IPuppetConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("df54999c-0627-11f0-ad7c-c72b7a763977")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode Environment();

    @IDynamicResourceExtension.MethodId("c63f5d1e-1073-11f0-b378-11a495632127")
    public cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document Architecture();

    @IDynamicResourceExtension.MethodId("b84af3f0-1060-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccount> AllServiceAccounts();

    @IDynamicResourceExtension.MethodId("fd69a308-1072-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> OnlyWhereNoExtends();

  }
  
  public static interface IPuppetConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("fd69a308-1072-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> OnlyWhereNoExtends(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> puppetConfigurationList);

  }
  
  public static class PuppetConfigurationFunctionsImpl implements IPuppetConfigurationFunctionsImpl {

    public static final IPuppetConfigurationFunctionsImpl INSTANCE = new PuppetConfigurationFunctionsImpl();

    private PuppetConfigurationFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> OnlyWhereNoExtends(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> puppetConfigurationList) {
      /* Begin Protected Region [[fd69a308-1072-11f0-b378-11a495632127]] */
    	return puppetConfigurationList.stream().filter(x -> x.selectExtends().isEmpty()).toList();   
      /* End Protected Region   [[fd69a308-1072-11f0-b378-11a495632127]] */
    }

  }
  
  public static class PuppetConfigurationFunctions {

    private PuppetConfigurationFunctions() {}

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> OnlyWhereNoExtends(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration> puppetConfigurationList) {
      return DynamicResourceUtil.invoke(IPuppetConfigurationFunctionsImpl.class, PuppetConfigurationFunctionsImpl.INSTANCE, puppetConfigurationList).OnlyWhereNoExtends(puppetConfigurationList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,82e8262a-0024-11f0-945c-87b19aec41f4,117fcYkNzHHMX3v10B5iFfo2yFc=] */
