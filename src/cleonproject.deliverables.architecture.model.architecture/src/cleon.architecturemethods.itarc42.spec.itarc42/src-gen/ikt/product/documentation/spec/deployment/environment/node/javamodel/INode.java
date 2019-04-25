package ikt.product.documentation.spec.deployment.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INode extends cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4a67ced9-02d4-11e9-9e58-33d596257b14");
  
  // relations
  
  public java.util.List<? extends ikt.product.documentation.spec.deployment.environment.node.javamodel.INode> selectNodes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4a67ced9-02d4-11e9-9e58-33d596257b14,UXf/OSctS9qAkgyoPf+VTR2AbgM=] */
