package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAutorizationConcept extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.IAbstractSecurityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9db33409-6e8e-11ea-b8e8-f1a46e0c42f7");
  
  // relations
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.INamedChapter> selectChapters();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.javamodel.IAuthZBuildingBlockConcept selectAuthZForBuildingBlock();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.javamodel.IAuthZEnvironmentConcept selectAuthZForEnvironment();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IResponsibilities selectResponsibilities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9db33409-6e8e-11ea-b8e8-f1a46e0c42f7,PZnxRFKzbBwP9BsjEnOMNdb3VsM=] */
