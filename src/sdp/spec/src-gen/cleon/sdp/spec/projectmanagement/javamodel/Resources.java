package cleon.sdp.spec.projectmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Resources extends DynamicResource implements IResources {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResources> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResources>() {
    
    @Override
    public IResources create() {
      return new Resources();
    }
    
    @Override
    public IResources create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Resources(resourceRepository, resource);
    }
  
  };

  public Resources() {
    super(IResources.TYPE_ID);
  }
  
  public Resources(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResources.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.javamodel.IResource> selectResources() {
    return _getList(cleon.sdp.spec.projectmanagement.javamodel.IResource.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Resources_resources);
  }

  public Resources setResources(java.util.List<? extends cleon.sdp.spec.projectmanagement.javamodel.IResource> resources) {
    _setList(cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Resources_resources, resources);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Resources setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.sdp.spec.projectmanagement.javamodel.IResource.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Resources_resources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sdp.spec.projectmanagement.javamodel.IResources> selectToMeResources(cleon.sdp.spec.projectmanagement.javamodel.IResource object) {
    return _getToMeList(object.getRepository(), cleon.sdp.spec.projectmanagement.javamodel.IResources.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Resources_resources, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,81e4d2c5-ff9e-11e4-ac0a-959b440f987f,wu71ax1s+UZ83fkzbbQWRUiHNkc=] */
