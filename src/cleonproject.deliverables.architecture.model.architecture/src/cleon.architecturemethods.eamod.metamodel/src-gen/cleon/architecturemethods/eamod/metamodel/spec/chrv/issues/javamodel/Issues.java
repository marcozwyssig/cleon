package cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel;

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
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.ICategory> selectCategories() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.ICategory.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.Issues_categories);
  }

  public Issues setCategories(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.ICategory> categories) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.Issues_categories, categories);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Issues setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Issues setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssueGroup> selectIssueGroups() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssueGroup.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.Issues_issueGroups);
  }

  public Issues setIssueGroups(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssueGroup> issueGroups) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.Issues_issueGroups, issueGroups);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Issues setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
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
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.ICategory.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.Issues_categories, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssueGroup.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.Issues_issueGroups, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssues selectToMeIssueGroups(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssueGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssues.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.Issues_issueGroups, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssues selectToMeCategories(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.ICategory object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssues.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.Issues_categories, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9fb6a044-bdee-11e5-965a-07bc81ea9ca9,qtCg6XmbbVEZgpLXUDtvELGvREc=] */
