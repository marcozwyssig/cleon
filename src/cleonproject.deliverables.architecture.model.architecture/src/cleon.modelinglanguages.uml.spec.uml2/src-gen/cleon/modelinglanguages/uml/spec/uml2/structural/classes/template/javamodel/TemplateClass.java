package cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TemplateClass extends DynamicResource implements ITemplateClass {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplateClass> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITemplateClass>() {
    
    @Override
    public ITemplateClass create() {
      return new TemplateClass();
    }
    
    @Override
    public ITemplateClass create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TemplateClass(resourceRepository, resource);
    }
  
  };

  public TemplateClass() {
    super(ITemplateClass.TYPE_ID);
  }
  
  public TemplateClass(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITemplateClass.TYPE_ID);
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

  public TemplateClass setCustomEvents(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.ICustomEvent> customEvents) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_customEvents, customEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEvent> selectEvents() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEvent.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.EventClass_events);
  }

  public TemplateClass setEvents(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEvent> events) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.EventClass_events, events);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClass selectExtends() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClass.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_extends);
  }

  public TemplateClass setExtends(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClass extends_) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_extends, extends_);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEventForField> selectFieldEvents() {
    return _getMap(cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEventForField.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_fieldEvents);
  }

  public TemplateClass setFieldEvents(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEventForField> fieldEvents) {
    _setMap(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_fieldEvents, fieldEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.fields.javamodel.IField> selectFields() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.fields.javamodel.IField.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.FieldClass_fields);
  }

  public TemplateClass setFields(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.fields.javamodel.IField> fields) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.FieldClass_fields, fields);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDependency.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency);
  }

  public TemplateClass setHasDependency(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDependency> hasDependency) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public TemplateClass setMethods(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.IAssociation> selectRelations() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.IAssociation.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.AssociationClass_relations);
  }

  public TemplateClass setRelations(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.IAssociation> relations) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.AssociationClass_relations, relations);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.javamodel.ITemplateClassParameter> selectTemplateParameters() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.javamodel.ITemplateClassParameter.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.TemplatePackage.TemplateClass_templateParameters);
  }

  public TemplateClass setTemplateParameters(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.javamodel.ITemplateClassParameter> templateParameters) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.TemplatePackage.TemplateClass_templateParameters, templateParameters);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TemplateClass setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.ICustomEvent.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_customEvents, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEvent.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.EventClass_events, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClass.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_extends, visitor);
    _acceptMap(cleon.modelinglanguages.uml.spec.uml2.structural.classes.events.javamodel.IEventForField.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.Class_fieldEvents, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.fields.javamodel.IField.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.FieldClass_fields, visitor);
    _acceptList(cleon.common.modularity.spec.buildingblock.javamodel.IDependency.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.association.javamodel.IAssociation.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.ClassesPackage.AssociationClass_relations, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.javamodel.ITemplateClassParameter.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.TemplatePackage.TemplateClass_templateParameters, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.javamodel.ITemplateClass selectToMeTemplateParameters(cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.javamodel.ITemplateClassParameter object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.javamodel.ITemplateClass.class, cleon.modelinglanguages.uml.spec.uml2.structural.classes.template.TemplatePackage.TemplateClass_templateParameters, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,743e6460-a3b9-11e3-8095-f11af53ab806,+3MnyowR5e/VBOhUZxQoKYMR+6w=] */
