package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Deploy extends DynamicResource implements IDeploy {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploy> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeploy>() {
    
    @Override
    public IDeploy create() {
      return new Deploy();
    }
    
    @Override
    public IDeploy create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Deploy(resourceRepository, resource);
    }
  
  };

  public Deploy() {
    super(IDeploy.TYPE_ID);
  }
  
  public Deploy(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeploy.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IEnvironment> selectEnvironments() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.DeployPackage.Deploy_environments);
  }

  public Deploy setEnvironments(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IEnvironment> environments) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.DeployPackage.Deploy_environments, environments);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Deploy setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.DeployPackage.Deploy_environments, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IDeploy> selectToMeEnvironments(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IDeploy.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.DeployPackage.Deploy_environments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e7d700a-406f-11e5-b5f0-5b1ce9c3de3e,fLU7GaVf/G4fdCHKTxbMZG3DV+g=] */
