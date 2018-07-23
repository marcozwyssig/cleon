package cleon.conception.applications.spec.ddd.entities.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Entity extends DynamicResource implements IEntity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEntity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEntity>() {
    
    @Override
    public IEntity create() {
      return new Entity();
    }
    
    @Override
    public IEntity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Entity(resourceRepository, resource);
    }
  
  };

  public Entity() {
    super(IEntity.TYPE_ID);
  }
  
  public Entity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEntity.TYPE_ID);
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
  public java.lang.Boolean selectIsAbstract() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.ICustomEvent> selectCustomEvents() {
    return _getList(cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.ICustomEvent.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Class_customEvents);
  }

  public Entity setCustomEvents(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.ICustomEvent> customEvents) {
    _setList(cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Class_customEvents, customEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEvent> selectEvents() {
    return _getList(cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEvent.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.EventClass_events);
  }

  public Entity setEvents(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEvent> events) {
    _setList(cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.EventClass_events, events);
    return this;
  }
    
  @Override
  public cleon.conception.applications.spec.ddd.entities.javamodel.IEntity selectExtends() {
    return _getSingle(cleon.conception.applications.spec.ddd.entities.javamodel.IEntity.class, cleon.conception.applications.spec.ddd.entities.EntitiesPackage.Entity_extends);
  }

  public Entity setExtends(cleon.conception.applications.spec.ddd.entities.javamodel.IEntity extends_) {
    _setSingle(cleon.conception.applications.spec.ddd.entities.EntitiesPackage.Entity_extends, extends_);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEventForField> selectFieldEvents() {
    return _getMap(cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEventForField.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Class_fieldEvents);
  }

  public Entity setFieldEvents(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEventForField> fieldEvents) {
    _setMap(cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Class_fieldEvents, fieldEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField> selectFields() {
    return _getList(cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.FieldClass_fields);
  }

  public Entity setFields(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField> fields) {
    _setList(cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.FieldClass_fields, fields);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.conception.architecture.spec.buildingblock.javamodel.IDependency.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency);
  }

  public Entity setHasDependency(java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDependency> hasDependency) {
    _setList(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.conception.architecture.spec.uml.structural.classes.method.javamodel.IMethod.class, cleon.conception.architecture.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public Entity setMethods(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.conception.architecture.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.association.javamodel.IAssociation> selectRelations() {
    return _getList(cleon.conception.architecture.spec.uml.structural.classes.association.javamodel.IAssociation.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.AssociationClass_relations);
  }

  public Entity setRelations(java.util.List<? extends cleon.conception.architecture.spec.uml.structural.classes.association.javamodel.IAssociation> relations) {
    _setList(cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.AssociationClass_relations, relations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Entity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.ICustomEvent.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Class_customEvents, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEvent.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.EventClass_events, visitor);
    _acceptSingle(cleon.conception.applications.spec.ddd.entities.javamodel.IEntity.class, cleon.conception.applications.spec.ddd.entities.EntitiesPackage.Entity_extends, visitor);
    _acceptMap(cleon.conception.architecture.spec.uml.structural.classes.events.javamodel.IEventForField.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.Class_fieldEvents, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.classes.fields.javamodel.IField.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.FieldClass_fields, visitor);
    _acceptList(cleon.conception.architecture.spec.buildingblock.javamodel.IDependency.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.classes.method.javamodel.IMethod.class, cleon.conception.architecture.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptList(cleon.conception.architecture.spec.uml.structural.classes.association.javamodel.IAssociation.class, cleon.conception.architecture.spec.uml.structural.classes.ClassesPackage.AssociationClass_relations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.applications.spec.ddd.entities.javamodel.IEntity> selectToMeExtends(cleon.conception.applications.spec.ddd.entities.javamodel.IEntity object) {
    return _getToMeList(object.getRepository(), cleon.conception.applications.spec.ddd.entities.javamodel.IEntity.class, cleon.conception.applications.spec.ddd.entities.EntitiesPackage.Entity_extends, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8914497d-10c0-11e3-b60e-ab478a3e1eca,2FeCukGjPAbpRN8ayRWAAA5Z8d8=] */