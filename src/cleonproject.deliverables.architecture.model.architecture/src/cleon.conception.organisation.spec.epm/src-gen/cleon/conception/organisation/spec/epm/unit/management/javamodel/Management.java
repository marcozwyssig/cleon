package cleon.conception.organisation.spec.epm.unit.management.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Management extends DynamicResource implements IManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IManagement>() {
    
    @Override
    public IManagement create() {
      return new Management();
    }
    
    @Override
    public IManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Management(resourceRepository, resource);
    }
  
  };

  public Management() {
    super(IManagement.TYPE_ID);
  }
  
  public Management(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IManagement.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.organisation.spec.epm.unit.management.javamodel.IEnvironmentProtection selectEnvironmentProtection() {
    return _getSingle(cleon.conception.organisation.spec.epm.unit.management.javamodel.IEnvironmentProtection.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_environmentProtection);
  }

  public Management setEnvironmentProtection(cleon.conception.organisation.spec.epm.unit.management.javamodel.IEnvironmentProtection environmentProtection) {
    _setSingle(cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_environmentProtection, environmentProtection);
    return this;
  }
    
  @Override
  public cleon.conception.organisation.spec.epm.unit.management.javamodel.IFinanceAndControlling selectFinanceAndControlling() {
    return _getSingle(cleon.conception.organisation.spec.epm.unit.management.javamodel.IFinanceAndControlling.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_financeAndControlling);
  }

  public Management setFinanceAndControlling(cleon.conception.organisation.spec.epm.unit.management.javamodel.IFinanceAndControlling financeAndControlling) {
    _setSingle(cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_financeAndControlling, financeAndControlling);
    return this;
  }
    
  @Override
  public cleon.conception.organisation.spec.epm.unit.management.javamodel.IPolticsAndStrategy selectPolticsAndStrategy() {
    return _getSingle(cleon.conception.organisation.spec.epm.unit.management.javamodel.IPolticsAndStrategy.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_polticsAndStrategy);
  }

  public Management setPolticsAndStrategy(cleon.conception.organisation.spec.epm.unit.management.javamodel.IPolticsAndStrategy polticsAndStrategy) {
    _setSingle(cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_polticsAndStrategy, polticsAndStrategy);
    return this;
  }
    
  @Override
  public cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Management setResponsible(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public Management setStaff(java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public Management setSubOrganisations(java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Management setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public cleon.conception.organisation.spec.epm.unit.management.javamodel.IValuesAndCorperateGovernance selectValuesAndCorperateGovernance() {
    return _getSingle(cleon.conception.organisation.spec.epm.unit.management.javamodel.IValuesAndCorperateGovernance.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_valuesAndCorperateGovernance);
  }

  public Management setValuesAndCorperateGovernance(cleon.conception.organisation.spec.epm.unit.management.javamodel.IValuesAndCorperateGovernance valuesAndCorperateGovernance) {
    _setSingle(cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_valuesAndCorperateGovernance, valuesAndCorperateGovernance);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.organisation.spec.epm.unit.management.javamodel.IEnvironmentProtection.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_environmentProtection, visitor);
    _acceptSingle(cleon.conception.organisation.spec.epm.unit.management.javamodel.IFinanceAndControlling.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_financeAndControlling, visitor);
    _acceptSingle(cleon.conception.organisation.spec.epm.unit.management.javamodel.IPolticsAndStrategy.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_polticsAndStrategy, visitor);
    _acceptSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(cleon.conception.organisation.spec.epm.unit.management.javamodel.IValuesAndCorperateGovernance.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_valuesAndCorperateGovernance, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.organisation.spec.epm.unit.management.javamodel.IManagement selectToMeEnvironmentProtection(cleon.conception.organisation.spec.epm.unit.management.javamodel.IEnvironmentProtection object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.organisation.spec.epm.unit.management.javamodel.IManagement.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_environmentProtection, object.getResource());
  }
  
  public static cleon.conception.organisation.spec.epm.unit.management.javamodel.IManagement selectToMePolticsAndStrategy(cleon.conception.organisation.spec.epm.unit.management.javamodel.IPolticsAndStrategy object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.organisation.spec.epm.unit.management.javamodel.IManagement.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_polticsAndStrategy, object.getResource());
  }
  
  public static cleon.conception.organisation.spec.epm.unit.management.javamodel.IManagement selectToMeFinanceAndControlling(cleon.conception.organisation.spec.epm.unit.management.javamodel.IFinanceAndControlling object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.organisation.spec.epm.unit.management.javamodel.IManagement.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_financeAndControlling, object.getResource());
  }
  
  public static cleon.conception.organisation.spec.epm.unit.management.javamodel.IManagement selectToMeValuesAndCorperateGovernance(cleon.conception.organisation.spec.epm.unit.management.javamodel.IValuesAndCorperateGovernance object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.organisation.spec.epm.unit.management.javamodel.IManagement.class, cleon.conception.organisation.spec.epm.unit.management.ManagementPackage.Management_valuesAndCorperateGovernance, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0fb27ece-ba76-11e3-9206-f19b78f4aff0,fA8SkbSILJVzK8jkjKm71G9nugk=] */
