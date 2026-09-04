package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractListOfSysCfgSpecifications extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.javamodel.IAbstractSpecification {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7bd287b7-059b-11f0-a294-67d88c30f2e4");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.ISysCfgSpecification> selectSystemConfigurationSpecifications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7bd287b7-059b-11f0-a294-67d88c30f2e4,+8f3JgkSbueTVLhwPrBYj2koaEY=] */
