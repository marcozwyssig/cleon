package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Memory extends DynamicResource implements IMemory {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMemory> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMemory>() {
    
    @Override
    public IMemory create() {
      return new Memory();
    }
    
    @Override
    public IMemory create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Memory(resourceRepository, resource);
    }
  
  };

  public Memory() {
    super(IMemory.TYPE_ID);
  }
  
  public Memory(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMemory.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectSizeGB() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.Memory_sizeGB);
  }
    
  public void setSizeGB(java.lang.Integer sizeGB) {
     _setSingleAttribute(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.Memory_sizeGB, sizeGB);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Memory setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.BuildingblockPackage.Memory_sizeGB, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,46fa8bd7-2b00-11e9-9692-65766bc2daa5,rk3/dacTlddM78HicA5ndx7QA/A=] */
