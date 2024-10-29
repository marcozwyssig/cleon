package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIdentityConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.IAbstractSecurityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("af9a3fbe-da5c-11eb-8ffa-d7727a940bcf");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel.IRealmConcept selectAuthn();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel.IAutorizationConcept selectAuthz();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IServiceAccounts selectAccounts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,af9a3fbe-da5c-11eb-8ffa-d7727a940bcf,ag1FIoYeJdNshQhZbweuy5eAcfg=] */
