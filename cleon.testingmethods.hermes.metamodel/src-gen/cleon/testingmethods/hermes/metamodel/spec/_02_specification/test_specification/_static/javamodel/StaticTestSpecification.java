package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StaticTestSpecification extends DynamicResource implements IStaticTestSpecification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTestSpecification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTestSpecification>() {
    
    @Override
    public IStaticTestSpecification create() {
      return new StaticTestSpecification();
    }
    
    @Override
    public IStaticTestSpecification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StaticTestSpecification(resourceRepository, resource);
    }
  
  };

  public StaticTestSpecification() {
    super(IStaticTestSpecification.TYPE_ID);
  }
  
  public StaticTestSpecification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStaticTestSpecification.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public StaticTestSpecification setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject selectTestObject() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.Test_specificationPackage.TestSpecification_testObject);
  }

  public StaticTestSpecification setTestObject(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject testObject) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.Test_specificationPackage.TestSpecification_testObject, testObject);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestQualityCriterias selectTestQualityCriteria() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestQualityCriterias.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static._staticPackage.StaticTestSpecification_testQualityCriteria);
  }

  public StaticTestSpecification setTestQualityCriteria(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestQualityCriterias testQualityCriteria) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static._staticPackage.StaticTestSpecification_testQualityCriteria, testQualityCriteria);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestSubjectArea> selectTestSubjectAreas() {
    return _getMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestSubjectArea.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static._staticPackage.StaticTestSpecification_testSubjectAreas);
  }

  public StaticTestSpecification setTestSubjectAreas(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestSubjectArea> testSubjectAreas) {
    _setMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static._staticPackage.StaticTestSpecification_testSubjectAreas, testSubjectAreas);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StaticTestSpecification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.Test_specificationPackage.TestSpecification_testObject, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestQualityCriterias.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static._staticPackage.StaticTestSpecification_testQualityCriteria, visitor);
    _acceptMap(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestSubjectArea.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static._staticPackage.StaticTestSpecification_testSubjectAreas, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.IStaticTestSpecification selectToMeTestSubjectAreas(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestSubjectArea object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.IStaticTestSpecification.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static._staticPackage.StaticTestSpecification_testSubjectAreas, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.IStaticTestSpecification selectToMeTestQualityCriteria(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestQualityCriterias object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.IStaticTestSpecification.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static._staticPackage.StaticTestSpecification_testQualityCriteria, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fa8377ef-1cef-11e6-aaba-9db7fdc64d7e,xjaAPfFRC7Et4HLxMTfRTUNDsQ0=] */
