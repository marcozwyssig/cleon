package Cleon.EBP.Spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnterpriseBusinessProcess extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("037d0836-bb6a-11e3-bf59-6b10d9dd6d36");
  
  // relations
  
  public Cleon.EBP.Spec.Organisational.javamodel.IOrganisational selectOrganisational();
  
  public Cleon.EBP.Spec.Operational.javamodel.IOperational selectOperational();
  
  public Cleon.EBP.Spec.Organigram.javamodel.IOrganigram selectOrganigram();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,037d0836-bb6a-11e3-bf59-6b10d9dd6d36,7LlBpeVzq6CN6ajL2bruI5lFbow=] */
