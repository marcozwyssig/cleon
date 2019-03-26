package cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DynamicTestSpecification extends DynamicResource implements IDynamicTestSpecification {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestSpecification> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestSpecification>() {
    
    @Override
    public IDynamicTestSpecification create() {
      return new DynamicTestSpecification();
    }
    
    @Override
    public IDynamicTestSpecification create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DynamicTestSpecification(resourceRepository, resource);
    }
  
  };

  public DynamicTestSpecification() {
    super(IDynamicTestSpecification.TYPE_ID);
  }
  
  public DynamicTestSpecification(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDynamicTestSpecification.TYPE_ID);
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
  public cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectArchitecture() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic._dynamicPackage.DynamicTestSpecification_architecture);
  }

  public DynamicTestSpecification setArchitecture(cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 architecture) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic._dynamicPackage.DynamicTestSpecification_architecture, architecture);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public DynamicTestSpecification setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public DynamicTestSpecification setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic.javamodel.IDynamicTestGroup> selectGroups() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic.javamodel.IDynamicTestGroup.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic._dynamicPackage.DynamicTestSpecification_groups);
  }

  public DynamicTestSpecification setGroups(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic.javamodel.IDynamicTestGroup> groups) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic._dynamicPackage.DynamicTestSpecification_groups, groups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DynamicTestSpecification setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DynamicTestSpecification setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject selectTestObject() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._07_testspecificationPackage.TestSpecification_testObject);
  }

  public DynamicTestSpecification setTestObject(cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject testObject) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._07_testspecificationPackage.TestSpecification_testObject, testObject);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DynamicTestSpecification setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic._dynamicPackage.DynamicTestSpecification_architecture, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic.javamodel.IDynamicTestGroup.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic._dynamicPackage.DynamicTestSpecification_groups, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept._02_test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._07_testspecificationPackage.TestSpecification_testObject, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic.javamodel.IDynamicTestSpecification> selectToMeArchitecture(cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic.javamodel.IDynamicTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic._dynamicPackage.DynamicTestSpecification_architecture, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic.javamodel.IDynamicTestSpecification selectToMeGroups(cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic.javamodel.IDynamicTestGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic.javamodel.IDynamicTestSpecification.class, cleon.testingmethods.hermes.spec.hermes5._02_specification._07_testspecification._dynamic._dynamicPackage.DynamicTestSpecification_groups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04d3d8a4-1cf0-11e6-aaba-9db7fdc64d7e,2cKJ0CXk7a0At6zp5Nbx6eoOaKw=] */
