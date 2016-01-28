package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Backlog extends DynamicResource implements IBacklog {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklog> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklog>() {
    
    @Override
    public IBacklog create() {
      return new Backlog();
    }
    
    @Override
    public IBacklog create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Backlog(resourceRepository, resource);
    }
  
  };

  public Backlog() {
    super(IBacklog.TYPE_ID);
  }
  
  public Backlog(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBacklog.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectPlannedEstimate() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_plannedEstimate);
  }
    
  public void setPlannedEstimate(java.lang.Integer plannedEstimate) {
     _setSingleAttribute(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_plannedEstimate, plannedEstimate);
  }

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

  public Backlog setAutors(java.util.List<? extends cleon.doc.spec.autor.javamodel.IAutor> autors) {
    _setList(cleon.doc.spec.autor.AutorPackage.Autors_autors, autors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Backlog setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public Backlog setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> selectFeatureGroups() {
    return _getList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_featureGroups);
  }

  public Backlog setFeatureGroups(java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> featureGroups) {
    _setList(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_featureGroups, featureGroups);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.javamodel.ISubDocument selectNoDocuments() {
    return _getSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments);
  }

  public Backlog setNoDocuments(cleon.doc.spec.document.javamodel.ISubDocument noDocuments) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, noDocuments);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Backlog setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson selectOwner() {
    return _getSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_owner);
  }

  public Backlog setOwner(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson owner) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_owner, owner);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Backlog setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style);
  }

  public Backlog setStyle(cleon.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Backlog setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Backlog setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_plannedEstimate, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.doc.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptList(cleon.doc.spec.autor.javamodel.IAutor.class, cleon.doc.spec.autor.AutorPackage.Autors_autors, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptList(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_featureGroups, visitor);
    _acceptSingle(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.NoSubDocuments_noDocuments, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_owner, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog selectToMeFeatureGroups(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_featureGroups, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog> selectToMeOwner(cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IBacklog.class, cleon.sda.spec.projectmanagement.scope.backlog.BacklogPackage.Backlog_owner, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,28af8502-ff9c-11e4-ac0a-959b440f987f,EXK1VD1ytb/LcSjRXjoaE0XY1iw=] */
