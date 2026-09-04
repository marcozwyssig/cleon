package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VlanRange extends DynamicResource implements IVlanRange {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVlanRange> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVlanRange>() {
    
    @Override
    public IVlanRange create() {
      return new VlanRange();
    }
    
    @Override
    public IVlanRange create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VlanRange(resourceRepository, resource);
    }
  
  };

  public VlanRange() {
    super(IVlanRange.TYPE_ID);
  }
  
  public VlanRange(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVlanRange.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan selectFrom_vlan() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanRange_from_aE_vlan);
  }

  public VlanRange setFrom_vlan(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan from_vlan) {
    _setSingle(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanRange_from_aE_vlan, from_vlan);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan selectTo_vlan() {
    return _getSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanRange_to_aE_vlan);
  }

  public VlanRange setTo_vlan(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan to_vlan) {
    _setSingle(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanRange_to_aE_vlan, to_vlan);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VlanRange setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanRange_from_aE_vlan, visitor);
    _acceptSingle(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanRange_to_aE_vlan, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlanRange selectToMeFrom_vlan(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlanRange.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanRange_from_aE_vlan, object.getResource());
  }
  
  public static cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlanRange selectToMeTo_vlan(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlanRange.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanRange_to_aE_vlan, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7b5e4b55-f756-11ef-9619-857aad3ec118,yvZrjWK7tXUYDW5iDN8dsjsjIf0=] */
