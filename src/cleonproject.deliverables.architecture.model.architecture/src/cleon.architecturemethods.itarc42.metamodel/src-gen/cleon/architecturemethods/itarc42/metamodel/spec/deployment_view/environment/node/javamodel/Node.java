package cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Node extends DynamicResource implements INode {

  // abstract implementation, only used for static method calls
  private Node() {
    super(INode.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode selectToMeNodes(cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode.class, cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.NodePackage.Node_nodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4a67ced9-02d4-11e9-9e58-33d596257b14,Qlg8hVJTkc+huGGDvoD4tWvnQaM=] */
