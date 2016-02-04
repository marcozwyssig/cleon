package cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Sprint extends DynamicResource implements ISprint {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprint> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprint>() {
    
    @Override
    public ISprint create() {
      return new Sprint();
    }
    
    @Override
    public ISprint create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Sprint(resourceRepository, resource);
    }
  
  };

  public Sprint() {
    super(ISprint.TYPE_ID);
  }
  
  public Sprint(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprint.TYPE_ID);
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
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, identifier);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Sprint setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectEnd() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end);
  }

  public Sprint setEnd(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay end) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end, end);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Sprint setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Sprint setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Sprint setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectStart() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start);
  }

  public Sprint setStart(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay start) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start, start);
    return this;
  }
    
  @Override
  public cleon.sda.spec.javamodel.IWorkState selectState() {
    return _getSingle(cleon.sda.spec.javamodel.IWorkState.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_state);
  }

  public Sprint setState(cleon.sda.spec.javamodel.IWorkState state) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Sprint setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.doc.spec.SpecPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.SpecPackage.BusinessObjectId_identifier, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_end, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_start, visitor);
    _acceptSingle(cleon.sda.spec.javamodel.IWorkState.class, cleon.sda.spec.projectmanagement.planning.releaseplanning.ReleaseplanningPackage.TimePlan_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,46c6145c-3761-11e5-95d9-2b04d7ab02d9,EycP0XlpzVeoSmwvJUd9vyiKzrc=] */
