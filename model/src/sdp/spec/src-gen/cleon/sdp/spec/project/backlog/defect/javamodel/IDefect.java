package cleon.sdp.spec.project.backlog.defect.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDefect extends ch.actifsource.core.javamodel.INamedResource, cleon.sdp.spec.project.backlog.javamodel.IWorkItem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("484dda11-ff9c-11e4-ac0a-959b440f987f");
  
  public java.lang.String selectEnvironment();
  
  // relations
  
  public cleon.sdp.spec.project.backlog.defect.javamodel.IReproducibility selectReproducibility();
  
  public cleon.sdp.spec.project.backlog.javamodel.IText selectResolution();
  
  public cleon.sdp.spec.project.javamodel.IPerson selectFoundBy();
  
  public cleon.sdp.spec.project.backlog.defect.javamodel.IClassification selectClassification();
  
  public cleon.sdp.spec.project.backlog.defect.javamodel.IObservation selectObservation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,484dda11-ff9c-11e4-ac0a-959b440f987f,1+sxJfAAqe/wP1+b86HfCiAd/kg=] */
