package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IPv4_B extends DynamicResource implements IIPv4_B {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4_B> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4_B>() {
    
    @Override
    public IIPv4_B create() {
      return new IPv4_B();
    }
    
    @Override
    public IIPv4_B create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IPv4_B(resourceRepository, resource);
    }
  
  };

  public IPv4_B() {
    super(IIPv4_B.TYPE_ID);
  }
  
  public IPv4_B(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIPv4_B.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIp() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.AbstractIPv4_ip);
  }
    
  public void setIp(java.lang.Integer ip) {
     _setSingleAttribute(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.AbstractIPv4_ip, ip);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C> selectIPv4_C() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_B_iPv4_aE_C);
  }

  public IPv4_B setIPv4_C(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C> iPv4_C) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_B_iPv4_aE_C, iPv4_C);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IPv4_B setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.AbstractIPv4_ip, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_B_iPv4_aE_C, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B selectToMeIPv4_C(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_C object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_B_iPv4_aE_C, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3f5e9f75-71ac-11e9-98e0-2719d32d2629,HpQIjMf06x4YVJQc5FVBmCzRuMo=] */
