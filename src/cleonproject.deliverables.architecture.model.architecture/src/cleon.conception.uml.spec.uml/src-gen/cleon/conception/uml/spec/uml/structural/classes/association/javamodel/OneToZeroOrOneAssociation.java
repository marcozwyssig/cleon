package cleon.conception.uml.spec.uml.structural.classes.association.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OneToZeroOrOneAssociation extends DynamicResource implements IOneToZeroOrOneAssociation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOneToZeroOrOneAssociation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOneToZeroOrOneAssociation>() {
    
    @Override
    public IOneToZeroOrOneAssociation create() {
      return new OneToZeroOrOneAssociation();
    }
    
    @Override
    public IOneToZeroOrOneAssociation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OneToZeroOrOneAssociation(resourceRepository, resource);
    }
  
  };

  public OneToZeroOrOneAssociation() {
    super(IOneToZeroOrOneAssociation.TYPE_ID);
  }
  
  public OneToZeroOrOneAssociation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOneToZeroOrOneAssociation.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectDescription() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_description);
  }
    
  public void setDescription(java.lang.String description) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_description, description);
  }

  @Override
  public java.lang.Boolean selectIsVirtual() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.Virtual_isVirtual);
  }
    
  public void setIsVirtual(java.lang.Boolean isVirtual) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.Virtual_isVirtual, isVirtual);
  }

  @Override
  public java.lang.Boolean selectObjectNavigationable() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_objectNavigationable);
  }
    
  public void setObjectNavigationable(java.lang.Boolean objectNavigationable) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_objectNavigationable, objectNavigationable);
  }

  @Override
  public java.lang.Boolean selectObjectReadOnly() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_objectReadOnly);
  }
    
  public void setObjectReadOnly(java.lang.Boolean objectReadOnly) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_objectReadOnly, objectReadOnly);
  }

  @Override
  public java.lang.String selectObjectRoleName() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_objectRoleName);
  }
    
  public void setObjectRoleName(java.lang.String objectRoleName) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_objectRoleName, objectRoleName);
  }

  @Override
  public java.lang.Boolean selectSubjectReadOnly() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_subjectReadOnly);
  }
    
  public void setSubjectReadOnly(java.lang.Boolean subjectReadOnly) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_subjectReadOnly, subjectReadOnly);
  }

  @Override
  public java.lang.String selectSubjectRoleName() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_subjectRoleName);
  }
    
  public void setSubjectRoleName(java.lang.String subjectRoleName) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_subjectRoleName, subjectRoleName);
  }

  @Override
  public java.lang.Boolean selectSuppressAutoProperty() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_suppressAutoProperty);
  }
    
  public void setSuppressAutoProperty(java.lang.Boolean suppressAutoProperty) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_suppressAutoProperty, suppressAutoProperty);
  }

  // relations
  
  @Override
  public cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociationType selectAssocationType() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociationType.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_assocationType);
  }

  public OneToZeroOrOneAssociation setAssocationType(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociationType assocationType) {
    _setSingle(cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_assocationType, assocationType);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier selectTo() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_to);
  }

  public OneToZeroOrOneAssociation setTo(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier to) {
    _setSingle(cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OneToZeroOrOneAssociation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_description, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.Virtual_isVirtual, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_objectNavigationable, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_objectReadOnly, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_objectRoleName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_subjectReadOnly, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_subjectRoleName, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_suppressAutoProperty, visitor);
    // relations
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociationType.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_assocationType, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.uml.spec.uml.structural.classes.association.AssociationPackage.Association_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,01df895e-2784-11e3-a466-eda9d7258bca,2eSSzc4NHjmvXhpStr3E/2xWys8=] */
