package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestLevelGoals extends DynamicResource implements ITestLevelGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestLevelGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestLevelGoals>() {
    
    @Override
    public ITestLevelGoals create() {
      return new TestLevelGoals();
    }
    
    @Override
    public ITestLevelGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestLevelGoals(resourceRepository, resource);
    }
  
  };

  public TestLevelGoals() {
    super(ITestLevelGoals.TYPE_ID);
  }
  
  public TestLevelGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestLevelGoals.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_chapters);
  }

  public TestLevelGoals setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestLevelGoals setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestLevelGoals setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_goals.javamodel.ITestGoal> selectTestGoals() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_goals.javamodel.ITestGoal.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestLevelGoals_testGoals);
  }

  public TestLevelGoals setTestGoals(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_goals.javamodel.ITestGoal> testGoals) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestLevelGoals_testGoals, testGoals);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestLevelGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_goals.javamodel.ITestGoal.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestLevelGoals_testGoals, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestLevelGoals> selectToMeTestGoals(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_goals.javamodel.ITestGoal object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.javamodel.ITestLevelGoals.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_levels.Test_levelsPackage.TestLevelGoals_testGoals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ece42cc0-5154-11e9-bb61-971a423d31e9,8ReaxaZSvpEmZJZKHY/gCMMD4go=] */
