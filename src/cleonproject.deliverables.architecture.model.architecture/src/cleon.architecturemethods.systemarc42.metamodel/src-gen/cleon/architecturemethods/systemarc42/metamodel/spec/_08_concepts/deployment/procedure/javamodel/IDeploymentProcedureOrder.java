package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentProcedureOrder extends cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4ed2390c-7e86-11ec-b55c-f5ca121c82b7");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureStage> selectStages();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> selectAffectedCmp();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4ed2390c-7e86-11ec-b55c-f5ca121c82b7,hBSfq4bFYUoft5p0CcIEW35G8NA=] */
