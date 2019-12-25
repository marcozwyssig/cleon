package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.controls.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ContentControlView extends DynamicResource implements IContentControlView {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IContentControlView> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IContentControlView>() {
    
    @Override
    public IContentControlView create() {
      return new ContentControlView();
    }
    
    @Override
    public IContentControlView create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ContentControlView(resourceRepository, resource);
    }
  
  };

  public ContentControlView() {
    super(IContentControlView.TYPE_ID);
  }
  
  public ContentControlView(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IContentControlView.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsAbstract() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
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
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEvent> selectCustomEvents() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEvent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Class_customEvents);
  }

  public ContentControlView setCustomEvents(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEvent> customEvents) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Class_customEvents, customEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.IEvent> selectEvents() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.IEvent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.EventClass_events);
  }

  public ContentControlView setEvents(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.IEvent> events) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.EventClass_events, events);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.javamodel.IView selectExtends() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.MvvmPackage.View_extends);
  }

  public ContentControlView setExtends(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.javamodel.IView extends_) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.MvvmPackage.View_extends, extends_);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.IEventForField> selectFieldEvents() {
    return _getMap(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.IEventForField.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Class_fieldEvents);
  }

  public ContentControlView setFieldEvents(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.IEventForField> fieldEvents) {
    _setMap(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Class_fieldEvents, fieldEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.fields.javamodel.IField> selectFields() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.fields.javamodel.IField.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.FieldClass_fields);
  }

  public ContentControlView setFields(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.fields.javamodel.IField> fields) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.FieldClass_fields, fields);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.common.modularity.metamodel.spec.javamodel.IDependency.class, cleon.common.modularity.metamodel.spec.SpecPackage.DependentBuildingBlock_hasDependency);
  }

  public ContentControlView setHasDependency(java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IDependency> hasDependency) {
    _setList(cleon.common.modularity.metamodel.spec.SpecPackage.DependentBuildingBlock_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public ContentControlView setMethods(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociation> selectRelations() {
    return _getList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociation.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.AssociationClass_relations);
  }

  public ContentControlView setRelations(java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociation> relations) {
    _setList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.AssociationClass_relations, relations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ContentControlView setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.javamodel.IViewModelDependency selectViewModel() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.javamodel.IViewModelDependency.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.MvvmPackage.View_viewModel);
  }

  public ContentControlView setViewModel(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.javamodel.IViewModelDependency viewModel) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.MvvmPackage.View_viewModel, viewModel);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.ICustomEvent.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Class_customEvents, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.javamodel.IView.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.MvvmPackage.View_extends, visitor);
    _acceptMap(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.events.javamodel.IEventForField.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.Class_fieldEvents, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.fields.javamodel.IField.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.FieldClass_fields, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.javamodel.IMethod.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptList(cleon.modelinglanguages.uml.metamodel.spec.structural.classes.association.javamodel.IAssociation.class, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.ClassesPackage.AssociationClass_relations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.javamodel.IViewModelDependency.class, cleon.architecturemethods.arc42.metamodel.spec._08_concepts.desktop.mvvm.MvvmPackage.View_viewModel, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5620ce54-92f5-11e3-a63e-fb8038f76aec,UZcT0qxoHlBvjwOSqtYdPEKv6mA=] */
