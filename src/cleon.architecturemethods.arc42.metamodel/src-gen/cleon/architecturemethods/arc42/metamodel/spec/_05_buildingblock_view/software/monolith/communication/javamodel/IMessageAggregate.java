package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMessageAggregate extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e3ab2692-fb82-11f0-919e-07363e802872");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.ITableArea selectTableArea();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IMessage> selectMessage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e3ab2692-fb82-11f0-919e-07363e802872,jjosInDDdaqDF3sK/3Ls/OfnxBU=] */
