package cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestObject extends DynamicResource implements ITestObject {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestObject> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestObject>() {
    
    @Override
    public ITestObject create() {
      return new TestObject();
    }
    
    @Override
    public ITestObject create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestObject(resourceRepository, resource);
    }
  
  };

  public TestObject() {
    super(ITestObject.TYPE_ID);
  }
  
  public TestObject(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestObject.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects._02_test_objectsPackage.TestObject_deliverable);
  }

  public TestObject setDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects._02_test_objectsPackage.TestObject_deliverable, deliverable);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestObject setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestObject setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects._02_test_objectsPackage.TestObject_deliverable, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject> selectToMeDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects._02_test_objectsPackage.TestObject_deliverable, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,24f8dba0-eabf-11e5-838a-6dbe7118dd11,ZD8qDBYtqYiPYp2wIYdjCi4XkNw=] */
