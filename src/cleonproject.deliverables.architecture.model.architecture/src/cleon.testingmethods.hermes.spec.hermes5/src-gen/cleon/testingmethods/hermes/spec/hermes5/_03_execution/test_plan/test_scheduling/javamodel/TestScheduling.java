package cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestScheduling extends DynamicResource implements ITestScheduling {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestScheduling> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestScheduling>() {
    
    @Override
    public ITestScheduling create() {
      return new TestScheduling();
    }
    
    @Override
    public ITestScheduling create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestScheduling(resourceRepository, resource);
    }
  
  };

  public TestScheduling() {
    super(ITestScheduling.TYPE_ID);
  }
  
  public TestScheduling(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestScheduling.TYPE_ID);
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

  public TestScheduling setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestScheduling setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestScheduling setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.javamodel.ITester> selectTester() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.javamodel.ITester.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.Test_schedulingPackage.TestScheduling_tester);
  }

  public TestScheduling setTester(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.javamodel.ITester> tester) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.Test_schedulingPackage.TestScheduling_tester, tester);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestScheduling setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.javamodel.ITester.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.Test_schedulingPackage.TestScheduling_tester, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.javamodel.ITestScheduling selectToMeTester(cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.javamodel.ITester object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.javamodel.ITestScheduling.class, cleon.testingmethods.hermes.spec.hermes5._03_execution.test_plan.test_scheduling.Test_schedulingPackage.TestScheduling_tester, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8438e1ea-918c-11e9-85e6-a377d9035ee3,tY2G38/GEBM/h8IA11BDWQ9mnMo=] */
