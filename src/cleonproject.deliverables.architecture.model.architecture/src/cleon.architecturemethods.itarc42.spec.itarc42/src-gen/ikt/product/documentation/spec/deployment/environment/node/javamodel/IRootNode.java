package ikt.product.documentation.spec.deployment.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRootNode extends ikt.product.documentation.spec.deployment.environment.node.javamodel.ISupplyAndBuildNodeDecomposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a632f40c-02d4-11e9-9e58-33d596257b14");
  
  // relations
  
  public java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a632f40c-02d4-11e9-9e58-33d596257b14,QfnIIbOmI6bXxCUVwyvR+u2T1BA=] */
