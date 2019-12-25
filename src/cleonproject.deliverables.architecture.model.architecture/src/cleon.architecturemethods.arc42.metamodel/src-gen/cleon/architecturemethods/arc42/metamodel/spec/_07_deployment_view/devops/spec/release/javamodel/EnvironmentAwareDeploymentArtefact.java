package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnvironmentAwareDeploymentArtefact extends DynamicResource implements IEnvironmentAwareDeploymentArtefact {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnvironmentAwareDeploymentArtefact> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnvironmentAwareDeploymentArtefact>() {
    
    @Override
    public IEnvironmentAwareDeploymentArtefact create() {
      return new EnvironmentAwareDeploymentArtefact();
    }
    
    @Override
    public IEnvironmentAwareDeploymentArtefact create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnvironmentAwareDeploymentArtefact(resourceRepository, resource);
    }
  
  };

  public EnvironmentAwareDeploymentArtefact() {
    super(IEnvironmentAwareDeploymentArtefact.TYPE_ID);
  }
  
  public EnvironmentAwareDeploymentArtefact(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnvironmentAwareDeploymentArtefact.TYPE_ID);
  }

  // relations
  
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IDeploymentArtefact> selectDeploymentArtefacts() {
    return _getMultiMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.HasDeploymentArtefact_deploymentArtefacts);
  }

  public EnvironmentAwareDeploymentArtefact setDeploymentArtefacts(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IDeploymentArtefact> deploymentArtefacts) {
    _setMultiMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.HasDeploymentArtefact_deploymentArtefacts, deploymentArtefacts);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IEnvironment selectEnvironment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.EnvironmentAwareDeploymentArtefact_environment);
  }

  public EnvironmentAwareDeploymentArtefact setEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IEnvironment environment) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.EnvironmentAwareDeploymentArtefact_environment, environment);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public EnvironmentAwareDeploymentArtefact setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnvironmentAwareDeploymentArtefact setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMultiMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.HasDeploymentArtefact_deploymentArtefacts, visitor);
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.EnvironmentAwareDeploymentArtefact_environment, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IEnvironmentAwareDeploymentArtefact> selectToMeEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.deploy.javamodel.IEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IEnvironmentAwareDeploymentArtefact.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.EnvironmentAwareDeploymentArtefact_environment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,35611355-4507-11e5-84bb-b76bc2368798,NnBu21n1pqEbMONEy2/QMFr34hw=] */
