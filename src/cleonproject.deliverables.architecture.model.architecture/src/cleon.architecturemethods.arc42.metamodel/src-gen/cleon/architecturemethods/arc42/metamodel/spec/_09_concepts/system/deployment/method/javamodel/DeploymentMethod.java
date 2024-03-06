package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DeploymentMethod extends DynamicResource implements IDeploymentMethod {

  // abstract implementation, only used for static method calls
  private DeploymentMethod() {
    super(IDeploymentMethod.TYPE_ID);
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethod selectToMeDeploymentMethodOptions(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodOption object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethod.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.MethodPackage.DeploymentMethod_deploymentMethodOptions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8f187258-fe3f-11ea-892b-df291bae18c5,SsFgKQmYUz0H0WOPzI1rYf7tf0w=] */
