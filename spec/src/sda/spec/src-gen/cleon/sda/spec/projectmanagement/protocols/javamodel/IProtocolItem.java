package cleon.sda.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProtocolItem extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("71fe646f-b462-11e5-a3f4-497fd75158dc");
  
  // attributes
  
  public java.lang.String selectName();
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> selectResponsibles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,71fe646f-b462-11e5-a3f4-497fd75158dc,S2Nw5XRrhvEKExsW8pSRNcz09jA=] */
