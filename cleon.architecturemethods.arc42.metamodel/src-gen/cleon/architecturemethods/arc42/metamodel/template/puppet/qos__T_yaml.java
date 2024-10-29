package cleon.architecturemethods.arc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7efd3326-a0e1-11ea-8daa-afb4679c3497,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.QosPackage;
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.FunctionSpace_SystemConfiguration.ISystemConfigurationFunctions;
import java.util.stream.Collectors;
/* End Protected Region   [[7efd3326-a0e1-11ea-8daa-afb4679c3497,imports]] */

public class qos__T_yaml {

  /* Begin Protected Region [[7efd3326-a0e1-11ea-8daa-afb4679c3497]] */

  /* End Protected Region   [[7efd3326-a0e1-11ea-8daa-afb4679c3497]] */


  public static interface IServiceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a5d67638-a0e2-11ea-8daa-afb4679c3497")
    public java.lang.String PolicyName(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource qoSSystemConfigurationSource);

  }
  
  public static interface IServiceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ServiceFunctionsImpl implements IServiceFunctionsImpl {

    public static final IServiceFunctionsImpl INSTANCE = new ServiceFunctionsImpl();

    private ServiceFunctionsImpl() {}

  }
  
  public static class ServiceFunctions {

    private ServiceFunctions() {}

  }

  public static interface IQoSSystemConfigurationSourceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("da9e57ef-5289-11ec-9fcc-f3bdcf3059b2")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource> WithoutDF();

  }
  
  public static interface IQoSSystemConfigurationSourceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("da9e57ef-5289-11ec-9fcc-f3bdcf3059b2")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource> WithoutDF(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource> qoSSystemConfigurationSourceList);

  }
  
  public static class QoSSystemConfigurationSourceFunctionsImpl implements IQoSSystemConfigurationSourceFunctionsImpl {

    public static final IQoSSystemConfigurationSourceFunctionsImpl INSTANCE = new QoSSystemConfigurationSourceFunctionsImpl();

    private QoSSystemConfigurationSourceFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource> WithoutDF(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource> qoSSystemConfigurationSourceList) {
      /* Begin Protected Region [[da9e57ef-5289-11ec-9fcc-f3bdcf3059b2]] */
      return qoSSystemConfigurationSourceList.stream().filter(x -> !x.selectServiceClass().getResource().equals(QosPackage.DSCP_DF__F___S___F_Standard)).collect(Collectors.toList());
      /* End Protected Region   [[da9e57ef-5289-11ec-9fcc-f3bdcf3059b2]] */
    }

  }
  
  public static class QoSSystemConfigurationSourceFunctions {

    private QoSSystemConfigurationSourceFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource> WithoutDF(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationSource> qoSSystemConfigurationSourceList) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationSourceFunctionsImpl.class, QoSSystemConfigurationSourceFunctionsImpl.INSTANCE, qoSSystemConfigurationSourceList).WithoutDF(qoSSystemConfigurationSourceList);
    }

  }

  public static interface IQoSSystemConfigurationConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d111661f-528c-11ec-9fcc-f3bdcf3059b2")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept> OnlyWithOperationSystem();

  }
  
  public static interface IQoSSystemConfigurationConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("d111661f-528c-11ec-9fcc-f3bdcf3059b2")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept> OnlyWithOperationSystem(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept> qoSSystemConfigurationConceptList);

  }
  
  public static class QoSSystemConfigurationConceptFunctionsImpl implements IQoSSystemConfigurationConceptFunctionsImpl {

    public static final IQoSSystemConfigurationConceptFunctionsImpl INSTANCE = new QoSSystemConfigurationConceptFunctionsImpl();

    private QoSSystemConfigurationConceptFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept> OnlyWithOperationSystem(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept> qoSSystemConfigurationConceptList) {
      /* Begin Protected Region [[d111661f-528c-11ec-9fcc-f3bdcf3059b2]] */
      return qoSSystemConfigurationConceptList.stream().filter(x -> x.selectConceptForSystemConfiguration().extension(ISystemConfigurationFunctions.class).IsDependsOnLinux() || x.selectConceptForSystemConfiguration().extension(ISystemConfigurationFunctions.class).IsDependsOnWindows() ).collect(Collectors.toList());
      /* End Protected Region   [[d111661f-528c-11ec-9fcc-f3bdcf3059b2]] */
    }

  }
  
  public static class QoSSystemConfigurationConceptFunctions {

    private QoSSystemConfigurationConceptFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept> OnlyWithOperationSystem(final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.qos.javamodel.IQoSSystemConfigurationConcept> qoSSystemConfigurationConceptList) {
      return DynamicResourceUtil.invoke(IQoSSystemConfigurationConceptFunctionsImpl.class, QoSSystemConfigurationConceptFunctionsImpl.INSTANCE, qoSSystemConfigurationConceptList).OnlyWithOperationSystem(qoSSystemConfigurationConceptList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7efd3326-a0e1-11ea-8daa-afb4679c3497,ON1PaOli3dTDJwlf7l6HHu0GTUo=] */
