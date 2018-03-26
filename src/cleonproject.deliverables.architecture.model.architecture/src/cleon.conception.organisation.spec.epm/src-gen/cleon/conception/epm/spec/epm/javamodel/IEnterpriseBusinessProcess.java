package cleon.conception.epm.spec.epm.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEnterpriseBusinessProcess extends cleon.conception.bpmn.spec.bpmn.javamodel.IBpmn, ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("037d0836-bb6a-11e3-bf59-6b10d9dd6d36");
  
  // relations
  
  public cleon.conception.epm.spec.epm.operational.javamodel.IOperational selectOperational();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,037d0836-bb6a-11e3-bf59-6b10d9dd6d36,eUHDvo5QKTuO2tx2CtC4HtLz9jM=] */
