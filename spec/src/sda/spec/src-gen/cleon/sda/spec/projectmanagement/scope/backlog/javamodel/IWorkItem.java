package cleon.sda.spec.projectmanagement.scope.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkItem extends cleon.sda.spec.javamodel.IBusinessObjectId, cleon.doc.spec.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4330cc63-ff9c-11e4-ac0a-959b440f987f");
  
  public java.lang.String selectReference();
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> selectOwner();
  
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IText selectAnalysis();
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem> selectPreconditions();
  
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IEffort selectEstimate();
  
  public cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IPriority selectPriority();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4330cc63-ff9c-11e4-ac0a-959b440f987f,4PJjM7eMhQgRNUzH49CkAw+Oqpo=] */
