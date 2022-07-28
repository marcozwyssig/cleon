package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

/**
 * Includes the overall order procedure for deployming the system
 */
public interface IDeploymentProcedureConcept extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("160aafe5-7e82-11ec-b55c-f5ca121c82b7");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureStage> selectDeploymentStages();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureExclude> selectExcludeInInstallationOrder();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.procedure.javamodel.IDeploymentProcedureOrderGroup> selectDeploymentProcedureOrderGroup();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,160aafe5-7e82-11ec-b55c-f5ca121c82b7,kyiAJUACkZ1H2dsrD/kbqYvgP5c=] */
