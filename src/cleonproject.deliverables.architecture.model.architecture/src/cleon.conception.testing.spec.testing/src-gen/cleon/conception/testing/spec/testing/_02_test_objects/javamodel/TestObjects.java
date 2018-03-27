package cleon.conception.testing.spec.testing._02_test_objects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestObjects extends DynamicResource implements ITestObjects {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestObjects> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestObjects>() {
    
    @Override
    public ITestObjects create() {
      return new TestObjects();
    }
    
    @Override
    public ITestObjects create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestObjects(resourceRepository, resource);
    }
  
  };

  public TestObjects() {
    super(ITestObjects.TYPE_ID);
  }
  
  public TestObjects(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestObjects.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public TestObjects setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObject> selectDynamicTestObjects() {
    return _getMap(cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObject.class, cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_dynamicTestObjects);
  }

  public TestObjects setDynamicTestObjects(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObject> dynamicTestObjects) {
    _setMap(cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_dynamicTestObjects, dynamicTestObjects);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes> selectOutcomes() {
    return _getList(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes.class, cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_outcomes);
  }

  public TestObjects setOutcomes(java.util.List<? extends cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes> outcomes) {
    _setList(cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_outcomes, outcomes);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObject> selectStaticTestObjects() {
    return _getMap(cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObject.class, cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_staticTestObjects);
  }

  public TestObjects setStaticTestObjects(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObject> staticTestObjects) {
    _setMap(cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_staticTestObjects, staticTestObjects);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestObjects setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptMap(cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObject.class, cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_dynamicTestObjects, visitor);
    _acceptList(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes.class, cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_outcomes, visitor);
    _acceptMap(cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObject.class, cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_staticTestObjects, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObjects selectToMeStaticTestObjects(cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObject object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObjects.class, cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_staticTestObjects, object.getResource());
  }
  
  public static cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObjects selectToMeDynamicTestObjects(cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObject object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObjects.class, cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_dynamicTestObjects, object.getResource());
  }
  
  public static java.util.List<cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObjects> selectToMeOutcomes(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes object) {
    return _getToMeList(object.getRepository(), cleon.conception.testing.spec.testing._02_test_objects.javamodel.ITestObjects.class, cleon.conception.testing.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_outcomes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fcd96549-1519-11e6-a185-8f02bf3f95ba,Rk7aDvZzcypRPcxw9KmxNe3szcM=] */
