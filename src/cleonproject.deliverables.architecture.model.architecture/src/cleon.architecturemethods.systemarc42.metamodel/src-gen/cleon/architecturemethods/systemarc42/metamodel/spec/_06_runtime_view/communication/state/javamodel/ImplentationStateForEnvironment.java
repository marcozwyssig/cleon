package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ImplentationStateForEnvironment extends DynamicResource implements IImplentationStateForEnvironment {

  // abstract implementation, only used for static method calls
  private ImplentationStateForEnvironment() {
    super(IImplentationStateForEnvironment.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplentationStateForEnvironment> selectToMeEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplentationStateForEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplentationStateForEnvironment_environment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b0ba7e8d-1770-11eb-aff5-dd5c3dd3a631,hLiu82CZIGllN7NNmhO92cNvajQ=] */
