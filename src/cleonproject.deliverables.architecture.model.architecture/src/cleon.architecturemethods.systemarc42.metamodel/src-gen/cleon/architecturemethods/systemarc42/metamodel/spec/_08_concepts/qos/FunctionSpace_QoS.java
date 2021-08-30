package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[010c10e4-a0c9-11ea-8daa-afb4679c3497,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.QoSCommunicationOnNetwork;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.QoSSystemConfigurationSource;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.network_segmentation.subzonepolicy.FunctionSpace_SubzonePolicy.ISourceSubZoneFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractHostFunctions;
import cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.FunctionSpace_SubjectArea.ISystemEnvironmentFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication.ISourceFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication.ISourceInSubSecurityZoneFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.Source;

import java.util.stream.Collectors;
import ch.actifsource.util.log.Logger;

/* End Protected Region   [[010c10e4-a0c9-11ea-8daa-afb4679c3497,imports]] */

public class FunctionSpace_QoS {

  /* Begin Protected Region [[010c10e4-a0c9-11ea-8daa-afb4679c3497]] */

  /* End Protected Region   [[010c10e4-a0c9-11ea-8daa-afb4679c3497]] */


  public static interface IQoSConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9cb503c2-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Long SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment);

  }
  
  public static interface IQoSConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9cb503c2-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Long SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept);

  }
  
  public static class QoSConceptFunctionsImpl implements IQoSConceptFunctionsImpl {

    public static final IQoSConceptFunctionsImpl INSTANCE = new QoSConceptFunctionsImpl();

    private QoSConceptFunctionsImpl() {}

    @Override
    public java.lang.Long SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept) {
      /* Begin Protected Region [[9cb503c2-1d92-11e9-b601-db75aa6f89a4]] */
      return qoSConcept.selectQosConfigurationConcepts().values().stream().mapToLong(x -> {
      	final var functions = x.extension(IQoSSystemConfigurationConceptFunctions.class);
      	return functions.SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(environment);
      }).sum();
      /* End Protected Region   [[9cb503c2-1d92-11e9-b601-db75aa6f89a4]] */
    }

  }
  
  public static class QoSConceptFunctions {

    private QoSConceptFunctions() {}

    public static java.lang.Long SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept) {
      return DynamicResourceUtil.invoke(IQoSConceptFunctionsImpl.class, QoSConceptFunctionsImpl.INSTANCE, qoSConcept).SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(environment, qoSConcept);
    }

  }

  public static interface IQoSSystemConfigurationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1d205486-a0c9-11ea-8daa-afb4679c3497")
    public java.lang.Long SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment);

    @IDynamicResourceExtension.MethodId("cb87ba0f-c850-11ea-a92a-436f8b822db6")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> SelectAllowedSource();

  }
  
  public static interface IQoSSystemConfigurationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1d205486-a0c9-11ea-8daa-afb4679c3497")
    public java.lang.Long SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept);

  }
  
  public static class QoSSystemConfigurationConceptFunctionsImpl implements IQoSSystemConfigurationConceptFunctionsImpl {

    public static final IQoSSystemConfigurationConceptFunctionsImpl INSTANCE = new QoSSystemConfigurationConceptFunctionsImpl();

    private QoSSystemConfigurationConceptFunctionsImpl() {}

    @Override
    public java.lang.Long SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept) {
      /* Begin Protected Region [[1d205486-a0c9-11ea-8daa-afb4679c3497]] */
      return qoSSystemConfigurationConcept.selectQoSSystemConfigurationDestination().values().stream().mapToLong( x -> x.extension(IQoSSystemConfigurationSourceFunctions.class).SumMean_aE__aA_Kbit_aE_s_aC_(environment)).sum();
      /* End Protected Region   [[1d205486-a0c9-11ea-8daa-afb4679c3497]] */
    }

  }
  
  public static class QoSSystemConfigurationConceptFunctions {

    private QoSSystemConfigurationConceptFunctions() {}

    public static java.lang.Long SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationConceptFunctionsImpl.class, QoSSystemConfigurationConceptFunctionsImpl.INSTANCE, qoSSystemConfigurationConcept).SumQoS_aE_Mean_aE__aA_kbit_aE_s_aC_(environment, qoSSystemConfigurationConcept);
    }

  }

  public static interface IQoSSystemConfigurationSourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0824a30c-308e-11eb-9149-f1e36a7322e5")
    public java.lang.Integer DestinationVLAN();

    @IDynamicResourceExtension.MethodId("f825adb4-308e-11eb-9149-f1e36a7322e5")
    public java.lang.String SourceVLAN();

    @IDynamicResourceExtension.MethodId("ea01182f-e08e-11eb-9584-9144fca99be9")
    public java.lang.Integer AllSources(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment);

    @IDynamicResourceExtension.MethodId("826b6209-e090-11eb-9584-9144fca99be9")
    public java.lang.Integer AllDestinations(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment);

    @IDynamicResourceExtension.MethodId("1c84eac4-e08f-11eb-9584-9144fca99be9")
    public java.lang.Long SumMean_aE__aA_Kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment);

  }
  
  public static interface IQoSSystemConfigurationSourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ea01182f-e08e-11eb-9584-9144fca99be9")
    public java.lang.Integer AllSources(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("826b6209-e090-11eb-9584-9144fca99be9")
    public java.lang.Integer AllDestinations(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("1c84eac4-e08f-11eb-9584-9144fca99be9")
    public java.lang.Long SumMean_aE__aA_Kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

  }
  
  public static class QoSSystemConfigurationSourceFunctionsImpl implements IQoSSystemConfigurationSourceFunctionsImpl {

    public static final IQoSSystemConfigurationSourceFunctionsImpl INSTANCE = new QoSSystemConfigurationSourceFunctionsImpl();

    private QoSSystemConfigurationSourceFunctionsImpl() {}

    @Override
    public java.lang.Integer AllSources(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource) {
      /* Begin Protected Region [[ea01182f-e08e-11eb-9584-9144fca99be9]] */
    	final var node = environment.extension(ISystemEnvironmentNodeFunctions.class).OnlyWithValidHosts(qoSSystemConfigurationSource);
    	if( node != null) {
			return node.extension(ISystemEnvironmentNodeFunctions.class).SourceSingleHosts(qoSSystemConfigurationSource)
					.size();
    	}
    	return 0;
      /* End Protected Region   [[ea01182f-e08e-11eb-9584-9144fca99be9]] */
    }

    @Override
    public java.lang.Integer AllDestinations(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource) {
      /* Begin Protected Region [[826b6209-e090-11eb-9584-9144fca99be9]] */
    	final var node = environment.extension(ISystemEnvironmentNodeFunctions.class).OnlyWithValidHosts(qoSSystemConfigurationSource);
    	if( node != null) {
			return node.extension(ISystemEnvironmentNodeFunctions.class)
					.DestinationSingleHosts(qoSSystemConfigurationSource).size();
    	}
    	return 0;
      /* End Protected Region   [[826b6209-e090-11eb-9584-9144fca99be9]] */
    }

    @Override
    public java.lang.Long SumMean_aE__aA_Kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource) {
      /* Begin Protected Region [[1c84eac4-e08f-11eb-9584-9144fca99be9]] */
    	//long total = AllSources(environment, qoSSystemConfigurationSource) * AllDestinations(environment, qoSSystemConfigurationSource) * qoSSystemConfigurationSource.selectEstimateMean_aE__aA_KBit_aE_s_aC_();
    	final long total = AllSources(environment, qoSSystemConfigurationSource) * qoSSystemConfigurationSource.selectEstimateMean_aE__aA_KB_aE_s_aC_();    	
    	return ((total * qoSSystemConfigurationSource.selectLoaddistribution_aE__aA___K__aC_()) / 100);
      /* End Protected Region   [[1c84eac4-e08f-11eb-9584-9144fca99be9]] */
    }

  }
  
  public static class QoSSystemConfigurationSourceFunctions {

    private QoSSystemConfigurationSourceFunctions() {}

    public static java.lang.Integer AllSources(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationSourceFunctionsImpl.class, QoSSystemConfigurationSourceFunctionsImpl.INSTANCE, qoSSystemConfigurationSource).AllSources(environment, qoSSystemConfigurationSource);
    }

    public static java.lang.Integer AllDestinations(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationSourceFunctionsImpl.class, QoSSystemConfigurationSourceFunctionsImpl.INSTANCE, qoSSystemConfigurationSource).AllDestinations(environment, qoSSystemConfigurationSource);
    }

    public static java.lang.Long SumMean_aE__aA_Kbit_aE_s_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationSourceFunctionsImpl.class, QoSSystemConfigurationSourceFunctionsImpl.INSTANCE, qoSSystemConfigurationSource).SumMean_aE__aA_Kbit_aE_s_aC_(environment, qoSSystemConfigurationSource);
    }

  }

  public static interface ISystemEnvironmentNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("82f449c6-a98e-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("e18bb66e-ff48-11eb-982b-5da7cd501019")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork);

    @IDynamicResourceExtension.MethodId("9791b23c-a98e-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("27b0fc13-a99a-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSingleHost> SourceSingleHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("49c24c0b-a99a-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSingleHost> DestinationSingleHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("42a84883-c930-11eb-a152-570abd1640d5")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

  }
  
  public static interface ISystemEnvironmentNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("82f449c6-a98e-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode);

    @IDynamicResourceExtension.MethodId("e18bb66e-ff48-11eb-982b-5da7cd501019")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode);

    @IDynamicResourceExtension.MethodId("9791b23c-a98e-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode);

    @IDynamicResourceExtension.MethodId("42a84883-c930-11eb-a152-570abd1640d5")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode);

  }
  
  public static class SystemEnvironmentNodeFunctionsImpl implements ISystemEnvironmentNodeFunctionsImpl {

    public static final ISystemEnvironmentNodeFunctionsImpl INSTANCE = new SystemEnvironmentNodeFunctionsImpl();

    private SystemEnvironmentNodeFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      /* Begin Protected Region [[82f449c6-a98e-11eb-8f9b-01c801f6a12b]] */
      final var source = qoSSystemConfigurationSource.selectSource();
      final var sourceFunctions = source.extension(ISourceFunctions.class);
      final var hosts = source.selectSourceSystemConfiguration().extension(ISystemConfigurationFunctions.class).AllHostsWithEnvironment(systemEnvironmentNode);
      return hosts.stream().filter(x -> x.extension(IAbstractHostFunctions.class).Subzones().stream().anyMatch(sz -> sourceFunctions.SourceSecuritySubzones().contains(sz))).collect(Collectors.toList());
      /* End Protected Region   [[82f449c6-a98e-11eb-8f9b-01c801f6a12b]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      /* Begin Protected Region [[e18bb66e-ff48-11eb-982b-5da7cd501019]] */
        final var source = Source.selectToMeAccessAllowed(qoSCommunicationOnNetwork.selectSourceInSubSecurityZone());
        final var sourceInSubSecurityZoneFunctions = qoSCommunicationOnNetwork.selectSourceInSubSecurityZone().extension(ISourceInSubSecurityZoneFunctions.class);        
        final var hosts = source.selectSourceSystemConfiguration().extension(ISystemConfigurationFunctions.class).AllHostsWithEnvironment(systemEnvironmentNode);
        return hosts.stream().filter(x -> x.extension(IAbstractHostFunctions.class).Subzones().stream().anyMatch(sz -> sz.equals(sourceInSubSecurityZoneFunctions.SourceSubZone()))).collect(Collectors.toList());
      /* End Protected Region   [[e18bb66e-ff48-11eb-982b-5da7cd501019]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      /* Begin Protected Region [[9791b23c-a98e-11eb-8f9b-01c801f6a12b]] */
      final var source = qoSSystemConfigurationSource.selectSource();
      final var sourceFunctions = source.extension(ISourceFunctions.class);
      final var destination = sourceFunctions.Destination();
      final var hosts = destination.selectDestinationSystemConfiguration().extension(ISystemConfigurationFunctions.class).AllHostsWithEnvironment(systemEnvironmentNode);
      return hosts.stream().filter(x -> x.extension(IAbstractHostFunctions.class).Subzones().stream().anyMatch(sz -> sourceFunctions.DestinationSubSecurityZone().selectInInterface().selectInterfaceInSecuritySubZone().equals(sz))).collect(Collectors.toList());
      /* End Protected Region   [[9791b23c-a98e-11eb-8f9b-01c801f6a12b]] */
    }

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      /* Begin Protected Region [[42a84883-c930-11eb-a152-570abd1640d5]] */
      if( SourceHosts(qoSSystemConfigurationSource, systemEnvironmentNode).isEmpty() || DestinationHosts(qoSSystemConfigurationSource, systemEnvironmentNode).isEmpty()) {
      	return null;
      }

      return systemEnvironmentNode;
      /* End Protected Region   [[42a84883-c930-11eb-a152-570abd1640d5]] */
    }

  }
  
  public static class SystemEnvironmentNodeFunctions {

    private SystemEnvironmentNodeFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentNodeFunctionsImpl.class, SystemEnvironmentNodeFunctionsImpl.INSTANCE, systemEnvironmentNode).SourceHosts(qoSSystemConfigurationSource, systemEnvironmentNode);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentNodeFunctionsImpl.class, SystemEnvironmentNodeFunctionsImpl.INSTANCE, systemEnvironmentNode).SourceHosts(qoSCommunicationOnNetwork, systemEnvironmentNode);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentNodeFunctionsImpl.class, SystemEnvironmentNodeFunctionsImpl.INSTANCE, systemEnvironmentNode).DestinationHosts(qoSSystemConfigurationSource, systemEnvironmentNode);
    }

    public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode OnlyWithValidHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode systemEnvironmentNode) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentNodeFunctionsImpl.class, SystemEnvironmentNodeFunctionsImpl.INSTANCE, systemEnvironmentNode).OnlyWithValidHosts(qoSSystemConfigurationSource, systemEnvironmentNode);
    }

  }

  public static interface IQoSCommunicationOnNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("01e85386-fe9f-11eb-bbec-6b945b7259b1")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("3dba9bee-ff48-11eb-982b-5da7cd501019")
    public java.lang.Long SumBandwithRequirements_aE__aA_bit_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment);

  }
  
  public static interface IQoSCommunicationOnNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("3dba9bee-ff48-11eb-982b-5da7cd501019")
    public java.lang.Long SumBandwithRequirements_aE__aA_bit_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork);

  }
  
  public static class QoSCommunicationOnNetworkFunctionsImpl implements IQoSCommunicationOnNetworkFunctionsImpl {

    public static final IQoSCommunicationOnNetworkFunctionsImpl INSTANCE = new QoSCommunicationOnNetworkFunctionsImpl();

    private QoSCommunicationOnNetworkFunctionsImpl() {}

    @Override
    public java.lang.Long SumBandwithRequirements_aE__aA_bit_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork) {
      /* Begin Protected Region [[3dba9bee-ff48-11eb-982b-5da7cd501019]] */
		final var qoSSystemConfigurationSource = QoSSystemConfigurationSource.selectToMeCommunicationOnNetwork(qoSCommunicationOnNetwork);
		final var systemEnvironmentNodeFunctions = environment.extension(ISystemEnvironmentNodeFunctions.class);		
		
    	final long total = systemEnvironmentNodeFunctions.SourceHosts(qoSCommunicationOnNetwork).size() * qoSSystemConfigurationSource.selectEstimateMean_aE__aA_KB_aE_s_aC_();    	
    	return ((total * qoSSystemConfigurationSource.selectLoaddistribution_aE__aA___K__aC_()) / 100);
      /* End Protected Region   [[3dba9bee-ff48-11eb-982b-5da7cd501019]] */
    }

  }
  
  public static class QoSCommunicationOnNetworkFunctions {

    private QoSCommunicationOnNetworkFunctions() {}

    public static java.lang.Long SumBandwithRequirements_aE__aA_bit_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSCommunicationOnNetwork qoSCommunicationOnNetwork) {
      return DynamicResourceUtil.invoke(IQoSCommunicationOnNetworkFunctionsImpl.class, QoSCommunicationOnNetworkFunctionsImpl.INSTANCE, qoSCommunicationOnNetwork).SumBandwithRequirements_aE__aA_bit_aC_(environment, qoSCommunicationOnNetwork);
    }

  }

  public static interface ITransportNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("6605672f-ff3d-11eb-bfe7-29eb44ce217c")
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment);

    @IDynamicResourceExtension.MethodId("ad60e2f5-ff4b-11eb-982b-5da7cd501019")
    public java.lang.Long SumBandwithRequirementsReserve_aE__aA_byte_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment);

    @IDynamicResourceExtension.MethodId("b8b3e792-ff4b-11eb-982b-5da7cd501019")
    public java.lang.Long Capacity_aE__aA_bytes_aC_();

  }
  
  public static interface ITransportNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("6605672f-ff3d-11eb-bfe7-29eb44ce217c")
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNetwork);

    @IDynamicResourceExtension.MethodId("ad60e2f5-ff4b-11eb-982b-5da7cd501019")
    public java.lang.Long SumBandwithRequirementsReserve_aE__aA_byte_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNetwork);

    @IDynamicResourceExtension.MethodId("b8b3e792-ff4b-11eb-982b-5da7cd501019")
    public java.lang.Long Capacity_aE__aA_bytes_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNetwork);

  }
  
  public static class TransportNetworkFunctionsImpl implements ITransportNetworkFunctionsImpl {

    public static final ITransportNetworkFunctionsImpl INSTANCE = new TransportNetworkFunctionsImpl();

    private TransportNetworkFunctionsImpl() {}

    @Override
    public java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNetwork) {
      /* Begin Protected Region [[6605672f-ff3d-11eb-bfe7-29eb44ce217c]] */
    	final var listOfCommuncationNetwork =  QoSCommunicationOnNetwork.selectToMeTransportNetwork(transportNetwork);
    	var result = 0L;
    	for( final var communcationNetwork : listOfCommuncationNetwork ) {
    		final var qosCommunictionNetworkFunctions = communcationNetwork.extension(IQoSCommunicationOnNetworkFunctions.class);
    		final var sum = qosCommunictionNetworkFunctions.SumBandwithRequirements_aE__aA_bit_aC_(environment);
    		result += sum;
    	}   	
    	final var total = result * 1000; // convert to bytes
    	return total / transportNetwork.selectInstances();
      /* End Protected Region   [[6605672f-ff3d-11eb-bfe7-29eb44ce217c]] */
    }

    @Override
    public java.lang.Long SumBandwithRequirementsReserve_aE__aA_byte_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNetwork) {
      /* Begin Protected Region [[ad60e2f5-ff4b-11eb-982b-5da7cd501019]] */
    	return Capacity_aE__aA_bytes_aC_(transportNetwork) - SumBandwithRequirements_aE__aA_bytes_aC_(environment, transportNetwork);
      /* End Protected Region   [[ad60e2f5-ff4b-11eb-982b-5da7cd501019]] */
    }

    @Override
    public java.lang.Long Capacity_aE__aA_bytes_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNetwork) {
      /* Begin Protected Region [[b8b3e792-ff4b-11eb-982b-5da7cd501019]] */
    	return (transportNetwork.selectCapacity_aE__aA_MBit_aE_s_aC_() / 8) * 1000 * 1000;
      /* End Protected Region   [[b8b3e792-ff4b-11eb-982b-5da7cd501019]] */
    }

  }
  
  public static class TransportNetworkFunctions {

    private TransportNetworkFunctions() {}

    public static java.lang.Long SumBandwithRequirements_aE__aA_byte_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNetwork) {
      return DynamicResourceUtil.invoke(ITransportNetworkFunctionsImpl.class, TransportNetworkFunctionsImpl.INSTANCE, transportNetwork).SumBandwithRequirements_aE__aA_byte_aC_(environment, transportNetwork);
    }

    public static java.lang.Long SumBandwithRequirementsReserve_aE__aA_byte_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode environment, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNetwork) {
      return DynamicResourceUtil.invoke(ITransportNetworkFunctionsImpl.class, TransportNetworkFunctionsImpl.INSTANCE, transportNetwork).SumBandwithRequirementsReserve_aE__aA_byte_aC_(environment, transportNetwork);
    }

    public static java.lang.Long Capacity_aE__aA_bytes_aC_(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.ITransportNetwork transportNetwork) {
      return DynamicResourceUtil.invoke(ITransportNetworkFunctionsImpl.class, TransportNetworkFunctionsImpl.INSTANCE, transportNetwork).Capacity_aE__aA_bytes_aC_(transportNetwork);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,010c10e4-a0c9-11ea-8daa-afb4679c3497,k/I35bayOZ5jBgTnnzBCg7FArM0=] */
