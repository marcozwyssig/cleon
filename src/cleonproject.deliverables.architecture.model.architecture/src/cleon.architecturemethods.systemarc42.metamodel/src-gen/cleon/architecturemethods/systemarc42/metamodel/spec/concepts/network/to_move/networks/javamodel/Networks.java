package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Networks extends DynamicResource implements INetworks {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworks> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INetworks>() {
    
    @Override
    public INetworks create() {
      return new Networks();
    }
    
    @Override
    public INetworks create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Networks(resourceRepository, resource);
    }
  
  };

  public Networks() {
    super(INetworks.TYPE_ID);
  }
  
  public Networks(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INetworks.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.javamodel.INetworkEnvironment> selectNetworkEnvironment() {
    return _getMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.javamodel.INetworkEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.NetworksPackage.Networks_networkEnvironment);
  }

  public Networks setNetworkEnvironment(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.javamodel.INetworkEnvironment> networkEnvironment) {
    _setMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.NetworksPackage.Networks_networkEnvironment, networkEnvironment);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Networks setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptMap(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.javamodel.INetworkEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.NetworksPackage.Networks_networkEnvironment, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.javamodel.INetworks selectToMeNetworkEnvironment(cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.javamodel.INetworkEnvironment object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.javamodel.INetworks.class, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.network.to_move.networks.NetworksPackage.Networks_networkEnvironment, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6cb1ff32-9289-11e9-959e-8115c2f9e41e,9lPNyr1EzA4s2+JurDz+vG2gDQ4=] */
