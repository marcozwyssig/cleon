package cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class __V_3_aE_System_aE_Scope_aE_and_aE_Context extends DynamicResource implements I__V_3_aE_System_aE_Scope_aE_and_aE_Context {

  // abstract implementation, only used for static method calls
  private __V_3_aE_System_aE_Scope_aE_and_aE_Context() {
    super(I__V_3_aE_System_aE_Scope_aE_and_aE_Context.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context selectToMeSystem(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_system, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context selectToMeNeighboringSystems(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_neighboringSystems, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context selectToMeDomainContext(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.domain.javamodel.I__V_3_aE_01_aE_DomainContext object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_domainContext, object.getResource());
  }
  
  public static cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context selectToMeTechnicalContext(cleon.conception.architecture.spec.arc42._03_system_scope_and_context.technical.javamodel.I__V_3_aE_02_aE_TechnicalContext object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.I__V_3_aE_System_aE_Scope_aE_and_aE_Context.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.__V_3_aE_System_aE_Scope_aE_and_aE_Context_technicalContext, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04cf294a-ffca-11e5-bd7b-8b0acf27d441,tQS8gcA6vHQVh2jLoisksHuILFI=] */
