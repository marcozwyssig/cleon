package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class AuthZBuildingBlockForAbstractSystemOrSystemConfiguration extends DynamicResource implements IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration>() {
    
    @Override
    public IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration create() {
      return new AuthZBuildingBlockForAbstractSystemOrSystemConfiguration();
    }
    
    @Override
    public IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new AuthZBuildingBlockForAbstractSystemOrSystemConfiguration(resourceRepository, resource);
    }
  
  };

  public AuthZBuildingBlockForAbstractSystemOrSystemConfiguration() {
    super(IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration.TYPE_ID);
  }
  
  public AuthZBuildingBlockForAbstractSystemOrSystemConfiguration(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration.TYPE_ID);
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
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission> selectAuthZBuildingBlockForPermission() {
    return _getMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForAbstractSystemOrSystemConfiguration_authZBuildingBlockForPermission);
  }

  public AuthZBuildingBlockForAbstractSystemOrSystemConfiguration setAuthZBuildingBlockForPermission(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission> authZBuildingBlockForPermission) {
    _setMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForAbstractSystemOrSystemConfiguration_authZBuildingBlockForPermission, authZBuildingBlockForPermission);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystemOrSystemConfiguration selectAuthZForSystemOrSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForAbstractSystemOrSystemConfiguration_authZForSystemOrSystemConfiguration);
  }

  public AuthZBuildingBlockForAbstractSystemOrSystemConfiguration setAuthZForSystemOrSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystemOrSystemConfiguration authZForSystemOrSystemConfiguration) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForAbstractSystemOrSystemConfiguration_authZForSystemOrSystemConfiguration, authZForSystemOrSystemConfiguration);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public AuthZBuildingBlockForAbstractSystemOrSystemConfiguration setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public AuthZBuildingBlockForAbstractSystemOrSystemConfiguration setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public AuthZBuildingBlockForAbstractSystemOrSystemConfiguration setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public AuthZBuildingBlockForAbstractSystemOrSystemConfiguration setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public AuthZBuildingBlockForAbstractSystemOrSystemConfiguration setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public AuthZBuildingBlockForAbstractSystemOrSystemConfiguration setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMultiMap(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForAbstractSystemOrSystemConfiguration_authZBuildingBlockForPermission, visitor);
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForAbstractSystemOrSystemConfiguration_authZForSystemOrSystemConfiguration, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration selectToMeAuthZForSystemOrSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractSystemOrSystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForAbstractSystemOrSystemConfiguration_authZForSystemOrSystemConfiguration, object.getResource());
  }
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration selectToMeAuthZBuildingBlockForPermission(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForPermission object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.javamodel.IAuthZBuildingBlockForAbstractSystemOrSystemConfiguration.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.identity.authz.buildingblock.activity.ActivityPackage.AuthZBuildingBlockForAbstractSystemOrSystemConfiguration_authZBuildingBlockForPermission, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6649e37b-032a-11eb-af88-136a9a3b3817,z8c4QlONhXda+xp1pBIgEgk3HaY=] */
