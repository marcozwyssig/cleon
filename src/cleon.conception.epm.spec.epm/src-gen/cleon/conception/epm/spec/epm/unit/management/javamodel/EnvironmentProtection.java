package cleon.conception.epm.spec.epm.unit.management.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnvironmentProtection extends DynamicResource implements IEnvironmentProtection {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnvironmentProtection> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnvironmentProtection>() {
    
    @Override
    public IEnvironmentProtection create() {
      return new EnvironmentProtection();
    }
    
    @Override
    public IEnvironmentProtection create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnvironmentProtection(resourceRepository, resource);
    }
  
  };

  public EnvironmentProtection() {
    super(IEnvironmentProtection.TYPE_ID);
  }
  
  public EnvironmentProtection(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnvironmentProtection.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.bpmn.spec.bpmn.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.conception.bpmn.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.conception.bpmn.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public EnvironmentProtection setResponsible(cleon.conception.bpmn.spec.bpmn.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.conception.bpmn.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.conception.bpmn.spec.bpmn.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.conception.bpmn.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.conception.bpmn.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public EnvironmentProtection setStaff(java.util.List<? extends cleon.conception.bpmn.spec.bpmn.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.conception.bpmn.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnvironmentProtection setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.bpmn.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.conception.bpmn.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.conception.bpmn.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.conception.bpmn.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,213718ab-daa3-11e3-ae07-89aa80d5ec3d,aZPEPxuAeU6F9JgmO5d/ZcPazZY=] */
