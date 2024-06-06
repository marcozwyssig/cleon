package cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DecisionTopic extends DynamicResource implements IDecisionTopic {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDecisionTopic> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDecisionTopic>() {
    
    @Override
    public IDecisionTopic create() {
      return new DecisionTopic();
    }
    
    @Override
    public IDecisionTopic create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DecisionTopic(resourceRepository, resource);
    }
  
  };

  public DecisionTopic() {
    super(IDecisionTopic.TYPE_ID);
  }
  
  public DecisionTopic(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDecisionTopic.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath);
  }
    
  public void setChapterPath(java.lang.String chapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, chapterPath);
  }

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

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapterPath, noChapterPath);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IAssumptions selectAssumptions() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IAssumptions.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_assumptions);
  }

  public DecisionTopic setAssumptions(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IAssumptions assumptions) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_assumptions, assumptions);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public DecisionTopic setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConsideredAlternatives selectConsideredAlternatives() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConsideredAlternatives.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_consideredAlternatives);
  }

  public DecisionTopic setConsideredAlternatives(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConsideredAlternatives consideredAlternatives) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_consideredAlternatives, consideredAlternatives);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConstraints selectConstraints() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConstraints.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_constraints);
  }

  public DecisionTopic setConstraints(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConstraints constraints) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_constraints, constraints);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecision selectDecision() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecision.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_decision);
  }

  public DecisionTopic setDecision(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecision decision) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_decision, decision);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements);
  }

  public DecisionTopic setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.NoDocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public DecisionTopic setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public DecisionTopic setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IProblem selectProblem() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IProblem.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_problem);
  }

  public DecisionTopic setProblem(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IProblem problem) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_problem, problem);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DecisionTopic setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IAssumptions.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_assumptions, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConsideredAlternatives.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_consideredAlternatives, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConstraints.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_constraints, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecision.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_decision, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IProblem.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_problem, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecisionTopic selectToMeProblem(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IProblem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecisionTopic.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_problem, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecisionTopic selectToMeConstraints(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConstraints object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecisionTopic.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_constraints, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecisionTopic selectToMeAssumptions(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IAssumptions object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecisionTopic.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_assumptions, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecisionTopic selectToMeConsideredAlternatives(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IConsideredAlternatives object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecisionTopic.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_consideredAlternatives, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecisionTopic selectToMeDecision(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecision object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDecisionTopic.class, cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions._10_design_decisionsPackage.DecisionTopic_decision, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ab88bc9d-ecde-11e8-8149-8542373915bf,3IHAz3aIwaZytE47w/IrV1g22jw=] */
