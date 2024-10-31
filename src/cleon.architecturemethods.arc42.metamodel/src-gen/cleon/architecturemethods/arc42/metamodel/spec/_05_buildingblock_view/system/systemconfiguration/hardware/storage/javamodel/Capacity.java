package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Capacity extends DynamicResource implements ICapacity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICapacity>() {
    
    @Override
    public ICapacity create() {
      return new Capacity();
    }
    
    @Override
    public ICapacity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Capacity(resourceRepository, resource);
    }
  
  };

  public Capacity() {
    super(ICapacity.TYPE_ID);
  }
  
  public Capacity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICapacity.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Double selectBrutto_aE__aA_GB_aC_() {
    return _getSingleAttribute(java.lang.Double.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.StoragePackage.Capacity_brutto_aE__aA_GB_aC_);
  }
    
  public void setBrutto_aE__aA_GB_aC_(java.lang.Double brutto_aE__aA_GB_aC_) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.StoragePackage.Capacity_brutto_aE__aA_GB_aC_, brutto_aE__aA_GB_aC_);
  }

  @Override
  public java.lang.Double selectDeduplication_rate() {
    return _getSingleAttribute(java.lang.Double.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.StoragePackage.Capacity_deduplication_aE_rate);
  }
    
  public void setDeduplication_rate(java.lang.Double deduplication_rate) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.StoragePackage.Capacity_deduplication_aE_rate, deduplication_rate);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Capacity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Double.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.StoragePackage.Capacity_brutto_aE__aA_GB_aC_, visitor);
    _acceptSingleAttribute(java.lang.Double.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.storage.StoragePackage.Capacity_deduplication_aE_rate, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7e4b59e1-8c7d-11eb-a9c0-c3b95abf3470,OGQVWiui3Ht1cydFNhmLFdGFy7o=] */
