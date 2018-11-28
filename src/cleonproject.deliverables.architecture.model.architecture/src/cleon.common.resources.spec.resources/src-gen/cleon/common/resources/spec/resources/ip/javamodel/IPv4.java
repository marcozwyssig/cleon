package cleon.common.resources.spec.resources.ip.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IPv4 extends DynamicResource implements IIPv4 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPv4>() {
    
    @Override
    public IIPv4 create() {
      return new IPv4();
    }
    
    @Override
    public IIPv4 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IPv4(resourceRepository, resource);
    }
  
  };

  public IPv4() {
    super(IIPv4.TYPE_ID);
  }
  
  public IPv4(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIPv4.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectA() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_a);
  }
    
  public void setA(java.lang.Integer a) {
     _setSingleAttribute(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_a, a);
  }

  @Override
  public java.lang.Integer selectB() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_b);
  }
    
  public void setB(java.lang.Integer b) {
     _setSingleAttribute(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_b, b);
  }

  @Override
  public java.lang.Integer selectC() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_c);
  }
    
  public void setC(java.lang.Integer c) {
     _setSingleAttribute(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_c, c);
  }

  @Override
  public java.lang.Integer selectD() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_d);
  }
    
  public void setD(java.lang.Integer d) {
     _setSingleAttribute(cleon.common.resources.spec.resources.ip.IpPackage.IPv4_d, d);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IPv4 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_a, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_b, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_c, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.common.resources.spec.resources.ip.IpPackage.IPv4_d, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,68345145-eab1-11e8-88d3-bfc6b992bdec,QA9Athg3mQRkR78Gg+H+Io9JdFE=] */
