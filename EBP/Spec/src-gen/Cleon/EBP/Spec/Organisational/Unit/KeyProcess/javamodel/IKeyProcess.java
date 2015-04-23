package Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IKeyProcess extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9bb7ed60-ba7c-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IProductDevelopment selectProductDevelopment();
  
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IMarkting selectMarkting();
  
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution selectDistribution();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9bb7ed60-ba7c-11e3-9206-f19b78f4aff0,w6/J/tgSHmDkoLv5AEkFSOjewsg=] */
