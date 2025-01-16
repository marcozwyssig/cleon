package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class InstallationManuals extends DynamicResource implements IInstallationManuals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallationManuals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInstallationManuals>() {
    
    @Override
    public IInstallationManuals create() {
      return new InstallationManuals();
    }
    
    @Override
    public IInstallationManuals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new InstallationManuals(resourceRepository, resource);
    }
  
  };

  public InstallationManuals() {
    super(IInstallationManuals.TYPE_ID);
  }
  
  public InstallationManuals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInstallationManuals.TYPE_ID);
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
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout selectAbout() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about);
  }

  public InstallationManuals setAbout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public InstallationManuals setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public InstallationManuals setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument> selectInstallationManuals() {
    return _getMap(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManuals_installationManuals);
  }

  public InstallationManuals setInstallationManuals(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument> installationManuals) {
    _setMap(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManuals_installationManuals, installationManuals);
    return this;
  }
    
  @Override
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual selectOperatingManual() {
    return _getSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManuals_operatingManual);
  }

  public InstallationManuals setOperatingManual(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual operatingManual) {
    _setSingle(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManuals_operatingManual, operatingManual);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public InstallationManuals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, visitor);
    _acceptMap(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManuals_installationManuals, visitor);
    _acceptSingle(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManuals_operatingManual, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManuals> selectToMeOperatingManual(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual object) {
    return _getToMeList(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManuals.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManuals_operatingManual, object.getResource());
  }
  
  public static cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManuals selectToMeInstallationManuals(cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManuals.class, cleon.operationalmethods.hermes.metamodel.spec.installation_manual.Installation_manualPackage.InstallationManuals_installationManuals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a3123c6e-23b3-11e9-9073-d1012347ccc5,9mtZHrKcGOEHRR7KUMC4B4s/NRc=] */
