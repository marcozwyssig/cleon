package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServerDecomposite extends DynamicResource implements IServerDecomposite {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServerDecomposite> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServerDecomposite>() {
    
    @Override
    public IServerDecomposite create() {
      return new ServerDecomposite();
    }
    
    @Override
    public IServerDecomposite create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServerDecomposite(resourceRepository, resource);
    }
  
  };

  public ServerDecomposite() {
    super(IServerDecomposite.TYPE_ID);
  }
  
  public ServerDecomposite(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServerDecomposite.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock selectIntoBuildingBlock() {
    return _getSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock);
  }

  public ServerDecomposite setIntoBuildingBlock(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock intoBuildingBlock) {
    _setSingle(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, intoBuildingBlock);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent selectIntoComponent() {
    return _getSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent);
  }

  public ServerDecomposite setIntoComponent(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent intoComponent) {
    _setSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, intoComponent);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServer selectIntoServer() {
    return _getSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServer.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.ServerPackage.ServerDecomposite_intoServer);
  }

  public ServerDecomposite setIntoServer(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServer intoServer) {
    _setSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.ServerPackage.ServerDecomposite_intoServer, intoServer);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServerDecomposite setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.modularity.spec.buildingblock.javamodel.IBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.AggregateDecomposite_intoBuildingBlock, visitor);
    _acceptSingle(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IAbstractComponent.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentCompositionDecomposite_intoComponent, visitor);
    _acceptSingle(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServer.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.ServerPackage.ServerDecomposite_intoServer, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServerDecomposite selectToMeIntoServer(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServer object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.javamodel.IServerDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.infrastructure.server.ServerPackage.ServerDecomposite_intoServer, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0bcbb0b5-d0b0-11e8-b005-f7630e4c29c0,AufuRGFD0PNj6ul6XIfZBchNNkY=] */
