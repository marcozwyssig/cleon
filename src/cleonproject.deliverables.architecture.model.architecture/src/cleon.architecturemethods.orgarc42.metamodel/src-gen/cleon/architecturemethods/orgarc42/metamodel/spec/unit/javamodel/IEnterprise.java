package cleon.architecturemethods.orgarc42.metamodel.spec.unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnterprise extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.javamodel.IOrganisationGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fb007daf-ba75-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel.IManagement selectManagement();
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.keyprocess.javamodel.IKeyProcess selectRealisation();
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IResource selectSupport();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fb007daf-ba75-11e3-9206-f19b78f4aff0,BJt7KjfgCopn9IJEJUHjxpVHFCo=] */
