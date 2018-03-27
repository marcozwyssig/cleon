package cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestSubjectArea extends DynamicResource implements ITestSubjectArea {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSubjectArea> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSubjectArea>() {
    
    @Override
    public ITestSubjectArea create() {
      return new TestSubjectArea();
    }
    
    @Override
    public ITestSubjectArea create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestSubjectArea(resourceRepository, resource);
    }
  
  };

  public TestSubjectArea() {
    super(ITestSubjectArea.TYPE_ID);
  }
  
  public TestSubjectArea(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestSubjectArea.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements);
  }

  public TestSubjectArea setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea selectSubjectArea() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.TestSubjectArea_subjectArea);
  }

  public TestSubjectArea setSubjectArea(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea subjectArea) {
    _setSingle(cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.TestSubjectArea_subjectArea, subjectArea);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestSubjectArea setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest> selectTestRequirements() {
    return _getMap(cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.TestSubjectArea_testRequirements);
  }

  public TestSubjectArea setTestRequirements(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest> testRequirements) {
    _setMap(cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.TestSubjectArea_testRequirements, testRequirements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestSubjectArea setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.document.DocumentPackage.AbstractDocument_documentElements, visitor);
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.TestSubjectArea_subjectArea, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptMap(cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.TestSubjectArea_testRequirements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.ITestSubjectArea> selectToMeSubjectArea(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea object) {
    return _getToMeList(object.getRepository(), cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.ITestSubjectArea.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.TestSubjectArea_subjectArea, object.getResource());
  }
  
  public static cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.ITestSubjectArea selectToMeTestRequirements(cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest object) {
    return _getToMeSingle(object.getRepository(), cleon.implementation.testing.spec.testing._07_testspecification._static.javamodel.ITestSubjectArea.class, cleon.implementation.testing.spec.testing._07_testspecification._static._staticPackage.TestSubjectArea_testRequirements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cfa22ec4-1cf0-11e6-aaba-9db7fdc64d7e,u7KxGWDVrEve5AsqPtFQxoFNmFw=] */
