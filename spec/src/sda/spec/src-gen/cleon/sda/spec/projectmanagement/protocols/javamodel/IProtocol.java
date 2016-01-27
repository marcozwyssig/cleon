package cleon.sda.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProtocol extends cleon.doc.spec.document.javamodel.INamedDocument, cleon.doc.spec.document.javamodel.INoSubDocuments, cleon.sda.spec.projectmanagement.javamodel.IProjectDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2140b619-b45f-11e5-b1fb-4fb16b224b5b");
  
  public java.lang.String selectStarttime();
  
  public java.lang.String selectEndtime();
  
  // relations
  
  public cleon.sda.spec.projectmanagement.planning.calendar.javamodel.IDay selectDate();
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.resourcemanagement.persons.javamodel.IPerson> selectMembers();
  
  public cleon.sda.spec.projectmanagement.protocols.javamodel.IAgenda selectAgenda();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems> selectProtocol();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2140b619-b45f-11e5-b1fb-4fb16b224b5b,Srv2FhwOrT2vAuwz8vRr1pZ7Lf8=] */
