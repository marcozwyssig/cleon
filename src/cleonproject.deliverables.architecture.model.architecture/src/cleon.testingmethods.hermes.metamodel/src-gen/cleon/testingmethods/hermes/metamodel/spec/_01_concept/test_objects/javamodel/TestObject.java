package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class TestObject extends DynamicResource implements ITestObject {

  // abstract implementation, only used for static method calls
  private TestObject() {
    super(ITestObject.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject> selectToMeDeliverable(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.Test_objectsPackage.TestObject_deliverable, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,24f8dba0-eabf-11e5-838a-6dbe7118dd11,qJESASOes9Nt8wFPO5nT06O+cuY=] */
