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
/* End Protected Region   [[fab6dfde-0014-11f0-945c-87b19aec41f4,imports]] */

public class FunctionSpace_Puppet_Detailspecification {

  /* Begin Protected Region [[fab6dfde-0014-11f0-945c-87b19aec41f4]] */
  
  /* End Protected Region   [[fab6dfde-0014-11f0-945c-87b19aec41f4]] */


  public static interface IAbstractSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eb81e13a-0026-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileNameYaml();

    @IDynamicResourceExtension.MethodId("0a676398-067a-11f0-9dcf-ff118a4f827f")
    public java.lang.String FullFileNameEyaml();

    @IDynamicResourceExtension.MethodId("66b61ba4-0631-11f0-ad7c-c72b7a763977")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> FilterListYaml();

    @IDynamicResourceExtension.MethodId("0dfa21b8-5811-11f0-b941-05f03c57551d")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> FilterListEyaml();

    @IDynamicResourceExtension.MethodId("ed913d3a-0a5d-11f0-a414-9b52960625e5")
    public java.lang.String CustomValues();

    @IDynamicResourceExtension.MethodId("039f4aad-580f-11f0-b941-05f03c57551d")
    public java.lang.Boolean FilterYaml();

    @IDynamicResourceExtension.MethodId("1168460a-5811-11f0-b941-05f03c57551d")
    public java.lang.Boolean FilterEyaml();

  }
  
  public static interface IAbstractSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("66b61ba4-0631-11f0-ad7c-c72b7a763977")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> FilterListYaml(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> abstractSpecificationList);

    @IDynamicResourceExtension.MethodId("0dfa21b8-5811-11f0-b941-05f03c57551d")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> FilterListEyaml(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> abstractSpecificationList);

    @IDynamicResourceExtension.MethodId("ed913d3a-0a5d-11f0-a414-9b52960625e5")
    public java.lang.String CustomValues(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification abstractSpecification);

    @IDynamicResourceExtension.MethodId("039f4aad-580f-11f0-b941-05f03c57551d")
    public java.lang.Boolean FilterYaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification abstractSpecification);

    @IDynamicResourceExtension.MethodId("1168460a-5811-11f0-b941-05f03c57551d")
    public java.lang.Boolean FilterEyaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification abstractSpecification);

  }
  
  public static class AbstractSpecificationFunctionsImpl implements IAbstractSpecificationFunctionsImpl {

    public static final IAbstractSpecificationFunctionsImpl INSTANCE = new AbstractSpecificationFunctionsImpl();

    private AbstractSpecificationFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> FilterListYaml(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> abstractSpecificationList) {
      /* Begin Protected Region [[66b61ba4-0631-11f0-ad7c-c72b7a763977]] */
    	return abstractSpecificationList.stream().filter(x -> x.extension(IAbstractSpecificationFunctions.class).FilterYaml()).toList();
      /* End Protected Region   [[66b61ba4-0631-11f0-ad7c-c72b7a763977]] */
    }

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> FilterListEyaml(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> abstractSpecificationList) {
      /* Begin Protected Region [[0dfa21b8-5811-11f0-b941-05f03c57551d]] */
    	return abstractSpecificationList.stream().filter(x -> x.extension(IAbstractSpecificationFunctions.class).FilterEyaml()).toList();   
      /* End Protected Region   [[0dfa21b8-5811-11f0-b941-05f03c57551d]] */
    }

    @Override
    public java.lang.String CustomValues(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification abstractSpecification) {
      return null;
    }

    @Override
    public java.lang.Boolean FilterYaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification abstractSpecification) {
      return true;
    }

    @Override
    public java.lang.Boolean FilterEyaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification abstractSpecification) {
      return false;
    }

  }
  
  public static class AbstractSpecificationFunctions {

    private AbstractSpecificationFunctions() {}

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> FilterListYaml(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> abstractSpecificationList) {
      return DynamicResourceUtil.invoke(IAbstractSpecificationFunctionsImpl.class, AbstractSpecificationFunctionsImpl.INSTANCE, abstractSpecificationList).FilterListYaml(abstractSpecificationList);
    }

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> FilterListEyaml(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification> abstractSpecificationList) {
      return DynamicResourceUtil.invoke(IAbstractSpecificationFunctionsImpl.class, AbstractSpecificationFunctionsImpl.INSTANCE, abstractSpecificationList).FilterListEyaml(abstractSpecificationList);
    }

    public static java.lang.String CustomValues(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification abstractSpecification) {
      return DynamicResourceUtil.invoke(IAbstractSpecificationFunctionsImpl.class, AbstractSpecificationFunctionsImpl.INSTANCE, abstractSpecification).CustomValues(abstractSpecification);
    }

    public static java.lang.Boolean FilterYaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification abstractSpecification) {
      return DynamicResourceUtil.invoke(IAbstractSpecificationFunctionsImpl.class, AbstractSpecificationFunctionsImpl.INSTANCE, abstractSpecification).FilterYaml(abstractSpecification);
    }

    public static java.lang.Boolean FilterEyaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification abstractSpecification) {
      return DynamicResourceUtil.invoke(IAbstractSpecificationFunctionsImpl.class, AbstractSpecificationFunctionsImpl.INSTANCE, abstractSpecification).FilterEyaml(abstractSpecification);
    }

  }

  public static interface IEnvironmentSpecificationsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6df44aea-5811-11f0-b941-05f03c57551d")
    public java.lang.Boolean FilterEyaml();

  }
  
  public static interface IEnvironmentSpecificationsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("6df44aea-5811-11f0-b941-05f03c57551d")
    public java.lang.Boolean FilterEyaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IEnvironmentSpecifications environmentSpecifications);

  }
  
  public static class EnvironmentSpecificationsFunctionsImpl implements IEnvironmentSpecificationsFunctionsImpl {

    public static final IEnvironmentSpecificationsFunctionsImpl INSTANCE = new EnvironmentSpecificationsFunctionsImpl();

    private EnvironmentSpecificationsFunctionsImpl() {}

    @Override
    public java.lang.Boolean FilterEyaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IEnvironmentSpecifications environmentSpecifications) {
      return true;
    }

  }
  
  public static class EnvironmentSpecificationsFunctions {

    private EnvironmentSpecificationsFunctions() {}

    public static java.lang.Boolean FilterEyaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.env.javamodel.IEnvironmentSpecifications environmentSpecifications) {
      return DynamicResourceUtil.invoke(IEnvironmentSpecificationsFunctionsImpl.class, EnvironmentSpecificationsFunctionsImpl.INSTANCE, environmentSpecifications).FilterEyaml(environmentSpecifications);
    }

  }

  public static interface IAbstractListOfSysCfgCategorySpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("32325ba5-580f-11f0-b941-05f03c57551d")
    public java.lang.Boolean FilterYaml();

  }
  
  public static interface IAbstractListOfSysCfgCategorySpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("32325ba5-580f-11f0-b941-05f03c57551d")
    public java.lang.Boolean FilterYaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.IAbstractListOfSysCfgCategorySpecification abstractListOfSysCfgCategorySpecification);

  }
  
  public static class AbstractListOfSysCfgCategorySpecificationFunctionsImpl implements IAbstractListOfSysCfgCategorySpecificationFunctionsImpl {

    public static final IAbstractListOfSysCfgCategorySpecificationFunctionsImpl INSTANCE = new AbstractListOfSysCfgCategorySpecificationFunctionsImpl();

    private AbstractListOfSysCfgCategorySpecificationFunctionsImpl() {}

    @Override
    public java.lang.Boolean FilterYaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.IAbstractListOfSysCfgCategorySpecification abstractListOfSysCfgCategorySpecification) {
      /* Begin Protected Region [[32325ba5-580f-11f0-b941-05f03c57551d]] */
		final var sysCfg = abstractListOfSysCfgCategorySpecification.extension(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.FunctionSpace_SysCfgSpec.IAbstractListOfSysCfgCategorySpecificationFunctions.class).SysCfg();
		final var sysCfgFunc = sysCfg.extension(ISystemConfigurationFunctions.class);
		return sysCfgFunc.IsDependsOnLinuxOrWindows() || sysCfg instanceof IOperatingSystemConfiguration;
      /* End Protected Region   [[32325ba5-580f-11f0-b941-05f03c57551d]] */
    }

  }
  
  public static class AbstractListOfSysCfgCategorySpecificationFunctions {

    private AbstractListOfSysCfgCategorySpecificationFunctions() {}

    public static java.lang.Boolean FilterYaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.IAbstractListOfSysCfgCategorySpecification abstractListOfSysCfgCategorySpecification) {
      return DynamicResourceUtil.invoke(IAbstractListOfSysCfgCategorySpecificationFunctionsImpl.class, AbstractListOfSysCfgCategorySpecificationFunctionsImpl.INSTANCE, abstractListOfSysCfgCategorySpecification).FilterYaml(abstractListOfSysCfgCategorySpecification);
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

  public static interface ISysCmpSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1fb18abc-5812-11f0-b941-05f03c57551d")
    public java.lang.Boolean FilterYaml();

  }
  
  public static interface ISysCmpSpecificationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1fb18abc-5812-11f0-b941-05f03c57551d")
    public java.lang.Boolean FilterYaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.ISysCmpSpecification sysCmpSpecification);

  }
  
  public static class SysCmpSpecificationFunctionsImpl implements ISysCmpSpecificationFunctionsImpl {

    public static final ISysCmpSpecificationFunctionsImpl INSTANCE = new SysCmpSpecificationFunctionsImpl();

    private SysCmpSpecificationFunctionsImpl() {}

    @Override
    public java.lang.Boolean FilterYaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.ISysCmpSpecification sysCmpSpecification) {
      return false;
    }

  }
  
  public static class SysCmpSpecificationFunctions {

    private SysCmpSpecificationFunctions() {}

    public static java.lang.Boolean FilterYaml(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.ISysCmpSpecification sysCmpSpecification) {
      return DynamicResourceUtil.invoke(ISysCmpSpecificationFunctionsImpl.class, SysCmpSpecificationFunctionsImpl.INSTANCE, sysCmpSpecification).FilterYaml(sysCmpSpecification);
    }

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

  public static interface IFeaturesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("37706e48-001a-11f0-945c-87b19aec41f4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("37706e5b-001a-11f0-945c-87b19aec41f4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IFeaturesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FeaturesFunctionsImpl implements IFeaturesFunctionsImpl {

    public static final IFeaturesFunctionsImpl INSTANCE = new FeaturesFunctionsImpl();

    private FeaturesFunctionsImpl() {}

  }
  
  public static class FeaturesFunctions {

    private FeaturesFunctions() {}

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

  public static interface IOUFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c12e6786-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("c12e67ae-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IOUFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OUFunctionsImpl implements IOUFunctionsImpl {

    public static final IOUFunctionsImpl INSTANCE = new OUFunctionsImpl();

    private OUFunctionsImpl() {}

  }
  
  public static class OUFunctions {

    private OUFunctions() {}

  }

  public static interface IActivitiesAndRolesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cc6e31f8-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("cc6e31fd-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IActivitiesAndRolesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivitiesAndRolesFunctionsImpl implements IActivitiesAndRolesFunctionsImpl {

    public static final IActivitiesAndRolesFunctionsImpl INSTANCE = new ActivitiesAndRolesFunctionsImpl();

    private ActivitiesAndRolesFunctionsImpl() {}

  }
  
  public static class ActivitiesAndRolesFunctions {

    private ActivitiesAndRolesFunctions() {}

  }

  public static interface IGMSAServiceAccountsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d6bfa564-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("d6bfcc79-05a2-11f0-a294-67d88c30f2e4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IGMSAServiceAccountsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GMSAServiceAccountsFunctionsImpl implements IGMSAServiceAccountsFunctionsImpl {

    public static final IGMSAServiceAccountsFunctionsImpl INSTANCE = new GMSAServiceAccountsFunctionsImpl();

    private GMSAServiceAccountsFunctionsImpl() {}

  }
  
  public static class GMSAServiceAccountsFunctions {

    private GMSAServiceAccountsFunctions() {}

  }

  public static interface IServiceAccountsAndTestUserFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1d916f4d-0661-11f0-ad7c-c72b7a763977")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("1d916fb7-0661-11f0-ad7c-c72b7a763977")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IServiceAccountsAndTestUserFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountsAndTestUserFunctionsImpl implements IServiceAccountsAndTestUserFunctionsImpl {

    public static final IServiceAccountsAndTestUserFunctionsImpl INSTANCE = new ServiceAccountsAndTestUserFunctionsImpl();

    private ServiceAccountsAndTestUserFunctionsImpl() {}

  }
  
  public static class ServiceAccountsAndTestUserFunctions {

    private ServiceAccountsAndTestUserFunctions() {}

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

  public static interface ISetWindowsEditionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6440cc82-2b0e-11f0-a774-db5eb4cfeffd")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("6440cca7-2b0e-11f0-a774-db5eb4cfeffd")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ISetWindowsEditionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SetWindowsEditionFunctionsImpl implements ISetWindowsEditionFunctionsImpl {

    public static final ISetWindowsEditionFunctionsImpl INSTANCE = new SetWindowsEditionFunctionsImpl();

    private SetWindowsEditionFunctionsImpl() {}

  }
  
  public static class SetWindowsEditionFunctions {

    private SetWindowsEditionFunctions() {}

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

  public static interface IRemoteDesktopHardeningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d1d89aee-108a-11f0-b378-11a495632127")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("d1d89af8-108a-11f0-b378-11a495632127")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IRemoteDesktopHardeningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RemoteDesktopHardeningFunctionsImpl implements IRemoteDesktopHardeningFunctionsImpl {

    public static final IRemoteDesktopHardeningFunctionsImpl INSTANCE = new RemoteDesktopHardeningFunctionsImpl();

    private RemoteDesktopHardeningFunctionsImpl() {}

  }
  
  public static class RemoteDesktopHardeningFunctions {

    private RemoteDesktopHardeningFunctions() {}

  }

  public static interface IRemoteDesktopLicenseFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("78986586-79da-11f0-be97-ebecaa61a3a3")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("78988c25-79da-11f0-be97-ebecaa61a3a3")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IRemoteDesktopLicenseFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RemoteDesktopLicenseFunctionsImpl implements IRemoteDesktopLicenseFunctionsImpl {

    public static final IRemoteDesktopLicenseFunctionsImpl INSTANCE = new RemoteDesktopLicenseFunctionsImpl();

    private RemoteDesktopLicenseFunctionsImpl() {}

  }
  
  public static class RemoteDesktopLicenseFunctions {

    private RemoteDesktopLicenseFunctions() {}

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

  public static interface ISoftwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8b6b4d48-1131-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("8b6b4d62-1131-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ISoftwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SoftwareFunctionsImpl implements ISoftwareFunctionsImpl {

    public static final ISoftwareFunctionsImpl INSTANCE = new SoftwareFunctionsImpl();

    private SoftwareFunctionsImpl() {}

  }
  
  public static class SoftwareFunctions {

    private SoftwareFunctions() {}

  }

  public static interface ISQLServerFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("24201250-1151-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("242039b9-1151-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ISQLServerFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SQLServerFunctionsImpl implements ISQLServerFunctionsImpl {

    public static final ISQLServerFunctionsImpl INSTANCE = new SQLServerFunctionsImpl();

    private SQLServerFunctionsImpl() {}

  }
  
  public static class SQLServerFunctions {

    private SQLServerFunctions() {}

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

  public static interface IDnsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8feab7dd-151b-11f0-8fa5-ad696b254e17")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("8feab800-151b-11f0-8fa5-ad696b254e17")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IDnsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DnsFunctionsImpl implements IDnsFunctionsImpl {

    public static final IDnsFunctionsImpl INSTANCE = new DnsFunctionsImpl();

    private DnsFunctionsImpl() {}

  }
  
  public static class DnsFunctions {

    private DnsFunctions() {}

  }

  public static interface IAbstractAccountConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3d5f06aa-272b-11f0-8098-59f455ea82af")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel.IServiceAccountsAndTestUser ConfigureServiceAccountAndTestUsers();

    @IDynamicResourceExtension.MethodId("69875858-272b-11f0-8098-59f455ea82af")
    public java.lang.String OU();

    @IDynamicResourceExtension.MethodId("2e2709e7-272c-11f0-8098-59f455ea82af")
    public java.lang.String InOU();

    @IDynamicResourceExtension.MethodId("0336085c-2743-11f0-bc3e-fdd30b5cbdec")
    public java.lang.String Password();

    @IDynamicResourceExtension.MethodId("3544d1a3-2743-11f0-bc3e-fdd30b5cbdec")
    public java.lang.String AccountType();

  }
  
  public static interface IAbstractAccountConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractAccountConfigurationFunctionsImpl implements IAbstractAccountConfigurationFunctionsImpl {

    public static final IAbstractAccountConfigurationFunctionsImpl INSTANCE = new AbstractAccountConfigurationFunctionsImpl();

    private AbstractAccountConfigurationFunctionsImpl() {}

  }
  
  public static class AbstractAccountConfigurationFunctions {

    private AbstractAccountConfigurationFunctions() {}

  }

  public static interface IServiceAccountConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0c46b4b1-272c-11f0-8098-59f455ea82af")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel.IServiceAccountsAndTestUser ConfigureServiceAccountAndTestUsers();

    @IDynamicResourceExtension.MethodId("415d19ab-272c-11f0-8098-59f455ea82af")
    public java.lang.String InOU();

    @IDynamicResourceExtension.MethodId("3eb1d813-2743-11f0-bc3e-fdd30b5cbdec")
    public java.lang.String AccountType();

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

  public static interface ITestAccountConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("14a224b0-272c-11f0-8098-59f455ea82af")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel.IServiceAccountsAndTestUser ConfigureServiceAccountAndTestUsers();

    @IDynamicResourceExtension.MethodId("4b35656c-272c-11f0-8098-59f455ea82af")
    public java.lang.String InOU();

    @IDynamicResourceExtension.MethodId("4b15896e-2743-11f0-bc3e-fdd30b5cbdec")
    public java.lang.String AccountType();

  }
  
  public static interface ITestAccountConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestAccountConfigurationFunctionsImpl implements ITestAccountConfigurationFunctionsImpl {

    public static final ITestAccountConfigurationFunctionsImpl INSTANCE = new TestAccountConfigurationFunctionsImpl();

    private TestAccountConfigurationFunctionsImpl() {}

  }
  
  public static class TestAccountConfigurationFunctions {

    private TestAccountConfigurationFunctions() {}

  }

  public static interface IChocoSoftwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("76d55945-13bf-11f0-b664-c7b92124985d")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("76d55948-13bf-11f0-b664-c7b92124985d")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IChocoSoftwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ChocoSoftwareFunctionsImpl implements IChocoSoftwareFunctionsImpl {

    public static final IChocoSoftwareFunctionsImpl INSTANCE = new ChocoSoftwareFunctionsImpl();

    private ChocoSoftwareFunctionsImpl() {}

  }
  
  public static class ChocoSoftwareFunctions {

    private ChocoSoftwareFunctions() {}

  }

  public static interface IWorkplaceLinksFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7ba4f327-2cac-11f0-851f-3f768d79c0eb")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("7ba4f364-2cac-11f0-851f-3f768d79c0eb")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IWorkplaceLinksFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WorkplaceLinksFunctionsImpl implements IWorkplaceLinksFunctionsImpl {

    public static final IWorkplaceLinksFunctionsImpl INSTANCE = new WorkplaceLinksFunctionsImpl();

    private WorkplaceLinksFunctionsImpl() {}

  }
  
  public static class WorkplaceLinksFunctions {

    private WorkplaceLinksFunctions() {}

  }

  public static interface IAbstractComputerGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("004d3e73-2ccf-11f0-851f-3f768d79c0eb")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("004d3f30-2ccf-11f0-851f-3f768d79c0eb")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IAbstractComputerGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractComputerGroupsFunctionsImpl implements IAbstractComputerGroupsFunctionsImpl {

    public static final IAbstractComputerGroupsFunctionsImpl INSTANCE = new AbstractComputerGroupsFunctionsImpl();

    private AbstractComputerGroupsFunctionsImpl() {}

  }
  
  public static class AbstractComputerGroupsFunctions {

    private AbstractComputerGroupsFunctions() {}

  }

  public static interface IEpoComputerGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("17482894-2cd0-11f0-851f-3f768d79c0eb")
    public java.lang.String ClassDefinition();

  }
  
  public static interface IEpoComputerGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class EpoComputerGroupsFunctionsImpl implements IEpoComputerGroupsFunctionsImpl {

    public static final IEpoComputerGroupsFunctionsImpl INSTANCE = new EpoComputerGroupsFunctionsImpl();

    private EpoComputerGroupsFunctionsImpl() {}

  }
  
  public static class EpoComputerGroupsFunctions {

    private EpoComputerGroupsFunctions() {}

  }

  public static interface IWusComputerGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1807cf7b-2cd0-11f0-851f-3f768d79c0eb")
    public java.lang.String ClassDefinition();

  }
  
  public static interface IWusComputerGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WusComputerGroupsFunctionsImpl implements IWusComputerGroupsFunctionsImpl {

    public static final IWusComputerGroupsFunctionsImpl INSTANCE = new WusComputerGroupsFunctionsImpl();

    private WusComputerGroupsFunctionsImpl() {}

  }
  
  public static class WusComputerGroupsFunctions {

    private WusComputerGroupsFunctions() {}

  }

  public static interface ILocalFileFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ab868c68-1b5f-11f0-9c3a-8502b2fb88fb")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("ab868c92-1b5f-11f0-9c3a-8502b2fb88fb")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ILocalFileFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalFileFunctionsImpl implements ILocalFileFunctionsImpl {

    public static final ILocalFileFunctionsImpl INSTANCE = new LocalFileFunctionsImpl();

    private LocalFileFunctionsImpl() {}

  }
  
  public static class LocalFileFunctions {

    private LocalFileFunctions() {}

  }

  public static interface ILocalRepoFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3412cf4d-1b65-11f0-9c3a-8502b2fb88fb")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("3412cf8a-1b65-11f0-9c3a-8502b2fb88fb")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ILocalRepoFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalRepoFunctionsImpl implements ILocalRepoFunctionsImpl {

    public static final ILocalRepoFunctionsImpl INSTANCE = new LocalRepoFunctionsImpl();

    private LocalRepoFunctionsImpl() {}

  }
  
  public static class LocalRepoFunctions {

    private LocalRepoFunctions() {}

  }

  public static interface IFoldersAndPuppetCleanupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("98bf116f-1b69-11f0-9c3a-8502b2fb88fb")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("98bf119b-1b69-11f0-9c3a-8502b2fb88fb")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IFoldersAndPuppetCleanupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FoldersAndPuppetCleanupFunctionsImpl implements IFoldersAndPuppetCleanupFunctionsImpl {

    public static final IFoldersAndPuppetCleanupFunctionsImpl INSTANCE = new FoldersAndPuppetCleanupFunctionsImpl();

    private FoldersAndPuppetCleanupFunctionsImpl() {}

  }
  
  public static class FoldersAndPuppetCleanupFunctions {

    private FoldersAndPuppetCleanupFunctions() {}

  }

  public static interface IFoldersCleanupTaskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d8fb5e06-2759-11f0-b32f-851840d4a5f4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("d8fb5e09-2759-11f0-b32f-851840d4a5f4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IFoldersCleanupTaskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class FoldersCleanupTaskFunctionsImpl implements IFoldersCleanupTaskFunctionsImpl {

    public static final IFoldersCleanupTaskFunctionsImpl INSTANCE = new FoldersCleanupTaskFunctionsImpl();

    private FoldersCleanupTaskFunctionsImpl() {}

  }
  
  public static class FoldersCleanupTaskFunctions {

    private FoldersCleanupTaskFunctions() {}

  }

  public static interface IRemoveUserCertsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7654afb4-1b6a-11f0-9c3a-8502b2fb88fb")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("7654afff-1b6a-11f0-9c3a-8502b2fb88fb")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IRemoveUserCertsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RemoveUserCertsFunctionsImpl implements IRemoveUserCertsFunctionsImpl {

    public static final IRemoveUserCertsFunctionsImpl INSTANCE = new RemoveUserCertsFunctionsImpl();

    private RemoveUserCertsFunctionsImpl() {}

  }
  
  public static class RemoveUserCertsFunctions {

    private RemoveUserCertsFunctions() {}

  }

  public static interface IRegistryKeysFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("64572ace-1b6b-11f0-9c3a-8502b2fb88fb")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("64572ae3-1b6b-11f0-9c3a-8502b2fb88fb")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IRegistryKeysFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RegistryKeysFunctionsImpl implements IRegistryKeysFunctionsImpl {

    public static final IRegistryKeysFunctionsImpl INSTANCE = new RegistryKeysFunctionsImpl();

    private RegistryKeysFunctionsImpl() {}

  }
  
  public static class RegistryKeysFunctions {

    private RegistryKeysFunctions() {}

  }

  public static interface IAdJoinFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("539f2e94-2140-11f0-83ae-df5418a109a4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("539f2e97-2140-11f0-83ae-df5418a109a4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IAdJoinFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AdJoinFunctionsImpl implements IAdJoinFunctionsImpl {

    public static final IAdJoinFunctionsImpl INSTANCE = new AdJoinFunctionsImpl();

    private AdJoinFunctionsImpl() {}

  }
  
  public static class AdJoinFunctions {

    private AdJoinFunctions() {}

  }

  public static interface IExtendRootFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ed41afd5-21a9-11f0-83ae-df5418a109a4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("ed41afd8-21a9-11f0-83ae-df5418a109a4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IExtendRootFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ExtendRootFunctionsImpl implements IExtendRootFunctionsImpl {

    public static final IExtendRootFunctionsImpl INSTANCE = new ExtendRootFunctionsImpl();

    private ExtendRootFunctionsImpl() {}

  }
  
  public static class ExtendRootFunctions {

    private ExtendRootFunctions() {}

  }

  public static interface IConfigureRepoFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9b4a558e-21e6-11f0-94ff-8381b76104b1")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("9b4a55b9-21e6-11f0-94ff-8381b76104b1")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IConfigureRepoFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConfigureRepoFunctionsImpl implements IConfigureRepoFunctionsImpl {

    public static final IConfigureRepoFunctionsImpl INSTANCE = new ConfigureRepoFunctionsImpl();

    private ConfigureRepoFunctionsImpl() {}

  }
  
  public static class ConfigureRepoFunctions {

    private ConfigureRepoFunctions() {}

  }

  public static interface IConfigureSSHFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0507ae56-21d7-11f0-83ae-df5418a109a4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("0507ae59-21d7-11f0-83ae-df5418a109a4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IConfigureSSHFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConfigureSSHFunctionsImpl implements IConfigureSSHFunctionsImpl {

    public static final IConfigureSSHFunctionsImpl INSTANCE = new ConfigureSSHFunctionsImpl();

    private ConfigureSSHFunctionsImpl() {}

  }
  
  public static class ConfigureSSHFunctions {

    private ConfigureSSHFunctions() {}

  }

  public static interface IConfigureDNSResolverFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("18d7f476-21ad-11f0-83ae-df5418a109a4")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("18d7f4a1-21ad-11f0-83ae-df5418a109a4")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IConfigureDNSResolverFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ConfigureDNSResolverFunctionsImpl implements IConfigureDNSResolverFunctionsImpl {

    public static final IConfigureDNSResolverFunctionsImpl INSTANCE = new ConfigureDNSResolverFunctionsImpl();

    private ConfigureDNSResolverFunctionsImpl() {}

  }
  
  public static class ConfigureDNSResolverFunctions {

    private ConfigureDNSResolverFunctions() {}

  }

  public static interface ILocalUsersFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("82d4ca08-2bdf-11f0-9ce1-09b647a63c7b")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("82d4f18c-2bdf-11f0-9ce1-09b647a63c7b")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ILocalUsersFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalUsersFunctionsImpl implements ILocalUsersFunctionsImpl {

    public static final ILocalUsersFunctionsImpl INSTANCE = new LocalUsersFunctionsImpl();

    private LocalUsersFunctionsImpl() {}

  }
  
  public static class LocalUsersFunctions {

    private LocalUsersFunctions() {}

  }

  public static interface IDotNetFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e2d345d5-2c14-11f0-8b7a-6dfeafb0166d")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("e2d36c12-2c14-11f0-8b7a-6dfeafb0166d")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IDotNetFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DotNetFunctionsImpl implements IDotNetFunctionsImpl {

    public static final IDotNetFunctionsImpl INSTANCE = new DotNetFunctionsImpl();

    private DotNetFunctionsImpl() {}

  }
  
  public static class DotNetFunctions {

    private DotNetFunctions() {}

  }

  public static interface IKrbtgtrenewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("af460ae9-2fe3-11f0-bba4-ebbcb3a9ada7")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("af460aec-2fe3-11f0-bba4-ebbcb3a9ada7")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IKrbtgtrenewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class KrbtgtrenewFunctionsImpl implements IKrbtgtrenewFunctionsImpl {

    public static final IKrbtgtrenewFunctionsImpl INSTANCE = new KrbtgtrenewFunctionsImpl();

    private KrbtgtrenewFunctionsImpl() {}

  }
  
  public static class KrbtgtrenewFunctions {

    private KrbtgtrenewFunctions() {}

  }

  public static interface ICopyCertFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("57283c2c-4791-11f0-bcdd-31d38803078d")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("57283c2f-4791-11f0-bcdd-31d38803078d")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ICopyCertFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CopyCertFunctionsImpl implements ICopyCertFunctionsImpl {

    public static final ICopyCertFunctionsImpl INSTANCE = new CopyCertFunctionsImpl();

    private CopyCertFunctionsImpl() {}

  }
  
  public static class CopyCertFunctions {

    private CopyCertFunctions() {}

  }

  public static interface IVeeamMasterFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f9469fa7-481a-11f0-98fa-27341f0ccbf7")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("f9469faa-481a-11f0-98fa-27341f0ccbf7")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IVeeamMasterFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VeeamMasterFunctionsImpl implements IVeeamMasterFunctionsImpl {

    public static final IVeeamMasterFunctionsImpl INSTANCE = new VeeamMasterFunctionsImpl();

    private VeeamMasterFunctionsImpl() {}

  }
  
  public static class VeeamMasterFunctions {

    private VeeamMasterFunctions() {}

  }

  public static interface IVeeamProxyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fa6b22dd-481a-11f0-98fa-27341f0ccbf7")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("fa6b22e0-481a-11f0-98fa-27341f0ccbf7")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IVeeamProxyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VeeamProxyFunctionsImpl implements IVeeamProxyFunctionsImpl {

    public static final IVeeamProxyFunctionsImpl INSTANCE = new VeeamProxyFunctionsImpl();

    private VeeamProxyFunctionsImpl() {}

  }
  
  public static class VeeamProxyFunctions {

    private VeeamProxyFunctions() {}

  }

  public static interface IInstallWSUSFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c3596d31-4c14-11f0-ab62-57f8f0b40f9d")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("c3596d4d-4c14-11f0-ab62-57f8f0b40f9d")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IInstallWSUSFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallWSUSFunctionsImpl implements IInstallWSUSFunctionsImpl {

    public static final IInstallWSUSFunctionsImpl INSTANCE = new InstallWSUSFunctionsImpl();

    private InstallWSUSFunctionsImpl() {}

  }
  
  public static class InstallWSUSFunctions {

    private InstallWSUSFunctions() {}

  }

  public static interface IWsusJoinFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("68674985-5261-11f0-9c5a-35f303bb18a5")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("6867709e-5261-11f0-9c5a-35f303bb18a5")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IWsusJoinFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WsusJoinFunctionsImpl implements IWsusJoinFunctionsImpl {

    public static final IWsusJoinFunctionsImpl INSTANCE = new WsusJoinFunctionsImpl();

    private WsusJoinFunctionsImpl() {}

  }
  
  public static class WsusJoinFunctions {

    private WsusJoinFunctions() {}

  }

  public static interface IWinRMFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7ff76b19-4c49-11f0-afd1-3133a97c4a61")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("7ff792ae-4c49-11f0-afd1-3133a97c4a61")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IWinRMFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WinRMFunctionsImpl implements IWinRMFunctionsImpl {

    public static final IWinRMFunctionsImpl INSTANCE = new WinRMFunctionsImpl();

    private WinRMFunctionsImpl() {}

  }
  
  public static class WinRMFunctions {

    private WinRMFunctions() {}

  }

  public static interface ISudoFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eccf852e-4ce5-11f0-954b-b579526ae084")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("eccf8533-4ce5-11f0-954b-b579526ae084")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ISudoFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SudoFunctionsImpl implements ISudoFunctionsImpl {

    public static final ISudoFunctionsImpl INSTANCE = new SudoFunctionsImpl();

    private SudoFunctionsImpl() {}

  }
  
  public static class SudoFunctions {

    private SudoFunctions() {}

  }

  public static interface IMailRelayFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fc6ba7ca-4ce9-11f0-954b-b579526ae084")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("fc6ba7e7-4ce9-11f0-954b-b579526ae084")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IMailRelayFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class MailRelayFunctionsImpl implements IMailRelayFunctionsImpl {

    public static final IMailRelayFunctionsImpl INSTANCE = new MailRelayFunctionsImpl();

    private MailRelayFunctionsImpl() {}

  }
  
  public static class MailRelayFunctions {

    private MailRelayFunctions() {}

  }

  public static interface ICertificatesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ffe3292f-4d13-11f0-954b-b579526ae084")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("01a8a70f-4d14-11f0-954b-b579526ae084")
    public java.lang.String ClassImplementation();

  }
  
  public static interface ICertificatesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CertificatesFunctionsImpl implements ICertificatesFunctionsImpl {

    public static final ICertificatesFunctionsImpl INSTANCE = new CertificatesFunctionsImpl();

    private CertificatesFunctionsImpl() {}

  }
  
  public static class CertificatesFunctions {

    private CertificatesFunctions() {}

  }

  public static interface ICertificateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4f21144a-58dd-11f0-b941-05f03c57551d")
    public java.lang.String CommonName();

    @IDynamicResourceExtension.MethodId("70100504-58dd-11f0-b941-05f03c57551d")
    public java.lang.String SubjectAltNames();

    @IDynamicResourceExtension.MethodId("ed67e14c-58dd-11f0-b941-05f03c57551d")
    public java.lang.String SubjectAltNamesFromHost();

  }
  
  public static interface ICertificateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CertificateFunctionsImpl implements ICertificateFunctionsImpl {

    public static final ICertificateFunctionsImpl INSTANCE = new CertificateFunctionsImpl();

    private CertificateFunctionsImpl() {}

  }
  
  public static class CertificateFunctions {

    private CertificateFunctions() {}

  }

  public static interface IWindowsClientHardeningFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("187ed413-5e43-11f0-a5db-972145eef50c")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("187efaf7-5e43-11f0-a5db-972145eef50c")
    public java.lang.String ClassImplementation();

    @IDynamicResourceExtension.MethodId("0bbbc8e1-5e61-11f0-85a0-e5fe67e459b3")
    public java.lang.String CisHardeningModule();

  }
  
  public static interface IWindowsClientHardeningFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WindowsClientHardeningFunctionsImpl implements IWindowsClientHardeningFunctionsImpl {

    public static final IWindowsClientHardeningFunctionsImpl INSTANCE = new WindowsClientHardeningFunctionsImpl();

    private WindowsClientHardeningFunctionsImpl() {}

  }
  
  public static class WindowsClientHardeningFunctions {

    private WindowsClientHardeningFunctions() {}

  }

  public static interface IScheduledBackupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a7997e6a-6316-11f0-a7ee-fba3b99d3616")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("a7997e6d-6316-11f0-a7ee-fba3b99d3616")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IScheduledBackupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ScheduledBackupFunctionsImpl implements IScheduledBackupFunctionsImpl {

    public static final IScheduledBackupFunctionsImpl INSTANCE = new ScheduledBackupFunctionsImpl();

    private ScheduledBackupFunctionsImpl() {}

  }
  
  public static class ScheduledBackupFunctions {

    private ScheduledBackupFunctions() {}

  }

  public static interface IGposFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9a4aaeba-63c8-11f0-87c2-0f8d66c50b66")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("9a4aaf45-63c8-11f0-87c2-0f8d66c50b66")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IGposFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GposFunctionsImpl implements IGposFunctionsImpl {

    public static final IGposFunctionsImpl INSTANCE = new GposFunctionsImpl();

    private GposFunctionsImpl() {}

  }
  
  public static class GposFunctions {

    private GposFunctions() {}

  }

  public static interface INpsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("de0d8378-8a66-11f0-af5e-cd5d044ab02b")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("de0d83b8-8a66-11f0-af5e-cd5d044ab02b")
    public java.lang.String ClassImplementation();

  }
  
  public static interface INpsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NpsFunctionsImpl implements INpsFunctionsImpl {

    public static final INpsFunctionsImpl INSTANCE = new NpsFunctionsImpl();

    private NpsFunctionsImpl() {}

  }
  
  public static class NpsFunctions {

    private NpsFunctions() {}

  }

  public static interface IWsusApprovalUpdatesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ad87ff10-8a6b-11f0-af5e-cd5d044ab02b")
    public java.lang.String ClassDefinition();

    @IDynamicResourceExtension.MethodId("ad88264e-8a6b-11f0-af5e-cd5d044ab02b")
    public java.lang.String ClassImplementation();

  }
  
  public static interface IWsusApprovalUpdatesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class WsusApprovalUpdatesFunctionsImpl implements IWsusApprovalUpdatesFunctionsImpl {

    public static final IWsusApprovalUpdatesFunctionsImpl INSTANCE = new WsusApprovalUpdatesFunctionsImpl();

    private WsusApprovalUpdatesFunctionsImpl() {}

  }
  
  public static class WsusApprovalUpdatesFunctions {

    private WsusApprovalUpdatesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fab6dfde-0014-11f0-945c-87b19aec41f4,sDScRExbo6jiRgpDfkNVNJ3/Hi4=] */
