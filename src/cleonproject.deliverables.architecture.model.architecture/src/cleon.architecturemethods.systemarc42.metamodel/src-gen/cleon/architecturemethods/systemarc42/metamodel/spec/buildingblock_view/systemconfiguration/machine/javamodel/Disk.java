package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Disk extends DynamicResource implements IDisk {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDisk> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDisk>() {
    
    @Override
    public IDisk create() {
      return new Disk();
    }
    
    @Override
    public IDisk create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Disk(resourceRepository, resource);
    }
  
  };

  public Disk() {
    super(IDisk.TYPE_ID);
  }
  
  public Disk(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDisk.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Double selectSize() {
    return _getSingleAttribute(java.lang.Double.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.Disk_size);
  }
    
  public void setSize(java.lang.Double size) {
     _setSingleAttribute(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.Disk_size, size);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDiskType selectDiskType() {
    return _getSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDiskType.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.Disk_diskType);
  }

  public Disk setDiskType(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDiskType diskType) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.Disk_diskType, diskType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Disk setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Double.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.Disk_size, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDiskType.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.Disk_diskType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDisk> selectToMeDiskType(cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDiskType object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.javamodel.IDisk.class, cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.machine.MachinePackage.Disk_diskType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2c32029e-2b00-11e9-9692-65766bc2daa5,5YoedamISTlRGte85+SKcqVsDqo=] */
