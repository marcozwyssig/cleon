package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class StateAware extends DynamicResource implements IStateAware {

  // abstract implementation, only used for static method calls
  private StateAware() {
    super(IStateAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IStateAware> selectToMeState(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IState object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.javamodel.IStateAware.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.ScopePackage.StateAware_state, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,33806909-bb63-11e8-921b-c1cf01226512,QHnUplVC4Ey90qcdrXMQmqhOlHE=] */
