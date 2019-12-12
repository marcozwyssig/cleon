package cleon.testingmethods.hermes.spec.hermes5._03_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestExecutionDocument extends DynamicResource implements ITestExecutionDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecutionDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecutionDocument>() {
    
    @Override
    public ITestExecutionDocument create() {
      return new TestExecutionDocument();
    }
    
    @Override
    public ITestExecutionDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestExecutionDocument(resourceRepository, resource);
    }
  
  };

  public TestExecutionDocument() {
    super(ITestExecutionDocument.TYPE_ID);
  }
  
  public TestExecutionDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestExecutionDocument.TYPE_ID);
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
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.doc.spec.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.doc.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.common.doc.doc.spec.chapter.about.javamodel.IAbout selectAbout() {
    return _getSingle(cleon.common.doc.doc.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.doc.spec.chapter.about.AboutPackage.AboutAware_about);
  }

  public TestExecutionDocument setAbout(cleon.common.doc.doc.spec.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.doc.spec.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters);
  }

  public TestExecutionDocument setChapters(java.util.List<? extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable);
  }

  public TestExecutionDocument setDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, deliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.doc.spec.javamodel.IDocumentElement.class, cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public TestExecutionDocument setDocumentElements(java.util.List<? extends cleon.common.doc.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.doc.spec.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_documentLanguage);
  }

  public TestExecutionDocument setDocumentLanguage(java.util.List<? extends cleon.common.doc.doc.spec.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.doc.spec.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.common.glossary.spec.glossary.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary);
  }

  public TestExecutionDocument setGlossary(cleon.common.glossary.spec.glossary.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestExecutionDocument setParagraphs(java.util.List<? extends cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument selectPlanning() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning);
  }

  public TestExecutionDocument setPlanning(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument planning) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, planning);
    return this;
  }
    
  @Override
  public cleon.common.doc.doc.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.doc.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_properties);
  }

  public TestExecutionDocument setProperties(cleon.common.doc.doc.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.doc.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.doc.spec.document.style.javamodel.IStyle.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_style);
  }

  public TestExecutionDocument setStyle(cleon.common.doc.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestExecutions selectTestExecutions() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestExecutions.class, cleon.testingmethods.hermes.spec.hermes5._03_execution._03_executionPackage.TestExecutionDocument_testExecutions);
  }

  public TestExecutionDocument setTestExecutions(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestExecutions testExecutions) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution._03_executionPackage.TestExecutionDocument_testExecutions, testExecutions);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.javamodel.ITestPlan selectTestPlan() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.javamodel.ITestPlan.class, cleon.testingmethods.hermes.spec.hermes5._03_execution._03_executionPackage.TestExecutionDocument_testPlan);
  }

  public TestExecutionDocument setTestPlan(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.javamodel.ITestPlan testPlan) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution._03_executionPackage.TestExecutionDocument_testPlan, testPlan);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestExecutionDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.common.doc.doc.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.doc.spec.chapter.about.AboutPackage.AboutAware_about, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, visitor);
    _acceptList(cleon.common.doc.doc.spec.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, visitor);
    _acceptList(cleon.common.doc.doc.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.doc.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.javamodel.IPlanningDocument.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, visitor);
    _acceptSingle(cleon.common.doc.doc.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.doc.spec.document.style.javamodel.IStyle.class, cleon.common.doc.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestExecutions.class, cleon.testingmethods.hermes.spec.hermes5._03_execution._03_executionPackage.TestExecutionDocument_testExecutions, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.javamodel.ITestPlan.class, cleon.testingmethods.hermes.spec.hermes5._03_execution._03_executionPackage.TestExecutionDocument_testPlan, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._03_execution.javamodel.ITestExecutionDocument selectToMeTestPlan(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.javamodel.ITestPlan object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.javamodel.ITestExecutionDocument.class, cleon.testingmethods.hermes.spec.hermes5._03_execution._03_executionPackage.TestExecutionDocument_testPlan, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._03_execution.javamodel.ITestExecutionDocument selectToMeTestExecutions(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestExecutions object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.javamodel.ITestExecutionDocument.class, cleon.testingmethods.hermes.spec.hermes5._03_execution._03_executionPackage.TestExecutionDocument_testExecutions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e85c9091-4f02-11e9-ba59-f1daaff821cc,e3ZHstmJl0Us5SWaBYYl9a9k6OQ=] */
