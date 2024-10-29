package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e1ea3d77-6eb2-11ea-b8e8-f1a46e0c42f7");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.buildingblock.javamodel.IDeploymentBuildingBlockConcept selectDeploymentBuildingBlock();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodConcept selectDeploymentMethod();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureConcept selectDeploymentProcedure();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.update.javamodel.IUpdateConcept selectUpdateConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e1ea3d77-6eb2-11ea-b8e8-f1a46e0c42f7,9rjnC8V++7r/thbZKbXMQ3zZIgQ=] */
