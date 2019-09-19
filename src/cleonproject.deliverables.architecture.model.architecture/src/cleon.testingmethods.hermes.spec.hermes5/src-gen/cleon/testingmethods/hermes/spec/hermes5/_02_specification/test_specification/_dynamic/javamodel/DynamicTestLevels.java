package cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DynamicTestLevels extends DynamicResource implements IDynamicTestLevels {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestLevels> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDynamicTestLevels>() {
    
    @Override
    public IDynamicTestLevels create() {
      return new DynamicTestLevels();
    }
    
    @Override
    public IDynamicTestLevels create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DynamicTestLevels(resourceRepository, resource);
    }
  
  };

  public DynamicTestLevels() {
    super(IDynamicTestLevels.TYPE_ID);
  }
  
  public DynamicTestLevels(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDynamicTestLevels.TYPE_ID);
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

  public DynamicTestLevels setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public DynamicTestLevels setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup> selectGroups() {
    return _getList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestLevels_groups);
  }

  public DynamicTestLevels setGroups(java.util.List<? extends cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup> groups) {
    _setList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestLevels_groups, groups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DynamicTestLevels setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DynamicTestLevels setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestLevelForDynamicObject selectTestLevelForDynamicObject() {
    return _getSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestLevelForDynamicObject.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestLevels_testLevelForDynamicObject);
  }

  public DynamicTestLevels setTestLevelForDynamicObject(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestLevelForDynamicObject testLevelForDynamicObject) {
    _setSingle(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestLevels_testLevelForDynamicObject, testLevelForDynamicObject);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DynamicTestLevels setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestLevels_groups, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestLevelForDynamicObject.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestLevels_testLevelForDynamicObject, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestLevels selectToMeGroups(cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestLevels.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestLevels_groups, object.getResource());
  }
  
  public static java.util.List<cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestLevels> selectToMeTestLevelForDynamicObject(cleon.testingmethods.hermes.spec.hermes5._01_concept.test_types.javamodel.ITestLevelForDynamicObject object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic.javamodel.IDynamicTestLevels.class, cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification._dynamic._dynamicPackage.DynamicTestLevels_testLevelForDynamicObject, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6d73f012-5157-11e9-bb61-971a423d31e9,U0uLTP5yRMlVm1rPAc04caM9mtc=] */
