package cleon.sdp.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISdp extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("ea1700ac-ff9a-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.sdp.spec.requirements.javamodel.IRequirements selectRequirements();
  
  public cleon.sdp.spec.project.javamodel.IProject selectProject();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,ea1700ac-ff9a-11e4-ac0a-959b440f987f,bmiQoHFUPygOkZw4x6zjlYeJtQ0=] */
