package cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StaticTest extends DynamicResource implements IStaticTest {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTest> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTest>() {
    
    @Override
    public IStaticTest create() {
      return new StaticTest();
    }
    
    @Override
    public IStaticTest create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StaticTest(resourceRepository, resource);
    }
  
  };

  public StaticTest() {
    super(IStaticTest.TYPE_ID);
  }
  
  public StaticTest(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStaticTest.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public StaticTest setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectRequirement() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_requirement);
  }

  public StaticTest setRequirement(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
    _setSingle(cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_requirement, requirement);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public StaticTest setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest> selectTestRequirements() {
    return _getMap(cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_testRequirements);
  }

  public StaticTest setTestRequirements(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest> testRequirements) {
    _setMap(cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_testRequirements, testRequirements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestResult> selectTestResult() {
    return _getMap(cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestResult.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_testResult);
  }

  public StaticTest setTestResult(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestResult> testResult) {
    _setMap(cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_testResult, testResult);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StaticTest setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_requirement, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptMap(cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_testRequirements, visitor);
    _acceptMap(cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestResult.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_testResult, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest> selectToMeRequirement(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_requirement, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest selectToMeTestResult(cleon.implementation.testing.spec.testing._09_test_execution.javamodel.ITestResult object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_testResult, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest selectToMeTestRequirements(cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.StaticTest_testRequirements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7cffe5db-1cf1-11e6-aaba-9db7fdc64d7e,yNJToBHqBq5Jx/FhI+zN9AYalHU=] */
