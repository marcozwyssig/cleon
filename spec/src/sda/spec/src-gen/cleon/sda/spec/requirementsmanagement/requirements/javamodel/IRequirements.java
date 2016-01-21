package cleon.sda.spec.requirementsmanagement.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirements extends cleon.doc.spec.document.javamodel.ISubDocument, cleon.sda.spec.requirementsmanagement.javamodel.IRequirementDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("f92279cc-ff9a-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectRequirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,f92279cc-ff9a-11e4-ac0a-959b440f987f,UW7Nj1eJXpPBur/n+rM4Bg77hLw=] */
