package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestInfrastractureAware extends DynamicResource implements ITestInfrastractureAware {

  // abstract implementation, only used for static method calls
  private TestInfrastractureAware() {
    super(ITestInfrastractureAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestInfrastractureAware> selectToMeTestInfrastructure(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.javamodel.IAbstractTestInfrastracture object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestInfrastractureAware.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestInfrastractureAware_testInfrastructure, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,413fdf28-6d8a-11e9-b84d-d319514e887f,FrXaNlFPzYThQ0HMYmfzNXbpwTA=] */
