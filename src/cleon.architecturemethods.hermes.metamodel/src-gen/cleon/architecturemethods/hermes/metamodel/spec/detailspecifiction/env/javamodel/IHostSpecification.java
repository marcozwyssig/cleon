package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.env.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHostSpecification extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractEnvironmentSpecification, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4440ff4a-001c-11f0-945c-87b19aec41f4");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode selectBuildNode();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.security.iam.javamodel.IMasterDomainControllerSystemConfiguration selectMasterDomainController();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4440ff4a-001c-11f0-945c-87b19aec41f4,jKktBAjQmAEzPc+NrnN2TS2pC8U=] */
