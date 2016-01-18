package cleon.sda.spec.requirementsmanagement.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIssue extends ch.actifsource.core.javamodel.INamedResource, cleon.doc.spec.javamodel.ISimpleDescription, cleon.sda.spec.requirementsmanagement.javamodel.INotes {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d0da468c-bdee-11e5-965a-07bc81ea9ca9");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.IRequirement> selectConcerns();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d0da468c-bdee-11e5-965a-07bc81ea9ca9,QjWC/I9aBFQTLoidcvd+vTsYeIs=] */
