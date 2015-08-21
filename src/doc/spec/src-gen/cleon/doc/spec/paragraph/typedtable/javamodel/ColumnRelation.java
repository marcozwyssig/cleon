package cleon.doc.spec.paragraph.typedtable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ColumnRelation extends DynamicResource implements IColumnRelation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnRelation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IColumnRelation>() {
    
    @Override
    public IColumnRelation create() {
      return new ColumnRelation();
    }
    
    @Override
    public IColumnRelation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ColumnRelation(resourceRepository, resource);
    }
  
  };

  public ColumnRelation() {
    super(IColumnRelation.TYPE_ID);
  }
  
  public ColumnRelation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IColumnRelation.TYPE_ID);
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
  public java.lang.String selectLabel() {
    return _getSingleAttribute(java.lang.String.class, cleon.doc.spec.paragraph.typedtable.TypedtablePackage.ColumnRelation_label);
  }
    
  public void setLabel(java.lang.String label) {
     _setSingleAttribute(cleon.doc.spec.paragraph.typedtable.TypedtablePackage.ColumnRelation_label, label);
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
    return _getSingleAttribute(java.lang.String.class, cleon.doc.spec.paragraph.typedtable.TypedtablePackage.ColumnRelation_width);
  }
    
  public void setWidth(java.lang.String width) {
     _setSingleAttribute(cleon.doc.spec.paragraph.typedtable.TypedtablePackage.ColumnRelation_width, width);
  }

  // relations
  
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ch.actifsource.core.javamodel.IAbstractAspectImplementation> selectAspect() {
    return _getMultiMap(ch.actifsource.core.javamodel.IAbstractAspectImplementation.class, ch.actifsource.core.CorePackage.AspectProvider_aspect);
  }

  public ColumnRelation setAspect(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends ch.actifsource.core.javamodel.IAbstractAspectImplementation> aspect) {
    _setMultiMap(ch.actifsource.core.CorePackage.AspectProvider_aspect, aspect);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IResource> selectDefaultValue() {
    return _getList(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.OwnRelation_defaultValue);
  }

  public ColumnRelation setDefaultValue(java.util.List<? extends ch.actifsource.core.javamodel.IResource> defaultValue) {
    _setList(ch.actifsource.core.CorePackage.OwnRelation_defaultValue, defaultValue);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IOwnRelation> selectExtends() {
    return _getList(ch.actifsource.core.javamodel.IOwnRelation.class, ch.actifsource.core.CorePackage.OwnRelation_extends);
  }

  public ColumnRelation setExtends(java.util.List<? extends ch.actifsource.core.javamodel.IOwnRelation> extends_) {
    _setList(ch.actifsource.core.CorePackage.OwnRelation_extends, extends_);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IInheritanceModifier selectModifier() {
    return _getSingle(ch.actifsource.core.javamodel.IInheritanceModifier.class, ch.actifsource.core.CorePackage.Relation_modifier);
  }

  public ColumnRelation setModifier(ch.actifsource.core.javamodel.IInheritanceModifier modifier) {
    _setSingle(ch.actifsource.core.CorePackage.Relation_modifier, modifier);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.ICardinality selectObjectCardinality() {
    return _getSingle(ch.actifsource.core.javamodel.ICardinality.class, ch.actifsource.core.CorePackage.Relation_objectCardinality);
  }

  public ColumnRelation setObjectCardinality(ch.actifsource.core.javamodel.ICardinality objectCardinality) {
    _setSingle(ch.actifsource.core.CorePackage.Relation_objectCardinality, objectCardinality);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IOwnershipType selectOwnershipType() {
    return _getSingle(ch.actifsource.core.javamodel.IOwnershipType.class, ch.actifsource.core.CorePackage.OwnRelation_ownershipType);
  }

  public ColumnRelation setOwnershipType(ch.actifsource.core.javamodel.IOwnershipType ownershipType) {
    _setSingle(ch.actifsource.core.CorePackage.OwnRelation_ownershipType, ownershipType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectRange() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.OwnRelation_range);
  }

  public ColumnRelation setRange(ch.actifsource.core.javamodel.IClass range) {
    _setSingle(ch.actifsource.core.CorePackage.OwnRelation_range, range);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.core.javamodel.IRelationStyle> selectStyle() {
    return _getList(ch.actifsource.core.javamodel.IRelationStyle.class, ch.actifsource.core.CorePackage.Relation_style);
  }

  public ColumnRelation setStyle(java.util.List<? extends ch.actifsource.core.javamodel.IRelationStyle> style) {
    _setList(ch.actifsource.core.CorePackage.Relation_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.ICardinality selectSubjectCardinality() {
    return _getSingle(ch.actifsource.core.javamodel.ICardinality.class, ch.actifsource.core.CorePackage.Property_subjectCardinality);
  }

  public ColumnRelation setSubjectCardinality(ch.actifsource.core.javamodel.ICardinality subjectCardinality) {
    _setSingle(ch.actifsource.core.CorePackage.Property_subjectCardinality, subjectCardinality);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ColumnRelation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.doc.spec.paragraph.typedtable.TypedtablePackage.ColumnRelation_label, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.doc.spec.paragraph.typedtable.TypedtablePackage.ColumnRelation_width, visitor);
    // relations
    _acceptMultiMap(ch.actifsource.core.javamodel.IAbstractAspectImplementation.class, ch.actifsource.core.CorePackage.AspectProvider_aspect, visitor);
    _acceptList(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.OwnRelation_defaultValue, visitor);
    _acceptList(ch.actifsource.core.javamodel.IOwnRelation.class, ch.actifsource.core.CorePackage.OwnRelation_extends, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IInheritanceModifier.class, ch.actifsource.core.CorePackage.Relation_modifier, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.ICardinality.class, ch.actifsource.core.CorePackage.Relation_objectCardinality, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IOwnershipType.class, ch.actifsource.core.CorePackage.OwnRelation_ownershipType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.OwnRelation_range, visitor);
    _acceptList(ch.actifsource.core.javamodel.IRelationStyle.class, ch.actifsource.core.CorePackage.Relation_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.ICardinality.class, ch.actifsource.core.CorePackage.Property_subjectCardinality, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9433643c-44a0-11e5-99ff-71cc0a5d776b,oDIWy0WEWuV+qaW+k2eLPe0DhA8=] */
