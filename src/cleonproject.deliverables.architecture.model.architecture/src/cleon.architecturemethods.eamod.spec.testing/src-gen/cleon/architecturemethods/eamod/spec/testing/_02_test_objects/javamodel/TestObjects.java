package cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestObjects extends DynamicResource implements ITestObjects {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestObjects> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestObjects>() {
    
    @Override
    public ITestObjects create() {
      return new TestObjects();
    }
    
    @Override
    public ITestObjects create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestObjects(resourceRepository, resource);
    }
  
  };

  public TestObjects() {
    super(ITestObjects.TYPE_ID);
  }
  
  public TestObjects(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestObjects.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters);
  }

  public TestObjects setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestObjects setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject> selectDynamicTestObjects() {
    return _getMap(cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject.class, cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_dynamicTestObjects);
  }

  public TestObjects setDynamicTestObjects(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject> dynamicTestObjects) {
    _setMap(cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_dynamicTestObjects, dynamicTestObjects);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes> selectOutcomes() {
    return _getList(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes.class, cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_outcomes);
  }

  public TestObjects setOutcomes(java.util.List<? extends cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes> outcomes) {
    _setList(cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_outcomes, outcomes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs);
  }

  public TestObjects setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject> selectStaticTestObjects() {
    return _getMap(cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject.class, cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_staticTestObjects);
  }

  public TestObjects setStaticTestObjects(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject> staticTestObjects) {
    _setMap(cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_staticTestObjects, staticTestObjects);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestObjects setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptMap(cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject.class, cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_dynamicTestObjects, visitor);
    _acceptList(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes.class, cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_outcomes, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_paragraphs, visitor);
    _acceptMap(cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject.class, cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_staticTestObjects, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObjects selectToMeStaticTestObjects(cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObjects.class, cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_staticTestObjects, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObjects selectToMeDynamicTestObjects(cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObject object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObjects.class, cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_dynamicTestObjects, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObjects> selectToMeOutcomes(cleon.common.resources.spec.resources.outcomes.javamodel.IOutcomes object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.testing._02_test_objects.javamodel.ITestObjects.class, cleon.architecturemethods.eamod.spec.testing._02_test_objects._02_test_objectsPackage.TestObjects_outcomes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fcd96549-1519-11e6-a185-8f02bf3f95ba,Rp5AVHBDipR3BRFBSv+vyHUQS3M=] */
