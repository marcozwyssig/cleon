package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProtocolItem extends ch.actifsource.core.javamodel.IResource, cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("71fe646f-b462-11e5-a3f4-497fd75158dc");
  
  // attributes
  
  public java.lang.String selectName();
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson> selectResponsibles();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,71fe646f-b462-11e5-a3f4-497fd75158dc,Uke57hODqyO6zLVPogjlkwZMmPM=] */
