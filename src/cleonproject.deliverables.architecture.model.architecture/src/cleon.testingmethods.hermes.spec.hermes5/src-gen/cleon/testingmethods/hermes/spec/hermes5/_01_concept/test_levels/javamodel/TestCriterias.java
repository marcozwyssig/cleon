package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestCriterias extends DynamicResource implements ITestCriterias {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestCriterias> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestCriterias>() {
    
    @Override
    public ITestCriterias create() {
      return new TestCriterias();
    }
    
    @Override
    public ITestCriterias create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestCriterias(resourceRepository, resource);
    }
  
  };

  public TestCriterias() {
    super(ITestCriterias.TYPE_ID);
  }
  
  public TestCriterias(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestCriterias.TYPE_ID);
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

  // relations
  
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria selectAcceptance() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_acceptance);
  }

  public TestCriterias setAcceptance(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria acceptance) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_acceptance, acceptance);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria> selectCancelation() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_cancelation);
  }

  public TestCriterias setCancelation(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria> cancelation) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_cancelation, cancelation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public TestCriterias setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestCriterias setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria selectExecution() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_execution);
  }

  public TestCriterias setExecution(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria execution) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_execution, execution);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria> selectFinishing() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_finishing);
  }

  public TestCriterias setFinishing(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria> finishing) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_finishing, finishing);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria selectInputCriteria() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_inputCriteria);
  }

  public TestCriterias setInputCriteria(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria inputCriteria) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_inputCriteria, inputCriteria);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestCriterias setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria selectPreparation() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_preparation);
  }

  public TestCriterias setPreparation(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria preparation) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_preparation, preparation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestCriterias setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_acceptance, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_cancelation, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_execution, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_finishing, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_inputCriteria, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_preparation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias selectToMeInputCriteria(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_inputCriteria, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias selectToMePreparation(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_preparation, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias selectToMeExecution(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_execution, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias selectToMeAcceptance(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_acceptance, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias selectToMeCancelation(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_cancelation, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias selectToMeFinishing(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriteria object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestCriterias.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestCriterias_finishing, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3bda8f69-5155-11e9-bb61-971a423d31e9,4L0ugr46QLnD9/HZUlLfO95gQ8w=] */
