package cleon.sdp.spec.requirements.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementGroup extends cleon.sdp.spec.requirements.javamodel.IAbstractRequirement {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3da3b4e2-ff9b-11e4-ac0a-959b440f987f");
  
  // relations
  
  public java.util.List<? extends cleon.sdp.spec.requirements.javamodel.IAbstractRequirement> selectRequirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3da3b4e2-ff9b-11e4-ac0a-959b440f987f,PBmGPJKv9BtVAni/5m3m2UacerQ=] */
