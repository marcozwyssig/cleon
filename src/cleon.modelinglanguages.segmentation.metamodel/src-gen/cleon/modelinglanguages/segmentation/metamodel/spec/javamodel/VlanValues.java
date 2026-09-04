package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class VlanValues extends DynamicResource implements IVlanValues {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVlanValues> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IVlanValues>() {
    
    @Override
    public IVlanValues create() {
      return new VlanValues();
    }
    
    @Override
    public IVlanValues create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new VlanValues(resourceRepository, resource);
    }
  
  };

  public VlanValues() {
    super(IVlanValues.TYPE_ID);
  }
  
  public VlanValues(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IVlanValues.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public VlanValues setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan> selectVlans() {
    return _getList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanValues_vlans);
  }

  public VlanValues setVlans(java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan> vlans) {
    _setList(cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanValues_vlans, vlans);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptList(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanValues_vlans, visitor);
  }

  // toMeRelations
  
  public static cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlanValues selectToMeVlans(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlanValues.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.VlanValues_vlans, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7427faeb-f756-11ef-9619-857aad3ec118,hRAJHCVYT3RWDAAiUpwbFuwO+z0=] */
