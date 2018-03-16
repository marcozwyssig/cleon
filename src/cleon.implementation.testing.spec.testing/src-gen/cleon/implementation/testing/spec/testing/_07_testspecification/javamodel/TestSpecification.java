package cleon.implementation.testing.spec.testing._07_testspecification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestSpecification extends DynamicResource implements ITestSpecification {

  // abstract implementation, only used for static method calls
  private TestSpecification() {
    super(ITestSpecification.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.implementation.testing.spec.testing._07_testspecification.javamodel.ITestSpecification> selectToMeTestObject(cleon.implementation.testing.spec.testing._02_test_objects.javamodel.ITestObject object) {
    return _getToMeList(object.getRepository(), cleon.implementation.testing.spec.testing._07_testspecification.javamodel.ITestSpecification.class, cleon.implementation.testing.spec.testing._07_testspecification._07_testspecificationPackage.TestSpecification_testObject, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ade37916-eabe-11e5-838a-6dbe7118dd11,04qvHD4oKOO9+cbiiwn6W/K50Rc=] */
