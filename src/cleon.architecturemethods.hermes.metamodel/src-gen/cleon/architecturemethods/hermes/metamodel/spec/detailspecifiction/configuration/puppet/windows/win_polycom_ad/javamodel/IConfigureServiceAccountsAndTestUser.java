package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IConfigureServiceAccountsAndTestUser extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("03f382f0-0661-11f0-ad7c-c72b7a763977");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.ou.javamodel.ISetOfOU selectSetOfOU();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite selectSite();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel.IServiceAccountConfiguration> selectServiceAccount();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_ad.javamodel.ITestAccountConfiguration> selectTestUsers();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,03f382f0-0661-11f0-ad7c-c72b7a763977,bDTUqLE7qDaMRLbf8jtJKMoNiR4=] */
