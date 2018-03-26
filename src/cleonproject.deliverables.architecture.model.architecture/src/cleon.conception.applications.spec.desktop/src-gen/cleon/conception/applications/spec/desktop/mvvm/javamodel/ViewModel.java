package cleon.conception.applications.spec.desktop.mvvm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ViewModel extends DynamicResource implements IViewModel {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IViewModel> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IViewModel>() {
    
    @Override
    public IViewModel create() {
      return new ViewModel();
    }
    
    @Override
    public IViewModel create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ViewModel(resourceRepository, resource);
    }
  
  };

  public ViewModel() {
    super(IViewModel.TYPE_ID);
  }
  
  public ViewModel(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IViewModel.TYPE_ID);
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
  public java.lang.Boolean selectGenerateFieldForDisplay() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_generateFieldForDisplay);
  }
    
  public void setGenerateFieldForDisplay(java.lang.Boolean generateFieldForDisplay) {
     _setSingleAttribute(cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_generateFieldForDisplay, generateFieldForDisplay);
  }

  @Override
  public java.lang.Boolean selectIsAbstract() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
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
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.events.javamodel.ICustomEvent> selectCustomEvents() {
    return _getList(cleon.conception.uml.spec.uml.structural.classes.events.javamodel.ICustomEvent.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.Class_customEvents);
  }

  public ViewModel setCustomEvents(java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.events.javamodel.ICustomEvent> customEvents) {
    _setList(cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.Class_customEvents, customEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.applications.spec.desktop.mvvm.javamodel.IDelegateCommand> selectDelegateCommands() {
    return _getList(cleon.conception.applications.spec.desktop.mvvm.javamodel.IDelegateCommand.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_delegateCommands);
  }

  public ViewModel setDelegateCommands(java.util.List<? extends cleon.conception.applications.spec.desktop.mvvm.javamodel.IDelegateCommand> delegateCommands) {
    _setList(cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_delegateCommands, delegateCommands);
    return this;
  }
    
  @Override
  public cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier selectDisplay() {
    return _getSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_display);
  }

  public ViewModel setDisplay(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier display) {
    _setSingle(cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_display, display);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ViewModel setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.events.javamodel.IEvent> selectEvents() {
    return _getList(cleon.conception.uml.spec.uml.structural.classes.events.javamodel.IEvent.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.EventClass_events);
  }

  public ViewModel setEvents(java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.events.javamodel.IEvent> events) {
    _setList(cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.EventClass_events, events);
    return this;
  }
    
  @Override
  public cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel selectExtends() {
    return _getSingle(cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_extends);
  }

  public ViewModel setExtends(cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel extends_) {
    _setSingle(cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_extends, extends_);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.uml.spec.uml.structural.classes.events.javamodel.IEventForField> selectFieldEvents() {
    return _getMap(cleon.conception.uml.spec.uml.structural.classes.events.javamodel.IEventForField.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.Class_fieldEvents);
  }

  public ViewModel setFieldEvents(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.uml.spec.uml.structural.classes.events.javamodel.IEventForField> fieldEvents) {
    _setMap(cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.Class_fieldEvents, fieldEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.fields.javamodel.IField> selectFields() {
    return _getList(cleon.conception.uml.spec.uml.structural.classes.fields.javamodel.IField.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.FieldClass_fields);
  }

  public ViewModel setFields(java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.fields.javamodel.IField> fields) {
    _setList(cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.FieldClass_fields, fields);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.applications.spec.desktop.mvvm.javamodel.IForwardPropertyDependency> selectForwardPropertys() {
    return _getMap(cleon.conception.applications.spec.desktop.mvvm.javamodel.IForwardPropertyDependency.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_forwardPropertys);
  }

  public ViewModel setForwardPropertys(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.applications.spec.desktop.mvvm.javamodel.IForwardPropertyDependency> forwardPropertys) {
    _setMap(cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_forwardPropertys, forwardPropertys);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.conception.architecture.spec.buildingblock.javamodel.IDependency.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency);
  }

  public ViewModel setHasDependency(java.util.List<? extends cleon.conception.architecture.spec.buildingblock.javamodel.IDependency> hasDependency) {
    _setList(cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod.class, cleon.conception.uml.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public ViewModel setMethods(java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.conception.uml.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation> selectRelations() {
    return _getList(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.AssociationClass_relations);
  }

  public ViewModel setRelations(java.util.List<? extends cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation> relations) {
    _setList(cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.AssociationClass_relations, relations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ViewModel setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_generateFieldForDisplay, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.conception.uml.spec.uml.structural.classes.events.javamodel.ICustomEvent.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.Class_customEvents, visitor);
    _acceptList(cleon.conception.applications.spec.desktop.mvvm.javamodel.IDelegateCommand.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_delegateCommands, visitor);
    _acceptSingle(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_display, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.classes.events.javamodel.IEvent.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.EventClass_events, visitor);
    _acceptSingle(cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_extends, visitor);
    _acceptMap(cleon.conception.uml.spec.uml.structural.classes.events.javamodel.IEventForField.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.Class_fieldEvents, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.classes.fields.javamodel.IField.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.FieldClass_fields, visitor);
    _acceptMap(cleon.conception.applications.spec.desktop.mvvm.javamodel.IForwardPropertyDependency.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_forwardPropertys, visitor);
    _acceptList(cleon.conception.architecture.spec.buildingblock.javamodel.IDependency.class, cleon.conception.architecture.spec.buildingblock.BuildingblockPackage.DependentBuildingBlock_hasDependency, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.classes.method.javamodel.IMethod.class, cleon.conception.uml.spec.uml.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptList(cleon.conception.uml.spec.uml.structural.classes.association.javamodel.IAssociation.class, cleon.conception.uml.spec.uml.structural.classes.ClassesPackage.AssociationClass_relations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel> selectToMeDisplay(cleon.conception.uml.spec.uml.structural.classes.javamodel.IClassifier object) {
    return _getToMeList(object.getRepository(), cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_display, object.getResource());
  }
  
  public static java.util.List<cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel> selectToMeExtends(cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel object) {
    return _getToMeList(object.getRepository(), cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_extends, object.getResource());
  }
  
  public static cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel selectToMeDelegateCommands(cleon.conception.applications.spec.desktop.mvvm.javamodel.IDelegateCommand object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_delegateCommands, object.getResource());
  }
  
  public static cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel selectToMeForwardPropertys(cleon.conception.applications.spec.desktop.mvvm.javamodel.IForwardPropertyDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.applications.spec.desktop.mvvm.javamodel.IViewModel.class, cleon.conception.applications.spec.desktop.mvvm.MvvmPackage.ViewModel_forwardPropertys, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,349382f4-5284-11e3-999a-25b1389b65ab,oNuVBfFvZXSd3Hvh6Ku6SZyHQVc=] */
