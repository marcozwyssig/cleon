package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Phase extends DynamicResource implements IPhase {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPhase> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPhase>() {
    
    @Override
    public IPhase create() {
      return new Phase();
    }
    
    @Override
    public IPhase create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Phase(resourceRepository, resource);
    }
  
  };

  public Phase() {
    super(IPhase.TYPE_ID);
  }
  
  public Phase(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPhase.TYPE_ID);
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
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Phase setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Phase setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Phase setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IRelease> selectReleases() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IRelease.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.ReleasesPackage.Phase_releases);
  }

  public Phase setReleases(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IRelease> releases) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.ReleasesPackage.Phase_releases, releases);
    return this;
  }
    
  @Override
  public cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState selectState() {
    return _getSingle(cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState.class, cleon.common.resources.metamodel.spec.workstate.WorkstatePackage.WorkStateAware_state);
  }

  public Phase setState(cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState state) {
    _setSingle(cleon.common.resources.metamodel.spec.workstate.WorkstatePackage.WorkStateAware_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Phase setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IRelease.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.ReleasesPackage.Phase_releases, visitor);
    _acceptSingle(cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState.class, cleon.common.resources.metamodel.spec.workstate.WorkstatePackage.WorkStateAware_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IPhase selectToMeReleases(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IRelease object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.javamodel.IPhase.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.schedule.releases.ReleasesPackage.Phase_releases, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bcd1f820-d719-11e6-a422-8b5491da3f30,L+Wf9R2fxXua86ms5o9JtCQdzQA=] */
