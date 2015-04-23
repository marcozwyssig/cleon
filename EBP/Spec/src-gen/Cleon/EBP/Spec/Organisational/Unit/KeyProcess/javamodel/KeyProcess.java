package Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class KeyProcess extends DynamicResource implements IKeyProcess {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKeyProcess> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKeyProcess>() {
    
    @Override
    public IKeyProcess create() {
      return new KeyProcess();
    }
    
    @Override
    public IKeyProcess create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new KeyProcess(resourceRepository, resource);
    }
  
  };

  public KeyProcess() {
    super(IKeyProcess.TYPE_ID);
  }
  
  public KeyProcess(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IKeyProcess.TYPE_ID);
  }

  // relations
  
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution selectDistribution() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_distribution);
  }

  public KeyProcess setDistribution(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution distribution) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_distribution, distribution);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IMarkting selectMarkting() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IMarkting.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_markting);
  }

  public KeyProcess setMarkting(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IMarkting markting) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_markting, markting);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IProductDevelopment selectProductDevelopment() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IProductDevelopment.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_productDevelopment);
  }

  public KeyProcess setProductDevelopment(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IProductDevelopment productDevelopment) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_productDevelopment, productDevelopment);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader selectResponsible() {
    return _getSingle(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible);
  }

  public KeyProcess setResponsible(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader responsible) {
    _setSingle(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff> selectStaff() {
    return _getList(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff);
  }

  public KeyProcess setStaff(java.util.List<? extends Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff> staff) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public KeyProcess setSubOrganisations(java.util.List<? extends Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public KeyProcess setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_distribution, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IMarkting.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_markting, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IProductDevelopment.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_productDevelopment, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.Role.javamodel.ILeader.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Role.javamodel.IStaff.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptList(Cleon.EBP.Spec.Organisational.Unit.javamodel.IOrganisationUnit.class, Cleon.EBP.Spec.Organisational.Unit.UnitPackage.OrganisationGroup_subOrganisations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess selectToMeProductDevelopment(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IProductDevelopment object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_productDevelopment, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess selectToMeMarkting(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IMarkting object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_markting, object.getResource());
  }
  
  public static Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess selectToMeDistribution(Cleon.EBP.Spec.Organisational.Unit.KeyProcess.Distribution.javamodel.IDistribution object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.Organisational.Unit.KeyProcess.javamodel.IKeyProcess.class, Cleon.EBP.Spec.Organisational.Unit.KeyProcess.KeyProcessPackage.KeyProcess_distribution, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9bb7ed60-ba7c-11e3-9206-f19b78f4aff0,97DaQNwJGs5YlFNYVDaJFCh+P2U=] */
