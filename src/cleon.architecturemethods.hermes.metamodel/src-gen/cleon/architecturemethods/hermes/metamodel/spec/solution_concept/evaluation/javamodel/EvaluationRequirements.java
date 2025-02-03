package cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EvaluationRequirements extends DynamicResource implements IEvaluationRequirements {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluationRequirements> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEvaluationRequirements>() {
    
    @Override
    public IEvaluationRequirements create() {
      return new EvaluationRequirements();
    }
    
    @Override
    public IEvaluationRequirements create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EvaluationRequirements(resourceRepository, resource);
    }
  
  };

  public EvaluationRequirements() {
    super(IEvaluationRequirements.TYPE_ID);
  }
  
  public EvaluationRequirements(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEvaluationRequirements.TYPE_ID);
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
  public java.lang.String selectNoChapterPath() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath);
  }
    
  public void setNoChapterPath(java.lang.String noChapterPath) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapterPath_noChapterPath, noChapterPath);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public EvaluationRequirements setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> selectDescriptionTranslation() {
    return _getMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation);
  }

  public EvaluationRequirements setDescriptionTranslation(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation> descriptionTranslation) {
    _setMap(cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, descriptionTranslation);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public EvaluationRequirements setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirement> selectEvaluationRequirement() {
    return _getMap(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirement.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirements_evaluationRequirement);
  }

  public EvaluationRequirements setEvaluationRequirement(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirement> evaluationRequirement) {
    _setMap(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirements_evaluationRequirement, evaluationRequirement);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public EvaluationRequirements setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public EvaluationRequirements setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirementList selectRequirementList() {
    return _getSingle(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirementList.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirements_requirementList);
  }

  public EvaluationRequirements setRequirementList(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirementList requirementList) {
    _setSingle(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirements_requirementList, requirementList);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public EvaluationRequirements setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EvaluationRequirements setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.common.language.metamodel.spec.translation.description.javamodel.ILanguageDescriptionTranslation.class, cleon.common.language.metamodel.spec.translation.description.DescriptionPackage.MultilingualDescription_descriptionTranslation, visitor);
    _acceptMap(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirement.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirements_evaluationRequirement, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirementList.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirements_requirementList, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirements> selectToMeRequirementList(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.requirements.javamodel.IRequirementList object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirements.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirements_requirementList, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirements selectToMeEvaluationRequirement(cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirement object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.javamodel.IEvaluationRequirements.class, cleon.architecturemethods.hermes.metamodel.spec.solution_concept.evaluation.EvaluationPackage.EvaluationRequirements_evaluationRequirement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0af35fc0-e244-11ef-a500-cb425fc4109d,Gx/TwnudIOq+hb8FqJ0haqmuMww=] */
