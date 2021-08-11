package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel;

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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument> selectDynamicTestLevelSpecification() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestSpecification_dynamicTestLevelSpecification);
  }

  public DynamicTestSpecification setDynamicTestLevelSpecification(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument> dynamicTestLevelSpecification) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestSpecification_dynamicTestLevelSpecification, dynamicTestLevelSpecification);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages selectRequirements_coverage() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestSpecification_requirements_aE_coverage);
  }

  public DynamicTestSpecification setRequirements_coverage(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages requirements_coverage) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestSpecification_requirements_aE_coverage, requirements_coverage);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DynamicTestSpecification setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject selectTestObject() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.Test_specificationPackage.TestSpecification_testObject);
  }

  public DynamicTestSpecification setTestObject(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject testObject) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.Test_specificationPackage.TestSpecification_testObject, testObject);
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
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestSpecification_dynamicTestLevelSpecification, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestSpecification_requirements_aE_coverage, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.Test_specificationPackage.TestSpecification_testObject, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification selectToMeDynamicTestLevelSpecification(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestSpecification_dynamicTestLevelSpecification, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification selectToMeRequirements_coverage(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestSpecification_requirements_aE_coverage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04d3d8a4-1cf0-11e6-aaba-9db7fdc64d7e,GGukBsqLHpbeo2If4wGHcCO/RRY=] */
