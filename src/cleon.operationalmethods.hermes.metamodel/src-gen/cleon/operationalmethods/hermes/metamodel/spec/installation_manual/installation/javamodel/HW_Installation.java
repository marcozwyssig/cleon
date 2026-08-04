package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class HW_Installation extends DynamicResource implements IHW_Installation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHW_Installation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHW_Installation>() {
    
    @Override
    public IHW_Installation create() {
      return new HW_Installation();
    }
    
    @Override
    public IHW_Installation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new HW_Installation(resourceRepository, resource);
    }
  
  };

  public HW_Installation() {
    super(IHW_Installation.TYPE_ID);
  }
  
  public HW_Installation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHW_Installation.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public HW_Installation setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IDeploy_VM selectDeploy_VM() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IDeploy_VM.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.HW_aE_Installation_deploy_aE_VM);
  }

  public HW_Installation setDeploy_VM(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IDeploy_VM deploy_VM) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.HW_aE_Installation_deploy_aE_VM, deploy_VM);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public HW_Installation setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public HW_Installation setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public HW_Installation setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IPrepare_Yaml selectPrepare_Yaml() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IPrepare_Yaml.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.HW_aE_Installation_prepare_aE_Yaml);
  }

  public HW_Installation setPrepare_Yaml(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IPrepare_Yaml prepare_Yaml) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.HW_aE_Installation_prepare_aE_Yaml, prepare_Yaml);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public HW_Installation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterLevel, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IDeploy_VM.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.HW_aE_Installation_deploy_aE_VM, visitor);
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IPrepare_Yaml.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.HW_aE_Installation_prepare_aE_Yaml, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IHW_Installation selectToMePrepare_Yaml(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IPrepare_Yaml object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IHW_Installation.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.HW_aE_Installation_prepare_aE_Yaml, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IHW_Installation selectToMeDeploy_VM(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IDeploy_VM object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IHW_Installation.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.InstallationPackage.HW_aE_Installation_deploy_aE_VM, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,51c569d0-9535-11ec-9b36-7d300415c806,onON3qfEB+0ui/P1bqR2JhOdMKQ=] */
