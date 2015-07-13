package cleon.sdp.spec.project.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IUserStory extends cleon.sdp.spec.project.javamodel.IStory, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("693cc9f9-ff9c-11e4-ac0a-959b440f987f");
  
  // relations
  
  public cleon.sdp.spec.requirements.javamodel.IRequirement selectRequirement();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,693cc9f9-ff9c-11e4-ac0a-959b440f987f,JR2+reY98IDKFxxIFWlczCQibH4=] */
