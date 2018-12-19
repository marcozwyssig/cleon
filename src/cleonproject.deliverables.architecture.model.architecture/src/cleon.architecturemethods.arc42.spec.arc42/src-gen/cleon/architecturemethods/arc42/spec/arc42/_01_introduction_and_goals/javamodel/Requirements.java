package cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Requirements extends DynamicResource implements IRequirements {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirements> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirements>() {
    
    @Override
    public IRequirements create() {
      return new Requirements();
    }
    
    @Override
    public IRequirements create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Requirements(resourceRepository, resource);
    }
  
  };

  public Requirements() {
    super(IRequirements.TYPE_ID);
  }
  
  public Requirements(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirements.TYPE_ID);
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

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> selectChapters() {
    return _getList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters);
  }

  public Requirements setChapters(java.util.List<? extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter> chapters) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Requirements setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Requirements setParagraphs(java.util.List<? extends cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement selectRequirementsManagement() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.Requirements_requirementsManagement);
  }

  public Requirements setRequirementsManagement(cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement requirementsManagement) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.Requirements_requirementsManagement, requirementsManagement);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea> selectSubjectAreas() {
    return _getList(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.Requirements_subjectAreas);
  }

  public Requirements setSubjectAreas(java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea> subjectAreas) {
    _setList(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.Requirements_subjectAreas, subjectAreas);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Requirements setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.chapter.javamodel.IChapter.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.Chapter_chapters, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.common.doc.spec.doc.paragraph.javamodel.IParagraph.class, cleon.common.doc.spec.doc.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.Requirements_requirementsManagement, visitor);
    _acceptList(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.Requirements_subjectAreas, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IRequirements> selectToMeRequirementsManagement(cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IRequirements.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.Requirements_requirementsManagement, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IRequirements> selectToMeSubjectAreas(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IRequirements.class, cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals._01_introduction_and_goalsPackage.Requirements_subjectAreas, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d9906e1c-11fc-11e5-848b-017a3a98ae34,yspW6ZpX72F8liEy7aNVoACmdl4=] */
