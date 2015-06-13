package cleon.uml.spec.structural.classes.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SimpleType extends DynamicResource implements ISimpleType {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISimpleType> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISimpleType>() {
    
    @Override
    public ISimpleType create() {
      return new SimpleType();
    }
    
    @Override
    public ISimpleType create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SimpleType(resourceRepository, resource);
    }
  
  };

  public SimpleType() {
    super(ISimpleType.TYPE_ID);
  }
  
  public SimpleType(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISimpleType.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public SimpleType setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SimpleType setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes);
  }

  public SimpleType setParagraphes(java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SimpleType setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,74f7edbd-52aa-11e3-9bab-1d73174e62c2,jJy1T5VXbGE9yIBo6gkK/FqzhVY=] */
