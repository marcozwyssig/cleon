package cleon.modelinglanguages.network.spec.network.ipv4.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IPv4_C extends DynamicResource implements IIPv4_C {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4_C> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4_C>() {
    
    @Override
    public IIPv4_C create() {
      return new IPv4_C();
    }
    
    @Override
    public IIPv4_C create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IPv4_C(resourceRepository, resource);
    }
  
  };

  public IPv4_C() {
    super(IIPv4_C.TYPE_ID);
  }
  
  public IPv4_C(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIPv4_C.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectIp() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.AbstractIPv4_ip);
  }
    
  public void setIp(java.lang.Integer ip) {
     _setSingleAttribute(cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.AbstractIPv4_ip, ip);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_D> selectIPv4_D() {
    return _getList(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_C_iPv4_aE_D);
  }

  public IPv4_C setIPv4_D(java.util.List<? extends cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_D> iPv4_D) {
    _setList(cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_C_iPv4_aE_D, iPv4_D);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IPv4_C setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.AbstractIPv4_ip, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_D.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_C_iPv4_aE_D, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_C selectToMeIPv4_D(cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_D object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.spec.network.ipv4.javamodel.IIPv4_C.class, cleon.modelinglanguages.network.spec.network.ipv4.Ipv4Package.IPv4_aE_C_iPv4_aE_D, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b34d6541-71af-11e9-98e0-2719d32d2629,iD3oSvbJQUMIhLzGvnmHD2H2nWE=] */
