package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSite extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISkipMonitoringAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("119b879d-878b-11e9-a61b-279ebde48b48");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite> selectAllowedToManage();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite selectAllowedToCentralAccess();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,119b879d-878b-11e9-a61b-279ebde48b48,MKKauk1L6T2M+5HsJ6l5xF7H58w=] */
