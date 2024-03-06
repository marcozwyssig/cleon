package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentSystemArc42 extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IDeployment, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("33c30f60-fe58-11ea-abcb-bfad67a56d79");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.method.javamodel.IDeploymentMethodForSystemConfiguration selectUsedDeploymentMethod();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,33c30f60-fe58-11ea-abcb-bfad67a56d79,EOJcr6Zi/eYzkKYsF/fVGOhf+Ko=] */
