package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISupplyAndBuildNodeDecomposite extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.INode {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4f4fc335-ef41-11e8-be8a-b748ff8f0a75");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.supplynode.javamodel.ISupplyNode> selectSuppliedNodes();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode> selectBuildNodes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4f4fc335-ef41-11e8-be8a-b748ff8f0a75,N4lx7IK+jU4q09WEmeeiC3WnvuY=] */
