package cleon.devops.spec.release.javamodel;

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
  public java.util.List<? extends cleon.devops.spec.release.javamodel.IPackage> selectDeploymentArtefacts() {
    return _getList(cleon.devops.spec.release.javamodel.IPackage.class, cleon.devops.spec.release.ReleasePackage.Release_deploymentArtefacts);
  }

  public Release setDeploymentArtefacts(java.util.List<? extends cleon.devops.spec.release.javamodel.IPackage> deploymentArtefacts) {
    _setList(cleon.devops.spec.release.ReleasePackage.Release_deploymentArtefacts, deploymentArtefacts);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.devops.spec.release.javamodel.IPackageRepository> selectPackageRepositories() {
    return _getList(cleon.devops.spec.release.javamodel.IPackageRepository.class, cleon.devops.spec.release.ReleasePackage.Release_packageRepositories);
  }

  public Release setPackageRepositories(java.util.List<? extends cleon.devops.spec.release.javamodel.IPackageRepository> packageRepositories) {
    _setList(cleon.devops.spec.release.ReleasePackage.Release_packageRepositories, packageRepositories);
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.devops.spec.release.javamodel.IPackage.class, cleon.devops.spec.release.ReleasePackage.Release_deploymentArtefacts, visitor);
    _acceptList(cleon.devops.spec.release.javamodel.IPackageRepository.class, cleon.devops.spec.release.ReleasePackage.Release_packageRepositories, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.devops.spec.release.javamodel.IRelease> selectToMeDeploymentArtefacts(cleon.devops.spec.release.javamodel.IPackage object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.release.javamodel.IRelease.class, cleon.devops.spec.release.ReleasePackage.Release_deploymentArtefacts, object.getResource());
  }
  
  public static java.util.List<cleon.devops.spec.release.javamodel.IRelease> selectToMePackageRepositories(cleon.devops.spec.release.javamodel.IPackageRepository object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.release.javamodel.IRelease.class, cleon.devops.spec.release.ReleasePackage.Release_packageRepositories, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d7db465a-406e-11e5-b5f0-5b1ce9c3de3e,mbhJwAKG2zhP1XnkFHUf7BppIRM=] */
