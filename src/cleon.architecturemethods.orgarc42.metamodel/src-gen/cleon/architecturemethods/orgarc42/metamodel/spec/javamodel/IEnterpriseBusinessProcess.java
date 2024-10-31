package cleon.architecturemethods.orgarc42.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnterpriseBusinessProcess extends cleon.modelinglanguages.bpmn.metamodel.spec.javamodel.IBpmn, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("037d0836-bb6a-11e3-bf59-6b10d9dd6d36");
  
  // relations
  
  public cleon.architecturemethods.orgarc42.metamodel.spec.operational.javamodel.IOperational selectOperational();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,037d0836-bb6a-11e3-bf59-6b10d9dd6d36,N6w5coARMs/UtuARritOw5DJ2Vc=] */
