package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemConfigurationAccessFrom extends DynamicResource implements ISystemConfigurationAccessFrom {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationAccessFrom> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationAccessFrom>() {
    
    @Override
    public ISystemConfigurationAccessFrom create() {
      return new SystemConfigurationAccessFrom();
    }
    
    @Override
    public ISystemConfigurationAccessFrom create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemConfigurationAccessFrom(resourceRepository, resource);
    }
  
  };

  public SystemConfigurationAccessFrom() {
    super(ISystemConfigurationAccessFrom.TYPE_ID);
  }
  
  public SystemConfigurationAccessFrom(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemConfigurationAccessFrom.TYPE_ID);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo> selectAccessTo() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.SystemConfigurationAccessFrom_accessTo);
  }

  public SystemConfigurationAccessFrom setAccessTo(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo> accessTo) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.SystemConfigurationAccessFrom_accessTo, accessTo);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SystemConfigurationAccessFrom setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SystemConfigurationAccessFrom setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public SystemConfigurationAccessFrom setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SystemConfigurationAccessFrom setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.remote_access.javamodel.IAbstractRemoteAccessSystemConfiguraiton selectSourceAccess() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.remote_access.javamodel.IAbstractRemoteAccessSystemConfiguraiton.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.SystemConfigurationAccessFrom_sourceAccess);
  }

  public SystemConfigurationAccessFrom setSourceAccess(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.remote_access.javamodel.IAbstractRemoteAccessSystemConfiguraiton sourceAccess) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.SystemConfigurationAccessFrom_sourceAccess, sourceAccess);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SystemConfigurationAccessFrom setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemConfigurationAccessFrom setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.SystemConfigurationAccessFrom_accessTo, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.remote_access.javamodel.IAbstractRemoteAccessSystemConfiguraiton.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.SystemConfigurationAccessFrom_sourceAccess, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.ISystemConfigurationAccessFrom selectToMeSourceAccess(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.remote_access.javamodel.IAbstractRemoteAccessSystemConfiguraiton object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.ISystemConfigurationAccessFrom.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.SystemConfigurationAccessFrom_sourceAccess, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.ISystemConfigurationAccessFrom selectToMeAccessTo(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessSystemConfigurationTo object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.ISystemConfigurationAccessFrom.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.AccessPackage.SystemConfigurationAccessFrom_accessTo, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,216f5973-19c1-11eb-8585-65084a06c07f,WlR6RAsHVP45NHwVE70svw1uVuI=] */
