package Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResource extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9ebfbca0-bb6a-11e3-bf59-6b10d9dd6d36");
  
  // relations
  
  public Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IHumanResource selectHumanresource();
  
  public Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IBilling selectBilling();
  
  public Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IQualityManagement selectQualityManagement();
  
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IInfrastructure> selectInfrastructure();
  
  public Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IITOps selectIt();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9ebfbca0-bb6a-11e3-bf59-6b10d9dd6d36,YviJiU9OFLlzjACQAjJJ1IGeRSc=] */
