package cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestTypeForDynamicObject extends DynamicResource implements ITestTypeForDynamicObject {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestTypeForDynamicObject> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestTypeForDynamicObject>() {
    
    @Override
    public ITestTypeForDynamicObject create() {
      return new TestTypeForDynamicObject();
    }
    
    @Override
    public ITestTypeForDynamicObject create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestTypeForDynamicObject(resourceRepository, resource);
    }
  
  };

  public TestTypeForDynamicObject() {
    super(ITestTypeForDynamicObject.TYPE_ID);
  }
  
  public TestTypeForDynamicObject(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestTypeForDynamicObject.TYPE_ID);
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

  public TestTypeForDynamicObject setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public TestTypeForDynamicObject setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public TestTypeForDynamicObject setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestTypeForDynamicObject setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestLevelForDynamicObject> selectTestLevelForDynamicObject() {
    return _getMap(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestLevelForDynamicObject.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.Test_typesPackage.TestTypeForDynamicObject_testLevelForDynamicObject);
  }

  public TestTypeForDynamicObject setTestLevelForDynamicObject(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestLevelForDynamicObject> testLevelForDynamicObject) {
    _setMap(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.Test_typesPackage.TestTypeForDynamicObject_testLevelForDynamicObject, testLevelForDynamicObject);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.javamodel.ITestObject selectTestObject() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.Test_typesPackage.TestTypeForDynamicObject_testObject);
  }

  public TestTypeForDynamicObject setTestObject(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.javamodel.ITestObject testObject) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.Test_typesPackage.TestTypeForDynamicObject_testObject, testObject);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestTypeForDynamicObject setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestLevelForDynamicObject.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.Test_typesPackage.TestTypeForDynamicObject_testLevelForDynamicObject, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.javamodel.ITestObject.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.Test_typesPackage.TestTypeForDynamicObject_testObject, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestTypeForDynamicObject> selectToMeTestObject(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_objects.javamodel.ITestObject object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestTypeForDynamicObject.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.Test_typesPackage.TestTypeForDynamicObject_testObject, object.getResource());
  }
  
  public static cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestTypeForDynamicObject selectToMeTestLevelForDynamicObject(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestLevelForDynamicObject object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestTypeForDynamicObject.class, cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.Test_typesPackage.TestTypeForDynamicObject_testLevelForDynamicObject, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,90ed9e98-4fd9-11e9-96a9-f9ba7cff2393,JmzPyDp4sy9Jtdbp0l6Y1zO/E5U=] */
