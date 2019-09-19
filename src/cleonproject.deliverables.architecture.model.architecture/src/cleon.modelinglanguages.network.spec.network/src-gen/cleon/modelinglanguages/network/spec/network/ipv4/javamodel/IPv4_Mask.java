package cleon.modelinglanguages.network.spec.network.ipv4.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IPv4_Mask extends DynamicResource implements IIPv4_Mask {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4_Mask> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4_Mask>() {
    
    @Override
    public IIPv4_Mask create() {
      return new IPv4_Mask();
    }
    
    @Override
    public IIPv4_Mask create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IPv4_Mask(resourceRepository, resource);
    }
  
  };

  public IPv4_Mask() {
    super(IIPv4_Mask.TYPE_ID);
  }
  
  public IPv4_Mask(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIPv4_Mask.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectIPv4() {
    return _getSingleAttribute(java.lang.String.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Address_aE_Aware_iPv4);
  }
    
  public void setIPv4(java.lang.String iPv4) {
     _setSingleAttribute(cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Address_aE_Aware_iPv4, iPv4);
  }

  @Override
  public java.util.List<java.lang.String> selectIPv4s() {
    return _getListAttribute(java.lang.String.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Addresses_aE_Aware_iPv4s);
  }
    
  public void setIPv4s(java.util.List<java.lang.String> iPv4s) {
     _setListAttribute(cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Addresses_aE_Aware_iPv4s, iPv4s);
  }

  @Override
  public java.lang.Integer selectMask() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Mask_mask);
  }
    
  public void setMask(java.lang.Integer mask) {
     _setSingleAttribute(cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Mask_mask, mask);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IPv4_Mask setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Address_aE_Aware_iPv4, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_Mask_mask, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,621bbad2-0932-11e9-8c40-11db3668c0c9,wRkPv8avwAw33m9z/0eVIz+CbUY=] */
