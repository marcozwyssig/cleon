package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestGlobalPreconditionGroup extends DynamicResource implements ITestGlobalPreconditionGroup {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestGlobalPreconditionGroup> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestGlobalPreconditionGroup>() {
    
    @Override
    public ITestGlobalPreconditionGroup create() {
      return new TestGlobalPreconditionGroup();
    }
    
    @Override
    public ITestGlobalPreconditionGroup create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestGlobalPreconditionGroup(resourceRepository, resource);
    }
  
  };

  public TestGlobalPreconditionGroup() {
    super(ITestGlobalPreconditionGroup.TYPE_ID);
  }
  
  public TestGlobalPreconditionGroup(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestGlobalPreconditionGroup.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public TestGlobalPreconditionGroup setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestGlobalPreconditionGroup setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public TestGlobalPreconditionGroup setNoChapters(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public TestGlobalPreconditionGroup setNoParagraphs(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.spec.doc.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestGlobalPreconditionGroup setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition> selectTestPreconditions() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPreconditionAwareList_testPreconditions);
  }

  public TestGlobalPreconditionGroup setTestPreconditions(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition> testPreconditions) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPreconditionAwareList_testPreconditions, testPreconditions);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestGlobalPreconditionGroup setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoParagraph_noParagraphs, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.javamodel.ITestPrecondition.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_precondition.Test_preconditionPackage.TestPreconditionAwareList_testPreconditions, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a4ea307b-67ea-11e9-9ec9-5fbc84faaeb1,PimfEq7eyQDW5Bj3rHrnVqXBhP0=] */
