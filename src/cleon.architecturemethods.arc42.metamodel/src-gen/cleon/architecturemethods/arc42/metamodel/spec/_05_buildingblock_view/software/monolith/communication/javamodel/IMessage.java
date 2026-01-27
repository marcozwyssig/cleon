package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMessage extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3ec14480-fac5-11f0-81b8-83fdbb37c0b0");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IAbstractTable selectAbstractTable();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IField> selectFields();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel.IRelation> selectRelation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3ec14480-fac5-11f0-81b8-83fdbb37c0b0,I76ndZjs/21iJnreNLkDB3knsWE=] */
