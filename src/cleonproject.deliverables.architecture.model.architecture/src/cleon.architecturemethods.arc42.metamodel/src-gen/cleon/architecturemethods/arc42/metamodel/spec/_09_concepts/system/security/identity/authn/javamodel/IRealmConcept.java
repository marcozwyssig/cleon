package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRealmConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.javamodel.IAbstractSecurityConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ebac8bd2-0eaf-11e9-9f19-6d15636f4ecc");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel.IRealmConfiguration> selectRealmConfigurations();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authn.javamodel.IRealmForSystem> selectRealmForSystems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ebac8bd2-0eaf-11e9-9f19-6d15636f4ecc,ZfK/JrFKVZp0/cillDrlEnyuRiA=] */
