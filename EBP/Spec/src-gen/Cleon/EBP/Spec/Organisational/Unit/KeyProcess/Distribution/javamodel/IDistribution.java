package Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDistribution extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7546c5a9-daa8-11e3-ae07-89aa80d5ec3d");
  
  // relations
  
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPreSales selectPreSales();
  
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IFulfillment selectFulfillment();
  
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IPurchase selectPurchase();
  
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IProduction selectProduction();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7546c5a9-daa8-11e3-ae07-89aa80d5ec3d,kxNznJnXs4+ntvTv3NRfI8JvftA=] */
