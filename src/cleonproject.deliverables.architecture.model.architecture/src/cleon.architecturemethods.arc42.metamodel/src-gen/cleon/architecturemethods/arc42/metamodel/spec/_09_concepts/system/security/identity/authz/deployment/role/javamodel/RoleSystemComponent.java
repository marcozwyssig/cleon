package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RoleSystemComponent extends DynamicResource implements IRoleSystemComponent {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleSystemComponent> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleSystemComponent>() {
    
    @Override
    public IRoleSystemComponent create() {
      return new RoleSystemComponent();
    }
    
    @Override
    public IRoleSystemComponent create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RoleSystemComponent(resourceRepository, resource);
    }
  
  };

  public RoleSystemComponent() {
    super(IRoleSystemComponent.TYPE_ID);
  }
  
  public RoleSystemComponent(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoleSystemComponent.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
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

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath, noChapterPath);
  }

  @Override
  public java.lang.Integer selectUniqueId() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_uniqueId);
  }
    
  public void setUniqueId(java.lang.Integer uniqueId) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_uniqueId, uniqueId);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectAllocateActivitiesFromSite() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ActivityAllocationFromSiteAware_allocateActivitiesFromSite);
  }

  public RoleSystemComponent setAllocateActivitiesFromSite(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> allocateActivitiesFromSite) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.AccountsPackage.ActivityAllocationFromSiteAware_allocateActivitiesFromSite, allocateActivitiesFromSite);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectAllocateActivitiesOfSite() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_allocateActivitiesOfSite);
  }

  public RoleSystemComponent setAllocateActivitiesOfSite(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> allocateActivitiesOfSite) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_allocateActivitiesOfSite, allocateActivitiesOfSite);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public RoleSystemComponent setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public RoleSystemComponent setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> selectExcludeActivities() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_excludeActivities);
  }

  public RoleSystemComponent setExcludeActivities(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission> excludeActivities) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_excludeActivities, excludeActivities);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public RoleSystemComponent setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RoleSystemComponent setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent selectSystemComponentRoleTemplate() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_systemComponentRoleTemplate);
  }

  public RoleSystemComponent setSystemComponentRoleTemplate(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent systemComponentRoleTemplate) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_systemComponentRoleTemplate, systemComponentRoleTemplate);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RoleSystemComponent setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RoleSystemComponent setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_uniqueId, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_allocateActivitiesOfSite, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_excludeActivities, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_systemComponentRoleTemplate, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> selectToMeSystemComponentRoleTemplate(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_systemComponentRoleTemplate, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> selectToMeAllocateActivitiesOfSite(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_allocateActivitiesOfSite, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> selectToMeExcludeActivities(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IActivityPermission object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.RolePackage.RoleSystemComponent_excludeActivities, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e33fb742-35e4-11e9-9d58-25409887bb2a,0DkrQSAYXzVs7NK9iWYi9ZCUPdk=] */
