package cleon.doc.spec.chapter.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Role extends DynamicResource implements IRole {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRole> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRole>() {
    
    @Override
    public IRole create() {
      return new Role();
    }
    
    @Override
    public IRole create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Role(resourceRepository, resource);
    }
  
  };

  public Role() {
    super(IRole.TYPE_ID);
  }
  
  public Role(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRole.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Role setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.paragraph.ParagraphPackage.Role_paragraphs);
  }

  public Role setParagraphs(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.doc.spec.chapter.paragraph.ParagraphPackage.Role_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Role setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.paragraph.ParagraphPackage.Role_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.doc.spec.chapter.paragraph.javamodel.IRole selectToMeParagraphs(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph object) {
    return _getToMeSingle(object.getRepository(), cleon.doc.spec.chapter.paragraph.javamodel.IRole.class, cleon.doc.spec.chapter.paragraph.ParagraphPackage.Role_paragraphs, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,06d20cec-3089-11e5-8cdc-d5b441c8c3df,kmbj1RAPH2If+zv1xUhrpggfj9U=] */
