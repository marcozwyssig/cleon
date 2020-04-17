package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.template.javamodel;

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

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,71262ab9-8010-11ea-973c-4be14eb20858,+tBknU1DyO16RP/ZcXmrzbGIDDI=] */
