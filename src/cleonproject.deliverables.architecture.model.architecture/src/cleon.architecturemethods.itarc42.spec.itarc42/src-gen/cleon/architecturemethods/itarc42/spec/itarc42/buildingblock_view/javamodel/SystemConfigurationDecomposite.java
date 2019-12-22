package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemConfigurationDecomposite extends DynamicResource implements ISystemConfigurationDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemConfigurationDecomposite>() {
    
    @Override
    public ISystemConfigurationDecomposite create() {
      return new SystemConfigurationDecomposite();
    }
    
    @Override
    public ISystemConfigurationDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemConfigurationDecomposite(resourceRepository, resource);
    }
  
  };

  public SystemConfigurationDecomposite() {
    super(ISystemConfigurationDecomposite.TYPE_ID);
  }
  
  public SystemConfigurationDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemConfigurationDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public SystemConfigurationDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public SystemConfigurationDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration selectIntoSystemConfiguration() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.SystemConfigurationDecomposite_intoSystemConfiguration);
  }

  public SystemConfigurationDecomposite setIntoSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration intoSystemConfiguration) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.SystemConfigurationDecomposite_intoSystemConfiguration, intoSystemConfiguration);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemConfigurationDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.SystemConfigurationDecomposite_intoSystemConfiguration, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfigurationDecomposite selectToMeIntoSystemConfiguration(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemConfigurationDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.Buildingblock_viewPackage.SystemConfigurationDecomposite_intoSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c90907aa-e0fd-11e8-8499-a3b0fb3cad90,Xo8Bwxmi/bltUEXjbKhkBZYLdw4=] */
