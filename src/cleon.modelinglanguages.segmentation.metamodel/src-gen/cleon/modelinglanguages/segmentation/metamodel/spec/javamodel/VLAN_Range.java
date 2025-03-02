package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VLAN_Range extends DynamicResource implements IVLAN_Range {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVLAN_Range> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVLAN_Range>() {
    
    @Override
    public IVLAN_Range create() {
      return new VLAN_Range();
    }
    
    @Override
    public IVLAN_Range create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VLAN_Range(resourceRepository, resource);
    }
  
  };

  public VLAN_Range() {
    super(IVLAN_Range.TYPE_ID);
  }
  
  public VLAN_Range(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVLAN_Range.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectFrom_vlan() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VLAN_aE_Range_from_aE_vlan);
  }
    
  public void setFrom_vlan(java.lang.Integer from_vlan) {
     _setSingleAttribute(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VLAN_aE_Range_from_aE_vlan, from_vlan);
  }

  @Override
  public java.lang.Integer selectTo_vlan() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VLAN_aE_Range_to_aE_vlan);
  }
    
  public void setTo_vlan(java.lang.Integer to_vlan) {
     _setSingleAttribute(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VLAN_aE_Range_to_aE_vlan, to_vlan);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VLAN_Range setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VLAN_aE_Range_from_aE_vlan, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VLAN_aE_Range_to_aE_vlan, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7b5e4b55-f756-11ef-9619-857aad3ec118,Dvm9AEVl2TAqfboc91y/4dmgURU=] */
