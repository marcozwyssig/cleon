package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state.implementationstateforenvironment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ImplementationStateForEnvironment extends DynamicResource implements IImplementationStateForEnvironment {

  // abstract implementation, only used for static method calls
  private ImplementationStateForEnvironment() {
    super(IImplementationStateForEnvironment.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state.implementationstateforenvironment.javamodel.IImplementationStateForEnvironment> selectToMeEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state.implementationstateforenvironment.javamodel.IImplementationStateForEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state.implementationstateforenvironment.ImplementationstateforenvironmentPackage.ImplementationStateForEnvironment_environment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b0ba7e8d-1770-11eb-aff5-dd5c3dd3a631,SVpNQlKWN3tMF4KxbkhgbLwM2HA=] */
