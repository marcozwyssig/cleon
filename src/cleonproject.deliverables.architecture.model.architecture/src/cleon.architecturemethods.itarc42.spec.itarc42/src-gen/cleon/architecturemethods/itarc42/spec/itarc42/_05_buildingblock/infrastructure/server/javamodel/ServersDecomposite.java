package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServersDecomposite extends DynamicResource implements IServersDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServersDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServersDecomposite>() {
    
    @Override
    public IServersDecomposite create() {
      return new ServersDecomposite();
    }
    
    @Override
    public IServersDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServersDecomposite(resourceRepository, resource);
    }
  
  };

  public ServersDecomposite() {
    super(IServersDecomposite.TYPE_ID);
  }
  
  public ServersDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServersDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public ServersDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public ServersDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServers selectIntoServers() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServers.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.ServerPackage.ServersDecomposite_intoServers);
  }

  public ServersDecomposite setIntoServers(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServers intoServers) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.ServerPackage.ServersDecomposite_intoServers, intoServers);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServersDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServers.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.ServerPackage.ServersDecomposite_intoServers, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServersDecomposite selectToMeIntoServers(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServers object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServersDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.ServerPackage.ServersDecomposite_intoServers, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0bcbb0d0-d0b0-11e8-b005-f7630e4c29c0,aup5h7ceKIJfVFiNKTZeLUweAzY=] */
