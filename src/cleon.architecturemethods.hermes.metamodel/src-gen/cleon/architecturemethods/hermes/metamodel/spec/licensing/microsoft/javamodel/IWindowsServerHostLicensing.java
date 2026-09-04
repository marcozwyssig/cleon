package cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWindowsServerHostLicensing extends cleon.architecturemethods.hermes.metamodel.spec.licensing.javamodel.IAbstractServerHostLicensing {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e6437b2d-dfc8-11ef-b0be-9b4cac321140");
  
  public java.lang.Integer selectAmount();
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.licensing.microsoft.javamodel.IMicrosoftServerLicense selectMicrosoftServerLicense();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e6437b2d-dfc8-11ef-b0be-9b4cac321140,uWBuB/BOA3s5V7D/3VPDZfDevZw=] */
