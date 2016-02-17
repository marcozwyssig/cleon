package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPropertyTemplate extends cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.ITemplate {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("584b9882-d574-11e5-89ea-2d8d86e9ef89");
  
  // relations
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IProperty selectProperty();
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.ISubjectMatter selectSubjectMatter();
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IExpression selectExpression();
  
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.property.javamodel.IValue selectValue();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,584b9882-d574-11e5-89ea-2d8d86e9ef89,TX3jzrKVFSHaF6J2l35kFebzb4M=] */
