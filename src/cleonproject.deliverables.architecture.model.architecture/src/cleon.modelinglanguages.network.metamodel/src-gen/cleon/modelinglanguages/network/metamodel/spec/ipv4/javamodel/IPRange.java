package cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class IPRange extends DynamicResource implements IIPRange {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPRange> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IIPRange>() {
    
    @Override
    public IIPRange create() {
      return new IPRange();
    }
    
    @Override
    public IIPRange create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new IPRange(resourceRepository, resource);
    }
  
  };

  public IPRange() {
    super(IIPRange.TYPE_ID);
  }
  
  public IPRange(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IIPRange.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A> selectIPv4_A() {
    return _getList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPRange_iPv4_aE_A);
  }

  public IPRange setIPv4_A(java.util.List<? extends cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A> iPv4_A) {
    _setList(cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPRange_iPv4_aE_A, iPv4_A);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public IPRange setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPRange_iPv4_aE_A, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange selectToMeIPv4_A(cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPv4_A object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.network.metamodel.spec.ipv4.javamodel.IIPRange.class, cleon.modelinglanguages.network.metamodel.spec.ipv4.Ipv4Package.IPRange_iPv4_aE_A, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e345d9f5-71ac-11e9-98e0-2719d32d2629,jGOfvAOK0e2ux1E+i1mWucaUdT0=] */
