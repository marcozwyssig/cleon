package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractHost extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipMonitoringAware, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.ISkipHostGenerationAware, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISkipBookmarkAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c6ffaf13-6da4-11e9-8af5-2346ca56c2e2");
  
  public java.lang.String selectOverrideOwner();
  
  public java.lang.Boolean selectIsTemporary();
  
  public java.lang.String selectAlias();
  
  public java.lang.Boolean selectIsVirtualized();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectInstanceOf();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectMonitoringWith();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> selectIps();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c6ffaf13-6da4-11e9-8af5-2346ca56c2e2,YUC3103ZyDIB9ajudDKl6t88nH0=] */
