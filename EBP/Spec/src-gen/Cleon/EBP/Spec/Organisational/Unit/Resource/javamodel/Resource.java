package Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel;

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
  public Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IBilling selectBilling() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IBilling.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_billing);
  }

  public Resource setBilling(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IBilling billing) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_billing, billing);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IHumanResource selectHumanresource() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IHumanResource.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_humanresource);
  }

  public Resource setHumanresource(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IHumanResource humanresource) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_humanresource, humanresource);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IInfrastructure> selectInfrastructure() {
    return _getList(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IInfrastructure.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_infrastructure);
  }

  public Resource setInfrastructure(java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IInfrastructure> infrastructure) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_infrastructure, infrastructure);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IITOps selectIt() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IITOps.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_it);
  }

  public Resource setIt(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IITOps it) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_it, it);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IQualityManagement selectQualityManagement() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IQualityManagement.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_qualityManagement);
  }

  public Resource setQualityManagement(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IQualityManagement qualityManagement) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_qualityManagement, qualityManagement);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader selectResponsible() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible);
  }

  public Resource setResponsible(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader responsible) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff> selectStaff() {
    return _getList(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff);
  }

  public Resource setStaff(java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff> staff) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public Resource setSubOrganisations(java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
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
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IBilling.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_billing, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IHumanResource.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_humanresource, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IInfrastructure.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_infrastructure, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IITOps.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_it, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IQualityManagement.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_qualityManagement, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource selectToMeHumanresource(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IHumanResource object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_humanresource, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource selectToMeBilling(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IBilling object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_billing, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource selectToMeQualityManagement(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IQualityManagement object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_qualityManagement, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource selectToMeInfrastructure(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IInfrastructure object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_infrastructure, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource selectToMeIt(Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IITOps object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.Resource.javamodel.IResource.class, Cleon.EBP.Spec.Organisational.Unit.Resource.ResourcePackage.Resource_it, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9ebfbca0-bb6a-11e3-bf59-6b10d9dd6d36,SUVVmpcG40pK9cxNkfS8TMVfAiI=] */
