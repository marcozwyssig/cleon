package cleon.sda.spec.projectmanagement.protocols.protocolsitems.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITask extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("55988936-b463-11e5-a3f4-497fd75158dc");
  
  // relations
  
  public cleon.sda.spec.projectmanagement.planning.targetdates.javamodel.ITargetDate selectDeadline();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,55988936-b463-11e5-a3f4-497fd75158dc,X/KuKmYWJlJuwmJu3D9ZnXQBEmU=] */
