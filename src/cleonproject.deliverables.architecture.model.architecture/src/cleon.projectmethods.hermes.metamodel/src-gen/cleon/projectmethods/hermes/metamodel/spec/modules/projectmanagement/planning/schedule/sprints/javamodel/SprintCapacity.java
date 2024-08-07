package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SprintCapacity extends DynamicResource implements ISprintCapacity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintCapacity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintCapacity>() {
    
    @Override
    public ISprintCapacity create() {
      return new SprintCapacity();
    }
    
    @Override
    public ISprintCapacity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SprintCapacity(resourceRepository, resource);
    }
  
  };

  public SprintCapacity() {
    super(ISprintCapacity.TYPE_ID);
  }
  
  public SprintCapacity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprintCapacity.TYPE_ID);
  }

  // attributes
  
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

  public SprintCapacity setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SprintCapacity setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SprintCapacity setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity> selectPersonCapacity() {
    return _getMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.SprintsPackage.SprintCapacity_personCapacity);
  }

  public SprintCapacity setPersonCapacity(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity> personCapacity) {
    _setMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.SprintsPackage.SprintCapacity_personCapacity, personCapacity);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SprintCapacity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptMap(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.SprintsPackage.SprintCapacity_personCapacity, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity selectToMePersonCapacity(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.IPersonCapacity object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.javamodel.ISprintCapacity.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.sprints.SprintsPackage.SprintCapacity_personCapacity, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ff83f76d-c00b-11e5-a165-d34765931e10,N+9z2igcKfX4A5oQOJxH9mYJEmA=] */
