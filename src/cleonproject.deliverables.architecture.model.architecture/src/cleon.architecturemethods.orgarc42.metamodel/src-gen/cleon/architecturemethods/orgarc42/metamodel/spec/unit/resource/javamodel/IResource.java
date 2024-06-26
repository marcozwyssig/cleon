package cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResource extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9ebfbca0-bb6a-11e3-bf59-6b10d9dd6d36");
  
  // relations
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IHumanResource selectHumanresource();
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IBilling selectBilling();
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IQualityManagement selectQualityManagement();
  
  public java.util.List<? extends cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IInfrastructure> selectInfrastructure();
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IITOps selectIt();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9ebfbca0-bb6a-11e3-bf59-6b10d9dd6d36,ya4rOLTpBDNGtWXVPWGU8lnrRig=] */
