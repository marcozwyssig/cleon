package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestDatas extends DynamicResource implements ITestDatas {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestDatas> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestDatas>() {
    
    @Override
    public ITestDatas create() {
      return new TestDatas();
    }
    
    @Override
    public ITestDatas create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestDatas(resourceRepository, resource);
    }
  
  };

  public TestDatas() {
    super(ITestDatas.TYPE_ID);
  }
  
  public TestDatas(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestDatas.TYPE_ID);
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

  public TestDatas setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestDatas setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public TestDatas setNoChapters(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.spec.doc.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestDatas setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestData> selectTestData() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestData.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.Test_dataPackage.TestDatas_testData);
  }

  public TestDatas setTestData(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestData> testData) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.Test_dataPackage.TestDatas_testData, testData);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestDatas setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestData.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.Test_dataPackage.TestDatas_testData, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestDatas selectToMeTestData(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestData object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.javamodel.ITestDatas.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_infrastructure.test_data.Test_dataPackage.TestDatas_testData, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0a539186-eabf-11e5-838a-6dbe7118dd11,yCNmJOJOr8KQO7Q186RCzd3J/Bs=] */
