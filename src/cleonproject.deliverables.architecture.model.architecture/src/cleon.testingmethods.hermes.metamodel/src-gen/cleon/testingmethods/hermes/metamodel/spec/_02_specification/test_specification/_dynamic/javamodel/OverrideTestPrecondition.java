package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class OverrideTestPrecondition extends DynamicResource implements IOverrideTestPrecondition {

  // abstract implementation, only used for static method calls
  private OverrideTestPrecondition() {
    super(IOverrideTestPrecondition.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition> selectToMeTestPrecondition(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPrecondition object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.OverrideTestPrecondition_testPrecondition, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,64ed6b39-67ea-11e9-9ec9-5fbc84faaeb1,FQaMpknzoaGrMaru1C0imONPMZU=] */
