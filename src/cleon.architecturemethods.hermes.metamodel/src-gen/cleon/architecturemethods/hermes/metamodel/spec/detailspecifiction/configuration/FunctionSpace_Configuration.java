package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[62d1177e-5329-11f0-8fbb-ff2ccb392c9c,imports]] */

/* End Protected Region   [[62d1177e-5329-11f0-8fbb-ff2ccb392c9c,imports]] */

public class FunctionSpace_Configuration {

  /* Begin Protected Region [[62d1177e-5329-11f0-8fbb-ff2ccb392c9c]] */
  
  /* End Protected Region   [[62d1177e-5329-11f0-8fbb-ff2ccb392c9c]] */


  public static interface IPuppetConfigurationFunctions extends IDynamicResourceExtension {

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

  public static interface IAbstractConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("df54999c-0627-11f0-ad7c-c72b7a763977")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.javamodel.IDeploymentEnvironmentRootNode Environment();

    @IDynamicResourceExtension.MethodId("c63f5d1e-1073-11f0-b378-11a495632127")
    public cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document arc42Document();

    @IDynamicResourceExtension.MethodId("b84af3f0-1060-11f0-b378-11a495632127")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount> AllServiceAccounts();

    @IDynamicResourceExtension.MethodId("107e696d-2742-11f0-bc3e-fdd30b5cbdec")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccount> AllTestAccounts();

    @IDynamicResourceExtension.MethodId("e7be6abb-112a-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String DomainName();

    @IDynamicResourceExtension.MethodId("adbff252-1132-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String NetbiosDomainName();

    @IDynamicResourceExtension.MethodId("8c3e98e5-1086-11f0-b378-11a495632127")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration SystemConfiguration();

    @IDynamicResourceExtension.MethodId("583a60ec-13b3-11f0-b664-c7b92124985d")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.serviceaccounts.javamodel.IServiceAccount> AllServiceAccountsForSystemConfiguration();

    @IDynamicResourceExtension.MethodId("e3a54a8e-481c-11f0-98fa-27341f0ccbf7")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment Topology();

    @IDynamicResourceExtension.MethodId("f58084df-481c-11f0-98fa-27341f0ccbf7")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> AllHosts();

    @IDynamicResourceExtension.MethodId("983d1039-5321-11f0-8fbb-ff2ccb392c9c")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> AllHostsWhereSystemConfiguration();

    @IDynamicResourceExtension.MethodId("bc29051b-4ce2-11f0-954b-b579526ae084")
    public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite Site();

    @IDynamicResourceExtension.MethodId("b00b79e2-5326-11f0-8fbb-ff2ccb392c9c")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> AllHostBySpecifications();

  }
  
  public static interface IAbstractConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("adbff252-1132-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String NetbiosDomainName(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration abstractConfiguration);

  }
  
  public static class AbstractConfigurationFunctionsImpl implements IAbstractConfigurationFunctionsImpl {

    public static final IAbstractConfigurationFunctionsImpl INSTANCE = new AbstractConfigurationFunctionsImpl();

    private AbstractConfigurationFunctionsImpl() {}

    @Override
    public java.lang.String NetbiosDomainName(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration abstractConfiguration) {
      /* Begin Protected Region [[adbff252-1132-11f0-a4f9-b5f995a9e0fe]] */
    	var abstractConfigurationSpecificationFunctions = abstractConfiguration.extension(IAbstractConfigurationFunctions.class);
    	final var domainName = abstractConfigurationSpecificationFunctions.DomainName();
    	int dotIndex = domainName.indexOf('.');
        return (dotIndex > 0) ? domainName.substring(0, dotIndex) : domainName;    
      /* End Protected Region   [[adbff252-1132-11f0-a4f9-b5f995a9e0fe]] */
    }

  }
  
  public static class AbstractConfigurationFunctions {

    private AbstractConfigurationFunctions() {}

    public static java.lang.String NetbiosDomainName(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration abstractConfiguration) {
      return DynamicResourceUtil.invoke(IAbstractConfigurationFunctionsImpl.class, AbstractConfigurationFunctionsImpl.INSTANCE, abstractConfiguration).NetbiosDomainName(abstractConfiguration);
    }

  }

  public static interface IServiceAccountFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7586f36a-13b2-11f0-b664-c7b92124985d")
    public java.lang.String LogonAs(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration abstractConfiguration);

  }
  
  public static interface IServiceAccountFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceAccountFunctionsImpl implements IServiceAccountFunctionsImpl {

    public static final IServiceAccountFunctionsImpl INSTANCE = new ServiceAccountFunctionsImpl();

    private ServiceAccountFunctionsImpl() {}

  }
  
  public static class ServiceAccountFunctions {

    private ServiceAccountFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,62d1177e-5329-11f0-8fbb-ff2ccb392c9c,xlllmYW2NMopg/GVc6SjIbxLYoc=] */
