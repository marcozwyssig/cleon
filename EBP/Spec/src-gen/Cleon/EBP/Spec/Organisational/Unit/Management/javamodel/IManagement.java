package Cleon.EBP.Spec.Organisational.Unit.Management.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IManagement extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0fb27ece-ba76-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IEnviromentProtection selectEnviromentProtection();
  
  public Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IPolticsAndStrategy selectPolticsAndStrategy();
  
  public Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IFinanceAndControlling selectFinanceAndControlling();
  
  public Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IValuesAndCorperateGovernance selectValuesAndCorperateGovernance();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0fb27ece-ba76-11e3-9206-f19b78f4aff0,qTZO1nmu9982VkPRDBAr7dd1quE=] */
