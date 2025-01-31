package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractServerLicense extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductEnvironmentLicensing {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0c7d7650-dfdd-11ef-b0be-9b4cac321140");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractServerHostLicensing> selectServerHostLicensing();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0c7d7650-dfdd-11ef-b0be-9b4cac321140,a3GrbJINR1NDJjyt4M25i+jvZYc=] */
