package cleon.architecturemethods.togaf.metamodel.spec.reference.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ReferenceArc42 extends DynamicResource implements IReferenceArc42 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReferenceArc42> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IReferenceArc42>() {
    
    @Override
    public IReferenceArc42 create() {
      return new ReferenceArc42();
    }
    
    @Override
    public IReferenceArc42 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ReferenceArc42(resourceRepository, resource);
    }
  
  };

  public ReferenceArc42() {
    super(IReferenceArc42.TYPE_ID);
  }
  
  public ReferenceArc42(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IReferenceArc42.TYPE_ID);
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
  public java.lang.String selectCurrentLanguageCode() {
    return _getSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_currentLanguageCode);
  }
    
  public void setCurrentLanguageCode(java.lang.String currentLanguageCode) {
     _setSingleAttribute(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_currentLanguageCode, currentLanguageCode);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.Boolean selectIsEnabled() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled);
  }
    
  public void setIsEnabled(java.lang.Boolean isEnabled) {
     _setSingleAttribute(cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, isEnabled);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals select__V_1_aE_introduction_aE_and_aE_goals() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_1_aE_introduction_aE_and_aE_goals);
  }

  public ReferenceArc42 set__V_1_aE_introduction_aE_and_aE_goals(cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals __V_1_aE_introduction_aE_and_aE_goals) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_1_aE_introduction_aE_and_aE_goals, __V_1_aE_introduction_aE_and_aE_goals);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitecture_Constraints select__V_2_aE_architecture_aE_constraints() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitecture_Constraints.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_2_aE_architecture_aE_constraints);
  }

  public ReferenceArc42 set__V_2_aE_architecture_aE_constraints(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitecture_Constraints __V_2_aE_architecture_aE_constraints) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_2_aE_architecture_aE_constraints, __V_2_aE_architecture_aE_constraints);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context select__V_3_aE_system_aE_scope_aE_and_aE_context() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_3_aE_system_aE_scope_aE_and_aE_context);
  }

  public ReferenceArc42 set__V_3_aE_system_aE_scope_aE_and_aE_context(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context __V_3_aE_system_aE_scope_aE_and_aE_context) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_3_aE_system_aE_scope_aE_and_aE_context, __V_3_aE_system_aE_scope_aE_and_aE_context);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._04_solution_strategy.javamodel.ISolution_Strategy select__V_4_aE_solution_aE_strategy() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._04_solution_strategy.javamodel.ISolution_Strategy.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_4_aE_solution_aE_strategy);
  }

  public ReferenceArc42 set__V_4_aE_solution_aE_strategy(cleon.architecturemethods.arc42.metamodel.spec._04_solution_strategy.javamodel.ISolution_Strategy __V_4_aE_solution_aE_strategy) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_4_aE_solution_aE_strategy, __V_4_aE_solution_aE_strategy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel.I__V_5_aE_ArchitectureBuildingBlockView select__V_5_aE_architecturebuildingblockview() {
    return _getSingle(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel.I__V_5_aE_ArchitectureBuildingBlockView.class, cleon.architecturemethods.togaf.metamodel.spec.reference.ReferencePackage.ReferenceArc42___V_5_aE_architecturebuildingblockview);
  }

  public ReferenceArc42 set__V_5_aE_architecturebuildingblockview(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel.I__V_5_aE_ArchitectureBuildingBlockView __V_5_aE_architecturebuildingblockview) {
    _setSingle(cleon.architecturemethods.togaf.metamodel.spec.reference.ReferencePackage.ReferenceArc42___V_5_aE_architecturebuildingblockview, __V_5_aE_architecturebuildingblockview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView select__V_5_aE_buildingblockview() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_5_aE_buildingblockview);
  }

  public ReferenceArc42 set__V_5_aE_buildingblockview(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView __V_5_aE_buildingblockview) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_5_aE_buildingblockview, __V_5_aE_buildingblockview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.javamodel.IRuntimeView select__V_6_aE_runtimeview() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.javamodel.IRuntimeView.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_6_aE_runtimeview);
  }

  public ReferenceArc42 set__V_6_aE_runtimeview(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.javamodel.IRuntimeView __V_6_aE_runtimeview) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_6_aE_runtimeview, __V_6_aE_runtimeview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDataView select__V_7_aE_dataview() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDataView.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_7_aE_dataview);
  }

  public ReferenceArc42 set__V_7_aE_dataview(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDataView __V_7_aE_dataview) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_7_aE_dataview, __V_7_aE_dataview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IDeploymentView select__V_8_aE_deploymentview() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_8_aE_deploymentview);
  }

  public ReferenceArc42 set__V_8_aE_deploymentview(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IDeploymentView __V_8_aE_deploymentview) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_8_aE_deploymentview, __V_8_aE_deploymentview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IConcepts select__V_9_aE_concepts() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IConcepts.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_9_aE_concepts);
  }

  public ReferenceArc42 set__V_9_aE_concepts(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IConcepts __V_9_aE_concepts) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_9_aE_concepts, __V_9_aE_concepts);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDesignDecision select__W_0_aE_designdecision() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDesignDecision.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_0_aE_designdecision);
  }

  public ReferenceArc42 set__W_0_aE_designdecision(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDesignDecision __W_0_aE_designdecision) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_0_aE_designdecision, __W_0_aE_designdecision);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._11_quality_scenarios.javamodel.IQuality_Scenarios select__W_1_aE_quality_aE_scenarios() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._11_quality_scenarios.javamodel.IQuality_Scenarios.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_1_aE_quality_aE_scenarios);
  }

  public ReferenceArc42 set__W_1_aE_quality_aE_scenarios(cleon.architecturemethods.arc42.metamodel.spec._11_quality_scenarios.javamodel.IQuality_Scenarios __W_1_aE_quality_aE_scenarios) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_1_aE_quality_aE_scenarios, __W_1_aE_quality_aE_scenarios);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._12_technical_risks.javamodel.ITechnical_Risks select__W_2_aE_technical_aE_risks() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._12_technical_risks.javamodel.ITechnical_Risks.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_2_aE_technical_aE_risks);
  }

  public ReferenceArc42 set__W_2_aE_technical_aE_risks(cleon.architecturemethods.arc42.metamodel.spec._12_technical_risks.javamodel.ITechnical_Risks __W_2_aE_technical_aE_risks) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_2_aE_technical_aE_risks, __W_2_aE_technical_aE_risks);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductView select__W_3_aE_productview() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductView.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_3_aE_productview);
  }

  public ReferenceArc42 set__W_3_aE_productview(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductView __W_3_aE_productview) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_3_aE_productview, __W_3_aE_productview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._14_requirements_coverage.javamodel.IArc42RequirementCoverages select__W_4_aE_requirements_aE_coverage() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._14_requirements_coverage.javamodel.IArc42RequirementCoverages.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_4_aE_requirements_aE_coverage);
  }

  public ReferenceArc42 set__W_4_aE_requirements_aE_coverage(cleon.architecturemethods.arc42.metamodel.spec._14_requirements_coverage.javamodel.IArc42RequirementCoverages __W_4_aE_requirements_aE_coverage) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_4_aE_requirements_aE_coverage, __W_4_aE_requirements_aE_coverage);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout selectAbout() {
    return _getSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about);
  }

  public ReferenceArc42 setAbout(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout about) {
    _setSingle(cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, about);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectChapters() {
    return _getList(cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters);
  }

  public ReferenceArc42 setChapters(java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> chapters) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapters, chapters);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable);
  }

  public ReferenceArc42 setDeliverable(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, deliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.metamodel.spec.javamodel.IDocumentElement.class, cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements);
  }

  public ReferenceArc42 setDocumentElements(java.util.List<? extends cleon.common.doc.metamodel.spec.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.metamodel.spec.SpecPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.glossary.metamodel.spec.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary);
  }

  public ReferenceArc42 setGlossary(cleon.common.glossary.metamodel.spec.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings selectLanguageSettings() {
    return _getSingle(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings);
  }

  public ReferenceArc42 setLanguageSettings(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings languageSettings) {
    _setSingle(cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, languageSettings);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> selectParagraphs() {
    return _getList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs);
  }

  public ReferenceArc42 setParagraphs(java.util.List<? extends cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph> paragraphs) {
    _setList(cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, paragraphs);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning selectPlanning() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning);
  }

  public ReferenceArc42 setPlanning(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning planning) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, planning);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties);
  }

  public ReferenceArc42 setProperties(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style);
  }

  public ReferenceArc42 setStyle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ReferenceArc42 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.SpecPackage.ChapterAware_chapterPath, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_currentLanguageCode, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.resources.metamodel.spec.active.ActivePackage.EnabledWithDefaultTrueAware_isEnabled, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_1_aE_introduction_aE_and_aE_goals, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitecture_Constraints.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_2_aE_architecture_aE_constraints, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_3_aE_system_aE_scope_aE_and_aE_context, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._04_solution_strategy.javamodel.ISolution_Strategy.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_4_aE_solution_aE_strategy, visitor);
    _acceptSingle(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel.I__V_5_aE_ArchitectureBuildingBlockView.class, cleon.architecturemethods.togaf.metamodel.spec.reference.ReferencePackage.ReferenceArc42___V_5_aE_architecturebuildingblockview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.javamodel.IRuntimeView.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_6_aE_runtimeview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDataView.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_7_aE_dataview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_8_aE_deploymentview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IConcepts.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_9_aE_concepts, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IDesignDecision.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_0_aE_designdecision, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._11_quality_scenarios.javamodel.IQuality_Scenarios.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_1_aE_quality_aE_scenarios, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._12_technical_risks.javamodel.ITechnical_Risks.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_2_aE_technical_aE_risks, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductView.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_3_aE_productview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._14_requirements_coverage.javamodel.IArc42RequirementCoverages.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_4_aE_requirements_aE_coverage, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAbout.class, cleon.common.doc.metamodel.spec.chapter.about.AboutPackage.AboutAware_about, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, visitor);
    _acceptSingle(cleon.common.glossary.metamodel.spec.javamodel.IGlossary.class, cleon.common.glossary.metamodel.spec.SpecPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.common.language.metamodel.spec.languagesettings.javamodel.ILanguageSettings.class, cleon.common.language.metamodel.spec.SpecPackage.AbstractLanguageSettingsAware_languageSettings, visitor);
    _acceptList(cleon.common.doc.metamodel.spec.paragraph.javamodel.IParagraph.class, cleon.common.doc.metamodel.spec.chapter.ChapterPackage.ParagraphAware_paragraphs, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.properties.javamodel.IProperties.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.metamodel.spec.document.style.javamodel.IStyle.class, cleon.common.doc.metamodel.spec.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.togaf.metamodel.spec.reference.javamodel.IReferenceArc42 selectToMe__V_5_aE_architecturebuildingblockview(cleon.architecturemethods.togaf.metamodel.spec.reference._05_architecturebuildingblock_view.javamodel.I__V_5_aE_ArchitectureBuildingBlockView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.metamodel.spec.reference.javamodel.IReferenceArc42.class, cleon.architecturemethods.togaf.metamodel.spec.reference.ReferencePackage.ReferenceArc42___V_5_aE_architecturebuildingblockview, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0813a879-2d6d-11e6-959f-d1cef44ff5fd,v3rFMpsjG25jMB8Q7klMOn2OylI=] */
