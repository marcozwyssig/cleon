package cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestObject extends DynamicResource implements ITestObject {

  // abstract implementation, only used for static method calls
  private TestObject() {
    super(ITestObject.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject> selectToMeDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects._02_test_objectsPackage.TestObject_deliverable, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,24f8dba0-eabf-11e5-838a-6dbe7118dd11,8wy1SWI1Q/pTcnIGQNDSYMxEH7E=] */
