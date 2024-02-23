package cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SolutionsEvaluation extends DynamicResource implements ISolutionsEvaluation {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionsEvaluation> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionsEvaluation>() {
    
    @Override
    public ISolutionsEvaluation create() {
      return new SolutionsEvaluation();
    }
    
    @Override
    public ISolutionsEvaluation create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SolutionsEvaluation(resourceRepository, resource);
    }
  
  };

  public SolutionsEvaluation() {
    super(ISolutionsEvaluation.TYPE_ID);
  }
  
  public SolutionsEvaluation(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutionsEvaluation.TYPE_ID);
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
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public SolutionsEvaluation setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public SolutionsEvaluation setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IKnockoutEvaluation> selectKnockoutEvaluation() {
    return _getMap(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IKnockoutEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_knockoutEvaluation);
  }

  public SolutionsEvaluation setKnockoutEvaluation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IKnockoutEvaluation> knockoutEvaluation) {
    _setMap(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_knockoutEvaluation, knockoutEvaluation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public SolutionsEvaluation setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolution selectSolution() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolution.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_solution);
  }

  public SolutionsEvaluation setSolution(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolution solution) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_solution, solution);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SolutionsEvaluation setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SolutionsEvaluation setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IWeightingEvaluation> selectWeightingEvaluation() {
    return _getMap(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IWeightingEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_weightingEvaluation);
  }

  public SolutionsEvaluation setWeightingEvaluation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IWeightingEvaluation> weightingEvaluation) {
    _setMap(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_weightingEvaluation, weightingEvaluation);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.AbstractChapter_chapterPath, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    // relations
    _acceptList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, visitor);
    _acceptMap(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IKnockoutEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_knockoutEvaluation, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolution.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_solution, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IWeightingEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_weightingEvaluation, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation> selectToMeSolution(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.solutions.javamodel.ISolution object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_solution, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation selectToMeKnockoutEvaluation(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IKnockoutEvaluation object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_knockoutEvaluation, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation selectToMeWeightingEvaluation(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.IWeightingEvaluation object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.javamodel.ISolutionsEvaluation.class, cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.evaluation.EvaluationPackage.SolutionsEvaluation_weightingEvaluation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,38e891b4-3c1a-11e5-9962-cf3035adb922,J/VfEy9nzDH1OfFKFUBowEMaFqc=] */
