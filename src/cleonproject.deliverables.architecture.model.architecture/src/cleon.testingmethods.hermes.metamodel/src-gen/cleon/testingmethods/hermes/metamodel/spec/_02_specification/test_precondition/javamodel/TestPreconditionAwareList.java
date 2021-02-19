package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestPreconditionAwareList extends DynamicResource implements ITestPreconditionAwareList {

  // abstract implementation, only used for static method calls
  private TestPreconditionAwareList() {
    super(ITestPreconditionAwareList.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPreconditionAwareList selectToMeTestPreconditions(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPrecondition object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestPreconditionAwareList.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.Test_preconditionPackage.TestPreconditionAwareList_testPreconditions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5e8c0206-67eb-11e9-9ec9-5fbc84faaeb1,ZJDbwXXT4uqoflnCrrtXj8Nk3iU=] */
