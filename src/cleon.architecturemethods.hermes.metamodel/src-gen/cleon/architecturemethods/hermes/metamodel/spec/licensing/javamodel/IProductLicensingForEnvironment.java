package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProductLicensingForEnvironment extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductLicensing {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d30d48bc-dfc1-11ef-b0be-9b4cac321140");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductEnvironmentLicensing> selectEnvironmentLicensing();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d30d48bc-dfc1-11ef-b0be-9b4cac321140,+BS1SB/HqY/blKNOShXJfGemVgk=] */
