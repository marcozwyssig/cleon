package ikt.product.documentation.spec.deployment.environment.node.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SupplyAndBuildNodeDecomposite extends DynamicResource implements ISupplyAndBuildNodeDecomposite {

  // abstract implementation, only used for static method calls
  private SupplyAndBuildNodeDecomposite() {
    super(ISupplyAndBuildNodeDecomposite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static ikt.product.documentation.spec.deployment.environment.node.javamodel.ISupplyAndBuildNodeDecomposite selectToMeSuppliedNodes(ikt.product.documentation.spec.deployment.environment.node.supplynode.javamodel.ISupplyNode object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.deployment.environment.node.javamodel.ISupplyAndBuildNodeDecomposite.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_suppliedNodes, object.getResource());
  }
  
  public static ikt.product.documentation.spec.deployment.environment.node.javamodel.ISupplyAndBuildNodeDecomposite selectToMeBuildNodes(ikt.product.documentation.spec.deployment.environment.node.buildnode.javamodel.IBuildNode object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.deployment.environment.node.javamodel.ISupplyAndBuildNodeDecomposite.class, ikt.product.documentation.spec.deployment.environment.node.NodePackage.SupplyAndBuildNodeDecomposite_buildNodes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4f4fc335-ef41-11e8-be8a-b748ff8f0a75,gTk303bTWwL4MiuLx5rLpAVzKGQ=] */
