package cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.quality.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SecurityRequirement extends DynamicResource implements ISecurityRequirement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurityRequirement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISecurityRequirement>() {
    
    @Override
    public ISecurityRequirement create() {
      return new SecurityRequirement();
    }
    
    @Override
    public ISecurityRequirement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SecurityRequirement(resourceRepository, resource);
    }
  
  };

  public SecurityRequirement() {
    super(ISecurityRequirement.TYPE_ID);
  }
  
  public SecurityRequirement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISecurityRequirement.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.Notes_notes, notes);
  }

  @Override
  public java.lang.String selectReasonBenefitRationale() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_reasonBenefitRationale);
  }
    
  public void setReasonBenefitRationale(java.lang.String reasonBenefitRationale) {
     _setSingleAttribute(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_reasonBenefitRationale, reasonBenefitRationale);
  }

  @Override
  public java.lang.String selectRejectReason() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_rejectReason);
  }
    
  public void setRejectReason(java.lang.String rejectReason) {
     _setSingleAttribute(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_rejectReason, rejectReason);
  }

  @Override
  public java.lang.String selectRestrictionRisks() {
    return _getSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_restrictionRisks);
  }
    
  public void setRestrictionRisks(java.lang.String restrictionRisks) {
     _setSingleAttribute(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_restrictionRisks, restrictionRisks);
  }

  // relations
  
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel selectAbstractionLevel() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_abstractionLevel);
  }

  public SecurityRequirement setAbstractionLevel(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel abstractionLevel) {
    _setSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_abstractionLevel, abstractionLevel);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal> selectAchieves() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_achieves);
  }

  public SecurityRequirement setAchieves(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal> achieves) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_achieves, achieves);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectAggregates() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aggregates);
  }

  public SecurityRequirement setAggregates(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> aggregates) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aggregates, aggregates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> selectAuthors() {
    return _getList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors);
  }

  public SecurityRequirement setAuthors(java.util.List<? extends cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember> authors) {
    _setList(cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConcretizes() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_concretizes);
  }

  public SecurityRequirement setConcretizes(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> concretizes) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_concretizes, concretizes);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConflicts() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_conflicts);
  }

  public SecurityRequirement setConflicts(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> conflicts) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_conflicts, conflicts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality> selectCoverageQualities() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.quality.QualityPackage.QualityRequirement_coverageQualities);
  }

  public SecurityRequirement setCoverageQualities(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality> coverageQualities) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.quality.QualityPackage.QualityRequirement_coverageQualities, coverageQualities);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public SecurityRequirement setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort selectEstimate() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate);
  }

  public SecurityRequirement setEstimate(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort estimate) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, estimate);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssue> selectIssues() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssue.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.IssueAware_issues);
  }

  public SecurityRequirement setIssues(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssue> issues) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.IssueAware_issues, issues);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource> selectOriginatesFromSource() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.architecture.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource);
  }

  public SecurityRequirement setOriginatesFromSource(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource> originatesFromSource) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, originatesFromSource);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder> selectOwners() {
    return _getList(cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder.class, cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners);
  }

  public SecurityRequirement setOwners(java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder> owners) {
    _setList(cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners, owners);
    return this;
  }
    
  @Override
  public cleon.common.resources.spec.resources.priority.javamodel.IPriority selectPriority() {
    return _getSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority);
  }

  public SecurityRequirement setPriority(cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
    _setSingle(cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority, priority);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState selectState() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_state);
  }

  public SecurityRequirement setState(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState state) {
    _setSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_state, state);
    return this;
  }
    
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.javamodel.INonFunctionalTemplate selectTemplate() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.javamodel.INonFunctionalTemplate.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.NonFunctionalRequirement_template);
  }

  public SecurityRequirement setTemplate(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.javamodel.INonFunctionalTemplate template) {
    _setSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.NonFunctionalRequirement_template, template);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SecurityRequirement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptListAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.ChrvPackage.Notes_notes, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_reasonBenefitRationale, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_rejectReason, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_restrictionRisks, visitor);
    // relations
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_abstractionLevel, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.motivation.goals.javamodel.IGoal.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_achieves, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aggregates, visitor);
    _acceptList(cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember.class, cleon.common.doc.spec.doc.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_concretizes, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_conflicts, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.quality.QualityPackage.QualityRequirement_coverageQualities, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssue.class, cleon.conception.architecture.spec.eamod.chrv.issues.IssuesPackage.IssueAware_issues, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.motivation.sources.javamodel.ISource.class, cleon.conception.architecture.spec.eamod.chrv.motivation.sources.SourcesPackage.SourceAware_originatesFromSource, visitor);
    _acceptList(cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.javamodel.IStakeholder.class, cleon.conception.architecture.spec.eamod.chrv.motivation.stakeholder.StakeholderPackage.StakeholderAware_owners, visitor);
    _acceptSingle(cleon.common.resources.spec.resources.priority.javamodel.IPriority.class, cleon.common.resources.spec.resources.priority.PriorityPackage.PriorityAware_priority, visitor);
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_state, visitor);
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.template.javamodel.INonFunctionalTemplate.class, cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.RequirementPackage.NonFunctionalRequirement_template, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f44a06a-a95d-11e5-bda2-a7fc3bd7c783,G9fMQ8/uW06NUU19vNMuKd03Sqg=] */
