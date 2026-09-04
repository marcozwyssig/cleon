package cleon.architecturemethods.arc42.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISoftwareArc42Document extends cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e7b5b0b3-a28c-11ef-9aea-bfda14a4d373");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals select__V_1_aE_introduction_aE_and_aE_goals();
  
  public cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitectureConstraints select__V_2_aE_architecture_aE_constraints();
  
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystemScopeAndContext select__V_3_aE_system_aE_scope_aE_and_aE_context();
  
  public cleon.architecturemethods.arc42.metamodel.spec._04_solution_strategy.javamodel.ISolutionStrategy select__V_4_aE_solution_aE_strategy();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.javamodel.IBuildingBlockViewSoftware select__V_5_aE_buildingblockview();
  
  public cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.javamodel.IRuntimeView select__V_6_aE_runtimeview();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDataView select__V_7_aE_dataview();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IDeploymentView select__V_8_aE_deploymentview();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.software.javamodel.ISoftwareCrosscuttingConcepts select__V_9_aE_software_aE_concepts();
  
  public cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IArchitecturalDecisions select__W_0_aE_designdecision();
  
  public cleon.architecturemethods.arc42.metamodel.spec._11_quality_scenarios.javamodel.IQualityRequirements select__W_1_aE_quality_aE_scenarios();
  
  public cleon.architecturemethods.arc42.metamodel.spec._12_technical_risks.javamodel.ITechnicalRisks select__W_2_aE_technical_aE_risks();
  
  public cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductView select__W_3_aE_productview();
  
  public cleon.architecturemethods.arc42.metamodel.spec._14_requirements_coverage.javamodel.IArc42RequirementCoverages select__W_4_aE_requirements_aE_coverage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e7b5b0b3-a28c-11ef-9aea-bfda14a4d373,iA8kZjMBbbKia+o2ndcWMf6SbNw=] */
