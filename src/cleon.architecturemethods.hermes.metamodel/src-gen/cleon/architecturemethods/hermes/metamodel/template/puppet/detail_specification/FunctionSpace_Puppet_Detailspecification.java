package cleon.architecturemethods.hermes.metamodel.template.puppet.detail_specification;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fab6dfde-0014-11f0-945c-87b19aec41f4,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.FunctionSpace_SystemConfiguration.ISystemConfigurationFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.operatingsystem.javamodel.IOperatingSystemConfiguration;
import cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.javamodel.ISysCfgSpecification;

/* End Protected Region   [[fab6dfde-0014-11f0-945c-87b19aec41f4,imports]] */

public class FunctionSpace_Puppet_Detailspecification {

  /* Begin Protected Region [[fab6dfde-0014-11f0-945c-87b19aec41f4]] */
  
  /* End Protected Region   [[fab6dfde-0014-11f0-945c-87b19aec41f4]] */


  public static interface IAbstractConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eb81e13a-0026-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileNameYaml();

    @IDynamicResourceExtension.MethodId("0a676398-067a-11f0-9dcf-ff118a4f827f")
    public java.lang.String FullFileNameEyaml();

    @IDynamicResourceExtension.MethodId("66b61ba4-0631-11f0-ad7c-c72b7a763977")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> Filter();

    @IDynamicResourceExtension.MethodId("ed913d3a-0a5d-11f0-a414-9b52960625e5")
    public java.lang.String CustomValues();

  }
  
  public static interface IAbstractConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("66b61ba4-0631-11f0-ad7c-c72b7a763977")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> Filter(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList);

    @IDynamicResourceExtension.MethodId("ed913d3a-0a5d-11f0-a414-9b52960625e5")
    public java.lang.String CustomValues(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration abstractConfiguration);

  }
  
  public static class AbstractConfigurationFunctionsImpl implements IAbstractConfigurationFunctionsImpl {

    public static final IAbstractConfigurationFunctionsImpl INSTANCE = new AbstractConfigurationFunctionsImpl();

    private AbstractConfigurationFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> Filter(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList) {
      /* Begin Protected Region [[66b61ba4-0631-11f0-ad7c-c72b7a763977]] */
    	return abstractConfigurationList.stream().filter(x -> {
    		if (x instanceof ISysCfgSpecification) { 
    			final var sysCfg = ((ISysCfgSpecification) x).selectSpecificationForSystemConfiguration();
    			final var sysCfgFunc = sysCfg.extension(ISystemConfigurationFunctions.class);
    			return sysCfgFunc.IsDependsOnLinuxOrWindows() || sysCfg instanceof IOperatingSystemConfiguration;
    		}
    		return true;
    	}).toList();
      /* End Protected Region   [[66b61ba4-0631-11f0-ad7c-c72b7a763977]] */
    }

    @Override
    public java.lang.String CustomValues(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration abstractConfiguration) {
      return null;
    }

  }
  
  public static class AbstractConfigurationFunctions {

    private AbstractConfigurationFunctions() {}

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> Filter(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList) {
      return DynamicResourceUtil.invoke(IAbstractConfigurationFunctionsImpl.class, AbstractConfigurationFunctionsImpl.INSTANCE, abstractConfigurationList).Filter(abstractConfigurationList);
    }

    public static java.lang.String CustomValues(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration abstractConfiguration) {
      return DynamicResourceUtil.invoke(IAbstractConfigurationFunctionsImpl.class, AbstractConfigurationFunctionsImpl.INSTANCE, abstractConfiguration).CustomValues(abstractConfiguration);
    }

  }

  public static interface ISysCfgSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c5177f3f-04ad-11f0-8e81-9be04e08660a")
    public java.lang.String FullFileNameAdJoinYaml();

  }
  
  public static interface ISysCfgSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SysCfgSpecificationFunctionsImpl implements ISysCfgSpecificationFunctionsImpl {

    public static final ISysCfgSpecificationFunctionsImpl INSTANCE = new SysCfgSpecificationFunctionsImpl();

    private SysCfgSpecificationFunctionsImpl() {}

  }
  
  public static class SysCfgSpecificationFunctions {

    private SysCfgSpecificationFunctions() {}

  }

  public static interface ISiteSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fe442380-0a5d-11f0-a414-9b52960625e5")
    public java.lang.String CustomValues();

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

  public static interface IPuppetConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5d44e08-0015-11f0-945c-87b19aec41f4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("03d24e1f-0016-11f0-945c-87b19aec41f4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IPuppetConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PuppetConfigurationFunctionsImpl implements IPuppetConfigurationFunctionsImpl {

    public static final IPuppetConfigurationFunctionsImpl INSTANCE = new PuppetConfigurationFunctionsImpl();

    private PuppetConfigurationFunctionsImpl() {}

  }
  
  public static class PuppetConfigurationFunctions {

    private PuppetConfigurationFunctions() {}

  }

  public static interface IUninstallFeaturesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0c8998ca-0016-11f0-945c-87b19aec41f4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("26e15efb-0016-11f0-945c-87b19aec41f4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IUninstallFeaturesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UninstallFeaturesFunctionsImpl implements IUninstallFeaturesFunctionsImpl {

    public static final IUninstallFeaturesFunctionsImpl INSTANCE = new UninstallFeaturesFunctionsImpl();

    private UninstallFeaturesFunctionsImpl() {}

  }
  
  public static class UninstallFeaturesFunctions {

    private UninstallFeaturesFunctions() {}

  }

  public static interface IInstallFeaturesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("37706e48-001a-11f0-945c-87b19aec41f4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("37706e5b-001a-11f0-945c-87b19aec41f4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IInstallFeaturesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallFeaturesFunctionsImpl implements IInstallFeaturesFunctionsImpl {

    public static final IInstallFeaturesFunctionsImpl INSTANCE = new InstallFeaturesFunctionsImpl();

    private InstallFeaturesFunctionsImpl() {}

  }
  
  public static class InstallFeaturesFunctions {

    private InstallFeaturesFunctions() {}

  }

  public static interface IIssuingCAFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c0f5baed-04b0-11f0-8e81-9be04e08660a")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("c0f5bb00-04b0-11f0-8e81-9be04e08660a")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IIssuingCAFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IssuingCAFunctionsImpl implements IIssuingCAFunctionsImpl {

    public static final IIssuingCAFunctionsImpl INSTANCE = new IssuingCAFunctionsImpl();

    private IssuingCAFunctionsImpl() {}

  }
  
  public static class IssuingCAFunctions {

    private IssuingCAFunctions() {}

  }

  public static interface IDfsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("761ba773-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("761ba776-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IDfsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DfsFunctionsImpl implements IDfsFunctionsImpl {

    public static final IDfsFunctionsImpl INSTANCE = new DfsFunctionsImpl();

    private DfsFunctionsImpl() {}

  }
  
  public static class DfsFunctions {

    private DfsFunctions() {}

  }

  public static interface ISharesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d0b3911f-07fb-11f0-bc12-1bbda1d7028e")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("d0b3b858-07fb-11f0-bc12-1bbda1d7028e")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ISharesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SharesFunctionsImpl implements ISharesFunctionsImpl {

    public static final ISharesFunctionsImpl INSTANCE = new SharesFunctionsImpl();

    private SharesFunctionsImpl() {}

  }
  
  public static class SharesFunctions {

    private SharesFunctions() {}

  }

  public static interface IEnforceOUFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c12e6786-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("c12e67ae-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IEnforceOUFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnforceOUFunctionsImpl implements IEnforceOUFunctionsImpl {

    public static final IEnforceOUFunctionsImpl INSTANCE = new EnforceOUFunctionsImpl();

    private EnforceOUFunctionsImpl() {}

  }
  
  public static class EnforceOUFunctions {

    private EnforceOUFunctions() {}

  }

  public static interface IEnforceActivitiesAndRolesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cc6e31f8-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("cc6e31fd-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IEnforceActivitiesAndRolesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnforceActivitiesAndRolesFunctionsImpl implements IEnforceActivitiesAndRolesFunctionsImpl {

    public static final IEnforceActivitiesAndRolesFunctionsImpl INSTANCE = new EnforceActivitiesAndRolesFunctionsImpl();

    private EnforceActivitiesAndRolesFunctionsImpl() {}

  }
  
  public static class EnforceActivitiesAndRolesFunctions {

    private EnforceActivitiesAndRolesFunctions() {}

  }

  public static interface IEnforcegMSAServiceAccountsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d6bfa564-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("d6bfcc79-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IEnforcegMSAServiceAccountsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnforcegMSAServiceAccountsFunctionsImpl implements IEnforcegMSAServiceAccountsFunctionsImpl {

    public static final IEnforcegMSAServiceAccountsFunctionsImpl INSTANCE = new EnforcegMSAServiceAccountsFunctionsImpl();

    private EnforcegMSAServiceAccountsFunctionsImpl() {}

  }
  
  public static class EnforcegMSAServiceAccountsFunctions {

    private EnforcegMSAServiceAccountsFunctions() {}

  }

  public static interface IEnforceServiceAccountsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1d916f4d-0661-11f0-ad7c-c72b7a763977")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("1d916fb7-0661-11f0-ad7c-c72b7a763977")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IEnforceServiceAccountsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EnforceServiceAccountsFunctionsImpl implements IEnforceServiceAccountsFunctionsImpl {

    public static final IEnforceServiceAccountsFunctionsImpl INSTANCE = new EnforceServiceAccountsFunctionsImpl();

    private EnforceServiceAccountsFunctionsImpl() {}

  }
  
  public static class EnforceServiceAccountsFunctions {

    private EnforceServiceAccountsFunctions() {}

  }

  public static interface IDiskPartFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8481f7a0-07f4-11f0-bc12-1bbda1d7028e")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("9b9c94d3-07f4-11f0-bc12-1bbda1d7028e")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IDiskPartFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DiskPartFunctionsImpl implements IDiskPartFunctionsImpl {

    public static final IDiskPartFunctionsImpl INSTANCE = new DiskPartFunctionsImpl();

    private DiskPartFunctionsImpl() {}

  }
  
  public static class DiskPartFunctions {

    private DiskPartFunctions() {}

  }

  public static interface IResizeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b5e14d4a-096a-11f0-bcb3-43fb1d3f2da5")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("b5e14d73-096a-11f0-bcb3-43fb1d3f2da5")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IResizeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ResizeFunctionsImpl implements IResizeFunctionsImpl {

    public static final IResizeFunctionsImpl INSTANCE = new ResizeFunctionsImpl();

    private ResizeFunctionsImpl() {}

  }
  
  public static class ResizeFunctions {

    private ResizeFunctions() {}

  }

  public static interface ILocalFwFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2c29df4e-0bd0-11f0-95b9-95d0cc9a328a")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("2c29df4f-0bd0-11f0-95b9-95d0cc9a328a")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ILocalFwFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalFwFunctionsImpl implements ILocalFwFunctionsImpl {

    public static final ILocalFwFunctionsImpl INSTANCE = new LocalFwFunctionsImpl();

    private LocalFwFunctionsImpl() {}

  }
  
  public static class LocalFwFunctions {

    private LocalFwFunctions() {}

  }

  public static interface IRouteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b9ae86bb-1061-11f0-b378-11a495632127")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("b9aead07-1061-11f0-b378-11a495632127")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IRouteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RouteFunctionsImpl implements IRouteFunctionsImpl {

    public static final IRouteFunctionsImpl INSTANCE = new RouteFunctionsImpl();

    private RouteFunctionsImpl() {}

  }
  
  public static class RouteFunctions {

    private RouteFunctions() {}

  }

  public static interface IUserrightsassignmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("06aae566-1070-11f0-b378-11a495632127")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("06aae58b-1070-11f0-b378-11a495632127")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IUserrightsassignmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class UserrightsassignmentFunctionsImpl implements IUserrightsassignmentFunctionsImpl {

    public static final IUserrightsassignmentFunctionsImpl INSTANCE = new UserrightsassignmentFunctionsImpl();

    private UserrightsassignmentFunctionsImpl() {}

  }
  
  public static class UserrightsassignmentFunctions {

    private UserrightsassignmentFunctions() {}

  }

  public static interface ILocalGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("472117b1-107e-11f0-b378-11a495632127")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("472117e8-107e-11f0-b378-11a495632127")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ILocalGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalGroupsFunctionsImpl implements ILocalGroupsFunctionsImpl {

    public static final ILocalGroupsFunctionsImpl INSTANCE = new LocalGroupsFunctionsImpl();

    private LocalGroupsFunctionsImpl() {}

  }
  
  public static class LocalGroupsFunctions {

    private LocalGroupsFunctions() {}

  }

  public static interface IServiceConfigFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11c8318b-1086-11f0-b378-11a495632127")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("11c858c7-1086-11f0-b378-11a495632127")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IServiceConfigFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceConfigFunctionsImpl implements IServiceConfigFunctionsImpl {

    public static final IServiceConfigFunctionsImpl INSTANCE = new ServiceConfigFunctionsImpl();

    private ServiceConfigFunctionsImpl() {}

  }
  
  public static class ServiceConfigFunctions {

    private ServiceConfigFunctions() {}

  }

  public static interface INetbiosFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f68c6ca9-1088-11f0-b378-11a495632127")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("f68c6cbc-1088-11f0-b378-11a495632127")
    public java.lang.String ClassImplementation();

  }
  
  public static interface INetbiosFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NetbiosFunctionsImpl implements INetbiosFunctionsImpl {

    public static final INetbiosFunctionsImpl INSTANCE = new NetbiosFunctionsImpl();

    private NetbiosFunctionsImpl() {}

  }
  
  public static class NetbiosFunctions {

    private NetbiosFunctions() {}

  }

  public static interface IHardeningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d1d89aee-108a-11f0-b378-11a495632127")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("d1d89af8-108a-11f0-b378-11a495632127")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IHardeningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HardeningFunctionsImpl implements IHardeningFunctionsImpl {

    public static final IHardeningFunctionsImpl INSTANCE = new HardeningFunctionsImpl();

    private HardeningFunctionsImpl() {}

  }
  
  public static class HardeningFunctions {

    private HardeningFunctions() {}

  }

  public static interface IRegistryFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("494d99da-1091-11f0-b378-11a495632127")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("494d9a57-1091-11f0-b378-11a495632127")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IRegistryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RegistryFunctionsImpl implements IRegistryFunctionsImpl {

    public static final IRegistryFunctionsImpl INSTANCE = new RegistryFunctionsImpl();

    private RegistryFunctionsImpl() {}

  }
  
  public static class RegistryFunctions {

    private RegistryFunctions() {}

  }

  public static interface IWineventlogFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("59ca0b1a-1095-11f0-b378-11a495632127")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("59ca0b5c-1095-11f0-b378-11a495632127")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IWineventlogFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WineventlogFunctionsImpl implements IWineventlogFunctionsImpl {

    public static final IWineventlogFunctionsImpl INSTANCE = new WineventlogFunctionsImpl();

    private WineventlogFunctionsImpl() {}

  }
  
  public static class WineventlogFunctions {

    private WineventlogFunctions() {}

  }

  public static interface IServicesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("46eab12b-1071-11f0-b378-11a495632127")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("46eab156-1071-11f0-b378-11a495632127")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IServicesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServicesFunctionsImpl implements IServicesFunctionsImpl {

    public static final IServicesFunctionsImpl INSTANCE = new ServicesFunctionsImpl();

    private ServicesFunctionsImpl() {}

  }
  
  public static class ServicesFunctions {

    private ServicesFunctions() {}

  }

  public static interface IInstallSoftwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b6b4d48-1131-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("8b6b4d62-1131-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IInstallSoftwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallSoftwareFunctionsImpl implements IInstallSoftwareFunctionsImpl {

    public static final IInstallSoftwareFunctionsImpl INSTANCE = new InstallSoftwareFunctionsImpl();

    private InstallSoftwareFunctionsImpl() {}

  }
  
  public static class InstallSoftwareFunctions {

    private InstallSoftwareFunctions() {}

  }

  public static interface IInstallSQLServerFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("24201250-1151-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("242039b9-1151-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IInstallSQLServerFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallSQLServerFunctionsImpl implements IInstallSQLServerFunctionsImpl {

    public static final IInstallSQLServerFunctionsImpl INSTANCE = new InstallSQLServerFunctionsImpl();

    private InstallSQLServerFunctionsImpl() {}

  }
  
  public static class InstallSQLServerFunctions {

    private InstallSQLServerFunctions() {}

  }

  public static interface IInstallIISFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a4b4d359-115d-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("a4b4d395-115d-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IInstallIISFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallIISFunctionsImpl implements IInstallIISFunctionsImpl {

    public static final IInstallIISFunctionsImpl INSTANCE = new InstallIISFunctionsImpl();

    private InstallIISFunctionsImpl() {}

  }
  
  public static class InstallIISFunctions {

    private InstallIISFunctions() {}

  }

  public static interface IIISMimelistFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b3974077-115d-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("b39740b3-115d-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IIISMimelistFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class IISMimelistFunctionsImpl implements IIISMimelistFunctionsImpl {

    public static final IIISMimelistFunctionsImpl INSTANCE = new IISMimelistFunctionsImpl();

    private IISMimelistFunctionsImpl() {}

  }
  
  public static class IISMimelistFunctions {

    private IISMimelistFunctions() {}

  }

  public static interface IServiceAccountConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11f9f5b0-0bb7-11f0-95b9-95d0cc9a328a")
    public java.lang.String OU();

  }
  
  public static interface IServiceAccountConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountConfigurationFunctionsImpl implements IServiceAccountConfigurationFunctionsImpl {

    public static final IServiceAccountConfigurationFunctionsImpl INSTANCE = new ServiceAccountConfigurationFunctionsImpl();

    private ServiceAccountConfigurationFunctionsImpl() {}

  }
  
  public static class ServiceAccountConfigurationFunctions {

    private ServiceAccountConfigurationFunctions() {}

  }

  public static interface IInstallChocoSoftwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("76d55945-13bf-11f0-b664-c7b92124985d")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("76d55948-13bf-11f0-b664-c7b92124985d")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IInstallChocoSoftwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallChocoSoftwareFunctionsImpl implements IInstallChocoSoftwareFunctionsImpl {

    public static final IInstallChocoSoftwareFunctionsImpl INSTANCE = new InstallChocoSoftwareFunctionsImpl();

    private InstallChocoSoftwareFunctionsImpl() {}

  }
  
  public static class InstallChocoSoftwareFunctions {

    private InstallChocoSoftwareFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fab6dfde-0014-11f0-945c-87b19aec41f4,+CgYGmQPJ0gQZVxJ7RLpCrCzioQ=] */
