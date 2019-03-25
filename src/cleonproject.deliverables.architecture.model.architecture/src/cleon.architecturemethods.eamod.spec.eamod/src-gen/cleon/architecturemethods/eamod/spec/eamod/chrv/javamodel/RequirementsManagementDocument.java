package cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementsManagementDocument extends DynamicResource implements IRequirementsManagementDocument {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementsManagementDocument> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementsManagementDocument>() {
    
    @Override
    public IRequirementsManagementDocument create() {
      return new RequirementsManagementDocument();
    }
    
    @Override
    public IRequirementsManagementDocument create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementsManagementDocument(resourceRepository, resource);
    }
  
  };

  public RequirementsManagementDocument() {
    super(IRequirementsManagementDocument.TYPE_ID);
  }
  
  public RequirementsManagementDocument(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementsManagementDocument.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.about.javamodel.IEAMod_About selectAbout() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.about.javamodel.IEAMod_About.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_about);
  }

  public RequirementsManagementDocument setAbout(cleon.architecturemethods.eamod.spec.eamod.chrv.about.javamodel.IEAMod_About about) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_about, about);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectAlikeDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_alikeDeliverable);
  }

  public RequirementsManagementDocument setAlikeDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable alikeDeliverable) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_alikeDeliverable, alikeDeliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters);
  }

  public RequirementsManagementDocument setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel.IDistinctions selectDestinctions() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel.IDistinctions.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_destinctions);
  }

  public RequirementsManagementDocument setDestinctions(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel.IDistinctions destinctions) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_destinctions, destinctions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public RequirementsManagementDocument setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> selectDocumentLanguage() {
    return _getList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage);
  }

  public RequirementsManagementDocument setDocumentLanguage(java.util.List<? extends cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage> documentLanguage) {
    _setList(cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, documentLanguage);
    return this;
  }
    
  @Override
  public cleon.common.glossary.spec.glossary.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary);
  }

  public RequirementsManagementDocument setGlossary(cleon.common.glossary.spec.glossary.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.introduction.javamodel.IIntroduction selectIntroduction() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.introduction.javamodel.IIntroduction.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_introduction);
  }

  public RequirementsManagementDocument setIntroduction(cleon.architecturemethods.eamod.spec.eamod.chrv.introduction.javamodel.IIntroduction introduction) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_introduction, introduction);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssues selectIssues() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssues.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_issues);
  }

  public RequirementsManagementDocument setIssues(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssues issues) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_issues, issues);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation selectMotivation() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_motivation);
  }

  public RequirementsManagementDocument setMotivation(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation motivation) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_motivation, motivation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public RequirementsManagementDocument setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public RequirementsManagementDocument setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea selectRequirements() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_requirements);
  }

  public RequirementsManagementDocument setRequirements(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea requirements) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_requirements, requirements);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISources selectSources() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISources.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_sources);
  }

  public RequirementsManagementDocument setSources(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISources sources) {
    _setSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_sources, sources);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public RequirementsManagementDocument setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementsManagementDocument setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.about.javamodel.IEAMod_About.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_about, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_alikeDeliverable, visitor);
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.spec.doc.DocPackage.ChapterAware_chapters, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel.IDistinctions.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_destinctions, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.documentlanguage.javamodel.IDocumentLanguage.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_documentLanguage, visitor);
    _acceptSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.introduction.javamodel.IIntroduction.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_introduction, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssues.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_issues, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_motivation, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_requirements, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISources.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_sources, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument selectToMeAbout(cleon.architecturemethods.eamod.spec.eamod.chrv.about.javamodel.IEAMod_About object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_about, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument selectToMeIntroduction(cleon.architecturemethods.eamod.spec.eamod.chrv.introduction.javamodel.IIntroduction object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_introduction, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument selectToMeMotivation(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.javamodel.IMotivation object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_motivation, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument selectToMeRequirements(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.javamodel.IProjectSubjectArea object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_requirements, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument selectToMeDestinctions(cleon.architecturemethods.eamod.spec.eamod.chrv.distinction.javamodel.IDistinctions object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_destinctions, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument selectToMeSources(cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.sources.javamodel.ISources object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_sources, object.getResource());
  }
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument selectToMeIssues(cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssues object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagementDocument.class, cleon.architecturemethods.eamod.spec.eamod.chrv.ChrvPackage.RequirementsManagementDocument_issues, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4bcb71bd-a950-11e5-bda2-a7fc3bd7c783,9E6dDfDbmJb8JrZjY3sabuDWmy4=] */
