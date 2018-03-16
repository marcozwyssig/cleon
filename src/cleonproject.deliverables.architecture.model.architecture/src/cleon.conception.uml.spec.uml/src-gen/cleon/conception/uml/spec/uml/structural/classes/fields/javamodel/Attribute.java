package cleon.conception.uml.spec.uml.structural.classes.fields.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Attribute extends DynamicResource implements IAttribute {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAttribute> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAttribute>() {
    
    @Override
    public IAttribute create() {
      return new Attribute();
    }
    
    @Override
    public IAttribute create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Attribute(resourceRepository, resource);
    }
  
  };

  public Attribute() {
    super(IAttribute.TYPE_ID);
  }
  
  public Attribute(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAttribute.TYPE_ID);
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
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.fields.FieldsPackage.Field_getter);
  }
    
  public void setGetter(java.lang.Boolean getter) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.fields.FieldsPackage.Field_getter, getter);
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
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.fields.FieldsPackage.Field_setter);
  }
    
  public void setSetter(java.lang.Boolean setter) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.fields.FieldsPackage.Field_setter, setter);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Attribute setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier selectReturnType() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.ReturnType_returnType);
  }

  public Attribute setReturnType(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier returnType) {
    _setSingle(cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.ReturnType_returnType, returnType);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier selectType() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.uml.spec.uml.structural.classes.fields.FieldsPackage.Field_type);
  }

  public Attribute setType(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier type) {
    _setSingle(cleon.conception.uml.spec.uml.structural.classes.fields.FieldsPackage.Field_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Attribute setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.fields.FieldsPackage.Field_getter, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.fields.FieldsPackage.Field_setter, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.ReturnType_returnType, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.uml.spec.uml.structural.classes.fields.FieldsPackage.Field_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,18d801f4-e48c-11e2-a881-1f0b1c54f1d5,gdXtrkacuEV665SUAE7+xbT4Kbc=] */
