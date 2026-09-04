package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestAccounts extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.IAbstractSecurityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cba56eb0-2732-11f0-8098-59f455ea82af");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccountTemplates selectTestAccountTemplates();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccountEnvironments selectTestAccountDeployments();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cba56eb0-2732-11f0-8098-59f455ea82af,jxGAkVcQWdF90KwUDumz1Gh/jtI=] */
