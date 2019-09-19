package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestExecutions extends DynamicResource implements ITestExecutions {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecutions> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestExecutions>() {
    
    @Override
    public ITestExecutions create() {
      return new TestExecutions();
    }
    
    @Override
    public ITestExecutions create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestExecutions(resourceRepository, resource);
    }
  
  };

  public TestExecutions() {
    super(ITestExecutions.TYPE_ID);
  }
  
  public TestExecutions(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestExecutions.TYPE_ID);
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

  public TestExecutions setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestExecutions setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecutionList> selectDynamicTestExecutions() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecutionList.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestExecutions_dynamicTestExecutions);
  }

  public TestExecutions setDynamicTestExecutions(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecutionList> dynamicTestExecutions) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestExecutions_dynamicTestExecutions, dynamicTestExecutions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestExecutions setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestExecutions setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecutionList.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestExecutions_dynamicTestExecutions, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestExecutions selectToMeDynamicTestExecutions(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution._dynamic.javamodel.IDynamicTestExecutionList object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.javamodel.ITestExecutions.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_execution.Test_executionPackage.TestExecutions_dynamicTestExecutions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,624c64dc-20d7-11e6-9368-9172b77c2cff,svJe4CSBiOA3iN54OWKaR+yMRAA=] */
