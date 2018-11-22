package cleon.architecturemethods.togaf.spec.togaf.solution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SolutionArc42 extends DynamicResource implements ISolutionArc42 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionArc42> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISolutionArc42>() {
    
    @Override
    public ISolutionArc42 create() {
      return new SolutionArc42();
    }
    
    @Override
    public ISolutionArc42 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SolutionArc42(resourceRepository, resource);
    }
  
  };

  public SolutionArc42() {
    super(ISolutionArc42.TYPE_ID);
  }
  
  public SolutionArc42(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISolutionArc42.TYPE_ID);
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
  public java.util.List<java.lang.String> selectImgDir() {
    return _getListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir);
  }
    
  public void setImgDir(java.util.List<java.lang.String> imgDir) {
     _setListAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, imgDir);
  }

  @Override
  public java.lang.Boolean selectWithToC() {
    return _getSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC);
  }
    
  public void setWithToC(java.lang.Boolean withToC) {
     _setSingleAttribute(cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, withToC);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._00_about.javamodel.IAbout select__V_0_aE_about() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._00_about.javamodel.IAbout.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_0_aE_about);
  }

  public SolutionArc42 set__V_0_aE_about(cleon.architecturemethods.arc42.spec.arc42._00_about.javamodel.IAbout __V_0_aE_about) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_0_aE_about, __V_0_aE_about);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals select__V_1_aE_introduction_aE_and_aE_goals() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals);
  }

  public SolutionArc42 set__V_1_aE_introduction_aE_and_aE_goals(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals __V_1_aE_introduction_aE_and_aE_goals) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals, __V_1_aE_introduction_aE_and_aE_goals);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IArchitecture_Constraints select__V_2_aE_architecture_aE_constraints() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IArchitecture_Constraints.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints);
  }

  public SolutionArc42 set__V_2_aE_architecture_aE_constraints(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IArchitecture_Constraints __V_2_aE_architecture_aE_constraints) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints, __V_2_aE_architecture_aE_constraints);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.togaf.spec.togaf.solution._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context select__V_3_aE_system_aE_scope_aE_and_aE_context() {
    return _getSingle(cleon.architecturemethods.togaf.spec.togaf.solution._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.architecturemethods.togaf.spec.togaf.solution.SolutionPackage.SolutionArc42___V_3_aE_system_aE_scope_aE_and_aE_context);
  }

  public SolutionArc42 set__V_3_aE_system_aE_scope_aE_and_aE_context(cleon.architecturemethods.togaf.spec.togaf.solution._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context __V_3_aE_system_aE_scope_aE_and_aE_context) {
    _setSingle(cleon.architecturemethods.togaf.spec.togaf.solution.SolutionPackage.SolutionArc42___V_3_aE_system_aE_scope_aE_and_aE_context, __V_3_aE_system_aE_scope_aE_and_aE_context);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.ISolution_Strategy select__V_4_aE_solution_aE_strategy() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.ISolution_Strategy.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_4_aE_solution_aE_strategy);
  }

  public SolutionArc42 set__V_4_aE_solution_aE_strategy(cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.ISolution_Strategy __V_4_aE_solution_aE_strategy) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_4_aE_solution_aE_strategy, __V_4_aE_solution_aE_strategy);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView select__V_5_aE_buildingblockview() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview);
  }

  public SolutionArc42 set__V_5_aE_buildingblockview(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView __V_5_aE_buildingblockview) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview, __V_5_aE_buildingblockview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.javamodel.I__V_5_aE_SolutionBuildingBlockView select__V_5_aE_solutionbuildingblockview() {
    return _getSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.javamodel.I__V_5_aE_SolutionBuildingBlockView.class, cleon.architecturemethods.togaf.spec.togaf.solution.SolutionPackage.SolutionArc42___V_5_aE_solutionbuildingblockview);
  }

  public SolutionArc42 set__V_5_aE_solutionbuildingblockview(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.javamodel.I__V_5_aE_SolutionBuildingBlockView __V_5_aE_solutionbuildingblockview) {
    _setSingle(cleon.architecturemethods.togaf.spec.togaf.solution.SolutionPackage.SolutionArc42___V_5_aE_solutionbuildingblockview, __V_5_aE_solutionbuildingblockview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView select__V_7_aE_deploymentview() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview);
  }

  public SolutionArc42 set__V_7_aE_deploymentview(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView __V_7_aE_deploymentview) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview, __V_7_aE_deploymentview);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.IConcepts select__V_8_aE_concepts() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.IConcepts.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_8_aE_concepts);
  }

  public SolutionArc42 set__V_8_aE_concepts(cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.IConcepts __V_8_aE_concepts) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_8_aE_concepts, __V_8_aE_concepts);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDesignDecision select__V_9_aE_designdecision() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDesignDecision.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_9_aE_designdecision);
  }

  public SolutionArc42 set__V_9_aE_designdecision(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDesignDecision __V_9_aE_designdecision) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_9_aE_designdecision, __V_9_aE_designdecision);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.IQuality_Scenarios select__W_0_aE_quality_aE_scenarios() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.IQuality_Scenarios.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_0_aE_quality_aE_scenarios);
  }

  public SolutionArc42 set__W_0_aE_quality_aE_scenarios(cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.IQuality_Scenarios __W_0_aE_quality_aE_scenarios) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_0_aE_quality_aE_scenarios, __W_0_aE_quality_aE_scenarios);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.ITechnical_Risks select__W_1_aE_technical_aE_risks() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.ITechnical_Risks.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_1_aE_technical_aE_risks);
  }

  public SolutionArc42 set__W_1_aE_technical_aE_risks(cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.ITechnical_Risks __W_1_aE_technical_aE_risks) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_1_aE_technical_aE_risks, __W_1_aE_technical_aE_risks);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirements_Coverage select__W_2_aE_requirements_aE_coverage() {
    return _getSingle(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirements_Coverage.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_2_aE_requirements_aE_coverage);
  }

  public SolutionArc42 set__W_2_aE_requirements_aE_coverage(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirements_Coverage __W_2_aE_requirements_aE_coverage) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_2_aE_requirements_aE_coverage, __W_2_aE_requirements_aE_coverage);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public SolutionArc42 setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.common.glossary.spec.glossary.javamodel.IGlossary selectGlossary() {
    return _getSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary);
  }

  public SolutionArc42 setGlossary(cleon.common.glossary.spec.glossary.javamodel.IGlossary glossary) {
    _setSingle(cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, glossary);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.properties.javamodel.IProperties selectProperties() {
    return _getSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties);
  }

  public SolutionArc42 setProperties(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties properties) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, properties);
    return this;
  }
    
  @Override
  public cleon.common.doc.spec.doc.document.style.javamodel.IStyle selectStyle() {
    return _getSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style);
  }

  public SolutionArc42 setStyle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle style) {
    _setSingle(cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, style);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SolutionArc42 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_imgDir, visitor);
    _acceptSingleAttribute(java.lang.Boolean.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_withToC, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._00_about.javamodel.IAbout.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_0_aE_about, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.IIntroductionAndGoals.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.IArchitecture_Constraints.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints, visitor);
    _acceptSingle(cleon.architecturemethods.togaf.spec.togaf.solution._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.architecturemethods.togaf.spec.togaf.solution.SolutionPackage.SolutionArc42___V_3_aE_system_aE_scope_aE_and_aE_context, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._04_solution_strategy.javamodel.ISolution_Strategy.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_4_aE_solution_aE_strategy, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.IBuildingBlockView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview, visitor);
    _acceptSingle(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.javamodel.I__V_5_aE_SolutionBuildingBlockView.class, cleon.architecturemethods.togaf.spec.togaf.solution.SolutionPackage.SolutionArc42___V_5_aE_solutionbuildingblockview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.IDeploymentView.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._08_concepts.javamodel.IConcepts.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_8_aE_concepts, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._09_design_decisions.javamodel.IDesignDecision.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_9_aE_designdecision, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._10_quality_scenarios.javamodel.IQuality_Scenarios.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_0_aE_quality_aE_scenarios, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._11_technical_risks.javamodel.ITechnical_Risks.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_1_aE_technical_aE_risks, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirements_Coverage.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___W_2_aE_requirements_aE_coverage, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.common.glossary.spec.glossary.javamodel.IGlossary.class, cleon.common.glossary.spec.glossary.GlossaryPackage.GlossaryAware_glossary, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.properties.javamodel.IProperties.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_properties, visitor);
    _acceptSingle(cleon.common.doc.spec.doc.document.style.javamodel.IStyle.class, cleon.common.doc.spec.doc.document.DocumentPackage.Document_style, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.togaf.spec.togaf.solution.javamodel.ISolutionArc42 selectToMe__V_3_aE_system_aE_scope_aE_and_aE_context(cleon.architecturemethods.togaf.spec.togaf.solution._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.spec.togaf.solution.javamodel.ISolutionArc42.class, cleon.architecturemethods.togaf.spec.togaf.solution.SolutionPackage.SolutionArc42___V_3_aE_system_aE_scope_aE_and_aE_context, object.getResource());
  }
  
  public static cleon.architecturemethods.togaf.spec.togaf.solution.javamodel.ISolutionArc42 selectToMe__V_5_aE_solutionbuildingblockview(cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.javamodel.I__V_5_aE_SolutionBuildingBlockView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.togaf.spec.togaf.solution.javamodel.ISolutionArc42.class, cleon.architecturemethods.togaf.spec.togaf.solution.SolutionPackage.SolutionArc42___V_5_aE_solutionbuildingblockview, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c90cdcfd-28f2-11e8-a684-8332c21c2f91,MoAQKJX9j41sb5vsFAw5lWqSeTc=] */
