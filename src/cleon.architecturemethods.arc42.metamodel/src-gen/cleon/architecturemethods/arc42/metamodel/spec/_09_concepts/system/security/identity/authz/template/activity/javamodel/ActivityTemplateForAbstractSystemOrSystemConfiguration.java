package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ActivityTemplateForAbstractSystemOrSystemConfiguration extends DynamicResource implements IActivityTemplateForAbstractSystemOrSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityTemplateForAbstractSystemOrSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IActivityTemplateForAbstractSystemOrSystemConfiguration>() {
    
    @Override
    public IActivityTemplateForAbstractSystemOrSystemConfiguration create() {
      return new ActivityTemplateForAbstractSystemOrSystemConfiguration();
    }
    
    @Override
    public IActivityTemplateForAbstractSystemOrSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ActivityTemplateForAbstractSystemOrSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public ActivityTemplateForAbstractSystemOrSystemConfiguration() {
    super(IActivityTemplateForAbstractSystemOrSystemConfiguration.TYPE_ID);
  }
  
  public ActivityTemplateForAbstractSystemOrSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IActivityTemplateForAbstractSystemOrSystemConfiguration.TYPE_ID);
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
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplatePermission> selectActivityTemplateForPermission() {
    return _getMultiMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_activityTemplateForPermission);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setActivityTemplateForPermission(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplatePermission> activityTemplateForPermission) {
    _setMultiMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_activityTemplateForPermission, activityTemplateForPermission);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration selectActivityTemplateForSystemOrSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_activityTemplateForSystemOrSystemConfiguration);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setActivityTemplateForSystemOrSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration activityTemplateForSystemOrSystemConfiguration) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_activityTemplateForSystemOrSystemConfiguration, activityTemplateForSystemOrSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup> selectBuiltinAdGroup() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.AdgroupsPackage.ADGroupAware_builtinAdGroup);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setBuiltinAdGroup(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup> builtinAdGroup) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.AdgroupsPackage.ADGroupAware_builtinAdGroup, builtinAdGroup);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration> selectDependsOn() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_dependsOn);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setDependsOn(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration> dependsOn) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_dependsOn, dependsOn);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissionTemplates selectPermissionTemplates() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissionTemplates.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.PermissionTemplateAware_permissionTemplates);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setPermissionTemplates(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissionTemplates permissionTemplates) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.PermissionTemplateAware_permissionTemplates, permissionTemplates);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ActivityTemplateForAbstractSystemOrSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptMultiMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplatePermission.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_activityTemplateForPermission, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_activityTemplateForSystemOrSystemConfiguration, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.javamodel.IADGroup.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.adgroups.AdgroupsPackage.ADGroupAware_builtinAdGroup, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_dependsOn, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.activity.javamodel.IPermissionTemplates.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.PermissionTemplateAware_permissionTemplates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateForAbstractSystemOrSystemConfiguration selectToMeActivityTemplateForSystemOrSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateForAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_activityTemplateForSystemOrSystemConfiguration, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateForAbstractSystemOrSystemConfiguration selectToMeActivityTemplateForPermission(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplatePermission object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateForAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_activityTemplateForPermission, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateForAbstractSystemOrSystemConfiguration> selectToMeDependsOn(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystemOrSystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.javamodel.IActivityTemplateForAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.activity.ActivityPackage.ActivityTemplateForAbstractSystemOrSystemConfiguration_dependsOn, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6649e37b-032a-11eb-af88-136a9a3b3817,e65xrUVNheCiTCDum1fgGydqnj4=] */
