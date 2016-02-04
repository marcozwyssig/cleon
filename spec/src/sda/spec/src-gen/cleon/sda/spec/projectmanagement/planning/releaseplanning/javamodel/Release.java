package cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Release extends DynamicResource implements IRelease {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRelease> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRelease>() {
    
    @Override
    public IRelease create() {
      return new Release();
    }
    
    @Override
    public IRelease create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Release(resourceRepository, resource);
    }
  
  };

  public Release() {
    super(IRelease.TYPE_ID);
  }
  
  public Release(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRelease.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.lang.Integer selectDaysPerSprint() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_daysPerSprint);
  }
    
  public void setDaysPerSprint(java.lang.Integer daysPerSprint) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_daysPerSprint, daysPerSprint);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
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
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Release setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectEnd() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end);
  }

  public Release setEnd(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay end) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end, end);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Release setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Release setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint> selectSprints() {
    return _getList(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_sprints);
  }

  public Release setSprints(java.util.List<? extends cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint> sprints) {
    _setList(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_sprints, sprints);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectStart() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start);
  }

  public Release setStart(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay start) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start, start);
    return this;
  }
    
  @Override
  public cleon.sda.spec.javamodel.IWorkState selectState() {
    return _getSingle(cleon.sda.spec.javamodel.IWorkState.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_state);
  }

  public Release setState(cleon.sda.spec.javamodel.IWorkState state) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Release setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_daysPerSprint, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_sprints, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start, visitor);
    _acceptSingle(cleon.sda.spec.javamodel.IWorkState.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IRelease selectToMeSprints(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.ISprint object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IRelease.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.Release_sprints, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2755120c-3761-11e5-95d9-2b04d7ab02d9,m3ZYP14pL3clE2rwVpA0p4NGA3k=] */
