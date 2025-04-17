package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localrepo.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Repo extends DynamicResource implements IRepo {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepo> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRepo>() {
    
    @Override
    public IRepo create() {
      return new Repo();
    }
    
    @Override
    public IRepo create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Repo(resourceRepository, resource);
    }
  
  };

  public Repo() {
    super(IRepo.TYPE_ID);
  }
  
  public Repo(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRepo.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectProviderName() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localrepo.Win_polycom_localrepoPackage.Repo_providerName);
  }
    
  public void setProviderName(java.lang.String providerName) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localrepo.Win_polycom_localrepoPackage.Repo_providerName, providerName);
  }

  @Override
  public java.lang.String selectSourceLocation() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localrepo.Win_polycom_localrepoPackage.Repo_sourceLocation);
  }
    
  public void setSourceLocation(java.lang.String sourceLocation) {
     _setSingleAttribute(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localrepo.Win_polycom_localrepoPackage.Repo_sourceLocation, sourceLocation);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Repo setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localrepo.Win_polycom_localrepoPackage.Repo_providerName, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_localrepo.Win_polycom_localrepoPackage.Repo_sourceLocation, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,188065f8-1b65-11f0-9c3a-8502b2fb88fb,qVgHwZn4fzTxFljLzEDT+4oEAfA=] */
