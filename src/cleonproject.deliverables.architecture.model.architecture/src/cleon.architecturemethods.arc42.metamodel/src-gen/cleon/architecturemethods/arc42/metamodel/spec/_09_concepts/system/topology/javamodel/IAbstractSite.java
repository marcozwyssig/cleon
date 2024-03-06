package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSite extends ch.actifsource.core.javamodel.INamedResource, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware, cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("119b879d-878b-11e9-a61b-279ebde48b48");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISite> selectAllowedToManage();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectAllowAccessWith();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,119b879d-878b-11e9-a61b-279ebde48b48,A8KkHlF9mCEhKxTRicNV0/3NWBo=] */
