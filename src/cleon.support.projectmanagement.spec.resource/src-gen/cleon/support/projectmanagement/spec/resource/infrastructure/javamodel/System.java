package cleon.support.projectmanagement.spec.resource.infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class System extends DynamicResource implements ISystem {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystem>() {
    
    @Override
    public ISystem create() {
      return new System();
    }
    
    @Override
    public ISystem create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new System(resourceRepository, resource);
    }
  
  };

  public System() {
    super(ISystem.TYPE_ID);
  }
  
  public System(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystem.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.support.projectmanagement.spec.resource.infrastructure.javamodel.IAsset> selectAssets() {
    return _getList(cleon.support.projectmanagement.spec.resource.infrastructure.javamodel.IAsset.class, cleon.support.projectmanagement.spec.resource.infrastructure.InfrastructurePackage.HasAssets_assets);
  }

  public System setAssets(java.util.List<? extends cleon.support.projectmanagement.spec.resource.infrastructure.javamodel.IAsset> assets) {
    _setList(cleon.support.projectmanagement.spec.resource.infrastructure.InfrastructurePackage.HasAssets_assets, assets);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public System setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.support.projectmanagement.spec.resource.infrastructure.javamodel.IAsset.class, cleon.support.projectmanagement.spec.resource.infrastructure.InfrastructurePackage.HasAssets_assets, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,bd920ebe-bbd6-11e6-997f-d73ea5a3671c,wP4ezYp+YQ5ZzjhjGDtX27xRCTo=] */
