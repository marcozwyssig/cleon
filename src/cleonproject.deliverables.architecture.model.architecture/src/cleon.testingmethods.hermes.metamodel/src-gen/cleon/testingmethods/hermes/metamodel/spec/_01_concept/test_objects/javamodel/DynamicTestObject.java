package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DynamicTestObject extends DynamicResource implements IDynamicTestObject {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestObject> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestObject>() {
    
    @Override
    public IDynamicTestObject create() {
      return new DynamicTestObject();
    }
    
    @Override
    public IDynamicTestObject create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DynamicTestObject(resourceRepository, resource);
    }
  
  };

  public DynamicTestObject() {
    super(IDynamicTestObject.TYPE_ID);
  }
  
  public DynamicTestObject(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDynamicTestObject.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.Test_objectsPackage.TestObject_deliverable);
  }

  public DynamicTestObject setDeliverable(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.Test_objectsPackage.TestObject_deliverable, deliverable);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DynamicTestObject setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DynamicTestObject setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.Test_objectsPackage.TestObject_deliverable, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c76aea0e-5165-11e9-bb61-971a423d31e9,Jt52GNMdSlS3yjVcmyDdmxDG7OY=] */
