package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IServiceAccounts extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.IAbstractSecurityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f976f9b6-a19e-11ea-886d-354b9ee6fb2d");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IBuiltinRole> selectBuiltinRole();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountBuildingBlocks selectServiceAccountBuildingBlocks();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccountEnvironments selectServiceAccountEnvironments();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f976f9b6-a19e-11ea-886d-354b9ee6fb2d,ctQ+xOvvnpi/oq9BIx15dA0Sb38=] */
