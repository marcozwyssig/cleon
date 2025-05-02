package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestAccountEnvironmentSite extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("755d59b1-2734-11f0-8098-59f455ea82af");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite selectSite();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccountEnvironmentSystem> selectTestAccountSystem();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,755d59b1-2734-11f0-8098-59f455ea82af,r4ExdTPBm7ddVLhFRIACkTJAJAs=] */
