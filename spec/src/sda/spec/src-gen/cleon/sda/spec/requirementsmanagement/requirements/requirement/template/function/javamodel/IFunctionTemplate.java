package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.function.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFunctionTemplate extends cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.ITemplate {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2ec24b51-d560-11e5-89ea-2d8d86e9ef89");
  
  // relations
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.function.functionalitytype.javamodel.IFunctionalityType selectFunctionalityType();
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.function.javamodel.IObject selectObject();
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.function.javamodel.IProcess selectProcess();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2ec24b51-d560-11e5-89ea-2d8d86e9ef89,iWJ+KdYNClrCSRIckF2jGsLkW/k=] */
