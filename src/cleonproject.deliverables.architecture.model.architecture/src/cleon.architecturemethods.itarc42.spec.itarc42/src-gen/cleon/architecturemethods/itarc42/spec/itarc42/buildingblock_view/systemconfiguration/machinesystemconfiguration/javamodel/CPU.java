package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class CPU extends DynamicResource implements ICPU {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICPU> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICPU>() {
    
    @Override
    public ICPU create() {
      return new CPU();
    }
    
    @Override
    public ICPU create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new CPU(resourceRepository, resource);
    }
  
  };

  public CPU() {
    super(ICPU.TYPE_ID);
  }
  
  public CPU(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICPU.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectAmount() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.MachinesystemconfigurationPackage.Processor_amount);
  }
    
  public void setAmount(java.lang.Integer amount) {
     _setSingleAttribute(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.MachinesystemconfigurationPackage.Processor_amount, amount);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.ICore> selectCores() {
    return _getList(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.ICore.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.MachinesystemconfigurationPackage.CPU_cores);
  }

  public CPU setCores(java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.ICore> cores) {
    _setList(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.MachinesystemconfigurationPackage.CPU_cores, cores);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public CPU setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.MachinesystemconfigurationPackage.Processor_amount, visitor);
    // relations
    _acceptList(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.ICore.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.MachinesystemconfigurationPackage.CPU_cores, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.ICPU selectToMeCores(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.ICore object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.javamodel.ICPU.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.machinesystemconfiguration.MachinesystemconfigurationPackage.CPU_cores, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,084c2bda-2afe-11e9-9692-65766bc2daa5,mIwnlyRRIBkSb5jtB9ySpXqh4C0=] */
