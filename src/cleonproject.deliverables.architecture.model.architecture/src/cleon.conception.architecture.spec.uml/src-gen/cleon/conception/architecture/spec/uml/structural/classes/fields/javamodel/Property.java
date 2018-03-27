package cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Property extends DynamicResource implements IProperty {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProperty> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProperty>() {
    
    @Override
    public IProperty create() {
      return new Property();
    }
    
    @Override
    public IProperty create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Property(resourceRepository, resource);
    }
  
  };

  public Property() {
    super(IProperty.TYPE_ID);
  }
  
  public Property(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProperty.TYPE_ID);
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

  @Override
  public java.lang.Boolean selectGetter() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Field_getter);
  }
    
  public void setGetter(java.lang.Boolean getter) {
     _setSingleAttribute(cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Field_getter, getter);
  }

  @Override
  public java.lang.Boolean selectIsAbstract() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
  }

  @Override
  public java.lang.Boolean selectIsObsolete() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Obsolete_isObsolete);
  }
    
  public void setIsObsolete(java.lang.Boolean isObsolete) {
     _setSingleAttribute(cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Obsolete_isObsolete, isObsolete);
  }

  @Override
  public java.lang.Boolean selectIsVirtual() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Virtual_isVirtual);
  }
    
  public void setIsVirtual(java.lang.Boolean isVirtual) {
     _setSingleAttribute(cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Virtual_isVirtual, isVirtual);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectSetter() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Field_setter);
  }
    
  public void setSetter(java.lang.Boolean setter) {
     _setSingleAttribute(cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Field_setter, setter);
  }

  // relations
  
  @Override
  public cleon.conception.architecture.spec.uml.structural.classes.association.javamodel.ICollectionType selectAsCollection() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.classes.association.javamodel.ICollectionType.class, cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Property_asCollection);
  }

  public Property setAsCollection(cleon.conception.architecture.spec.uml.structural.classes.association.javamodel.ICollectionType asCollection) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Property_asCollection, asCollection);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Property setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier selectReturnType() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.ReturnType_returnType);
  }

  public Property setReturnType(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier returnType) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.ReturnType_returnType, returnType);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier selectType() {
    return _getSingle(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Field_type);
  }

  public Property setType(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier type) {
    _setSingle(cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Field_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Property setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Field_getter, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Obsolete_isObsolete, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Virtual_isVirtual, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Field_setter, visitor);
    // relations
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.classes.association.javamodel.ICollectionType.class, cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Property_asCollection, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.ReturnType_returnType, visitor);
    _acceptSingle(cleon.conception.architecture.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Field_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IProperty> selectToMeAsCollection(cleon.conception.architecture.spec.uml.structural.classes.association.javamodel.ICollectionType object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IProperty.class, cleon.conception.architecture.spec.uml.structural.classes.fields.FieldsPackage.Property_asCollection, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,123c8e93-13ba-11e3-bec7-f1e135382475,OHq4RyPKUSXh/Q8ceAiCdsUJ3KQ=] */
