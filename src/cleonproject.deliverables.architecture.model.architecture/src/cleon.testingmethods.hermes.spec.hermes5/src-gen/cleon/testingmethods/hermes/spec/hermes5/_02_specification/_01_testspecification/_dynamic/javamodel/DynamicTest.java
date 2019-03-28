package cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DynamicTest extends DynamicResource implements IDynamicTest {

  // abstract implementation, only used for static method calls
  private DynamicTest() {
    super(IDynamicTest.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.IDynamicTest selectToMeTestSteps(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.ITestStep object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.IDynamicTest.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_testSteps, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.IDynamicTest selectToMeTestPreconditions(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.ITestPrecondition object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.IDynamicTest.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic._dynamicPackage.DynamicTest_testPreconditions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bded44f4-4f8c-11e9-ad5d-977b17aab907,V0yqI/PYgBU6sMJ/zqhmD5WnAWM=] */
