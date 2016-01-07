package cleon.sda.spec.projectmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProject extends cleon.doc.spec.document.javamodel.IDocument, cleon.doc.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("be3d7626-ff9b-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.scope.javamodel.IScope selectScope();
  
  public cleon.sda.spec.projectmanagement.resourcemanagement.javamodel.IResourceManagement selectResourceManagement();
  
  public cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning selectPlanning();
  
  public cleon.sda.spec.projectmanagement.controlling.javamodel.IControlling selectControlling();
  
  public cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocols selectProtocols();
  
  public cleon.sda.spec.projectmanagement.process.javamodel.IProcess selectProcess();
  
  public cleon.sda.spec.projectmanagement.risks.javamodel.IRisks selectRisks();
  
  public cleon.sda.spec.projectmanagement.budget.javamodel.IBudget selectBudget();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,be3d7626-ff9b-11e4-ac0a-959b440f987f,+E/u1VQ00u3FP1qA438gpxP4iNk=] */
