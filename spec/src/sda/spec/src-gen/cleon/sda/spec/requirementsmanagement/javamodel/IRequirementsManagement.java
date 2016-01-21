package cleon.sda.spec.requirementsmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementsManagement extends cleon.doc.spec.chapter.javamodel.INoChapters, cleon.doc.spec.document.javamodel.INamedDocument, cleon.sda.spec.requirementsmanagement.javamodel.IRequirementDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4bcb71bd-a950-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public cleon.sda.spec.requirementsmanagement.motivation.javamodel.IMotivation selectMotivation();
  
  public cleon.sda.spec.requirementsmanagement.requirements.javamodel.IRequirements selectRequirements();
  
  public cleon.sda.spec.requirementsmanagement.issues.javamodel.IIssues selectIssues();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4bcb71bd-a950-11e5-bda2-a7fc3bd7c783,Ryl5QEcGr95GHXngh4/rtzWWd7o=] */
