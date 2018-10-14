package cleon.architecturemethods.org42.spec.epm.organigram.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnterpriseOrganigram extends DynamicResource implements IEnterpriseOrganigram {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnterpriseOrganigram> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnterpriseOrganigram>() {
    
    @Override
    public IEnterpriseOrganigram create() {
      return new EnterpriseOrganigram();
    }
    
    @Override
    public IEnterpriseOrganigram create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnterpriseOrganigram(resourceRepository, resource);
    }
  
  };

  public EnterpriseOrganigram() {
    super(IEnterpriseOrganigram.TYPE_ID);
  }
  
  public EnterpriseOrganigram(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnterpriseOrganigram.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.org42.spec.epm.unit.javamodel.IEnterprise selectEnterprise() {
    return _getSingle(cleon.architecturemethods.org42.spec.epm.unit.javamodel.IEnterprise.class, cleon.architecturemethods.org42.spec.epm.organigram.OrganigramPackage.EnterpriseOrganigram_enterprise);
  }

  public EnterpriseOrganigram setEnterprise(cleon.architecturemethods.org42.spec.epm.unit.javamodel.IEnterprise enterprise) {
    _setSingle(cleon.architecturemethods.org42.spec.epm.organigram.OrganigramPackage.EnterpriseOrganigram_enterprise, enterprise);
    return this;
  }
    
  @Override
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.bpmn.spec.bpmn2.organigram.javamodel.IOrganisation> selectOrganisation() {
    return _getMultiMap(cleon.modelinglanguages.bpmn.spec.bpmn2.organigram.javamodel.IOrganisation.class, cleon.architecturemethods.org42.spec.epm.organigram.OrganigramPackage.EnterpriseOrganigram_organisation);
  }

  public EnterpriseOrganigram setOrganisation(IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.bpmn.spec.bpmn2.organigram.javamodel.IOrganisation> organisation) {
    _setMultiMap(cleon.architecturemethods.org42.spec.epm.organigram.OrganigramPackage.EnterpriseOrganigram_organisation, organisation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public EnterpriseOrganigram setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnterpriseOrganigram setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.org42.spec.epm.unit.javamodel.IEnterprise.class, cleon.architecturemethods.org42.spec.epm.organigram.OrganigramPackage.EnterpriseOrganigram_enterprise, visitor);
    _acceptMultiMap(cleon.modelinglanguages.bpmn.spec.bpmn2.organigram.javamodel.IOrganisation.class, cleon.architecturemethods.org42.spec.epm.organigram.OrganigramPackage.EnterpriseOrganigram_organisation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.org42.spec.epm.organigram.javamodel.IEnterpriseOrganigram> selectToMeEnterprise(cleon.architecturemethods.org42.spec.epm.unit.javamodel.IEnterprise object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.org42.spec.epm.organigram.javamodel.IEnterpriseOrganigram.class, cleon.architecturemethods.org42.spec.epm.organigram.OrganigramPackage.EnterpriseOrganigram_enterprise, object.getResource());
  }
  
  public static cleon.architecturemethods.org42.spec.epm.organigram.javamodel.IEnterpriseOrganigram selectToMeOrganisation(cleon.modelinglanguages.bpmn.spec.bpmn2.organigram.javamodel.IOrganisation object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.org42.spec.epm.organigram.javamodel.IEnterpriseOrganigram.class, cleon.architecturemethods.org42.spec.epm.organigram.OrganigramPackage.EnterpriseOrganigram_organisation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4302c8a6-daad-11e3-ae07-89aa80d5ec3d,PkMPebpJt2Zo43HFEDW9D4ZGZjQ=] */
