package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploymentProcedureOrder extends cleon.common.resources.metamodel.spec.descriptions.javamodel.IMandatoryDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4ed2390c-7e86-11ec-b55c-f5ca121c82b7");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.deployment.procedure.javamodel.IDeploymentProcedureStage> selectStages();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectAffectedCmp();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4ed2390c-7e86-11ec-b55c-f5ca121c82b7,5cF1c4dn/3x5ZyEnxCTBOHg5jI8=] */
