package cleon.architecturemethods.arc42.spec.arc42.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Arc42 extends DynamicResource implements IArc42 {

  // abstract implementation, only used for static method calls
  private Arc42() {
    super(IArc42.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_1_aE_introduction_aE_and_aE_goals(cleon.architecturemethods.arc42.spec.arc42._01_introduction_and_goals.javamodel.I__V_1_aE_IntroductionAndGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_1_aE_introduction_aE_and_aE_goals, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_2_aE_architecture_aE_constraints(cleon.architecturemethods.arc42.spec.arc42._02_architecture_constraints.javamodel.I__V_2_aE_Architecture_aE_Constraints object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_2_aE_architecture_aE_constraints, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_3_aE_system_aE_scope_aE_and_aE_context(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_3_aE_system_aE_scope_aE_and_aE_context, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_5_aE_buildingblockview(cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.I__V_5_aE_BuildingBlockView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_5_aE_buildingblockview, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42 selectToMe__V_7_aE_deploymentview(cleon.architecturemethods.arc42.spec.arc42._07_deployment_view.javamodel.I__V_7_aE_DeploymentView object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42.javamodel.IArc42.class, cleon.architecturemethods.arc42.spec.arc42.Arc42Package.arc42___V_7_aE_deploymentview, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2cbcf671-ffcc-11e4-ac0a-959b440f987f,B2O/Qffl9mwd287m2VCHfaBUrUg=] */
