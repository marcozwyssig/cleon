package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestScope extends DynamicResource implements ITestScope {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestScope> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestScope>() {
    
    @Override
    public ITestScope create() {
      return new TestScope();
    }
    
    @Override
    public ITestScope create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestScope(resourceRepository, resource);
    }
  
  };

  public TestScope() {
    super(ITestScope.TYPE_ID);
  }
  
  public TestScope(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestScope.TYPE_ID);
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
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public TestScope setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestScope setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestScope setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicSpecificationScope> selectTestScopeTestObjects() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicSpecificationScope.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestScope_testScopeTestObjects);
  }

  public TestScope setTestScopeTestObjects(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicSpecificationScope> testScopeTestObjects) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestScope_testScopeTestObjects, testScopeTestObjects);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestScope setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicSpecificationScope.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestScope_testScopeTestObjects, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestScope selectToMeTestScopeTestObjects(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestDynamicSpecificationScope object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.javamodel.ITestScope.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scope.Test_scopePackage.TestScope_testScopeTestObjects, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4ca652f8-9184-11e9-97b2-b9ddd2a0520b,n2ko70a2HnCkZdO4CJojMyLnCCA=] */
