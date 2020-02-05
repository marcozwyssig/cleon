package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITopology extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fca3a39b-878a-11e9-a61b-279ebde48b48");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.topology.javamodel.ITopologyEnvironment> selectTopologyEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fca3a39b-878a-11e9-a61b-279ebde48b48,omVTmSfFilsR9ZKimQRk9OXeT2o=] */
