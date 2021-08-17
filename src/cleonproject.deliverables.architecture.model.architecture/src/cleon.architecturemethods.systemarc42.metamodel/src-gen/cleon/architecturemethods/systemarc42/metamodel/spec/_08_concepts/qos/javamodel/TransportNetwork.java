package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TransportNetwork extends DynamicResource implements ITransportNetwork {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITransportNetwork> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITransportNetwork>() {
    
    @Override
    public ITransportNetwork create() {
      return new TransportNetwork();
    }
    
    @Override
    public ITransportNetwork create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TransportNetwork(resourceRepository, resource);
    }
  
  };

  public TransportNetwork() {
    super(ITransportNetwork.TYPE_ID);
  }
  
  public TransportNetwork(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITransportNetwork.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectCapacity_aE__aA_KBit_aE_s_aC_() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.TransportNetwork_capacity_aE__aA_KBit_aE_s_aC_);
  }
    
  public void setCapacity_aE__aA_KBit_aE_s_aC_(java.lang.Integer capacity_aE__aA_KBit_aE_s_aC_) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.TransportNetwork_capacity_aE__aA_KBit_aE_s_aC_, capacity_aE__aA_KBit_aE_s_aC_);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TransportNetwork setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.qos.QosPackage.TransportNetwork_capacity_aE__aA_KBit_aE_s_aC_, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d1cad952-fe9b-11eb-bbec-6b945b7259b1,sPR8iboYVW4YJe9SbAzamJTm658=] */
