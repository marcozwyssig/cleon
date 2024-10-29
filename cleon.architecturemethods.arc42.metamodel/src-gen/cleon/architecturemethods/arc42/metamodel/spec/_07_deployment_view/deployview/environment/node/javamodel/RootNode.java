package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class RootNode extends DynamicResource implements IRootNode {

  // abstract implementation, only used for static method calls
  private RootNode() {
    super(IRootNode.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.IRootNode selectToMeBuildNodes(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.buildnode.javamodel.IBuildNode object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.javamodel.IRootNode.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.environment.node.NodePackage.RootNode_buildNodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a632f40c-02d4-11e9-9e58-33d596257b14,rqcWo8jc273Sjn9l5RaT7TLbAoM=] */
