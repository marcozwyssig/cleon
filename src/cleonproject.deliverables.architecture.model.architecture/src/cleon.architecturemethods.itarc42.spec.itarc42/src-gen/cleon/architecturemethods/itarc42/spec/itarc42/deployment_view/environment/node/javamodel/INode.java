package cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INode extends cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4a67ced9-02d4-11e9-9e58-33d596257b14");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.javamodel.INode> selectNodes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4a67ced9-02d4-11e9-9e58-33d596257b14,edQmfFUZKpooVmO41OqJzfe4AlM=] */
