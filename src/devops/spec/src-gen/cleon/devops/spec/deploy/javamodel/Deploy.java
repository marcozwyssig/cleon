package cleon.devops.spec.deploy.javamodel;

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
  public java.util.List<? extends cleon.devops.spec.deploy.javamodel.IEnvironment> selectEnvironments() {
    return _getList(cleon.devops.spec.deploy.javamodel.IEnvironment.class, cleon.devops.spec.deploy.DeployPackage.Deploy_environments);
  }

  public Deploy setEnvironments(java.util.List<? extends cleon.devops.spec.deploy.javamodel.IEnvironment> environments) {
    _setList(cleon.devops.spec.deploy.DeployPackage.Deploy_environments, environments);
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.devops.spec.deploy.javamodel.IEnvironment.class, cleon.devops.spec.deploy.DeployPackage.Deploy_environments, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.devops.spec.deploy.javamodel.IDeploy> selectToMeEnvironments(cleon.devops.spec.deploy.javamodel.IEnvironment object) {
    return _getToMeList(object.getRepository(), cleon.devops.spec.deploy.javamodel.IDeploy.class, cleon.devops.spec.deploy.DeployPackage.Deploy_environments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6e7d700a-406f-11e5-b5f0-5b1ce9c3de3e,Aw6S0SWuUlkV6NonNrLPKMToULg=] */
