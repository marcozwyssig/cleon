package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Vlan extends DynamicResource implements IVlan {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVlan> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVlan>() {
    
    @Override
    public IVlan create() {
      return new Vlan();
    }
    
    @Override
    public IVlan create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Vlan(resourceRepository, resource);
    }
  
  };

  public Vlan() {
    super(IVlan.TYPE_ID);
  }
  
  public Vlan(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVlan.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectVlan_no() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Vlan_vlan_aE_no);
  }
    
  public void setVlan_no(java.lang.Integer vlan_no) {
     _setSingleAttribute(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Vlan_vlan_aE_no, vlan_no);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Vlan setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.Vlan_vlan_aE_no, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,455796a7-f75a-11ef-9619-857aad3ec118,iiQni6CaQuRhb4+h7m0p7v1SXo8=] */
