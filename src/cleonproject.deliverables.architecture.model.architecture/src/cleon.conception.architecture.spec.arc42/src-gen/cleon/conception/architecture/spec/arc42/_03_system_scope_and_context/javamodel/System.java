package cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class System extends DynamicResource implements ISystem {

  // abstract implementation, only used for static method calls
  private System() {
    super(ISystem.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem selectToMeDecompose(cleon.conception.architecture.spec.buildingblock.javamodel.IDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.arc42._03_system_scope_and_context.javamodel.ISystem.class, cleon.conception.architecture.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.System_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a3ea83ea-2660-11e6-ae54-e50d44645ae7,9fAnKh2RO3A5Yj7zxiGy9fugKu4=] */
