package cleon.sda.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProtocols extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d9251a72-a7d8-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocol> selectProtocols();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d9251a72-a7d8-11e5-82dd-3b995d9c840c,Uu7A2p8mvxW6Kshv6alIeiBFeB0=] */
