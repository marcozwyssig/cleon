package cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISource extends ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bf998613-877a-11e9-a61b-279ebde48b48");
  
  public java.lang.Boolean selectIsTemporary();
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration selectSourceSystemConfiguration();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.services.javamodel.IAbstractService> selectCommunicatesWith();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ISourceSubSecurityZone> selectAccessAllowed();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.ITrack selectTrack();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.runtime_view.communication.javamodel.IAction selectAction();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bf998613-877a-11e9-a61b-279ebde48b48,8oHJx0Ji41+dIXSkNm6ATZzD970=] */
