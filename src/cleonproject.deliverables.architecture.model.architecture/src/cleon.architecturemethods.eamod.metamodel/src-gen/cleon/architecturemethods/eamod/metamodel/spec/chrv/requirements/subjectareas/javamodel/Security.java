package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Security extends DynamicResource implements ISecurity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurity>() {
    
    @Override
    public ISecurity create() {
      return new Security();
    }
    
    @Override
    public ISecurity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Security(resourceRepository, resource);
    }
  
  };

  public Security() {
    super(ISecurity.TYPE_ID);
  }
  
  public Security(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISecurity.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, identifier);
  }

  @Override
  public java.util.List<java.lang.String> selectNotes() {
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.Notes_notes, notes);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal> selectAchieves() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.GoalsPackage.GoalAware_achieves);
  }

  public Security setAchieves(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal> achieves) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.GoalsPackage.GoalAware_achieves, achieves);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors);
  }

  public Security setAuthors(java.util.List<? extends cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Security setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Security setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.javamodel.IStakeholder> selectOwners() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.javamodel.IStakeholder.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners);
  }

  public Security setOwners(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.javamodel.IStakeholder> owners) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners, owners);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Security setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectRequirements() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.SubjectareasPackage.SubSubjectArea_requirements);
  }

  public Security setRequirements(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> requirements) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.SubjectareasPackage.SubSubjectArea_requirements, requirements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Security setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.Notes_notes, visitor);
    // relations
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.javamodel.IGoal.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.goals.GoalsPackage.GoalAware_achieves, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.javamodel.IStakeholder.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.SubjectareasPackage.SubSubjectArea_requirements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a2b8737c-0c76-11e6-86c5-87a8b520dd59,zytN0asJJ6b2stXSqKN2Ukwisss=] */
