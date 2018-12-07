package cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class System_Scope_and_Context extends DynamicResource implements ISystem_Scope_and_Context {

  // abstract implementation, only used for static method calls
  private System_Scope_and_Context() {
    super(ISystem_Scope_and_Context.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context selectToMeSystem(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_system, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context selectToMeNeighboringSystems(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.INeighboringSystem object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_neighboringSystems, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context selectToMeDomainContext(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.domain.javamodel.IDomainContext object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_domainContext, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context selectToMeTechnicalContext(cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.technical.javamodel.ITechnicalContext object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem_Scope_and_Context.class, cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_aE_Scope_aE_and_aE_Context_technicalContext, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,04cf294a-ffca-11e5-bd7b-8b0acf27d441,gBHZPtwIAEmb6wSBz4eWnsS0KS8=] */
