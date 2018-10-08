package cleon.conception.organisation.spec.epm.unit.keyprocess.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IKeyProcess extends cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9bb7ed60-ba7c-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public cleon.conception.organisation.spec.epm.unit.keyprocess.javamodel.IProductDevelopment selectProductDevelopment();
  
  public cleon.conception.organisation.spec.epm.unit.keyprocess.javamodel.IMarkting selectMarkting();
  
  public cleon.conception.organisation.spec.epm.unit.keyprocess.distribution.javamodel.IDistribution selectDistribution();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9bb7ed60-ba7c-11e3-9206-f19b78f4aff0,b1n2OoBUqoxB/AU+lqyMkX1IvTQ=] */
