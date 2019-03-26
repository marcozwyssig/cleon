package cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestInfrastructures extends DynamicResource implements ITestInfrastructures {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInfrastructures> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestInfrastructures>() {
    
    @Override
    public ITestInfrastructures create() {
      return new TestInfrastructures();
    }
    
    @Override
    public ITestInfrastructures create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestInfrastructures(resourceRepository, resource);
    }
  
  };

  public TestInfrastructures() {
    super(ITestInfrastructures.TYPE_ID);
  }
  
  public TestInfrastructures(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestInfrastructures.TYPE_ID);
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

  public TestInfrastructures setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestInfrastructures setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestInfrastructures setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure.javamodel.ITester> selectTesters() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure.javamodel.ITester.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure._06_test_infrastructurePackage.TestInfrastructures_testers);
  }

  public TestInfrastructures setTesters(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure.javamodel.ITester> testers) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure._06_test_infrastructurePackage.TestInfrastructures_testers, testers);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestInfrastructures setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure.javamodel.ITester.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure._06_test_infrastructurePackage.TestInfrastructures_testers, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure.javamodel.ITestInfrastructures selectToMeTesters(cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure.javamodel.ITester object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure.javamodel.ITestInfrastructures.class, cleon.testingmethods.hermes.spec.hermes5._01_concept._06_test_infrastructure._06_test_infrastructurePackage.TestInfrastructures_testers, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b2de291a-20d7-11e6-9368-9172b77c2cff,4N+a5wS+mlM22iOx3bgfVHBFDHw=] */
