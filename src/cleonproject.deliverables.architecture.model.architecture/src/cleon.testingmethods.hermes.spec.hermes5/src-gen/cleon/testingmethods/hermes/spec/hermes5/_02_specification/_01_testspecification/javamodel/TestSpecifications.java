package cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestSpecifications extends DynamicResource implements ITestSpecifications {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSpecifications> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSpecifications>() {
    
    @Override
    public ITestSpecifications create() {
      return new TestSpecifications();
    }
    
    @Override
    public ITestSpecifications create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestSpecifications(resourceRepository, resource);
    }
  
  };

  public TestSpecifications() {
    super(ITestSpecifications.TYPE_ID);
  }
  
  public TestSpecifications(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestSpecifications.TYPE_ID);
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

  public TestSpecifications setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestSpecifications setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.IDynamicTestSpecification> selectDynamicTestSpecifications() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.IDynamicTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._01_testspecificationPackage.TestSpecifications_dynamicTestSpecifications);
  }

  public TestSpecifications setDynamicTestSpecifications(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.IDynamicTestSpecification> dynamicTestSpecifications) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._01_testspecificationPackage.TestSpecifications_dynamicTestSpecifications, dynamicTestSpecifications);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestSpecifications setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._static.javamodel.IStaticTestSpecification> selectStaticTestSpecifications() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._static.javamodel.IStaticTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._01_testspecificationPackage.TestSpecifications_staticTestSpecifications);
  }

  public TestSpecifications setStaticTestSpecifications(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._static.javamodel.IStaticTestSpecification> staticTestSpecifications) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._01_testspecificationPackage.TestSpecifications_staticTestSpecifications, staticTestSpecifications);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestSpecifications setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.IDynamicTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._01_testspecificationPackage.TestSpecifications_dynamicTestSpecifications, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._static.javamodel.IStaticTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._01_testspecificationPackage.TestSpecifications_staticTestSpecifications, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecifications selectToMeStaticTestSpecifications(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._static.javamodel.IStaticTestSpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecifications.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._01_testspecificationPackage.TestSpecifications_staticTestSpecifications, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecifications selectToMeDynamicTestSpecifications(cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._dynamic.javamodel.IDynamicTestSpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification.javamodel.ITestSpecifications.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._01_testspecification._01_testspecificationPackage.TestSpecifications_dynamicTestSpecifications, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1c345fe2-1db1-11e6-974b-630b7f5d3b95,vXv+LZmiAvPArEbWvEhXiuHHEsQ=] */
