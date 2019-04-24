package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StaticTestObject extends DynamicResource implements IStaticTestObject {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTestObject> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTestObject>() {
    
    @Override
    public IStaticTestObject create() {
      return new StaticTestObject();
    }
    
    @Override
    public IStaticTestObject create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StaticTestObject(resourceRepository, resource);
    }
  
  };

  public StaticTestObject() {
    super(IStaticTestObject.TYPE_ID);
  }
  
  public StaticTestObject(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStaticTestObject.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.Test_objectsPackage.TestObject_deliverable);
  }

  public StaticTestObject setDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.Test_objectsPackage.TestObject_deliverable, deliverable);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public StaticTestObject setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StaticTestObject setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.Test_objectsPackage.TestObject_deliverable, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cf5dabee-5165-11e9-bb61-971a423d31e9,oy7ZDRYdvR+O9Z3k30uof16Axy8=] */
