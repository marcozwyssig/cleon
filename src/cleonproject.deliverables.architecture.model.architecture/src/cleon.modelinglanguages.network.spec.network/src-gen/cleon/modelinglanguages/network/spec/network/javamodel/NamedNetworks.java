package cleon.modelinglanguages.network.spec.network.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NamedNetworks extends DynamicResource implements INamedNetworks {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedNetworks> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INamedNetworks>() {
    
    @Override
    public INamedNetworks create() {
      return new NamedNetworks();
    }
    
    @Override
    public INamedNetworks create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NamedNetworks(resourceRepository, resource);
    }
  
  };

  public NamedNetworks() {
    super(INamedNetworks.TYPE_ID);
  }
  
  public NamedNetworks(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INamedNetworks.TYPE_ID);
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
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.INamedNetwork> selectNetworks() {
    return _getList(cleon.modelinglanguages.network.spec.network.javamodel.INamedNetwork.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.NamedNetworks_networks);
  }

  public NamedNetworks setNetworks(java.util.List<? extends cleon.modelinglanguages.network.spec.network.javamodel.INamedNetwork> networks) {
    _setList(cleon.modelinglanguages.network.spec.network.NetworkPackage.NamedNetworks_networks, networks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NamedNetworks setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.spec.network.javamodel.INamedNetwork.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.NamedNetworks_networks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.network.spec.network.javamodel.INamedNetworks selectToMeNetworks(cleon.modelinglanguages.network.spec.network.javamodel.INamedNetwork object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.spec.network.javamodel.INamedNetworks.class, cleon.modelinglanguages.network.spec.network.NetworkPackage.NamedNetworks_networks, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1a8c5420-054f-11e9-b814-a133e521728c,TnldHLBV3cpnv4EVoP3KjXcVZnM=] */
