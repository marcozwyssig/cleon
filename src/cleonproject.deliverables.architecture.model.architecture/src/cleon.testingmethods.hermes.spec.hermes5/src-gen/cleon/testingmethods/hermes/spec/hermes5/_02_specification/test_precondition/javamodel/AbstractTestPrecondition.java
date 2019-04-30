package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractTestPrecondition extends DynamicResource implements IAbstractTestPrecondition {

  // abstract implementation, only used for static method calls
  private AbstractTestPrecondition() {
    super(IAbstractTestPrecondition.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.IAbstractTestPrecondition> selectToMeTestInfrastructure(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.javamodel.ITestInfrastracture object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.IAbstractTestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.AbstractTestPrecondition_testInfrastructure, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,491bb959-6b2b-11e9-bd30-87fcf852dea7,chWcaljaVXyOVZFJrLGKV+Ct6Gs=] */
