package cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DynamicTestSpecification extends DynamicResource implements IDynamicTestSpecification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestSpecification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestSpecification>() {
    
    @Override
    public IDynamicTestSpecification create() {
      return new DynamicTestSpecification();
    }
    
    @Override
    public IDynamicTestSpecification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DynamicTestSpecification(resourceRepository, resource);
    }
  
  };

  public DynamicTestSpecification() {
    super(IDynamicTestSpecification.TYPE_ID);
  }
  
  public DynamicTestSpecification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDynamicTestSpecification.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DynamicTestSpecification setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.test._01_concept._02_test_objects.javamodel.ITestObject selectTestObject() {
    return _getSingle(cleon.architecturemethods.eamod.spec.test._01_concept._02_test_objects.javamodel.ITestObject.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._07_testspecificationPackage.TestSpecification_testObject);
  }

  public DynamicTestSpecification setTestObject(cleon.architecturemethods.eamod.spec.test._01_concept._02_test_objects.javamodel.ITestObject testObject) {
    _setSingle(cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._07_testspecificationPackage.TestSpecification_testObject, testObject);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DynamicTestSpecification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.test._01_concept._02_test_objects.javamodel.ITestObject.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._07_testspecificationPackage.TestSpecification_testObject, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04d3d8a4-1cf0-11e6-aaba-9db7fdc64d7e,W48TAeDEjmeoq+RIZ2IuTxOW400=] */
