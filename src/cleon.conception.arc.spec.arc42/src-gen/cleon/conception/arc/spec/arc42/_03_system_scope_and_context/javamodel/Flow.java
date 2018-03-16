package cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Flow extends DynamicResource implements IFlow {

  // abstract implementation, only used for static method calls
  private Flow() {
    super(IFlow.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.IFlow> selectToMeFrom(cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.IMember object) {
    return _getToMeList(object.getRepository(), cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.IFlow.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_from, object.getResource());
  }
  
  public static java.util.List<cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.IFlow> selectToMeTo(cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.IMember object) {
    return _getToMeList(object.getRepository(), cleon.conception.arc.spec.arc42._03_system_scope_and_context.javamodel.IFlow.class, cleon.conception.arc.spec.arc42._03_system_scope_and_context._03_system_scope_and_contextPackage.Flow_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eff51cbc-2803-11e6-b263-9db62e053e59,+4fyLCOdnsIbeAvZTkTF1e5n/9Q=] */
