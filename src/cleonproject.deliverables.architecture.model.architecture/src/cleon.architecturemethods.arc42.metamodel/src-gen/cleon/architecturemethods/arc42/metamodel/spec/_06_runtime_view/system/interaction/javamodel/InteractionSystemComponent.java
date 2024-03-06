package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InteractionSystemComponent extends DynamicResource implements IInteractionSystemComponent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInteractionSystemComponent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInteractionSystemComponent>() {
    
    @Override
    public IInteractionSystemComponent create() {
      return new InteractionSystemComponent();
    }
    
    @Override
    public IInteractionSystemComponent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InteractionSystemComponent(resourceRepository, resource);
    }
  
  };

  public InteractionSystemComponent() {
    super(IInteractionSystemComponent.TYPE_ID);
  }
  
  public InteractionSystemComponent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInteractionSystemComponent.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, chapterPath);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public InteractionSystemComponent setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public InteractionSystemComponent setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteraction> selectInteraction() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteraction.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.InteractionPackage.InteractionSystemComponent_interaction);
  }

  public InteractionSystemComponent setInteraction(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteraction> interaction) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.InteractionPackage.InteractionSystemComponent_interaction, interaction);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent selectInteractionSystemComponent() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.InteractionPackage.InteractionSystemComponent_interactionSystemComponent);
  }

  public InteractionSystemComponent setInteractionSystemComponent(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent interactionSystemComponent) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.InteractionPackage.InteractionSystemComponent_interactionSystemComponent, interactionSystemComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public InteractionSystemComponent setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public InteractionSystemComponent setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InteractionSystemComponent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteraction.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.InteractionPackage.InteractionSystemComponent_interaction, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.InteractionPackage.InteractionSystemComponent_interactionSystemComponent, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteractionSystemComponent> selectToMeInteractionSystemComponent(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteractionSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.InteractionPackage.InteractionSystemComponent_interactionSystemComponent, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteractionSystemComponent selectToMeInteraction(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteraction object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.javamodel.IInteractionSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.interaction.InteractionPackage.InteractionSystemComponent_interaction, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6ece79d2-6827-11ea-94e8-6d7d386ab4e1,b/B0Jkck0yP3o4RNouhaDyq+g6M=] */
