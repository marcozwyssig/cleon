package cleon.modelinglanguages.network.spec.network.javamodel;

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
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.INetwork> selectNetworks() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.INetwork.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.Networks_networks);
  }

  public Networks setNetworks(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.INetwork> networks) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.Networks_networks, networks);
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
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.spec.network.javamodel.INetwork.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.Networks_networks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.network.spec.network.javamodel.INetworks selectToMeNetworks(cleon.modelinglanguages.network.spec.network.javamodel.INetwork object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.spec.network.javamodel.INetworks.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.Networks_networks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1a8c5420-054f-11e9-b814-a133e521728c,qdAF513BHvdjyNIEu0gbc0MTCdw=] */
