package cleon.architecturemethods.arc42.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IArc42Document extends cleon.common.doc.metamodel.spec.document.javamodel.IDocument, cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAboutAware, cleon.common.glossary.metamodel.spec.javamodel.IGlossaryAware, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2cbcf671-ffcc-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals select__V_1_aE_introduction_aE_and_aE_goals();
  
  public cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitecture_Constraints select__V_2_aE_architecture_aE_constraints();
  
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context select__V_3_aE_system_aE_scope_aE_and_aE_context();
  
  public cleon.architecturemethods.arc42.metamodel.spec._04_solution_strategy.javamodel.ISolution_Strategy select__V_4_aE_solution_aE_strategy();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView select__V_5_aE_buildingblockview();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IDeploymentView select__V_7_aE_deploymentview();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.javamodel.IConcepts select__V_8_aE_concepts();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_design_decisions.javamodel.IDesignDecision select__V_9_aE_designdecision();
  
  public cleon.architecturemethods.arc42.metamodel.spec._10_quality_scenarios.javamodel.IQuality_Scenarios select__W_0_aE_quality_aE_scenarios();
  
  public cleon.architecturemethods.arc42.metamodel.spec._11_technical_risks.javamodel.ITechnical_Risks select__W_1_aE_technical_aE_risks();
  
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductView select__W_2_aE_productview();
  
  public cleon.architecturemethods.arc42.metamodel.spec._12_requirements_coverage.javamodel.IArc42RequirementCoverages select__W_3_aE_requirements_aE_coverage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2cbcf671-ffcc-11e4-ac0a-959b440f987f,u6bnsuB9VCdCiVEHE0yRCPnZy0w=] */
