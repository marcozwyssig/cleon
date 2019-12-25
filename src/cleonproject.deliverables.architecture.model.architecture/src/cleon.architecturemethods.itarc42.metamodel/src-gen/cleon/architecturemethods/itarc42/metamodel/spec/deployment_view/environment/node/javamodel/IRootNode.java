package cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRootNode extends cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.ISupplyAndBuildNodeDecomposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a632f40c-02d4-11e9-9e58-33d596257b14");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a632f40c-02d4-11e9-9e58-33d596257b14,dJ2agXG3R/7Gv+z5t+iTx4vzg1I=] */
