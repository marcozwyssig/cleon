package cleon.conception.organisation.spec.epm.unit.keyprocess.distribution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDistribution extends cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7546c5a9-daa8-11e3-ae07-89aa80d5ec3d");
  
  // relations
  
  public cleon.conception.organisation.spec.epm.unit.keyprocess.distribution.javamodel.IPreSales selectPreSales();
  
  public cleon.conception.organisation.spec.epm.unit.keyprocess.distribution.javamodel.IFulfillment selectFulfillment();
  
  public cleon.conception.organisation.spec.epm.unit.keyprocess.distribution.javamodel.IPurchase selectPurchase();
  
  public cleon.conception.organisation.spec.epm.unit.keyprocess.distribution.javamodel.IProduction selectProduction();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7546c5a9-daa8-11e3-ae07-89aa80d5ec3d,p6onIxVijerVHkmiKHZVv5eWjJU=] */
