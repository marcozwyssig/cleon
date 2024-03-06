package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentProcedureStage extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5886b9d2-7e84-11ec-b55c-f5ca121c82b7");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedurePhaseUsageCount> selectPhaseUsageCountExceptions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5886b9d2-7e84-11ec-b55c-f5ca121c82b7,w/sPAslcSsZTBKhSvOSzlkcwd5Q=] */
