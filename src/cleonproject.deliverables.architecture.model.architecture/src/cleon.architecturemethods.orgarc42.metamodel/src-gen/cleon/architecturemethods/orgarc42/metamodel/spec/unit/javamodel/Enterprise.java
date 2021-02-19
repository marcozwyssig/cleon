package cleon.architecturemethods.orgarc42.metamodel.spec.unit.javamodel;

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
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel.IManagement selectManagement() {
    return _getSingle(cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel.IManagement.class, cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_management);
  }

  public Enterprise setManagement(cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel.IManagement management) {
    _setSingle(cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_management, management);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.keyprocess.javamodel.IKeyProcess selectRealisation() {
    return _getSingle(cleon.architecturemethods.orgarc42.metamodel.spec.unit.keyprocess.javamodel.IKeyProcess.class, cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_realisation);
  }

  public Enterprise setRealisation(cleon.architecturemethods.orgarc42.metamodel.spec.unit.keyprocess.javamodel.IKeyProcess realisation) {
    _setSingle(cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_realisation, realisation);
    return this;
  }
    
  @Override
  public cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Enterprise setResponsible(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public Enterprise setStaff(java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.javamodel.IOrganisationUnit.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public Enterprise setSubOrganisations(java.util.List<? extends cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IResource selectSupport() {
    return _getSingle(cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IResource.class, cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_support);
  }

  public Enterprise setSupport(cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IResource support) {
    _setSingle(cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_support, support);
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
    _acceptSingle(cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel.IManagement.class, cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_management, visitor);
    _acceptSingle(cleon.architecturemethods.orgarc42.metamodel.spec.unit.keyprocess.javamodel.IKeyProcess.class, cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_realisation, visitor);
    _acceptSingle(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.modelinglanguages.bpmn.metamodel.spec.organisational.role.javamodel.IRole.class, cleon.modelinglanguages.bpmn.metamodel.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptSingle(cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IResource.class, cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_support, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.orgarc42.metamodel.spec.unit.javamodel.IEnterprise selectToMeManagement(cleon.architecturemethods.orgarc42.metamodel.spec.unit.management.javamodel.IManagement object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.orgarc42.metamodel.spec.unit.javamodel.IEnterprise.class, cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_management, object.getResource());
  }
  
  public static cleon.architecturemethods.orgarc42.metamodel.spec.unit.javamodel.IEnterprise selectToMeRealisation(cleon.architecturemethods.orgarc42.metamodel.spec.unit.keyprocess.javamodel.IKeyProcess object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.orgarc42.metamodel.spec.unit.javamodel.IEnterprise.class, cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_realisation, object.getResource());
  }
  
  public static cleon.architecturemethods.orgarc42.metamodel.spec.unit.javamodel.IEnterprise selectToMeSupport(cleon.architecturemethods.orgarc42.metamodel.spec.unit.resource.javamodel.IResource object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.orgarc42.metamodel.spec.unit.javamodel.IEnterprise.class, cleon.architecturemethods.orgarc42.metamodel.spec.unit.UnitPackage.Enterprise_support, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fb007daf-ba75-11e3-9206-f19b78f4aff0,auXFJbD2/jJ/FBBgxhWZojey6rM=] */
