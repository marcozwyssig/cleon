package cleon.uml.spec.structural.classes.association.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OneToManyAssociation extends DynamicResource implements IOneToManyAssociation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOneToManyAssociation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOneToManyAssociation>() {
    
    @Override
    public IOneToManyAssociation create() {
      return new OneToManyAssociation();
    }
    
    @Override
    public IOneToManyAssociation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OneToManyAssociation(resourceRepository, resource);
    }
  
  };

  public OneToManyAssociation() {
    super(IOneToManyAssociation.TYPE_ID);
  }
  
  public OneToManyAssociation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOneToManyAssociation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_description);
  }
    
  public void setDescription(java.lang.String description) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.association.AssociationPackage.Association_description, description);
  }

  @Override
  public java.lang.Boolean selectIsVirtual() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.Virtual_isVirtual);
  }
    
  public void setIsVirtual(java.lang.Boolean isVirtual) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.Virtual_isVirtual, isVirtual);
  }

  @Override
  public java.lang.Boolean selectObjectNavigationable() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_objectNavigationable);
  }
    
  public void setObjectNavigationable(java.lang.Boolean objectNavigationable) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.association.AssociationPackage.Association_objectNavigationable, objectNavigationable);
  }

  @Override
  public java.lang.Boolean selectObjectReadOnly() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_objectReadOnly);
  }
    
  public void setObjectReadOnly(java.lang.Boolean objectReadOnly) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.association.AssociationPackage.Association_objectReadOnly, objectReadOnly);
  }

  @Override
  public java.lang.String selectObjectRoleName() {
    return _getSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_objectRoleName);
  }
    
  public void setObjectRoleName(java.lang.String objectRoleName) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.association.AssociationPackage.Association_objectRoleName, objectRoleName);
  }

  @Override
  public java.lang.String selectResponsibility() {
    return _getSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility);
  }
    
  public void setResponsibility(java.lang.String responsibility) {
     _setSingleAttribute(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, responsibility);
  }

  @Override
  public java.lang.Boolean selectSubjectReadOnly() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_subjectReadOnly);
  }
    
  public void setSubjectReadOnly(java.lang.Boolean subjectReadOnly) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.association.AssociationPackage.Association_subjectReadOnly, subjectReadOnly);
  }

  @Override
  public java.lang.String selectSubjectRoleName() {
    return _getSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_subjectRoleName);
  }
    
  public void setSubjectRoleName(java.lang.String subjectRoleName) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.association.AssociationPackage.Association_subjectRoleName, subjectRoleName);
  }

  @Override
  public java.lang.Boolean selectSuppressAutoProperty() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_suppressAutoProperty);
  }
    
  public void setSuppressAutoProperty(java.lang.Boolean suppressAutoProperty) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.association.AssociationPackage.Association_suppressAutoProperty, suppressAutoProperty);
  }

  // relations
  
  @Override
  public cleon.uml.spec.structural.classes.association.javamodel.IAssociationType selectAssocationType() {
    return _getSingle(cleon.uml.spec.structural.classes.association.javamodel.IAssociationType.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_assocationType);
  }

  public OneToManyAssociation setAssocationType(cleon.uml.spec.structural.classes.association.javamodel.IAssociationType assocationType) {
    _setSingle(cleon.uml.spec.structural.classes.association.AssociationPackage.Association_assocationType, assocationType);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters);
  }

  public OneToManyAssociation setChapters(java.util.List<? extends cleon.doc.spec.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.uml.spec.structural.classes.association.javamodel.ICollectionType selectCollectionType() {
    return _getSingle(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType.class, cleon.uml.spec.structural.classes.association.AssociationPackage.CollectionAssociation_collectionType);
  }

  public OneToManyAssociation setCollectionType(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType collectionType) {
    _setSingle(cleon.uml.spec.structural.classes.association.AssociationPackage.CollectionAssociation_collectionType, collectionType);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public OneToManyAssociation setDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes);
  }

  public OneToManyAssociation setParagraphes(java.util.List<? extends cleon.doc.spec.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.SpecPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OneToManyAssociation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_description, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.Virtual_isVirtual, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_objectNavigationable, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_objectReadOnly, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_objectRoleName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.BuildingBlock_responsibility, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_subjectReadOnly, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_subjectRoleName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_suppressAutoProperty, visitor);
    // relations
    _acceptSingle(cleon.uml.spec.structural.classes.association.javamodel.IAssociationType.class, cleon.uml.spec.structural.classes.association.AssociationPackage.Association_assocationType, visitor);
    _acceptList(cleon.doc.spec.javamodel.IChapter.class, cleon.doc.spec.SpecPackage.Chapter_chapters, visitor);
    _acceptSingle(cleon.uml.spec.structural.classes.association.javamodel.ICollectionType.class, cleon.uml.spec.structural.classes.association.AssociationPackage.CollectionAssociation_collectionType, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.doc.spec.javamodel.IParagraph.class, cleon.doc.spec.SpecPackage.Chapter_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e11893b8-2783-11e3-a466-eda9d7258bca,jKsvzboqEAZEwr+hLbQsgtOBaCk=] */
