package cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestSpecification extends DynamicResource implements ITestSpecification {

  // abstract implementation, only used for static method calls
  private TestSpecification() {
    super(ITestSpecification.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecification> selectToMeTestObject(cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._01_testspecificationPackage.TestSpecification_testObject, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ade37916-eabe-11e5-838a-6dbe7118dd11,z2Jm9I8jVHojo2j4tmyPiZf6tJs=] */
