package cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestLevelUsage extends DynamicResource implements ITestLevelUsage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestLevelUsage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestLevelUsage>() {
    
    @Override
    public ITestLevelUsage create() {
      return new TestLevelUsage();
    }
    
    @Override
    public ITestLevelUsage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestLevelUsage(resourceRepository, resource);
    }
  
  };

  public TestLevelUsage() {
    super(ITestLevelUsage.TYPE_ID);
  }
  
  public TestLevelUsage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestLevelUsage.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public TestLevelUsage setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public TestLevelUsage setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public TestLevelUsage setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestLevelUsage setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestLevelUsage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestCriterias selectTestCriterias() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestCriterias.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testCriterias);
  }

  public TestLevelUsage setTestCriterias(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestCriterias testCriterias) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testCriterias, testCriterias);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevel selectTestLevel() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevel.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testLevel);
  }

  public TestLevelUsage setTestLevel(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevel testLevel) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testLevel, testLevel);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelGoals selectTestLevelGoals() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelGoals.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testLevelGoals);
  }

  public TestLevelUsage setTestLevelGoals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelGoals testLevelGoals) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testLevelGoals, testLevelGoals);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestLevelUsage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestCriterias.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testCriterias, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevel.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testLevel, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelGoals.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testLevelGoals, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelUsage> selectToMeTestLevel(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevel object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelUsage.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testLevel, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelUsage selectToMeTestLevelGoals(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelUsage.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testLevelGoals, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelUsage selectToMeTestCriterias(cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestCriterias object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.javamodel.ITestLevelUsage.class, cleon.testingmethods.hermes.metamodel.spec._01_concept.test_levels.Test_levelsPackage.TestLevelUsage_testCriterias, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a0ed7d6a-264b-11e6-ae54-e50d44645ae7,UtsFtYWvvD8IQACFDIAagOrXyzs=] */