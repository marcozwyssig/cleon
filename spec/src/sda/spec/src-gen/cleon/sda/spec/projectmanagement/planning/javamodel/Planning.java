package cleon.sda.spec.projectmanagement.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Planning extends DynamicResource implements IPlanning {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlanning> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlanning>() {
    
    @Override
    public IPlanning create() {
      return new Planning();
    }
    
    @Override
    public IPlanning create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Planning(resourceRepository, resource);
    }
  
  };

  public Planning() {
    super(IPlanning.TYPE_ID);
  }
  
  public Planning(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPlanning.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.doc.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.doc.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> selectAutors() {
    return _getList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors);
  }

  public Planning setAutors(java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> autors) {
    _setList(cleon.doc.spec.autor.AutorPackage.Autors_autors, autors);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendar selectCalendar() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendar.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_calendar);
  }

  public Planning setCalendar(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendar calendar) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_calendar, calendar);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Planning setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public Planning setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.javamodel.ISubDocument selectNoDocuments() {
    return _getSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments);
  }

  public Planning setNoDocuments(cleon.doc.spec.document.javamodel.ISubDocument noDocuments) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, noDocuments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Planning setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Planning setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IReleasePlanning selectReleasePlanning() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IReleasePlanning.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_releasePlanning);
  }

  public Planning setReleasePlanning(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IReleasePlanning releasePlanning) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_releasePlanning, releasePlanning);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlannings selectSprintPlanning() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlannings.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_sprintPlanning);
  }

  public Planning setSprintPlanning(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlannings sprintPlanning) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_sprintPlanning, sprintPlanning);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style);
  }

  public Planning setStyle(cleon.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDates selectTargetDates() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDates.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_targetDates);
  }

  public Planning setTargetDates(cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDates targetDates) {
    _setSingle(cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_targetDates, targetDates);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Planning setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Planning setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.doc.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendar.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_calendar, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IReleasePlanning.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_releasePlanning, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlannings.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_sprintPlanning, visitor);
    _acceptSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDates.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_targetDates, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning selectToMeReleasePlanning(cleon.sda.spec.projectmanagement.planning.releaseplanning.javamodel.IReleasePlanning object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_releasePlanning, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning selectToMeSprintPlanning(cleon.sda.spec.projectmanagement.planning.sprintplanning.javamodel.ISprintPlannings object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_sprintPlanning, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning selectToMeTargetDates(cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDates object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_targetDates, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning> selectToMeCalendar(cleon.sda.spec.projectmanagement.planning.calendar.javamodel.ICalendar object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning.class, cleon.sda.spec.projectmanagement.planning.PlanningPackage.Planning_calendar, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f541a84-a7d8-11e5-82dd-3b995d9c840c,sqBPspdLyYPvBOyu4CKR3axZudc=] */
