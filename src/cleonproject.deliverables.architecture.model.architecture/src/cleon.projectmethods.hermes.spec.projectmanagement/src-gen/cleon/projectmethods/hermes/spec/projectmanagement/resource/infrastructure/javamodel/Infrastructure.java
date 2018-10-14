package cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Infrastructure extends DynamicResource implements IInfrastructure {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructure> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IInfrastructure>() {
    
    @Override
    public IInfrastructure create() {
      return new Infrastructure();
    }
    
    @Override
    public IInfrastructure create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Infrastructure(resourceRepository, resource);
    }
  
  };

  public Infrastructure() {
    super(IInfrastructure.TYPE_ID);
  }
  
  public Infrastructure(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IInfrastructure.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel.IAsset> selectAssets() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel.IAsset.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.InfrastructurePackage.HasAssets_assets);
  }

  public Infrastructure setAssets(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel.IAsset> assets) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.InfrastructurePackage.HasAssets_assets, assets);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Infrastructure setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.javamodel.IAsset.class, cleon.projectmethods.hermes.spec.projectmanagement.resource.infrastructure.InfrastructurePackage.HasAssets_assets, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5dd75f3f-c768-11e5-b3f9-43c5a0896ea1,vkyXxvA8GyEb3Dhe6NYETh8vDTI=] */
