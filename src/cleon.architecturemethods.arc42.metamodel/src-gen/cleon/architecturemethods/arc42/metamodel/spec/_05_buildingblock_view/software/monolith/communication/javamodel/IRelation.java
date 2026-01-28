package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRelation extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e810938c-facf-11f0-81b8-83fdbb37c0b0");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTableRelation selectAbstractTableRelation();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage selectMessage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e810938c-facf-11f0-81b8-83fdbb37c0b0,fJOU9XQMV7oLZH7ohXIYY575QQg=] */
