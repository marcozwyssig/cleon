package cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Resource extends DynamicResource implements IResource {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResource> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IResource>() {
    
    @Override
    public IResource create() {
      return new Resource();
    }
    
    @Override
    public IResource create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Resource(resourceRepository, resource);
    }
  
  };

  public Resource() {
    super(IResource.TYPE_ID);
  }
  
  public Resource(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IResource.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IBilling selectBilling() {
    return _getSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IBilling.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_billing);
  }

  public Resource setBilling(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IBilling billing) {
    _setSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_billing, billing);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IHumanResource selectHumanresource() {
    return _getSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IHumanResource.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_humanresource);
  }

  public Resource setHumanresource(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IHumanResource humanresource) {
    _setSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_humanresource, humanresource);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IInfrastructure> selectInfrastructure() {
    return _getList(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IInfrastructure.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_infrastructure);
  }

  public Resource setInfrastructure(java.util.List<? extends cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IInfrastructure> infrastructure) {
    _setList(cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_infrastructure, infrastructure);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IITOps selectIt() {
    return _getSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IITOps.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_it);
  }

  public Resource setIt(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IITOps it) {
    _setSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_it, it);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IQualityManagement selectQualityManagement() {
    return _getSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IQualityManagement.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_qualityManagement);
  }

  public Resource setQualityManagement(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IQualityManagement qualityManagement) {
    _setSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_qualityManagement, qualityManagement);
    return this;
  }
    
  @Override
  public cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Resource setResponsible(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public Resource setStaff(java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public Resource setSubOrganisations(java.util.List<? extends cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Resource setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IBilling.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_billing, visitor);
    _acceptSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IHumanResource.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_humanresource, visitor);
    _acceptList(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IInfrastructure.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_infrastructure, visitor);
    _acceptSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IITOps.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_it, visitor);
    _acceptSingle(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IQualityManagement.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_qualityManagement, visitor);
    _acceptSingle(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.initialization.processlanguage.spec.bpmn.organisational.role.javamodel.IRole.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptList(cleon.initialization.processlanguage.spec.bpmn.organisational.unit.javamodel.IOrganisationUnit.class, cleon.initialization.processlanguage.spec.bpmn.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IResource selectToMeHumanresource(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IHumanResource object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IResource.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_humanresource, object.getResource());
  }
  
  public static cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IResource selectToMeBilling(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IBilling object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IResource.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_billing, object.getResource());
  }
  
  public static cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IResource selectToMeQualityManagement(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IQualityManagement object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IResource.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_qualityManagement, object.getResource());
  }
  
  public static cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IResource selectToMeInfrastructure(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IInfrastructure object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IResource.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_infrastructure, object.getResource());
  }
  
  public static cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IResource selectToMeIt(cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IITOps object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.org42.spec.epm.unit.resource.javamodel.IResource.class, cleon.architecturemethods.org42.spec.epm.unit.resource.ResourcePackage.Resource_it, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9ebfbca0-bb6a-11e3-bf59-6b10d9dd6d36,y/2Ha/RK6SPGiOsp8oC+pnpG8XA=] */
