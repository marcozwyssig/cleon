package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeploymentTemplateNode extends DynamicResource implements IDeploymentTemplateNode {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentTemplateNode> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploymentTemplateNode>() {
    
    @Override
    public IDeploymentTemplateNode create() {
      return new DeploymentTemplateNode();
    }
    
    @Override
    public IDeploymentTemplateNode create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeploymentTemplateNode(resourceRepository, resource);
    }
  
  };

  public DeploymentTemplateNode() {
    super(IDeploymentTemplateNode.TYPE_ID);
  }
  
  public DeploymentTemplateNode(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploymentTemplateNode.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectBuildingBlock() {
    return _getSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentTemplateNode_buildingBlock);
  }

  public DeploymentTemplateNode setBuildingBlock(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock buildingBlock) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentTemplateNode_buildingBlock, buildingBlock);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DeploymentTemplateNode setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeploymentTemplateNode setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentTemplateNode_buildingBlock, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentTemplateNode> selectToMeBuildingBlock(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeploymentTemplateNode.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.DeploymentTemplateNode_buildingBlock, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2ee816be-8012-11ea-b940-37dc59567e20,iP9kU3YcufCNluU6dT4g4S4COns=] */
