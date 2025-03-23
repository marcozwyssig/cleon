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

  }
  
  public static interface IAbstractConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("66b61ba4-0631-11f0-ad7c-c72b7a763977")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> Filter(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList);

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

  }
  
  public static class AbstractConfigurationFunctions {

    private AbstractConfigurationFunctions() {}

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> Filter(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> abstractConfigurationList) {
      return DynamicResourceUtil.invoke(IAbstractConfigurationFunctionsImpl.class, AbstractConfigurationFunctionsImpl.INSTANCE, abstractConfigurationList).Filter(abstractConfigurationList);
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

    @IDynamicResourceExtension.MethodId("c5647390-05a6-11f0-a7b1-53303e9b84a9")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode Environment();

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

    @IDynamicResourceExtension.MethodId("df54999c-0627-11f0-ad7c-c72b7a763977")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode Environment();

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

    @IDynamicResourceExtension.MethodId("1d916fc4-0661-11f0-ad7c-c72b7a763977")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode Environment();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fab6dfde-0014-11f0-945c-87b19aec41f4,redEIVQOSZpPFTkc0YRqjl79SKc=] */
