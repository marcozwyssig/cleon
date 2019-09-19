package cleon.architecturemethods.arc42.spec.ddd.exceptions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DomainException extends DynamicResource implements IDomainException {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDomainException> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDomainException>() {
    
    @Override
    public IDomainException create() {
      return new DomainException();
    }
    
    @Override
    public IDomainException create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DomainException(resourceRepository, resource);
    }
  
  };

  public DomainException() {
    super(IDomainException.TYPE_ID);
  }
  
  public DomainException(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDomainException.TYPE_ID);
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
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
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
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.ICustomEvent> selectCustomEvents() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.ICustomEvent.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_customEvents);
  }

  public DomainException setCustomEvents(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.ICustomEvent> customEvents) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_customEvents, customEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEvent> selectEvents() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEvent.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.EventClass_events);
  }

  public DomainException setEvents(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEvent> events) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.EventClass_events, events);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClass selectExtends() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClass.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_extends);
  }

  public DomainException setExtends(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClass extends_) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_extends, extends_);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEventForField> selectFieldEvents() {
    return _getMap(cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEventForField.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_fieldEvents);
  }

  public DomainException setFieldEvents(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEventForField> fieldEvents) {
    _setMap(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_fieldEvents, fieldEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.fields.javamodel.IField> selectFields() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.fields.javamodel.IField.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.FieldClass_fields);
  }

  public DomainException setFields(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.fields.javamodel.IField> fields) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.FieldClass_fields, fields);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDependency.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency);
  }

  public DomainException setHasDependency(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDependency> hasDependency) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public DomainException setMethods(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.IAssociation> selectRelations() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.IAssociation.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.AssociationClass_relations);
  }

  public DomainException setRelations(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.IAssociation> relations) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.AssociationClass_relations, relations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DomainException setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.ICustomEvent.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_customEvents, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClass.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_extends, visitor);
    _acceptMap(cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEventForField.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_fieldEvents, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.fields.javamodel.IField.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.FieldClass_fields, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.IAssociation.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.AssociationClass_relations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d23456fc-25e9-11e3-af30-61c5782ee2ab,P53HYfIpreYS2cgcp++ABn+kSls=] */
