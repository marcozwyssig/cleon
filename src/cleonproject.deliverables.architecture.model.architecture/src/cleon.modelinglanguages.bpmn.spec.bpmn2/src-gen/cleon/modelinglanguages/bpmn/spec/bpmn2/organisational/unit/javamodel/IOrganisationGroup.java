package cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrganisationGroup extends cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.javamodel.IOrganisationUnit {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a7b9016a-ba7b-11e3-9206-f19b78f4aff0");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.javamodel.IOrganisationUnit> selectSubOrganisations();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a7b9016a-ba7b-11e3-9206-f19b78f4aff0,K24UPU3sZd3qIOw/uKU74NQfnb4=] */
