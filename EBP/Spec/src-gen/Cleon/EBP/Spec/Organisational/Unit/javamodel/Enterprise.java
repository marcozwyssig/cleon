package Cleon.EBP.Spec.Organisational.Unit.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Enterprise extends DynamicResource implements IEnterprise {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnterprise> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnterprise>() {
    
    @Override
    public IEnterprise create() {
      return new Enterprise();
    }
    
    @Override
    public IEnterprise create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Enterprise(resourceRepository, resource);
    }
  
  };

  public Enterprise() {
    super(IEnterprise.TYPE_ID);
  }
  
  public Enterprise(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnterprise.TYPE_ID);
  }

  // relations
  
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement selectManagement() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_management);
  }

  public Enterprise setManagement(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement management) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_management, management);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess selectRealisation() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_realisation);
  }

  public Enterprise setRealisation(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess realisation) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_realisation, realisation);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader selectResponsible() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Enterprise setResponsible(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader responsible) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff> selectStaff() {
    return _getList(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff);
  }

  public Enterprise setStaff(java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff> staff) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public Enterprise setSubOrganisations(java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource selectSupport() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_support);
  }

  public Enterprise setSupport(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource support) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_support, support);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Enterprise setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_management, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_realisation, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_support, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise selectToMeManagement(Cleon.EBP.Spec.Organisational.Unit.Management.javamodel.IManagement object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_management, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise selectToMeRealisation(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_realisation, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise selectToMeSupport(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.javamodel.IEnterprise.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.Enterprise_support, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fb007daf-ba75-11e3-9206-f19b78f4aff0,xCVSMFbl3+vWkEkTLb0owFMd7ZU=] */
