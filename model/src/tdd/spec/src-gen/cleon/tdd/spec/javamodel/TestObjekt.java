package cleon.tdd.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestObjekt extends DynamicResource implements ITestObjekt {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestObjekt> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestObjekt>() {
    
    @Override
    public ITestObjekt create() {
      return new TestObjekt();
    }
    
    @Override
    public ITestObjekt create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestObjekt(resourceRepository, resource);
    }
  
  };

  public TestObjekt() {
    super(ITestObjekt.TYPE_ID);
  }
  
  public TestObjekt(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestObjekt.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectGiven() {
    return _getSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.TestObjekt_given);
  }
    
  public void setGiven(java.lang.String given) {
     _setSingleAttribute(cleon.tdd.spec.SpecPackage.TestObjekt_given, given);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  @Override
  public java.lang.String selectThen() {
    return _getSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.TestObjekt_then);
  }
    
  public void setThen(java.lang.String then) {
     _setSingleAttribute(cleon.tdd.spec.SpecPackage.TestObjekt_then, then);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public TestObjekt setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents);
  }

  public TestObjekt setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.IDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.Document_documents, documents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public TestObjekt setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public TestObjekt setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestObjekt setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestObjekt setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public TestObjekt setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.TestObjekt_given, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.tdd.spec.SpecPackage.TestObjekt_then, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.IDocument.class, cleon.doc.spec.document.DocumentPackage.Document_documents, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,27a0e91c-a398-11e3-9113-ffc7f11b0a42,wY2DOE/6N9LZfprMLhm61nx3DAE=] */
