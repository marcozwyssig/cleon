package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RoleTemplate extends DynamicResource implements IRoleTemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleTemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoleTemplate>() {
    
    @Override
    public IRoleTemplate create() {
      return new RoleTemplate();
    }
    
    @Override
    public IRoleTemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RoleTemplate(resourceRepository, resource);
    }
  
  };

  public RoleTemplate() {
    super(IRoleTemplate.TYPE_ID);
  }
  
  public RoleTemplate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoleTemplate.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectChapterLevel() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel);
  }
    
  public void setChapterLevel(java.lang.Integer chapterLevel) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel, chapterLevel);
  }

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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
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
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath, noChapterPath);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> selectActivityTemplatePermissionOnSites() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionOnSites);
  }

  public RoleTemplate setActivityTemplatePermissionOnSites(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> activityTemplatePermissionOnSites) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionOnSites, activityTemplatePermissionOnSites);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> selectActivityTemplatePermissionsOnLocalSite() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionsOnLocalSite);
  }

  public RoleTemplate setActivityTemplatePermissionsOnLocalSite(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission> activityTemplatePermissionsOnLocalSite) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionsOnLocalSite, activityTemplatePermissionsOnLocalSite);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectAvailablePermissionTemplateOfSystemConfigurations() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_availablePermissionTemplateOfSystemConfigurations);
  }

  public RoleTemplate setAvailablePermissionTemplateOfSystemConfigurations(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> availablePermissionTemplateOfSystemConfigurations) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_availablePermissionTemplateOfSystemConfigurations, availablePermissionTemplateOfSystemConfigurations);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate> selectBasedOn() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_basedOn);
  }

  public RoleTemplate setBasedOn(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate> basedOn) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_basedOn, basedOn);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public RoleTemplate setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public RoleTemplate setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public RoleTemplate setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public RoleTemplate setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RoleTemplate setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemComponent selectSystemOrSystemComponent() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_systemOrSystemComponent);
  }

  public RoleTemplate setSystemOrSystemComponent(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemComponent systemOrSystemComponent) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_systemOrSystemComponent, systemOrSystemComponent);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RoleTemplate setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RoleTemplate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectUsePermissionTemplateOfSystemConfigurations() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_usePermissionTemplateOfSystemConfigurations);
  }

  public RoleTemplate setUsePermissionTemplateOfSystemConfigurations(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> usePermissionTemplateOfSystemConfigurations) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_usePermissionTemplateOfSystemConfigurations, usePermissionTemplateOfSystemConfigurations);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> selectUsedBy() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_usedBy);
  }

  public RoleTemplate setUsedBy(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> usedBy) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_usedBy, usedBy);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionOnSites, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IAbstractActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateAware_activityTemplatePermissionsOnLocalSite, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_availablePermissionTemplateOfSystemConfigurations, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_basedOn, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_systemOrSystemComponent, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_usePermissionTemplateOfSystemConfigurations, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_usedBy, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate> selectToMeSystemOrSystemComponent(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_systemOrSystemComponent, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate> selectToMeBasedOn(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_basedOn, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate> selectToMeUsedBy(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_usedBy, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate> selectToMeUsePermissionTemplateOfSystemConfigurations(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_usePermissionTemplateOfSystemConfigurations, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate> selectToMeAvailablePermissionTemplateOfSystemConfigurations(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.javamodel.IRoleTemplate.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role.RolePackage.RoleTemplate_availablePermissionTemplateOfSystemConfigurations, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,59a32567-d423-11eb-9862-7f597b9587dd,1iMhWYNfARCTPkzQvTquBbUqy6E=] */
