package cleon.doc.spec.chapter.paragraph.typedtable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ColumnAttribute extends DynamicResource implements IColumnAttribute {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnAttribute> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnAttribute>() {
    
    @Override
    public IColumnAttribute create() {
      return new ColumnAttribute();
    }
    
    @Override
    public IColumnAttribute create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ColumnAttribute(resourceRepository, resource);
    }
  
  };

  public ColumnAttribute() {
    super(IColumnAttribute.TYPE_ID);
  }
  
  public ColumnAttribute(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IColumnAttribute.TYPE_ID);
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
  public java.lang.String selectDefaultValue() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Attribute_defaultValue);
  }
    
  public void setDefaultValue(java.lang.String defaultValue) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Attribute_defaultValue, defaultValue);
  }

  @Override
  public java.lang.String selectLabel() {
    return _getSingleAttribute(java.lang.String.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.ColumnAttribute_label);
  }
    
  public void setLabel(java.lang.String label) {
     _setSingleAttribute(cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.ColumnAttribute_label, label);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectWidth() {
    return _getSingleAttribute(java.lang.String.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.ColumnAttribute_width);
  }
    
  public void setWidth(java.lang.String width) {
     _setSingleAttribute(cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.ColumnAttribute_width, width);
  }

  // relations
  
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ch.actifsource.core.javamodel.IAbstractAspectImplementation> selectAspect() {
    return _getMultiMap(ch.actifsource.core.javamodel.IAbstractAspectImplementation.class, ch.actifsource.core.CorePackage.AspectProvider_aspect);
  }

  public ColumnAttribute setAspect(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ch.actifsource.core.javamodel.IAbstractAspectImplementation> aspect) {
    _setMultiMap(ch.actifsource.core.CorePackage.AspectProvider_aspect, aspect);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IAttribute> selectExtends() {
    return _getList(ch.actifsource.core.javamodel.IAttribute.class, ch.actifsource.core.CorePackage.Attribute_extends);
  }

  public ColumnAttribute setExtends(java.util.List<? extends ch.actifsource.core.javamodel.IAttribute> extends_) {
    _setList(ch.actifsource.core.CorePackage.Attribute_extends, extends_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IInheritanceModifier selectModifier() {
    return _getSingle(ch.actifsource.core.javamodel.IInheritanceModifier.class, ch.actifsource.core.CorePackage.Extendable_modifier);
  }

  public ColumnAttribute setModifier(ch.actifsource.core.javamodel.IInheritanceModifier modifier) {
    _setSingle(ch.actifsource.core.CorePackage.Extendable_modifier, modifier);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.ILiteral selectRange() {
    return _getSingle(ch.actifsource.core.javamodel.ILiteral.class, ch.actifsource.core.CorePackage.Attribute_range);
  }

  public ColumnAttribute setRange(ch.actifsource.core.javamodel.ILiteral range) {
    _setSingle(ch.actifsource.core.CorePackage.Attribute_range, range);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.ICardinality selectSubjectCardinality() {
    return _getSingle(ch.actifsource.core.javamodel.ICardinality.class, ch.actifsource.core.CorePackage.Property_subjectCardinality);
  }

  public ColumnAttribute setSubjectCardinality(ch.actifsource.core.javamodel.ICardinality subjectCardinality) {
    _setSingle(ch.actifsource.core.CorePackage.Property_subjectCardinality, subjectCardinality);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ColumnAttribute setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Attribute_defaultValue, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.ColumnAttribute_label, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.doc.spec.chapter.paragraph.typedtable.TypedtablePackage.ColumnAttribute_width, visitor);
    // relations
    _acceptMultiMap(ch.actifsource.core.javamodel.IAbstractAspectImplementation.class, ch.actifsource.core.CorePackage.AspectProvider_aspect, visitor);
    _acceptList(ch.actifsource.core.javamodel.IAttribute.class, ch.actifsource.core.CorePackage.Attribute_extends, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IInheritanceModifier.class, ch.actifsource.core.CorePackage.Extendable_modifier, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.ILiteral.class, ch.actifsource.core.CorePackage.Attribute_range, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.ICardinality.class, ch.actifsource.core.CorePackage.Property_subjectCardinality, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,28d3fd21-3cef-11e5-871f-6beac6a7c24b,vmB+56TaPluENdwctXrmY0UqZlU=] */
