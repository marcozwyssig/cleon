package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class QualityRequirement extends DynamicResource implements IQualityRequirement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityRequirement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IQualityRequirement>() {
    
    @Override
    public IQualityRequirement create() {
      return new QualityRequirement();
    }
    
    @Override
    public IQualityRequirement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new QualityRequirement(resourceRepository, resource);
    }
  
  };

  public QualityRequirement() {
    super(IQualityRequirement.TYPE_ID);
  }
  
  public QualityRequirement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IQualityRequirement.TYPE_ID);
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
  public java.lang.Integer selectIdentifier() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier);
  }
    
  public void setIdentifier(java.lang.Integer identifier) {
     _setSingleAttribute(cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, identifier);
  }

  @Override
  public java.util.List<java.lang.String> selectMandatoryDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions);
  }
    
  public void setMandatoryDescriptions(java.util.List<java.lang.String> mandatoryDescriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, mandatoryDescriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.util.List<java.lang.String> selectNotes() {
    return _getListAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.ChrvPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.conception.eamod.spec.chrv.ChrvPackage.Notes_notes, notes);
  }

  @Override
  public java.lang.String selectReasonBenefitRationale() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_reasonBenefitRationale);
  }
    
  public void setReasonBenefitRationale(java.lang.String reasonBenefitRationale) {
     _setSingleAttribute(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_reasonBenefitRationale, reasonBenefitRationale);
  }

  @Override
  public java.lang.String selectRejectReason() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_rejectReason);
  }
    
  public void setRejectReason(java.lang.String rejectReason) {
     _setSingleAttribute(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_rejectReason, rejectReason);
  }

  @Override
  public java.lang.String selectRestrictionRisks() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_restrictionRisks);
  }
    
  public void setRestrictionRisks(java.lang.String restrictionRisks) {
     _setSingleAttribute(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_restrictionRisks, restrictionRisks);
  }

  // relations
  
  @Override
  public cleon.conception.eamod.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel selectAbstractionLevel() {
    return _getSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_abstractionLevel);
  }

  public QualityRequirement setAbstractionLevel(cleon.conception.eamod.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel abstractionLevel) {
    _setSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_abstractionLevel, abstractionLevel);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal> selectAchieves() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_achieves);
  }

  public QualityRequirement setAchieves(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal> achieves) {
    _setList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_achieves, achieves);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectAggregates() {
    return _getList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aggregates);
  }

  public QualityRequirement setAggregates(java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> aggregates) {
    _setList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aggregates, aggregates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors);
  }

  public QualityRequirement setAuthors(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConcretizes() {
    return _getList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_concretizes);
  }

  public QualityRequirement setConcretizes(java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> concretizes) {
    _setList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_concretizes, concretizes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConflicts() {
    return _getList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_conflicts);
  }

  public QualityRequirement setConflicts(java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> conflicts) {
    _setList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_conflicts, conflicts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality> selectCoverageQualities() {
    return _getList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.QualityPackage.QualityRequirement_coverageQualities);
  }

  public QualityRequirement setCoverageQualities(java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality> coverageQualities) {
    _setList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.QualityPackage.QualityRequirement_coverageQualities, coverageQualities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public QualityRequirement setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort selectEstimate() {
    return _getSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate);
  }

  public QualityRequirement setEstimate(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort estimate) {
    _setSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, estimate);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.issues.javamodel.IIssue> selectIssues() {
    return _getList(cleon.conception.eamod.spec.chrv.issues.javamodel.IIssue.class, cleon.conception.eamod.spec.chrv.issues.IssuesPackage.IssueAware_issues);
  }

  public QualityRequirement setIssues(java.util.List<? extends cleon.conception.eamod.spec.chrv.issues.javamodel.IIssue> issues) {
    _setList(cleon.conception.eamod.spec.chrv.issues.IssuesPackage.IssueAware_issues, issues);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> selectOriginatesFromSource() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource);
  }

  public QualityRequirement setOriginatesFromSource(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource> originatesFromSource) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, originatesFromSource);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.stakeholder.javamodel.IStakeholder> selectOwners() {
    return _getList(cleon.conception.eamod.spec.chrv.motivation.stakeholder.javamodel.IStakeholder.class, cleon.conception.eamod.spec.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners);
  }

  public QualityRequirement setOwners(java.util.List<? extends cleon.conception.eamod.spec.chrv.motivation.stakeholder.javamodel.IStakeholder> owners) {
    _setList(cleon.conception.eamod.spec.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners, owners);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.priority.javamodel.IPriority selectPriority() {
    return _getSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority);
  }

  public QualityRequirement setPriority(cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
    _setSingle(cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority, priority);
    return this;
  }
    
  @Override
  public cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState selectState() {
    return _getSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_state);
  }

  public QualityRequirement setState(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState state) {
    _setSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_state, state);
    return this;
  }
    
  @Override
  public cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.javamodel.INonFunctionalTemplate selectTemplate() {
    return _getSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.javamodel.INonFunctionalTemplate.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.NonFunctionalRequirement_template);
  }

  public QualityRequirement setTemplate(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.javamodel.INonFunctionalTemplate template) {
    _setSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.NonFunctionalRequirement_template, template);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public QualityRequirement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.id.IdPackage.BusinessObjectId_identifier, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.MandatoryDescription_mandatoryDescriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.ChrvPackage.Notes_notes, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_reasonBenefitRationale, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_rejectReason, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_restrictionRisks, visitor);
    // relations
    _acceptSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_abstractionLevel, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.goals.javamodel.IGoal.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_achieves, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aggregates, visitor);
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_concretizes, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_conflicts, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.QualityPackage.QualityRequirement_coverageQualities, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.issues.javamodel.IIssue.class, cleon.conception.eamod.spec.chrv.issues.IssuesPackage.IssueAware_issues, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.eamod.spec.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, visitor);
    _acceptList(cleon.conception.eamod.spec.chrv.motivation.stakeholder.javamodel.IStakeholder.class, cleon.conception.eamod.spec.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority, visitor);
    _acceptSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_state, visitor);
    _acceptSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.javamodel.INonFunctionalTemplate.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.NonFunctionalRequirement_template, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.javamodel.IQualityRequirement> selectToMeCoverageQualities(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality object) {
    return _getToMeList(object.getRepository(), cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.javamodel.IQualityRequirement.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.QualityPackage.QualityRequirement_coverageQualities, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,66cfdfc4-a95d-11e5-bda2-a7fc3bd7c783,rp0Me06nSBvaWr9YA+R+gPstEb0=] */