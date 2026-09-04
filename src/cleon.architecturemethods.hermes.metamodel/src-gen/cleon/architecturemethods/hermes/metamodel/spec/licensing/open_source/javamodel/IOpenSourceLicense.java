package cleon.architecturemethods.hermes.metamodel.spec.licensing.open_source.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOpenSourceLicense extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractProductLicensing {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3036d829-dfc0-11ef-b0be-9b4cac321140");
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.open_source.javamodel.ILicenseTyp selectType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3036d829-dfc0-11ef-b0be-9b4cac321140,Y7zM9c5OO8sUkL0jZpAnpvphnTI=] */
