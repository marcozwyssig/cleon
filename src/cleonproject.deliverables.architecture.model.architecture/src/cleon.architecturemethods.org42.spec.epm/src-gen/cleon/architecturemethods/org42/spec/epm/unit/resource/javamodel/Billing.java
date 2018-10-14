package cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Billing extends DynamicResource implements IBilling {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBilling> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBilling>() {
    
    @Override
    public IBilling create() {
      return new Billing();
    }
    
    @Override
    public IBilling create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Billing(resourceRepository, resource);
    }
  
  };

  public Billing() {
    super(IBilling.TYPE_ID);
  }
  
  public Billing(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBilling.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Billing setResponsible(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public Billing setStaff(java.util.List<? extends cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Billing setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.spec.bpmn2.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7379e5ea-bb6b-11e3-bf59-6b10d9dd6d36,InwgIAEXJ1oe0nyelVCjRCtZHvE=] */
