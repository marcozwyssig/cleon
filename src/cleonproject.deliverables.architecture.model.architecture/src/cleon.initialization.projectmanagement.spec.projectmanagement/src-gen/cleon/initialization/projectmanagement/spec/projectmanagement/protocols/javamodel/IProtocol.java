package cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProtocol extends cleon.common.doc.spec.doc.document.javamodel.INamedDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2140b619-b45f-11e5-b1fb-4fb16b224b5b");
  
  public java.lang.String selectStarttime();
  
  public java.lang.String selectEndtime();
  
  // relations
  
  public cleon.common.resources.spec.calendar.javamodel.IDay selectDate();
  
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.resource.persons.javamodel.IPerson> selectMembers();
  
  public cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IAgenda selectAgenda();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolItems> selectProtocol();
  
  public cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember selectModerator();
  
  public cleon.initialization.projectmanagement.spec.resource.locations.javamodel.ILocation selectLocation();
  
  public cleon.initialization.projectmanagement.spec.projectmanagement.protocols.javamodel.IProtocolProperties selectProperties();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2140b619-b45f-11e5-b1fb-4fb16b224b5b,b7pUIYxRr3S+tOU1Ir3Q2LlWP3g=] */
