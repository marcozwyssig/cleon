package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class HasAssets extends DynamicResource implements IHasAssets {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHasAssets> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IHasAssets>() {
    
    @Override
    public IHasAssets create() {
      return new HasAssets();
    }
    
    @Override
    public IHasAssets create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new HasAssets(resourceRepository, resource);
    }
  
  };

  public HasAssets() {
    super(IHasAssets.TYPE_ID);
  }
  
  public HasAssets(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IHasAssets.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.IAsset> selectAssets() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.IAsset.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.InfrastructurePackage.HasAssets_assets);
  }

  public HasAssets setAssets(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.IAsset> assets) {
    _setList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.InfrastructurePackage.HasAssets_assets, assets);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public HasAssets setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.IAsset.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.InfrastructurePackage.HasAssets_assets, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.IHasAssets selectToMeAssets(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.IAsset object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.IHasAssets.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.InfrastructurePackage.HasAssets_assets, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c80d50de-bbd6-11e6-997f-d73ea5a3671c,rtHA5pZZ4puFfnDQhwIsadWmMhw=] */
