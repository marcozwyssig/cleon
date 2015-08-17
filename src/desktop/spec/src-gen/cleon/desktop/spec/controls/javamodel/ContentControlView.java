package cleon.desktop.spec.controls.javamodel;

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
  public java.lang.Boolean selectIsAbstract() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract);
  }
    
  public void setIsAbstract(java.lang.Boolean isAbstract) {
     _setSingleAttribute(cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, isAbstract);
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
  public cleon.desktop.spec.mvvm.binding.javamodel.IBinding selectBindingPattern() {
    return _getSingle(cleon.desktop.spec.mvvm.binding.javamodel.IBinding.class, cleon.desktop.spec.mvvm.binding.BindingPackage.Bindable_bindingPattern);
  }

  public ContentControlView setBindingPattern(cleon.desktop.spec.mvvm.binding.javamodel.IBinding bindingPattern) {
    _setSingle(cleon.desktop.spec.mvvm.binding.BindingPackage.Bindable_bindingPattern, bindingPattern);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters);
  }

  public ContentControlView setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent> selectCustomEvents() {
    return _getList(cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_customEvents);
  }

  public ContentControlView setCustomEvents(java.util.List<? extends cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent> customEvents) {
    _setList(cleon.uml.spec.structural.classes.ClassesPackage.Class_customEvents, customEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose);
  }

  public ContentControlView setDecompose(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite> decompose) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph> selectDescription() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description);
  }

  public ContentControlView setDescription(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph> description) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, description);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.events.javamodel.IEvent> selectEvents() {
    return _getList(cleon.uml.spec.structural.classes.events.javamodel.IEvent.class, cleon.uml.spec.structural.classes.ClassesPackage.EventClass_events);
  }

  public ContentControlView setEvents(java.util.List<? extends cleon.uml.spec.structural.classes.events.javamodel.IEvent> events) {
    _setList(cleon.uml.spec.structural.classes.ClassesPackage.EventClass_events, events);
    return this;
  }
    
  @Override
  public cleon.desktop.spec.mvvm.javamodel.IView selectExtends() {
    return _getSingle(cleon.desktop.spec.mvvm.javamodel.IView.class, cleon.desktop.spec.mvvm.MvvmPackage.View_extends);
  }

  public ContentControlView setExtends(cleon.desktop.spec.mvvm.javamodel.IView extends_) {
    _setSingle(cleon.desktop.spec.mvvm.MvvmPackage.View_extends, extends_);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.uml.spec.structural.classes.events.javamodel.IEventForField> selectFieldEvents() {
    return _getMap(cleon.uml.spec.structural.classes.events.javamodel.IEventForField.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_fieldEvents);
  }

  public ContentControlView setFieldEvents(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.uml.spec.structural.classes.events.javamodel.IEventForField> fieldEvents) {
    _setMap(cleon.uml.spec.structural.classes.ClassesPackage.Class_fieldEvents, fieldEvents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.fields.javamodel.IField> selectFields() {
    return _getList(cleon.uml.spec.structural.classes.fields.javamodel.IField.class, cleon.uml.spec.structural.classes.ClassesPackage.FieldClass_fields);
  }

  public ContentControlView setFields(java.util.List<? extends cleon.uml.spec.structural.classes.fields.javamodel.IField> fields) {
    _setList(cleon.uml.spec.structural.classes.ClassesPackage.FieldClass_fields, fields);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDependency> selectHasDependency() {
    return _getList(cleon.arc42.spec._05_buildingblockview.javamodel.IDependency.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DependentBuildingBlock_hasDependency);
  }

  public ContentControlView setHasDependency(java.util.List<? extends cleon.arc42.spec._05_buildingblockview.javamodel.IDependency> hasDependency) {
    _setList(cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DependentBuildingBlock_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> selectMethods() {
    return _getList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods);
  }

  public ContentControlView setMethods(java.util.List<? extends cleon.uml.spec.structural.classes.method.javamodel.IMethod> methods) {
    _setList(cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods, methods);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public ContentControlView setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes);
  }

  public ContentControlView setParagraphes(java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.uml.spec.structural.classes.association.javamodel.IAssociation> selectRelations() {
    return _getList(cleon.uml.spec.structural.classes.association.javamodel.IAssociation.class, cleon.uml.spec.structural.classes.ClassesPackage.AssociationClass_relations);
  }

  public ContentControlView setRelations(java.util.List<? extends cleon.uml.spec.structural.classes.association.javamodel.IAssociation> relations) {
    _setList(cleon.uml.spec.structural.classes.ClassesPackage.AssociationClass_relations, relations);
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
  public cleon.desktop.spec.mvvm.javamodel.IViewModelDependency selectViewModel() {
    return _getSingle(cleon.desktop.spec.mvvm.javamodel.IViewModelDependency.class, cleon.desktop.spec.mvvm.MvvmPackage.View_viewModel);
  }

  public ContentControlView setViewModel(cleon.desktop.spec.mvvm.javamodel.IViewModelDependency viewModel) {
    _setSingle(cleon.desktop.spec.mvvm.MvvmPackage.View_viewModel, viewModel);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.uml.spec.structural.classes.ClassesPackage.IsAbstract_isAbstract, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.desktop.spec.mvvm.binding.javamodel.IBinding.class, cleon.desktop.spec.mvvm.binding.BindingPackage.Bindable_bindingPattern, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.uml.spec.structural.classes.events.javamodel.ICustomEvent.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_customEvents, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDecomposite.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.ITextParagraph.class, cleon.doc.spec.chapter.ChapterPackage.ChapterWithDescription_description, visitor);
    _acceptList(cleon.uml.spec.structural.classes.events.javamodel.IEvent.class, cleon.uml.spec.structural.classes.ClassesPackage.EventClass_events, visitor);
    _acceptSingle(cleon.desktop.spec.mvvm.javamodel.IView.class, cleon.desktop.spec.mvvm.MvvmPackage.View_extends, visitor);
    _acceptMap(cleon.uml.spec.structural.classes.events.javamodel.IEventForField.class, cleon.uml.spec.structural.classes.ClassesPackage.Class_fieldEvents, visitor);
    _acceptList(cleon.uml.spec.structural.classes.fields.javamodel.IField.class, cleon.uml.spec.structural.classes.ClassesPackage.FieldClass_fields, visitor);
    _acceptList(cleon.arc42.spec._05_buildingblockview.javamodel.IDependency.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.DependentBuildingBlock_hasDependency, visitor);
    _acceptList(cleon.uml.spec.structural.classes.method.javamodel.IMethod.class, cleon.uml.spec.structural.classes.method.MethodPackage.MethodClass_methods, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.chapter.paragraph.javamodel.IParagraph.class, cleon.doc.spec.chapter.ChapterPackage.Chapter_paragraphes, visitor);
    _acceptList(cleon.uml.spec.structural.classes.association.javamodel.IAssociation.class, cleon.uml.spec.structural.classes.ClassesPackage.AssociationClass_relations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.desktop.spec.mvvm.javamodel.IViewModelDependency.class, cleon.desktop.spec.mvvm.MvvmPackage.View_viewModel, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5620ce54-92f5-11e3-a63e-fb8038f76aec,vuK9cQoBJIIcziZUt7LE2od8VkM=] */
