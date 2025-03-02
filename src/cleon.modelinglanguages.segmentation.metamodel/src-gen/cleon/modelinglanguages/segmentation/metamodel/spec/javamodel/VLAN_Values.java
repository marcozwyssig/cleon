package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VLAN_Values extends DynamicResource implements IVLAN_Values {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVLAN_Values> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVLAN_Values>() {
    
    @Override
    public IVLAN_Values create() {
      return new VLAN_Values();
    }
    
    @Override
    public IVLAN_Values create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VLAN_Values(resourceRepository, resource);
    }
  
  };

  public VLAN_Values() {
    super(IVLAN_Values.TYPE_ID);
  }
  
  public VLAN_Values(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVLAN_Values.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.Integer> selectVlan() {
    return _getListAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VLAN_aE_Values_vlan);
  }
    
  public void setVlan(java.util.List<java.lang.Integer> vlan) {
     _setListAttribute(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VLAN_aE_Values_vlan, vlan);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VLAN_Values setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.Integer.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VLAN_aE_Values_vlan, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7427faeb-f756-11ef-9619-857aad3ec118,4nhV30RQyijOryfXe+QA/OrRrNo=] */
