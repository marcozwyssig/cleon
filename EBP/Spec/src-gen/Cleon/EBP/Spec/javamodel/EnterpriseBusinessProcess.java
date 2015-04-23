package Cleon.EBP.Spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class EnterpriseBusinessProcess extends DynamicResource implements IEnterpriseBusinessProcess {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnterpriseBusinessProcess> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IEnterpriseBusinessProcess>() {
    
    @Override
    public IEnterpriseBusinessProcess create() {
      return new EnterpriseBusinessProcess();
    }
    
    @Override
    public IEnterpriseBusinessProcess create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new EnterpriseBusinessProcess(resourceRepository, resource);
    }
  
  };

  public EnterpriseBusinessProcess() {
    super(IEnterpriseBusinessProcess.TYPE_ID);
  }
  
  public EnterpriseBusinessProcess(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IEnterpriseBusinessProcess.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public Cleon.EBP.Spec.Operational.javamodel.IOperational selectOperational() {
    return _getSingle(Cleon.EBP.Spec.Operational.javamodel.IOperational.class, Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_operational);
  }

  public EnterpriseBusinessProcess setOperational(Cleon.EBP.Spec.Operational.javamodel.IOperational operational) {
    _setSingle(Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_operational, operational);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organigram.javamodel.IOrganigram selectOrganigram() {
    return _getSingle(Cleon.EBP.Spec.Organigram.javamodel.IOrganigram.class, Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_organigram);
  }

  public EnterpriseBusinessProcess setOrganigram(Cleon.EBP.Spec.Organigram.javamodel.IOrganigram organigram) {
    _setSingle(Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_organigram, organigram);
    return this;
  }
    
  @Override
  public Cleon.EBP.Spec.Organisational.javamodel.IOrganisational selectOrganisational() {
    return _getSingle(Cleon.EBP.Spec.Organisational.javamodel.IOrganisational.class, Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_organisational);
  }

  public EnterpriseBusinessProcess setOrganisational(Cleon.EBP.Spec.Organisational.javamodel.IOrganisational organisational) {
    _setSingle(Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_organisational, organisational);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public EnterpriseBusinessProcess setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(Cleon.EBP.Spec.Operational.javamodel.IOperational.class, Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_operational, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organigram.javamodel.IOrganigram.class, Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_organigram, visitor);
    _acceptSingle(Cleon.EBP.Spec.Organisational.javamodel.IOrganisational.class, Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_organisational, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static Cleon.EBP.Spec.javamodel.IEnterpriseBusinessProcess selectToMeOrganisational(Cleon.EBP.Spec.Organisational.javamodel.IOrganisational object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.javamodel.IEnterpriseBusinessProcess.class, Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_organisational, object.getResource());
  }
  
  public static Cleon.EBP.Spec.javamodel.IEnterpriseBusinessProcess selectToMeOperational(Cleon.EBP.Spec.Operational.javamodel.IOperational object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.javamodel.IEnterpriseBusinessProcess.class, Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_operational, object.getResource());
  }
  
  public static Cleon.EBP.Spec.javamodel.IEnterpriseBusinessProcess selectToMeOrganigram(Cleon.EBP.Spec.Organigram.javamodel.IOrganigram object) {
    return _getToMeSingle(object.getRepository(), Cleon.EBP.Spec.javamodel.IEnterpriseBusinessProcess.class, Cleon.EBP.Spec.SpecPackage.EnterpriseBusinessProcess_organigram, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,037d0836-bb6a-11e3-bf59-6b10d9dd6d36,GyU/nbmKiZXmCUAxeCdRRlGnyL0=] */
