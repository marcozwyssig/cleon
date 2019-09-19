package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QualityDynamicTest extends DynamicResource implements IQualityDynamicTest {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityDynamicTest> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityDynamicTest>() {
    
    @Override
    public IQualityDynamicTest create() {
      return new QualityDynamicTest();
    }
    
    @Override
    public IQualityDynamicTest create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QualityDynamicTest(resourceRepository, resource);
    }
  
  };

  public QualityDynamicTest() {
    super(IQualityDynamicTest.TYPE_ID);
  }
  
  public QualityDynamicTest(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQualityDynamicTest.TYPE_ID);
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
  public java.lang.String selectExternalReferenceId() {
    return _getSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_externalReferenceId);
  }
    
  public void setExternalReferenceId(java.lang.String externalReferenceId) {
     _setSingleAttribute(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_externalReferenceId, externalReferenceId);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectTestGoals() {
    return _getListAttribute(java.lang.String.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_testGoals);
  }
    
  public void setTestGoals(java.util.List<java.lang.String> testGoals) {
     _setListAttribute(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_testGoals, testGoals);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public QualityDynamicTest setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public QualityDynamicTest setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public QualityDynamicTest setNoChapters(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public QualityDynamicTest setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.chapter.references.javamodel.IReference selectReference() {
    return _getSingle(cleon.common.doc.spec.doc.chapter.references.javamodel.IReference.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_reference);
  }

  public QualityDynamicTest setReference(cleon.common.doc.spec.doc.chapter.references.javamodel.IReference reference) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_reference, reference);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup> selectTestGlobalPrecondition() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.GlobalPreconditionsAware_testGlobalPrecondition);
  }

  public QualityDynamicTest setTestGlobalPrecondition(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup> testGlobalPrecondition) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.GlobalPreconditionsAware_testGlobalPrecondition, testGlobalPrecondition);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition> selectTestPreconditions() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPreconditionAwareList_testPreconditions);
  }

  public QualityDynamicTest setTestPreconditions(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition> testPreconditions) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPreconditionAwareList_testPreconditions, testPreconditions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep> selectTestSteps() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTest_testSteps);
  }

  public QualityDynamicTest setTestSteps(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep> testSteps) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTest_testSteps, testSteps);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QualityDynamicTest setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_externalReferenceId, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_testGoals, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.chapter.references.javamodel.IReference.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.AbstractDynamicTest_reference, visitor);
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IUsedTestGlobalPreconditionGroup.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.GlobalPreconditionsAware_testGlobalPrecondition, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPreconditionAwareList_testPreconditions, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.test_step.javamodel.ITestStep.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTest_testSteps, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e68767f9-4f8c-11e9-ad5d-977b17aab907,MwwYr9zrxrYNS8Y1p+fk2aKpHdg=] */
