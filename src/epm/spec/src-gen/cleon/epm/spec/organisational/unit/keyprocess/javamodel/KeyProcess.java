package cleon.epm.spec.organisational.unit.keyprocess.javamodel;

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
  public cleon.epm.spec.organisational.unit.keyprocess.distribution.javamodel.IDistribution selectDistribution() {
    return _getSingle(cleon.epm.spec.organisational.unit.keyprocess.distribution.javamodel.IDistribution.class, cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_distribution);
  }

  public KeyProcess setDistribution(cleon.epm.spec.organisational.unit.keyprocess.distribution.javamodel.IDistribution distribution) {
    _setSingle(cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_distribution, distribution);
    return this;
  }
    
  @Override
  public cleon.epm.spec.organisational.unit.keyprocess.javamodel.IMarkting selectMarkting() {
    return _getSingle(cleon.epm.spec.organisational.unit.keyprocess.javamodel.IMarkting.class, cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_markting);
  }

  public KeyProcess setMarkting(cleon.epm.spec.organisational.unit.keyprocess.javamodel.IMarkting markting) {
    _setSingle(cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_markting, markting);
    return this;
  }
    
  @Override
  public cleon.epm.spec.organisational.unit.keyprocess.javamodel.IProductDevelopment selectProductDevelopment() {
    return _getSingle(cleon.epm.spec.organisational.unit.keyprocess.javamodel.IProductDevelopment.class, cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_productDevelopment);
  }

  public KeyProcess setProductDevelopment(cleon.epm.spec.organisational.unit.keyprocess.javamodel.IProductDevelopment productDevelopment) {
    _setSingle(cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_productDevelopment, productDevelopment);
    return this;
  }
    
  @Override
  public cleon.bpmn.spec.organisational.role.javamodel.IRole selectResponsible() {
    return _getSingle(cleon.bpmn.spec.organisational.role.javamodel.IRole.class, cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible);
  }

  public KeyProcess setResponsible(cleon.bpmn.spec.organisational.role.javamodel.IRole responsible) {
    _setSingle(cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, responsible);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.bpmn.spec.organisational.role.javamodel.IRole> selectStaff() {
    return _getList(cleon.bpmn.spec.organisational.role.javamodel.IRole.class, cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_staff);
  }

  public KeyProcess setStaff(java.util.List<? extends cleon.bpmn.spec.organisational.role.javamodel.IRole> staff) {
    _setList(cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, staff);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.bpmn.spec.organisational.unit.javamodel.IOrganisationUnit> selectSubOrganisations() {
    return _getList(cleon.bpmn.spec.organisational.unit.javamodel.IOrganisationUnit.class, cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations);
  }

  public KeyProcess setSubOrganisations(java.util.List<? extends cleon.bpmn.spec.organisational.unit.javamodel.IOrganisationUnit> subOrganisations) {
    _setList(cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, subOrganisations);
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
    _acceptSingle(cleon.epm.spec.organisational.unit.keyprocess.distribution.javamodel.IDistribution.class, cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_distribution, visitor);
    _acceptSingle(cleon.epm.spec.organisational.unit.keyprocess.javamodel.IMarkting.class, cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_markting, visitor);
    _acceptSingle(cleon.epm.spec.organisational.unit.keyprocess.javamodel.IProductDevelopment.class, cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_productDevelopment, visitor);
    _acceptSingle(cleon.bpmn.spec.organisational.role.javamodel.IRole.class, cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_responsible, visitor);
    _acceptList(cleon.bpmn.spec.organisational.role.javamodel.IRole.class, cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationUnit_staff, visitor);
    _acceptList(cleon.bpmn.spec.organisational.unit.javamodel.IOrganisationUnit.class, cleon.bpmn.spec.organisational.unit.UnitPackage.OrganisationGroup_subOrganisations, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.epm.spec.organisational.unit.keyprocess.javamodel.IKeyProcess selectToMeProductDevelopment(cleon.epm.spec.organisational.unit.keyprocess.javamodel.IProductDevelopment object) {
    return _getToMeSingle(object.getRepository(), cleon.epm.spec.organisational.unit.keyprocess.javamodel.IKeyProcess.class, cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_productDevelopment, object.getResource());
  }
  
  public static cleon.epm.spec.organisational.unit.keyprocess.javamodel.IKeyProcess selectToMeMarkting(cleon.epm.spec.organisational.unit.keyprocess.javamodel.IMarkting object) {
    return _getToMeSingle(object.getRepository(), cleon.epm.spec.organisational.unit.keyprocess.javamodel.IKeyProcess.class, cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_markting, object.getResource());
  }
  
  public static cleon.epm.spec.organisational.unit.keyprocess.javamodel.IKeyProcess selectToMeDistribution(cleon.epm.spec.organisational.unit.keyprocess.distribution.javamodel.IDistribution object) {
    return _getToMeSingle(object.getRepository(), cleon.epm.spec.organisational.unit.keyprocess.javamodel.IKeyProcess.class, cleon.epm.spec.organisational.unit.keyprocess.KeyprocessPackage.KeyProcess_distribution, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,9bb7ed60-ba7c-11e3-9206-f19b78f4aff0,RU9/pRkwwc8i8j5VqRa2isb/4bM=] */
