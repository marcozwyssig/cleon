package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IField extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c78f20fa-fac6-11f0-81b8-83fdbb37c0b0");
  
  public java.lang.String selectDbType();
  
  public java.lang.String selectGRPCType();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_data_view.table.javamodel.IColumn selectColumn();
  
  public ch.actifsource.solution.datatype.generic.datatype.javamodel.IType selectType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c78f20fa-fac6-11f0-81b8-83fdbb37c0b0,AAjX5lVL3upDvmyUSuVLIm0NmV0=] */
