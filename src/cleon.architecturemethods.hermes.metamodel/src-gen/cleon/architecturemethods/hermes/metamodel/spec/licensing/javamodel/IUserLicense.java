package cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IUserLicense extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductEnvironmentLicensing, cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAmountAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c296db3a-dfd1-11ef-b0be-9b4cac321140");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IUserLicenseType selectUserLicenseType();
  
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IUserLicenseValidity selectUserLicenseValidity();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c296db3a-dfd1-11ef-b0be-9b4cac321140,lwDOn/0DzCuShsV8S0/UUCz+PxA=] */
