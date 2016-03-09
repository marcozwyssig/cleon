package cleon.sda.spec.requirementsmanagement.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Issues extends DynamicResource implements IIssues {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIssues> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIssues>() {
    
    @Override
    public IIssues create() {
      return new Issues();
    }
    
    @Override
    public IIssues create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Issues(resourceRepository, resource);
    }
  
  };

  public Issues() {
    super(IIssues.TYPE_ID);
  }
  
  public Issues(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIssues.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory> selectCategories() {
    return _getList(cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issues_categories);
  }

  public Issues setCategories(java.util.List<? extends cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory> categories) {
    _setList(cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issues_categories, categories);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> selectChapters() {
    return _getList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters);
  }

  public Issues setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public Issues setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssueGroup> selectIssueGroups() {
    return _getList(cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssueGroup.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issues_issueGroups);
  }

  public Issues setIssueGroups(java.util.List<? extends cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssueGroup> issueGroups) {
    _setList(cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issues_issueGroups, issueGroups);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Issues setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public Issues setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public Issues setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Issues setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public Issues setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issues_categories, visitor);
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssueGroup.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issues_issueGroups, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssues selectToMeIssueGroups(cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssueGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssues.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issues_issueGroups, object.getResource());
  }
  
  public static cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssues selectToMeCategories(cleon.sda.spec.requirementsmanagement.issues.javamodel.ICategory object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssues.class, cleon.sda.spec.requirementsmanagement.issues.IssuesPackage.Issues_categories, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9fb6a044-bdee-11e5-965a-07bc81ea9ca9,Mhcj7MEO6xCWbZqwdGFxdrlSYUY=] */
