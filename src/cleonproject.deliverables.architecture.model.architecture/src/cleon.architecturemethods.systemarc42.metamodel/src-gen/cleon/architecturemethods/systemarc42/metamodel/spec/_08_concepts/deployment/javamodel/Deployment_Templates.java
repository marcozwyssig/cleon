package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Deployment_Templates extends DynamicResource implements IDeployment_Templates {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeployment_Templates> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeployment_Templates>() {
    
    @Override
    public IDeployment_Templates create() {
      return new Deployment_Templates();
    }
    
    @Override
    public IDeployment_Templates create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Deployment_Templates(resourceRepository, resource);
    }
  
  };

  public Deployment_Templates() {
    super(IDeployment_Templates.TYPE_ID);
  }
  
  public Deployment_Templates(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeployment_Templates.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeployement_Template> selectDeployement_Template() {
    return _getList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeployement_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.Deployment_aE_Templates_deployement_aE_Template);
  }

  public Deployment_Templates setDeployement_Template(java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeployement_Template> deployement_Template) {
    _setList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.Deployment_aE_Templates_deployement_aE_Template, deployement_Template);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Deployment_Templates setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeployement_Template.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.Deployment_aE_Templates_deployement_aE_Template, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeployment_Templates selectToMeDeployement_Template(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeployement_Template object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.javamodel.IDeployment_Templates.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.deployment.DeploymentPackage.Deployment_aE_Templates_deployement_aE_Template, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d034279f-7ff7-11ea-bf96-319d59e08cdb,oM0p8cpD92fROOBItGzIx7eebBk=] */
