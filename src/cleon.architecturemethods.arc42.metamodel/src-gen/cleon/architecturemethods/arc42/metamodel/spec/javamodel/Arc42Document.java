package cleon.architecturemethods.arc42.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Arc42Document extends DynamicResource implements IArc42Document {

  // abstract implementation, only used for static method calls
  private Arc42Document() {
    super(IArc42Document.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__V_1_aE_introduction_aE_and_aE_goals(cleon.architecturemethods.arc42.metamodel.spec._01_introduction_and_goals.javamodel.IIntroductionAndGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_1_aE_introduction_aE_and_aE_goals, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__V_2_aE_architecture_aE_constraints(cleon.architecturemethods.arc42.metamodel.spec._02_architecture_constraints.javamodel.IArchitectureConstraints object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_2_aE_architecture_aE_constraints, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__V_3_aE_system_aE_scope_aE_and_aE_context(cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.javamodel.ISystemScopeAndContext object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_3_aE_system_aE_scope_aE_and_aE_context, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__V_4_aE_solution_aE_strategy(cleon.architecturemethods.arc42.metamodel.spec._04_solution_strategy.javamodel.ISolutionStrategy object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_4_aE_solution_aE_strategy, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__V_5_aE_buildingblockview(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_5_aE_buildingblockview, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__V_6_aE_runtimeview(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.javamodel.IRuntimeView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_6_aE_runtimeview, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__V_7_aE_dataview(cleon.architecturemethods.arc42.metamodel.spec._08_data_view.javamodel.IDataView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_7_aE_dataview, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__V_8_aE_deploymentview(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.javamodel.IDeploymentView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_8_aE_deploymentview, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__V_9_aE_concepts(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.ICrosscuttingConcepts object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___V_9_aE_concepts, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__W_0_aE_designdecision(cleon.architecturemethods.arc42.metamodel.spec._10_design_decisions.javamodel.IArchitecturalDecisions object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_0_aE_designdecision, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__W_1_aE_quality_aE_scenarios(cleon.architecturemethods.arc42.metamodel.spec._11_quality_scenarios.javamodel.IQualityRequirements object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_1_aE_quality_aE_scenarios, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__W_2_aE_technical_aE_risks(cleon.architecturemethods.arc42.metamodel.spec._12_technical_risks.javamodel.ITechnicalRisks object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_2_aE_technical_aE_risks, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__W_3_aE_productview(cleon.architecturemethods.arc42.metamodel.spec._13_product_view.javamodel.IProductView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_3_aE_productview, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document selectToMe__W_4_aE_requirements_aE_coverage(cleon.architecturemethods.arc42.metamodel.spec._14_requirements_coverage.javamodel.IArc42RequirementCoverages object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec.javamodel.IArc42Document.class, cleon.architecturemethods.arc42.metamodel.spec.SpecPackage.arc42Document___W_4_aE_requirements_aE_coverage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2cbcf671-ffcc-11e4-ac0a-959b440f987f,HMrXs1Zlk30T/Gndkrms+EDXoHU=] */
