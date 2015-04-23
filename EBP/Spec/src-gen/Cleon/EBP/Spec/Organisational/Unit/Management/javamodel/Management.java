package Cleon.EBP.Spec.Organisational.Unit.Management.javamodel;

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
  public Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IEnviromentProtection selectEnviromentProtection() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IEnviromentProtection.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_enviromentProtection);
  }

  public Management setEnviromentProtection(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IEnviromentProtection enviromentProtection) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_enviromentProtection, enviromentProtection);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IFinanceAndControlling selectFinanceAndControlling() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IFinanceAndControlling.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_financeAndControlling);
  }

  public Management setFinanceAndControlling(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IFinanceAndControlling financeAndControlling) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_financeAndControlling, financeAndControlling);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IPolticsAndStrategy selectPolticsAndStrategy() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IPolticsAndStrategy.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_polticsAndStrategy);
  }

  public Management setPolticsAndStrategy(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IPolticsAndStrategy polticsAndStrategy) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_polticsAndStrategy, polticsAndStrategy);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader selectResponsible() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Management setResponsible(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader responsible) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff> selectStaff() {
    return _getList(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff);
  }

  public Management setStaff(java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff> staff) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public Management setSubOrganisations(java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
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
  public Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IValuesAndCorperateGovernance selectValuesAndCorperateGovernance() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IValuesAndCorperateGovernance.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_valuesAndCorperateGovernance);
  }

  public Management setValuesAndCorperateGovernance(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IValuesAndCorperateGovernance valuesAndCorperateGovernance) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_valuesAndCorperateGovernance, valuesAndCorperateGovernance);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IEnviromentProtection.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_enviromentProtection, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IFinanceAndControlling.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_financeAndControlling, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IPolticsAndStrategy.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_polticsAndStrategy, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IValuesAndCorperateGovernance.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_valuesAndCorperateGovernance, visitor);
  }

  // toMeRelations
  
  public static Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement selectToMeEnviromentProtection(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IEnviromentProtection object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_enviromentProtection, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement selectToMePolticsAndStrategy(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IPolticsAndStrategy object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_polticsAndStrategy, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement selectToMeFinanceAndControlling(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IFinanceAndControlling object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_financeAndControlling, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement selectToMeValuesAndCorperateGovernance(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IValuesAndCorperateGovernance object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement.class, Cleon.EBP.Spec.Organisational.Unit.Management.ManagementPackage.Management_valuesAndCorperateGovernance, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0fb27ece-ba76-11e3-9206-f19b78f4aff0,Druzp6mrWsYNhOpeUDMZapAu85M=] */
