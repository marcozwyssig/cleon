package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentConcept extends cleon.architecturemethods.arc42.metamodel.spec._08_concepts.javamodel.IConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e1ea3d77-6eb2-11ea-b8e8-f1a46e0c42f7");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.buildingblock.javamodel.IDeploymentBuildingBlockConcept selectDeploymentBuildingBlock();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.method.javamodel.IDeploymentMethodConcept selectDeploymentMethod();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureConcept selectDeploymentProcedure();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.update.javamodel.IUpdateConcept selectUpdateConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e1ea3d77-6eb2-11ea-b8e8-f1a46e0c42f7,Edfdpz23s9HegLizwY0HHW/XdT4=] */
