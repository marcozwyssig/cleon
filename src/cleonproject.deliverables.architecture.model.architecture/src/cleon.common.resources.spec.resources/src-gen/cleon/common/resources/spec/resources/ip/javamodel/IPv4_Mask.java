package cleon.common.resources.spec.resources.ip.javamodel;

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
  public java.lang.Integer selectMask() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Mask_mask);
  }
    
  public void setMask(java.lang.Integer mask) {
     _setSingleAttribute(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Mask_mask, mask);
  }

  // relations
  
  @Override
  public cleon.common.resources.spec.resources.ip.javamodel.IIPv4 selectIPv4() {
    return _getSingle(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Address_aE_Aware_iPv4);
  }

  public IPv4_Mask setIPv4(cleon.common.resources.spec.resources.ip.javamodel.IIPv4 iPv4) {
    _setSingle(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Address_aE_Aware_iPv4, iPv4);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.resources.spec.resources.ip.javamodel.IIPv4> selectIPv4s() {
    return _getList(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s);
  }

  public IPv4_Mask setIPv4s(java.util.List<? extends cleon.common.resources.spec.resources.ip.javamodel.IIPv4> iPv4s) {
    _setList(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s, iPv4s);
    return this;
  }
    
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
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Mask_mask, visitor);
    // relations
    _acceptSingle(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Address_aE_Aware_iPv4, visitor);
    _acceptList(cleon.common.resources.spec.resources.ip.javamodel.IIPv4.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_aE_Addresses_aE_Aware_iPv4s, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,621bbad2-0932-11e9-8c40-11db3668c0c9,GpZvxvNSWpUpZCmsCbuGHfJRIao=] */
