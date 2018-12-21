package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemLayer extends DynamicResource implements ISystemLayer {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemLayer> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemLayer>() {
    
    @Override
    public ISystemLayer create() {
      return new SystemLayer();
    }
    
    @Override
    public ISystemLayer create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemLayer(resourceRepository, resource);
    }
  
  };

  public SystemLayer() {
    super(ISystemLayer.TYPE_ID);
  }
  
  public SystemLayer(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemLayer.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> selectDecompose() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose);
  }

  public SystemLayer setDecompose(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite> decompose) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, decompose);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> selectDecomposeComponent() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent);
  }

  public SystemLayer setDecomposeComponent(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite> decomposeComponent) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, decomposeComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDecomposite> selectDecomposeSystemComponent() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemLayer_decomposeSystemComponent);
  }

  public SystemLayer setDecomposeSystemComponent(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDecomposite> decomposeSystemComponent) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemLayer_decomposeSystemComponent, decomposeSystemComponent);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemLayerDependency> selectHasDependency() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemLayerDependency.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemLayer_hasDependency);
  }

  public SystemLayer setHasDependency(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemLayerDependency> hasDependency) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemLayer_hasDependency, hasDependency);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IInteraction> selectInteracts() {
    return _getList(cleon.common.modularity.spec.buildingblock.javamodel.IInteraction.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.InteractiveBuildingBlock_interacts);
  }

  public SystemLayer setInteracts(java.util.List<? extends cleon.common.modularity.spec.buildingblock.javamodel.IInteraction> interacts) {
    _setList(cleon.common.modularity.spec.buildingblock.BuildingblockPackage.InteractiveBuildingBlock_interacts, interacts);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required> selectPorts_In() {
    return _getMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In);
  }

  public SystemLayer setPorts_In(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required> ports_In) {
    _setMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, ports_In);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider> selectPorts_Out() {
    return _getList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out);
  }

  public SystemLayer setPorts_Out(java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider> ports_Out) {
    _setList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, ports_Out);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemLayer setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.common.modularity.spec.buildingblock.javamodel.IDecomposite.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.IComponentCompositionDecomposite.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.ComponentComposition_decomposeComponent, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDecomposite.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemLayer_decomposeSystemComponent, visitor);
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemLayerDependency.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemLayer_hasDependency, visitor);
    _acceptList(cleon.common.modularity.spec.buildingblock.javamodel.IInteraction.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.InteractiveBuildingBlock_interacts, visitor);
    _acceptMultiMap(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Required.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_In, visitor);
    _acceptList(cleon.modelinglanguages.uml.spec.uml2.structural.components.ports.javamodel.IPort_Provider.class, cleon.modelinglanguages.uml.spec.uml2.structural.components.ComponentsPackage.AbstractComponent_ports_aE_Out, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemLayer selectToMeDecomposeSystemComponent(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemComponentDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemLayer.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemLayer_decomposeSystemComponent, object.getResource());
  }
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemLayer selectToMeHasDependency(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemLayerDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock.javamodel.ISystemLayer.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock._05_buildingblockPackage.SystemLayer_hasDependency, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b894901a-d0b2-11e8-b005-f7630e4c29c0,SgfLh/60chaWYh84czzdHyt4vqs=] */
