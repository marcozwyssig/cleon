package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[010c10e4-a0c9-11ea-8daa-afb4679c3497,imports]] */

import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.QoSCommunicationOnNetwork;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.QoSSystemConfigurationSource;

import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.FunctionSpace_Topology.IAbstractHostFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.FunctionSpace_SystemConfiguration.ISystemConfigurationFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.FunctionSpace_Communication.ISourceFunctions;
import cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.FunctionSpace_Communication.ISourceInSubSecurityZoneFunctions;

import cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.Source;

import java.util.stream.Collectors;

/* End Protected Region   [[010c10e4-a0c9-11ea-8daa-afb4679c3497,imports]] */

public class FunctionSpace_QoS {

  /* Begin Protected Region [[010c10e4-a0c9-11ea-8daa-afb4679c3497]] */

  /* End Protected Region   [[010c10e4-a0c9-11ea-8daa-afb4679c3497]] */


  public static interface IQoSSystemConfigurationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1d205486-a0c9-11ea-8daa-afb4679c3497")
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNet);

    @IDynamicResourceExtension.MethodId("cb87ba0f-c850-11ea-a92a-436f8b822db6")
    public List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.ISource> SelectAllowedSource();

  }
  
  public static interface IQoSSystemConfigurationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1d205486-a0c9-11ea-8daa-afb4679c3497")
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNet, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept);

  }
  
  public static class QoSSystemConfigurationConceptFunctionsImpl implements IQoSSystemConfigurationConceptFunctionsImpl {

    public static final IQoSSystemConfigurationConceptFunctionsImpl INSTANCE = new QoSSystemConfigurationConceptFunctionsImpl();

    private QoSSystemConfigurationConceptFunctionsImpl() {}

    @Override
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNet, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept) {
      /* Begin Protected Region [[1d205486-a0c9-11ea-8daa-afb4679c3497]] */
      return qoSSystemConfigurationConcept.selectQoSSystemConfigurationDestination().values().stream()
      		.mapToLong(x -> x.extension(IQoSSystemConfigurationSourceFunctions.class)
      				.SumBandwithRequirements_aE__aA_byte_aC_(environment, transportNet))
      		.sum();
      /* End Protected Region   [[1d205486-a0c9-11ea-8daa-afb4679c3497]] */
    }

  }
  
  public static class QoSSystemConfigurationConceptFunctions {

    private QoSSystemConfigurationConceptFunctions() {}

    public static java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNet, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationConceptFunctionsImpl.class, QoSSystemConfigurationConceptFunctionsImpl.INSTANCE, qoSSystemConfigurationConcept).SumBandwithRequirements_aE__aA_byte_aC_(environment, transportNet, qoSSystemConfigurationConcept);
    }

  }

  public static interface IQoSSystemConfigurationSourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0824a30c-308e-11eb-9149-f1e36a7322e5")
    public java.lang.Integer DestinationVLAN();

    @IDynamicResourceExtension.MethodId("f825adb4-308e-11eb-9149-f1e36a7322e5")
    public java.lang.String SourceVLAN();

    @IDynamicResourceExtension.MethodId("1c84eac4-e08f-11eb-9584-9144fca99be9")
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNet);

  }
  
  public static interface IQoSSystemConfigurationSourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1c84eac4-e08f-11eb-9584-9144fca99be9")
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNet, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

  }
  
  public static class QoSSystemConfigurationSourceFunctionsImpl implements IQoSSystemConfigurationSourceFunctionsImpl {

    public static final IQoSSystemConfigurationSourceFunctionsImpl INSTANCE = new QoSSystemConfigurationSourceFunctionsImpl();

    private QoSSystemConfigurationSourceFunctionsImpl() {}

    @Override
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNet, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource) {
      /* Begin Protected Region [[1c84eac4-e08f-11eb-9584-9144fca99be9]] */
      //long total = AllSources(environment, qoSSystemConfigurationSource) * AllDestinations(environment, qoSSystemConfigurationSource) * qoSSystemConfigurationSource.selectEstimateMean_aE__aA_KBit_aE_s_aC_();
      return qoSSystemConfigurationSource.selectCommunicationOnNetwork().values().stream()
      		.filter(x -> x.selectTransportNetwork().equals(transportNet))
      		.mapToLong(x -> x.extension(IQoSCommunicationOnNetworkFunctions.class)
      				.SumBandwithRequirements_aE__aA_byte_aC_(environment))
      		.sum();
      /* End Protected Region   [[1c84eac4-e08f-11eb-9584-9144fca99be9]] */
    }

  }
  
  public static class QoSSystemConfigurationSourceFunctions {

    private QoSSystemConfigurationSourceFunctions() {}

    public static java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNet, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationSourceFunctionsImpl.class, QoSSystemConfigurationSourceFunctionsImpl.INSTANCE, qoSSystemConfigurationSource).SumBandwithRequirements_aE__aA_byte_aC_(environment, transportNet, qoSSystemConfigurationSource);
    }

  }

  public static interface ISystemEnvironmentNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e18bb66e-ff48-11eb-982b-5da7cd501019")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork);

    @IDynamicResourceExtension.MethodId("115dda0d-09b0-11ec-9bfe-c14fd3a44483")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("8d023a2c-09b0-11ec-9bfe-c14fd3a44483")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("27b0fc13-a99a-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSingleHost> SourceSingleHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork);

    @IDynamicResourceExtension.MethodId("3484441a-09b0-11ec-9bfe-c14fd3a44483")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSingleHost> SourceSingleHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("95759dc7-09b0-11ec-9bfe-c14fd3a44483")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSingleHost> DestinationSingleHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("42a84883-c930-11eb-a152-570abd1640d5")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork);

    @IDynamicResourceExtension.MethodId("7e4f8f73-09b0-11ec-9bfe-c14fd3a44483")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

  }
  
  public static interface ISystemEnvironmentNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e18bb66e-ff48-11eb-982b-5da7cd501019")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode);

    @IDynamicResourceExtension.MethodId("115dda0d-09b0-11ec-9bfe-c14fd3a44483")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode);

    @IDynamicResourceExtension.MethodId("8d023a2c-09b0-11ec-9bfe-c14fd3a44483")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode);

    @IDynamicResourceExtension.MethodId("42a84883-c930-11eb-a152-570abd1640d5")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode);

    @IDynamicResourceExtension.MethodId("7e4f8f73-09b0-11ec-9bfe-c14fd3a44483")
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode);

  }
  
  public static class SystemEnvironmentNodeFunctionsImpl implements ISystemEnvironmentNodeFunctionsImpl {

    public static final ISystemEnvironmentNodeFunctionsImpl INSTANCE = new SystemEnvironmentNodeFunctionsImpl();

    private SystemEnvironmentNodeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      /* Begin Protected Region [[e18bb66e-ff48-11eb-982b-5da7cd501019]] */
      final var source = Source.selectToMeAccessAllowed(qoSCommunicationOnNetwork.selectSourceInSubSecurityZone());
      final var sourceInSubSecurityZoneFunctions = qoSCommunicationOnNetwork.selectSourceInSubSecurityZone().extension(ISourceInSubSecurityZoneFunctions.class);
      final var hosts = source.selectSourceSystemConfiguration().extension(ISystemConfigurationFunctions.class).AllHostsWithEnvironment(systemEnvironmentNode);
      return hosts.stream().filter(x -> x.extension(IAbstractHostFunctions.class).Subzones().stream().anyMatch(sz -> sz.equals(sourceInSubSecurityZoneFunctions.SourceSubZone()))).collect(Collectors.toList());
      /* End Protected Region   [[e18bb66e-ff48-11eb-982b-5da7cd501019]] */
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      /* Begin Protected Region [[115dda0d-09b0-11ec-9bfe-c14fd3a44483]] */
      final var source = qoSSystemConfigurationSource.selectSource();
      final var sourceFunctions = source.extension(ISourceFunctions.class);
      final var hosts = source.selectSourceSystemConfiguration().extension(ISystemConfigurationFunctions.class).AllHostsWithEnvironment(systemEnvironmentNode);
      return hosts.stream().filter(x -> x.extension(IAbstractHostFunctions.class).Subzones().stream().anyMatch(sz -> sourceFunctions.SourceSecuritySubzones().contains(sz))).collect(Collectors.toList());

      /* End Protected Region   [[115dda0d-09b0-11ec-9bfe-c14fd3a44483]] */
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      /* Begin Protected Region [[8d023a2c-09b0-11ec-9bfe-c14fd3a44483]] */
      final var source = qoSSystemConfigurationSource.selectSource();
      final var sourceFunctions = source.extension(ISourceFunctions.class);
      final var destination = sourceFunctions.Destination();
      final var hosts = destination.selectDestinationSystemConfiguration().extension(ISystemConfigurationFunctions.class).AllHostsWithEnvironment(systemEnvironmentNode);
      return hosts.stream().filter(x -> x.extension(IAbstractHostFunctions.class).Subzones().stream().anyMatch(sz -> sourceFunctions.DestinationSubSecurityZone().selectInInterface().selectInterfaceInSecuritySubZone().equals(sz))).collect(Collectors.toList());

      /* End Protected Region   [[8d023a2c-09b0-11ec-9bfe-c14fd3a44483]] */
    }

    @Override
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      /* Begin Protected Region [[42a84883-c930-11eb-a152-570abd1640d5]] */
      if (SourceHosts(qoSCommunicationOnNetwork, systemEnvironmentNode).isEmpty()) {
      	return null;
      }

      return systemEnvironmentNode;
      /* End Protected Region   [[42a84883-c930-11eb-a152-570abd1640d5]] */
    }

    @Override
    public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      /* Begin Protected Region [[7e4f8f73-09b0-11ec-9bfe-c14fd3a44483]] */
      if( SourceHosts(qoSSystemConfigurationSource, systemEnvironmentNode).isEmpty() || DestinationHosts(qoSSystemConfigurationSource, systemEnvironmentNode).isEmpty()) {
      	return null;
      }

      return systemEnvironmentNode;

      /* End Protected Region   [[7e4f8f73-09b0-11ec-9bfe-c14fd3a44483]] */
    }

  }
  
  public static class SystemEnvironmentNodeFunctions {

    private SystemEnvironmentNodeFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentNodeFunctionsImpl.class, SystemEnvironmentNodeFunctionsImpl.INSTANCE, systemEnvironmentNode).SourceHosts(qoSCommunicationOnNetwork, systemEnvironmentNode);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentNodeFunctionsImpl.class, SystemEnvironmentNodeFunctionsImpl.INSTANCE, systemEnvironmentNode).SourceHosts(qoSSystemConfigurationSource, systemEnvironmentNode);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentNodeFunctionsImpl.class, SystemEnvironmentNodeFunctionsImpl.INSTANCE, systemEnvironmentNode).DestinationHosts(qoSSystemConfigurationSource, systemEnvironmentNode);
    }

    public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentNodeFunctionsImpl.class, SystemEnvironmentNodeFunctionsImpl.INSTANCE, systemEnvironmentNode).OnlyWithValidHosts(qoSCommunicationOnNetwork, systemEnvironmentNode);
    }

    public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentNodeFunctionsImpl.class, SystemEnvironmentNodeFunctionsImpl.INSTANCE, systemEnvironmentNode).OnlyWithValidHosts(qoSSystemConfigurationSource, systemEnvironmentNode);
    }

  }

  public static interface IQoSCommunicationOnNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("01e85386-fe9f-11eb-bbec-6b945b7259b1")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("3dba9bee-ff48-11eb-982b-5da7cd501019")
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment);

    @IDynamicResourceExtension.MethodId("ea01182f-e08e-11eb-9584-9144fca99be9")
    public java.lang.Integer AllSources(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment);

  }
  
  public static interface IQoSCommunicationOnNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("3dba9bee-ff48-11eb-982b-5da7cd501019")
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork);

    @IDynamicResourceExtension.MethodId("ea01182f-e08e-11eb-9584-9144fca99be9")
    public java.lang.Integer AllSources(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork);

  }
  
  public static class QoSCommunicationOnNetworkFunctionsImpl implements IQoSCommunicationOnNetworkFunctionsImpl {

    public static final IQoSCommunicationOnNetworkFunctionsImpl INSTANCE = new QoSCommunicationOnNetworkFunctionsImpl();

    private QoSCommunicationOnNetworkFunctionsImpl() {}

    @Override
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork) {
      /* Begin Protected Region [[3dba9bee-ff48-11eb-982b-5da7cd501019]] */
      final var qoSSystemConfigurationSource = QoSSystemConfigurationSource.selectToMeCommunicationOnNetwork(qoSCommunicationOnNetwork);
      final var systemEnvironmentNodeFunctions = environment.extension(ISystemEnvironmentNodeFunctions.class);

      final long total = systemEnvironmentNodeFunctions.SourceSingleHosts(qoSCommunicationOnNetwork).size()
      		* qoSSystemConfigurationSource.selectEstimateMean_aE__aA_KB_aE_s_aC_() * 1000;
      return total * qoSSystemConfigurationSource.selectLoaddistribution_aE__aA___K__aC_() / 100;
      /* End Protected Region   [[3dba9bee-ff48-11eb-982b-5da7cd501019]] */
    }

    @Override
    public java.lang.Integer AllSources(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork) {
      /* Begin Protected Region [[ea01182f-e08e-11eb-9584-9144fca99be9]] */
      final var node = environment.extension(ISystemEnvironmentNodeFunctions.class)
      		.OnlyWithValidHosts(qoSCommunicationOnNetwork);
      if( node != null) {
      	return node.extension(ISystemEnvironmentNodeFunctions.class).SourceSingleHosts(qoSCommunicationOnNetwork)
      			.size();
      }
      return 0;
      /* End Protected Region   [[ea01182f-e08e-11eb-9584-9144fca99be9]] */
    }

  }
  
  public static class QoSCommunicationOnNetworkFunctions {

    private QoSCommunicationOnNetworkFunctions() {}

    public static java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork) {
      return DynamicResourceUtil.invoke(IQoSCommunicationOnNetworkFunctionsImpl.class, QoSCommunicationOnNetworkFunctionsImpl.INSTANCE, qoSCommunicationOnNetwork).SumBandwithRequirements_aE__aA_byte_aC_(environment, qoSCommunicationOnNetwork);
    }

    public static java.lang.Integer AllSources(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork) {
      return DynamicResourceUtil.invoke(IQoSCommunicationOnNetworkFunctionsImpl.class, QoSCommunicationOnNetworkFunctionsImpl.INSTANCE, qoSCommunicationOnNetwork).AllSources(environment, qoSCommunicationOnNetwork);
    }

  }

  public static interface ITransportNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6605672f-ff3d-11eb-bfe7-29eb44ce217c")
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment);

    @IDynamicResourceExtension.MethodId("ad60e2f5-ff4b-11eb-982b-5da7cd501019")
    public java.lang.Long SumBandwithRequirementsReserve_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment);

    @IDynamicResourceExtension.MethodId("b8b3e792-ff4b-11eb-982b-5da7cd501019")
    public java.lang.Long Capacity_aE__aA_byte_aC_();

  }
  
  public static interface ITransportNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("6605672f-ff3d-11eb-bfe7-29eb44ce217c")
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNetwork);

    @IDynamicResourceExtension.MethodId("ad60e2f5-ff4b-11eb-982b-5da7cd501019")
    public java.lang.Long SumBandwithRequirementsReserve_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNetwork);

    @IDynamicResourceExtension.MethodId("b8b3e792-ff4b-11eb-982b-5da7cd501019")
    public java.lang.Long Capacity_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNetwork);

  }
  
  public static class TransportNetworkFunctionsImpl implements ITransportNetworkFunctionsImpl {

    public static final ITransportNetworkFunctionsImpl INSTANCE = new TransportNetworkFunctionsImpl();

    private TransportNetworkFunctionsImpl() {}

    @Override
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNetwork) {
      /* Begin Protected Region [[6605672f-ff3d-11eb-bfe7-29eb44ce217c]] */
      final var listOfCommuncationNetwork =  QoSCommunicationOnNetwork.selectToMeTransportNetwork(transportNetwork);
      var total = 0L;
      for( final var communcationNetwork : listOfCommuncationNetwork ) {
      	final var qosCommunictionNetworkFunctions = communcationNetwork.extension(IQoSCommunicationOnNetworkFunctions.class);
      	final var sum = qosCommunictionNetworkFunctions.SumBandwithRequirements_aE__aA_byte_aC_(environment);
      	total += sum;
      }
      return total / transportNetwork.selectInstances();
      /* End Protected Region   [[6605672f-ff3d-11eb-bfe7-29eb44ce217c]] */
    }

    @Override
    public java.lang.Long SumBandwithRequirementsReserve_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNetwork) {
      /* Begin Protected Region [[ad60e2f5-ff4b-11eb-982b-5da7cd501019]] */
      return Capacity_aE__aA_byte_aC_(transportNetwork)
      		- SumBandwithRequirements_aE__aA_byte_aC_(environment, transportNetwork);
      /* End Protected Region   [[ad60e2f5-ff4b-11eb-982b-5da7cd501019]] */
    }

    @Override
    public java.lang.Long Capacity_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNetwork) {
      /* Begin Protected Region [[b8b3e792-ff4b-11eb-982b-5da7cd501019]] */
      return transportNetwork.selectCapacity_aE__aA_MBit_aE_s_aC_() / 8 * 1000 * 1000;
      /* End Protected Region   [[b8b3e792-ff4b-11eb-982b-5da7cd501019]] */
    }

  }
  
  public static class TransportNetworkFunctions {

    private TransportNetworkFunctions() {}

    public static java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNetwork) {
      return DynamicResourceUtil.invoke(ITransportNetworkFunctionsImpl.class, TransportNetworkFunctionsImpl.INSTANCE, transportNetwork).SumBandwithRequirements_aE__aA_byte_aC_(environment, transportNetwork);
    }

    public static java.lang.Long SumBandwithRequirementsReserve_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNetwork) {
      return DynamicResourceUtil.invoke(ITransportNetworkFunctionsImpl.class, TransportNetworkFunctionsImpl.INSTANCE, transportNetwork).SumBandwithRequirementsReserve_aE__aA_byte_aC_(environment, transportNetwork);
    }

    public static java.lang.Long Capacity_aE__aA_byte_aC_(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.ITransportNetwork transportNetwork) {
      return DynamicResourceUtil.invoke(ITransportNetworkFunctionsImpl.class, TransportNetworkFunctionsImpl.INSTANCE, transportNetwork).Capacity_aE__aA_byte_aC_(transportNetwork);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,010c10e4-a0c9-11ea-8daa-afb4679c3497,jNfRAdbfCMtQvSxdtXBx8Bk8d7o=] */
