package cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel;

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
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public StaticTest setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public StaticTest setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public StaticTest setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectRequirement() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_requirement);
  }

  public StaticTest setRequirement(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
    _setSingle(cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_requirement, requirement);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest> selectTestRequirements() {
    return _getMap(cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_testRequirements);
  }

  public StaticTest setTestRequirements(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest> testRequirements) {
    _setMap(cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_testRequirements, testRequirements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.test._03_execution._09_test_execution.javamodel.ITestResult> selectTestResult() {
    return _getMap(cleon.architecturemethods.eamod.spec.test._03_execution._09_test_execution.javamodel.ITestResult.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_testResult);
  }

  public StaticTest setTestResult(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.test._03_execution._09_test_execution.javamodel.ITestResult> testResult) {
    _setMap(cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_testResult, testResult);
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
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_requirement, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptMap(cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_testRequirements, visitor);
    _acceptMap(cleon.architecturemethods.eamod.spec.test._03_execution._09_test_execution.javamodel.ITestResult.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_testResult, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest> selectToMeRequirement(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_requirement, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest selectToMeTestResult(cleon.architecturemethods.eamod.spec.test._03_execution._09_test_execution.javamodel.ITestResult object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_testResult, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest selectToMeTestRequirements(cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static.javamodel.IStaticTest.class, cleon.architecturemethods.eamod.spec.test._02_specification._07_testspecification._static._staticPackage.StaticTest_testRequirements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7cffe5db-1cf1-11e6-aaba-9db7fdc64d7e,zjj2c02qmousF64YPiBa14Pi5MM=] */
