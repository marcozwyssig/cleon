package cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class StaticTestSpecification extends DynamicResource implements IStaticTestSpecification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTestSpecification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IStaticTestSpecification>() {
    
    @Override
    public IStaticTestSpecification create() {
      return new StaticTestSpecification();
    }
    
    @Override
    public IStaticTestSpecification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new StaticTestSpecification(resourceRepository, resource);
    }
  
  };

  public StaticTestSpecification() {
    super(IStaticTestSpecification.TYPE_ID);
  }
  
  public StaticTestSpecification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IStaticTestSpecification.TYPE_ID);
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

  public StaticTestSpecification setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public StaticTestSpecification setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public StaticTestSpecification setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public StaticTestSpecification setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject selectTestObject() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._07_testspecificationPackage.TestSpecification_testObject);
  }

  public StaticTestSpecification setTestObject(cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject testObject) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._07_testspecificationPackage.TestSpecification_testObject, testObject);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriterias selectTestQualityCriteria() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriterias.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.StaticTestSpecification_testQualityCriteria);
  }

  public StaticTestSpecification setTestQualityCriteria(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriterias testQualityCriteria) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.StaticTestSpecification_testQualityCriteria, testQualityCriteria);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestSubjectArea> selectTestSubjectAreas() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestSubjectArea.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.StaticTestSpecification_testSubjectAreas);
  }

  public StaticTestSpecification setTestSubjectAreas(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestSubjectArea> testSubjectAreas) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.StaticTestSpecification_testSubjectAreas, testSubjectAreas);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public StaticTestSpecification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._07_testspecificationPackage.TestSpecification_testObject, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriterias.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.StaticTestSpecification_testQualityCriteria, visitor);
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestSubjectArea.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.StaticTestSpecification_testSubjectAreas, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.IStaticTestSpecification selectToMeTestSubjectAreas(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestSubjectArea object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.IStaticTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.StaticTestSpecification_testSubjectAreas, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.IStaticTestSpecification selectToMeTestQualityCriteria(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.ITestQualityCriterias object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static.javamodel.IStaticTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._static._staticPackage.StaticTestSpecification_testQualityCriteria, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fa8377ef-1cef-11e6-aaba-9db7fdc64d7e,CMyk4j3d4qLP9p0Cwi7hgQcbnUM=] */
