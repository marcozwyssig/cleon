package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IPv4_A extends DynamicResource implements IIPv4_A {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4_A> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4_A>() {
    
    @Override
    public IIPv4_A create() {
      return new IPv4_A();
    }
    
    @Override
    public IIPv4_A create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IPv4_A(resourceRepository, resource);
    }
  
  };

  public IPv4_A() {
    super(IIPv4_A.TYPE_ID);
  }
  
  public IPv4_A(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIPv4_A.TYPE_ID);
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
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B> selectIPv4_B() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_A_iPv4_aE_B);
  }

  public IPv4_A setIPv4_B(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B> iPv4_B) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_A_iPv4_aE_B, iPv4_B);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IPv4_A setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.AbstractIPv4_ip, visitor);
    // relations
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_A_iPv4_aE_B, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A selectToMeIPv4_B(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_B object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPv4_aE_A_iPv4_aE_B, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,34d1f845-71ac-11e9-98e0-2719d32d2629,kHWaLZ6wYRLkS3jOLSrYwrsVyAk=] */
