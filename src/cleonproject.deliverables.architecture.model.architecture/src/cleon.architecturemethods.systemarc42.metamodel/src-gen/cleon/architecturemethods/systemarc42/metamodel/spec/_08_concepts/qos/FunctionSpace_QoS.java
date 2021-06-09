package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[010c10e4-a0c9-11ea-8daa-afb4679c3497,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.FunctionSpace_Topology.IAbstractHostFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.FunctionSpace_Communication.ISourceFunctions;
import java.util.stream.Collectors;

/* End Protected Region   [[010c10e4-a0c9-11ea-8daa-afb4679c3497,imports]] */

public class FunctionSpace_QoS {

  /* Begin Protected Region [[010c10e4-a0c9-11ea-8daa-afb4679c3497]] */

  /* End Protected Region   [[010c10e4-a0c9-11ea-8daa-afb4679c3497]] */


  public static interface IQoSConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9cb503c2-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS_Mean();

  }
  
  public static interface IQoSConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9cb503c2-1d92-11e9-b601-db75aa6f89a4")
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept);

  }
  
  public static class QoSConceptFunctionsImpl implements IQoSConceptFunctionsImpl {

    public static final IQoSConceptFunctionsImpl INSTANCE = new QoSConceptFunctionsImpl();

    private QoSConceptFunctionsImpl() {}

    @Override
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept) {
      /* Begin Protected Region [[9cb503c2-1d92-11e9-b601-db75aa6f89a4]] */
      return qoSConcept.selectQosConfigurationConcept().values().stream().mapToInt(x -> {
      	final IQoSSystemConfigurationConceptFunctions functions = x.extension(IQoSSystemConfigurationConceptFunctions.class);
      	return functions.SumQoS_Mean();
      }).sum();
      /* End Protected Region   [[9cb503c2-1d92-11e9-b601-db75aa6f89a4]] */
    }

  }
  
  public static class QoSConceptFunctions {

    private QoSConceptFunctions() {}

    public static java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSConcept qoSConcept) {
      return DynamicResourceUtil.invoke(IQoSConceptFunctionsImpl.class, QoSConceptFunctionsImpl.INSTANCE, qoSConcept).SumQoS_Mean(qoSConcept);
    }

  }

  public static interface IQoSSystemConfigurationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1d205486-a0c9-11ea-8daa-afb4679c3497")
    public java.lang.Integer SumQoS_Mean();

    @IDynamicResourceExtension.MethodId("cb87ba0f-c850-11ea-a92a-436f8b822db6")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> SelectAllowedSource();

  }
  
  public static interface IQoSSystemConfigurationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1d205486-a0c9-11ea-8daa-afb4679c3497")
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept);

  }
  
  public static class QoSSystemConfigurationConceptFunctionsImpl implements IQoSSystemConfigurationConceptFunctionsImpl {

    public static final IQoSSystemConfigurationConceptFunctionsImpl INSTANCE = new QoSSystemConfigurationConceptFunctionsImpl();

    private QoSSystemConfigurationConceptFunctionsImpl() {}

    @Override
    public java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept) {
      /* Begin Protected Region [[1d205486-a0c9-11ea-8daa-afb4679c3497]] */
      return qoSSystemConfigurationConcept.selectQoSSystemConfigurationDestination().values().stream().mapToInt( IQoSSystemConfigurationSource::selectEstimateMean_KBits ).sum();
      /* End Protected Region   [[1d205486-a0c9-11ea-8daa-afb4679c3497]] */
    }

  }
  
  public static class QoSSystemConfigurationConceptFunctions {

    private QoSSystemConfigurationConceptFunctions() {}

    public static java.lang.Integer SumQoS_Mean(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationConcept qoSSystemConfigurationConcept) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationConceptFunctionsImpl.class, QoSSystemConfigurationConceptFunctionsImpl.INSTANCE, qoSSystemConfigurationConcept).SumQoS_Mean(qoSSystemConfigurationConcept);
    }

  }

  public static interface IQoSSystemConfigurationSourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0824a30c-308e-11eb-9149-f1e36a7322e5")
    public java.lang.Integer DestinationVLAN();

    @IDynamicResourceExtension.MethodId("f825adb4-308e-11eb-9149-f1e36a7322e5")
    public java.lang.String SourceVLAN();

  }
  
  public static interface IQoSSystemConfigurationSourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class QoSSystemConfigurationSourceFunctionsImpl implements IQoSSystemConfigurationSourceFunctionsImpl {

    public static final IQoSSystemConfigurationSourceFunctionsImpl INSTANCE = new QoSSystemConfigurationSourceFunctionsImpl();

    private QoSSystemConfigurationSourceFunctionsImpl() {}

  }
  
  public static class QoSSystemConfigurationSourceFunctions {

    private QoSSystemConfigurationSourceFunctions() {}

  }

  public static interface ISystemEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("82f449c6-a98e-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("9791b23c-a98e-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("27b0fc13-a99a-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSingleHost> SourceSingleHost(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("49c24c0b-a99a-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSingleHost> DestinationSingleHost(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

    @IDynamicResourceExtension.MethodId("42a84883-c930-11eb-a152-570abd1640d5")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment OnlyWithValidHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

  }
  
  public static interface ISystemEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("82f449c6-a98e-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment systemEnvironment);

    @IDynamicResourceExtension.MethodId("9791b23c-a98e-11eb-8f9b-01c801f6a12b")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment systemEnvironment);

    @IDynamicResourceExtension.MethodId("42a84883-c930-11eb-a152-570abd1640d5")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment OnlyWithValidHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment systemEnvironment);

  }
  
  public static class SystemEnvironmentFunctionsImpl implements ISystemEnvironmentFunctionsImpl {

    public static final ISystemEnvironmentFunctionsImpl INSTANCE = new SystemEnvironmentFunctionsImpl();

    private SystemEnvironmentFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment systemEnvironment) {
      /* Begin Protected Region [[82f449c6-a98e-11eb-8f9b-01c801f6a12b]] */
      final var source = qoSSystemConfigurationSource.selectSource();
      final var sourceFunctions = source.extension(ISourceFunctions.class);
      final var hosts = source.selectSourceSystemConfiguration().extension(ISystemConfigurationFunctions.class).AllHostsWithEnvironment(systemEnvironment);
      return hosts.stream().filter(x -> x.extension(IAbstractHostFunctions.class).Subzones().stream().anyMatch(sz -> sourceFunctions.SourceSecuritySubzones().contains(sz))).collect(Collectors.toList());
      /* End Protected Region   [[82f449c6-a98e-11eb-8f9b-01c801f6a12b]] */
    }

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment systemEnvironment) {
      /* Begin Protected Region [[9791b23c-a98e-11eb-8f9b-01c801f6a12b]] */
      final var source = qoSSystemConfigurationSource.selectSource();
      final var sourceFunctions = source.extension(ISourceFunctions.class);
      final var destination = sourceFunctions.Destination();
      final var hosts = destination.selectDestinationSystemConfiguration().extension(ISystemConfigurationFunctions.class).AllHostsWithEnvironment(systemEnvironment);
      return hosts.stream().filter(x -> x.extension(IAbstractHostFunctions.class).Subzones().stream().anyMatch(sz -> sourceFunctions.DestinationSubSecurityZone().selectInInterface().selectInterfaceInSecuritySubZone().equals(sz))).collect(Collectors.toList());
      /* End Protected Region   [[9791b23c-a98e-11eb-8f9b-01c801f6a12b]] */
    }

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment OnlyWithValidHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment systemEnvironment) {
      /* Begin Protected Region [[42a84883-c930-11eb-a152-570abd1640d5]] */
      if( SourceHosts(qoSSystemConfigurationSource, systemEnvironment).isEmpty()) {
      	return null;
      }

      if( DestinationHosts(qoSSystemConfigurationSource, systemEnvironment).isEmpty()) {
      	return null;
      }

      return systemEnvironment;
      /* End Protected Region   [[42a84883-c930-11eb-a152-570abd1640d5]] */
    }

  }
  
  public static class SystemEnvironmentFunctions {

    private SystemEnvironmentFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> SourceHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment systemEnvironment) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentFunctionsImpl.class, SystemEnvironmentFunctionsImpl.INSTANCE, systemEnvironment).SourceHosts(qoSSystemConfigurationSource, systemEnvironment);
    }

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> DestinationHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment systemEnvironment) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentFunctionsImpl.class, SystemEnvironmentFunctionsImpl.INSTANCE, systemEnvironment).DestinationHosts(qoSSystemConfigurationSource, systemEnvironment);
    }

    public static cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment OnlyWithValidHosts(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource, final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment systemEnvironment) {
      return DynamicResourceUtil.invoke(ISystemEnvironmentFunctionsImpl.class, SystemEnvironmentFunctionsImpl.INSTANCE, systemEnvironment).OnlyWithValidHosts(qoSSystemConfigurationSource, systemEnvironment);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,010c10e4-a0c9-11ea-8daa-afb4679c3497,4fV5WA6P2wIk4q1+1UfLgQLBpPw=] */
