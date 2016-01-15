package cleon.sda.spec.requirementsmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementsManagement extends DynamicResource implements IRequirementsManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementsManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementsManagement>() {
    
    @Override
    public IRequirementsManagement create() {
      return new RequirementsManagement();
    }
    
    @Override
    public IRequirementsManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementsManagement(resourceRepository, resource);
    }
  
  };

  public RequirementsManagement() {
    super(IRequirementsManagement.TYPE_ID);
  }
  
  public RequirementsManagement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementsManagement.TYPE_ID);
  }

  // attributes
  
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

  public RequirementsManagement setChapters(java.util.List<? extends cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite> chapters) {
    _setList(cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> selectDocuments() {
    return _getList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents);
  }

  public RequirementsManagement setDocuments(java.util.List<? extends cleon.doc.spec.document.javamodel.ISubDocument> documents) {
    _setList(cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, documents);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation selectMotivation() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.RequirementsManagement_motivation);
  }

  public RequirementsManagement setMotivation(cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation motivation) {
    _setSingle(cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.RequirementsManagement_motivation, motivation);
    return this;
  }
    
  @Override
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters() {
    return _getSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public RequirementsManagement setNoChapters(cleon.doc.spec.chapter.javamodel.IChapter noChapters) {
    _setSingle(cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectOwnDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements);
  }

  public RequirementsManagement setOwnDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> ownDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, ownDocumentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> selectParagraphes() {
    return _getList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes);
  }

  public RequirementsManagement setParagraphes(java.util.List<? extends cleon.doc.spec.paragraph.javamodel.IParagraph> paragraphes) {
    _setList(cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, paragraphes);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.javamodel.IRequirements selectRequirements() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.javamodel.IRequirements.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.RequirementsManagement_requirements);
  }

  public RequirementsManagement setRequirements(cleon.sda.spec.requirementsmanagement.requirements.javamodel.IRequirements requirements) {
    _setSingle(cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.RequirementsManagement_requirements, requirements);
    return this;
  }
    
  @Override
  public cleon.doc.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style);
  }

  public RequirementsManagement setStyle(cleon.doc.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.doc.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementsManagement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> selectUseDocumentElements() {
    return _getList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements);
  }

  public RequirementsManagement setUseDocumentElements(java.util.List<? extends cleon.doc.spec.javamodel.IDocumentElement> useDocumentElements) {
    _setList(cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, useDocumentElements);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.doc.spec.chapter.javamodel.IChapterOwnDocumentElementComposite.class, cleon.doc.spec.chapter.ChapterPackage.ChapterOwnDocumentElementComposite_chapters, visitor);
    _acceptList(cleon.doc.spec.document.javamodel.ISubDocument.class, cleon.doc.spec.document.DocumentPackage.AbstractDocument_documents, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.RequirementsManagement_motivation, visitor);
    _acceptSingle(cleon.doc.spec.chapter.javamodel.IChapter.class, cleon.doc.spec.chapter.ChapterPackage.NoChapters_noChapters, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.OwnDocumentElementComposite_ownDocumentElements, visitor);
    _acceptList(cleon.doc.spec.paragraph.javamodel.IParagraph.class, cleon.doc.spec.paragraph.ParagraphPackage.ParagraphOwnDocumentElementComposite_paragraphes, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.javamodel.IRequirements.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.RequirementsManagement_requirements, visitor);
    _acceptSingle(cleon.doc.spec.document.style.javamodel.IStyle.class, cleon.doc.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.doc.spec.javamodel.IDocumentElement.class, cleon.doc.spec.SpecPackage.UseDocumentElementComposite_useDocumentElements, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.javamodel.IRequirementsManagement selectToMeMotivation(cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.javamodel.IRequirementsManagement.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.RequirementsManagement_motivation, object.getResource());
  }
  
  public static cleon.sda.spec.requirementsmanagement.javamodel.IRequirementsManagement selectToMeRequirements(cleon.sda.spec.requirementsmanagement.requirements.javamodel.IRequirements object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.javamodel.IRequirementsManagement.class, cleon.sda.spec.requirementsmanagement.RequirementsmanagementPackage.RequirementsManagement_requirements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4bcb71bd-a950-11e5-bda2-a7fc3bd7c783,2A4QO0MfqRE7FmdIuTnrBEWAFks=] */
