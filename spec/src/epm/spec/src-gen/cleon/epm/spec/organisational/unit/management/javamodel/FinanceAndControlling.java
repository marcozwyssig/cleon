package cleon.epm.spec.organisational.unit.management.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FinanceAndControlling extends DynamicResource implements IFinanceAndControlling {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFinanceAndControlling> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFinanceAndControlling>() {
    
    @Override
    public IFinanceAndControlling create() {
      return new FinanceAndControlling();
    }
    
    @Override
    public IFinanceAndControlling create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FinanceAndControlling(resourceRepository, resource);
    }
  
  };

  public FinanceAndControlling() {
    super(IFinanceAndControlling.TYPE_ID);
  }
  
  public FinanceAndControlling(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFinanceAndControlling.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.bpmn.spec.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.bpmn.spec.organisational.role.javamodel.IRole.class, cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public FinanceAndControlling setResponsible(cleon.bpmn.spec.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.bpmn.spec.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.bpmn.spec.organisational.role.javamodel.IRole.class, cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public FinanceAndControlling setStaff(java.util.List<? extends cleon.bpmn.spec.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FinanceAndControlling setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.bpmn.spec.organisational.role.javamodel.IRole.class, cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.bpmn.spec.organisational.role.javamodel.IRole.class, cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,068d6215-daa3-11e3-ae07-89aa80d5ec3d,4Q8ctKP52gtIEHbHrMYwV6Sj3ZE=] */
