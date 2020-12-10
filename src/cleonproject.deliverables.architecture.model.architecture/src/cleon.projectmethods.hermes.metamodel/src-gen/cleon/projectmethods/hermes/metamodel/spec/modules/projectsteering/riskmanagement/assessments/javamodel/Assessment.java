package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Assessment extends DynamicResource implements IAssessment {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAssessment> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IAssessment>() {
    
    @Override
    public IAssessment create() {
      return new Assessment();
    }
    
    @Override
    public IAssessment create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Assessment(resourceRepository, resource);
    }
  
  };

  public Assessment() {
    super(IAssessment.TYPE_ID);
  }
  
  public Assessment(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IAssessment.TYPE_ID);
  }

  // attributes
  
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
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.action.javamodel.IAction selectActions() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.action.javamodel.IAction.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_actions);
  }

  public Assessment setActions(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.action.javamodel.IAction actions) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_actions, actions);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis selectAnalysis() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_analysis);
  }

  public Assessment setAnalysis(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis analysis) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_analysis, analysis);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public Assessment setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public Assessment setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter selectNoChapters() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters);
  }

  public Assessment setNoChapters(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter noChapters) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoChapters_noChapters, noChapters);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph selectNoParagraphs() {
    return _getSingle(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs);
  }

  public Assessment setNoParagraphs(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph noParagraphs) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.NoParagraph_noParagraphs, noParagraphs);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public Assessment setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk selectRisk() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_risk);
  }

  public Assessment setRisk(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk risk) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_risk, risk);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Assessment setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Assessment setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.action.javamodel.IAction.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_actions, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_analysis, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_risk, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment> selectToMeRisk(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_risk, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment selectToMeAnalysis(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.analysis.javamodel.IRiskAnalysis object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_analysis, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment selectToMeActions(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.action.javamodel.IAction object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.javamodel.IAssessment.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.assessments.AssessmentsPackage.Assessment_actions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2b557b98-324a-11e6-ab4d-73a9260c8088,eepjTHu97a0lfP0vF9bx3oCrdqw=] */
