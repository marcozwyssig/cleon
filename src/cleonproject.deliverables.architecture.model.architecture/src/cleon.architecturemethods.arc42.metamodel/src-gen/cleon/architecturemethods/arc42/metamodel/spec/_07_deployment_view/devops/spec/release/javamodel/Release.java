package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Release extends DynamicResource implements IRelease {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRelease> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRelease>() {
    
    @Override
    public IRelease create() {
      return new Release();
    }
    
    @Override
    public IRelease create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Release(resourceRepository, resource);
    }
  
  };

  public Release() {
    super(IRelease.TYPE_ID);
  }
  
  public Release(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRelease.TYPE_ID);
  }

  // relations
  
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IDeploymentArtefact> selectDeploymentArtefacts() {
    return _getMultiMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.HasDeploymentArtefact_deploymentArtefacts);
  }

  public Release setDeploymentArtefacts(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IDeploymentArtefact> deploymentArtefacts) {
    _setMultiMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.HasDeploymentArtefact_deploymentArtefacts, deploymentArtefacts);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IEnvironmentAwareDeploymentArtefact> selectEnvironmentAwareDeploymentArtefact() {
    return _getMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IEnvironmentAwareDeploymentArtefact.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.Release_environmentAwareDeploymentArtefact);
  }

  public Release setEnvironmentAwareDeploymentArtefact(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IEnvironmentAwareDeploymentArtefact> environmentAwareDeploymentArtefact) {
    _setMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.Release_environmentAwareDeploymentArtefact, environmentAwareDeploymentArtefact);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IPackageRepository> selectPackageRepositories() {
    return _getList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IPackageRepository.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.Release_packageRepositories);
  }

  public Release setPackageRepositories(java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IPackageRepository> packageRepositories) {
    _setList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.Release_packageRepositories, packageRepositories);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Release setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMultiMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IDeploymentArtefact.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.HasDeploymentArtefact_deploymentArtefacts, visitor);
    _acceptMap(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IEnvironmentAwareDeploymentArtefact.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.Release_environmentAwareDeploymentArtefact, visitor);
    _acceptList(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IPackageRepository.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.Release_packageRepositories, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IRelease> selectToMePackageRepositories(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IPackageRepository object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IRelease.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.Release_packageRepositories, object.getResource());
  }
  
  public static cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IRelease selectToMeEnvironmentAwareDeploymentArtefact(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IEnvironmentAwareDeploymentArtefact object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.javamodel.IRelease.class, cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.devops.spec.release.ReleasePackage.Release_environmentAwareDeploymentArtefact, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d7db465a-406e-11e5-b5f0-5b1ce9c3de3e,W0HhHxnTMFULmINf+kFTQ4yN0uU=] */
