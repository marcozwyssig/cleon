package cleon.architecturemethods.hermes.metamodel.template.puppet.detail_specification;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[fab6dfde-0014-11f0-945c-87b19aec41f4,imports]] */

/* End Protected Region   [[fab6dfde-0014-11f0-945c-87b19aec41f4,imports]] */

public class FunctionSpace_Puppet_Detailspecification {

  /* Begin Protected Region [[fab6dfde-0014-11f0-945c-87b19aec41f4]] */
  
  /* End Protected Region   [[fab6dfde-0014-11f0-945c-87b19aec41f4]] */


  public static interface IAbstractConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("94a9e507-0024-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileName();

    @IDynamicResourceExtension.MethodId("eb81e13a-0026-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileNameYaml();

  }
  
  public static interface IAbstractConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractConfigurationFunctionsImpl implements IAbstractConfigurationFunctionsImpl {

    public static final IAbstractConfigurationFunctionsImpl INSTANCE = new AbstractConfigurationFunctionsImpl();

    private AbstractConfigurationFunctionsImpl() {}

  }
  
  public static class AbstractConfigurationFunctions {

    private AbstractConfigurationFunctions() {}

  }

  public static interface ISysCfgSpecificationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("08187956-0015-11f0-945c-87b19aec41f4")
    public java.lang.String FullFileName();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,fab6dfde-0014-11f0-945c-87b19aec41f4,ibqHE7pMafg6avrNdswFOoWtDVg=] */
