package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FormalFunctionalRequirement extends DynamicResource implements IFormalFunctionalRequirement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFormalFunctionalRequirement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFormalFunctionalRequirement>() {
    
    @Override
    public IFormalFunctionalRequirement create() {
      return new FormalFunctionalRequirement();
    }
    
    @Override
    public IFormalFunctionalRequirement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FormalFunctionalRequirement(resourceRepository, resource);
    }
  
  };

  public FormalFunctionalRequirement() {
    super(IFormalFunctionalRequirement.TYPE_ID);
  }
  
  public FormalFunctionalRequirement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFormalFunctionalRequirement.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, chapterPath);
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
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
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
    return _getListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.Notes_notes);
  }
    
  public void setNotes(java.util.List<java.lang.String> notes) {
     _setListAttribute(cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.Notes_notes, notes);
  }

  @Override
  public java.lang.String selectReasonBenefitRationale() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_reasonBenefitRationale);
  }
    
  public void setReasonBenefitRationale(java.lang.String reasonBenefitRationale) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_reasonBenefitRationale, reasonBenefitRationale);
  }

  @Override
  public java.lang.String selectRejectReason() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_rejectReason);
  }
    
  public void setRejectReason(java.lang.String rejectReason) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_rejectReason, rejectReason);
  }

  @Override
  public java.lang.String selectRestrictionRisks() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_restrictionRisks);
  }
    
  public void setRestrictionRisks(java.lang.String restrictionRisks) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_restrictionRisks, restrictionRisks);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel selectAbstractionLevel() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_abstractionLevel);
  }

  public FormalFunctionalRequirement setAbstractionLevel(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel abstractionLevel) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_abstractionLevel, abstractionLevel);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoal> selectAchieves() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoal.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_achieves);
  }

  public FormalFunctionalRequirement setAchieves(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoal> achieves) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_achieves, achieves);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectAggregates() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aggregates);
  }

  public FormalFunctionalRequirement setAggregates(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> aggregates) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aggregates, aggregates);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectAspectAffectedRequirements() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aspectAffectedRequirements);
  }

  public FormalFunctionalRequirement setAspectAffectedRequirements(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> aspectAffectedRequirements) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aspectAffectedRequirements, aspectAffectedRequirements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementAspect> selectAspects() {
    return _getMap(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementAspect.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aspects);
  }

  public FormalFunctionalRequirement setAspects(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementAspect> aspects) {
    _setMap(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aspects, aspects);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember selectAuthors() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors);
  }

  public FormalFunctionalRequirement setAuthors(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember authors) {
    _setSingle(cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, authors);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public FormalFunctionalRequirement setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.common.resources.metamodel.spec.complexity.javamodel.IComplexity selectComplexity() {
    return _getSingle(cleon.common.resources.metamodel.spec.complexity.javamodel.IComplexity.class, cleon.common.resources.metamodel.spec.complexity.ComplexityPackage.ComplexityAware_complexity);
  }

  public FormalFunctionalRequirement setComplexity(cleon.common.resources.metamodel.spec.complexity.javamodel.IComplexity complexity) {
    _setSingle(cleon.common.resources.metamodel.spec.complexity.ComplexityPackage.ComplexityAware_complexity, complexity);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectConflicts() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_conflicts);
  }

  public FormalFunctionalRequirement setConflicts(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> conflicts) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_conflicts, conflicts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public FormalFunctionalRequirement setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IEffort selectEstimate() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate);
  }

  public FormalFunctionalRequirement setEstimate(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IEffort estimate) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, estimate);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssue> selectIssues() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssue.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.IssueAware_issues);
  }

  public FormalFunctionalRequirement setIssues(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssue> issues) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.IssueAware_issues, issues);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource> selectOriginatesFromSource() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceAware_originatesFromSource);
  }

  public FormalFunctionalRequirement setOriginatesFromSource(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource> originatesFromSource) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceAware_originatesFromSource, originatesFromSource);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholder> selectOwners() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholder.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_owners);
  }

  public FormalFunctionalRequirement setOwners(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholder> owners) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_owners, owners);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public FormalFunctionalRequirement setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.common.resources.metamodel.spec.priority.javamodel.IPriority selectPriority() {
    return _getSingle(cleon.common.resources.metamodel.spec.priority.javamodel.IPriority.class, cleon.common.resources.metamodel.spec.priority.PriorityPackage.PriorityAware_priority);
  }

  public FormalFunctionalRequirement setPriority(cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
    _setSingle(cleon.common.resources.metamodel.spec.priority.PriorityPackage.PriorityAware_priority, priority);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState selectState() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_state);
  }

  public FormalFunctionalRequirement setState(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState state) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_state, state);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectSupplement() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_supplement);
  }

  public FormalFunctionalRequirement setSupplement(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> supplement) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_supplement, supplement);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.function.javamodel.IFunctionTemplate selectTemplate() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.function.javamodel.IFunctionTemplate.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.FormalFunctionalRequirement_template);
  }

  public FormalFunctionalRequirement setTemplate(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.function.javamodel.IFunctionTemplate template) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.FormalFunctionalRequirement_template, template);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FormalFunctionalRequirement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.metamodel.spec.id.IdPackage.IntegerBusinessObjectId_identifier, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.ChrvPackage.Notes_notes, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_reasonBenefitRationale, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_rejectReason, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_restrictionRisks, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.abstraction_level.javamodel.IAbstractionLevel.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_abstractionLevel, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoal.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_achieves, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aggregates, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aspectAffectedRequirements, visitor);
    _acceptMap(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementAspect.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_aspects, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.member.javamodel.IMember.class, cleon.common.doc.metamodel.spec.document.properties.member.MemberPackage.Authors_authors, visitor);
    _acceptSingle(cleon.common.resources.metamodel.spec.complexity.javamodel.IComplexity.class, cleon.common.resources.metamodel.spec.complexity.ComplexityPackage.ComplexityAware_complexity, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_conflicts, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.javamodel.IEffort.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.workpackage.backlog.BacklogPackage.EffortAware_estimate, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssue.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.IssuesPackage.IssueAware_issues, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.javamodel.ISource.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.sources.SourcesPackage.SourceAware_originatesFromSource, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholder.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_owners, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.common.resources.metamodel.spec.priority.javamodel.IPriority.class, cleon.common.resources.metamodel.spec.priority.PriorityPackage.PriorityAware_priority, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirementState.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_state, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.Requirement_supplement, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.function.javamodel.IFunctionTemplate.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.FormalFunctionalRequirement_template, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IFormalFunctionalRequirement selectToMeTemplate(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.function.javamodel.IFunctionTemplate object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IFormalFunctionalRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.RequirementPackage.FormalFunctionalRequirement_template, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7244f943-a962-11e5-bda2-a7fc3bd7c783,i2jTqVlRyt4fs4mykWLFHkZFby4=] */
