package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestUserAware extends DynamicResource implements ITestUserAware {

  // abstract implementation, only used for static method calls
  private TestUserAware() {
    super(ITestUserAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestUserAware> selectToMeTestUser(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_infrastructure.test_users.javamodel.ITestUser object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.javamodel.ITestUserAware.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.test_step.Test_stepPackage.TestUserAware_testUser, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5da2706c-715b-11e9-98e0-2719d32d2629,RVROMLidjO66gEFjIfLVoaQt7mk=] */
