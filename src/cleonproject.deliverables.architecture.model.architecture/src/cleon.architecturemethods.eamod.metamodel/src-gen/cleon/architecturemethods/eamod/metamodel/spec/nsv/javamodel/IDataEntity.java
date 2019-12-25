package cleon.architecturemethods.eamod.metamodel.spec.nsv.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDataEntity extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9327c0d9-818c-11e7-9507-01b75489c44b");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.nsv.javamodel.IDataEntity> selectEntityRelationship();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9327c0d9-818c-11e7-9507-01b75489c44b,L3cinjY6lzBPe4yYmHtp867z+8g=] */
