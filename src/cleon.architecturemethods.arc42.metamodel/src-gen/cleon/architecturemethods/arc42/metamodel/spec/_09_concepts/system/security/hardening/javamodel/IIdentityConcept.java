package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.hardening.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIdentityConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.IAbstractSecurityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("817c7cb1-688a-11f0-91c0-65abe4ae8362");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel.IRealmConcept selectAuthn();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.javamodel.IAutorizationConcept selectAuthz();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.javamodel.IAccounts> selectAccounts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,817c7cb1-688a-11f0-91c0-65abe4ae8362,/OQcoM2kQRZnCKdbkyKPR3amzxI=] */
