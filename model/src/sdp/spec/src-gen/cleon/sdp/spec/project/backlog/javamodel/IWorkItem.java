package cleon.sdp.spec.project.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkItem extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4330cc63-ff9c-11e4-ac0a-959b440f987f");
  
  public java.lang.String selectReference();
  
  // relations
  
  public cleon.sdp.spec.project.javamodel.IPerson selectOwner();
  
  public cleon.sdp.spec.project.backlog.javamodel.IText selectDescription();
  
  public cleon.sdp.spec.project.release.javamodel.ISprint selectSprint();
  
  public cleon.sdp.spec.project.backlog.javamodel.IText selectAnalysis();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4330cc63-ff9c-11e4-ac0a-959b440f987f,XlfC5fwXnjENFwUc2nTjPeeQw8s=] */
