package cleon.epm.spec.javamodel;

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
  public cleon.epm.spec.operational.javamodel.IOperational selectOperational() {
    return _getSingle(cleon.epm.spec.operational.javamodel.IOperational.class, cleon.epm.spec.SpecPackage.EnterpriseBusinessProcess_operational);
  }

  public EnterpriseBusinessProcess setOperational(cleon.epm.spec.operational.javamodel.IOperational operational) {
    _setSingle(cleon.epm.spec.SpecPackage.EnterpriseBusinessProcess_operational, operational);
    return this;
  }
    
  @Override
  public cleon.bpmn.spec.organigram.javamodel.IOrganigram selectOrganigram() {
    return _getSingle(cleon.bpmn.spec.organigram.javamodel.IOrganigram.class, cleon.bpmn.spec.SpecPackage.Bpmn_organigram);
  }

  public EnterpriseBusinessProcess setOrganigram(cleon.bpmn.spec.organigram.javamodel.IOrganigram organigram) {
    _setSingle(cleon.bpmn.spec.SpecPackage.Bpmn_organigram, organigram);
    return this;
  }
    
  @Override
  public cleon.bpmn.spec.organisational.javamodel.IOrganisational selectOrganisational() {
    return _getSingle(cleon.bpmn.spec.organisational.javamodel.IOrganisational.class, cleon.bpmn.spec.SpecPackage.Bpmn_organisational);
  }

  public EnterpriseBusinessProcess setOrganisational(cleon.bpmn.spec.organisational.javamodel.IOrganisational organisational) {
    _setSingle(cleon.bpmn.spec.SpecPackage.Bpmn_organisational, organisational);
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
    _acceptSingle(cleon.epm.spec.operational.javamodel.IOperational.class, cleon.epm.spec.SpecPackage.EnterpriseBusinessProcess_operational, visitor);
    _acceptSingle(cleon.bpmn.spec.organigram.javamodel.IOrganigram.class, cleon.bpmn.spec.SpecPackage.Bpmn_organigram, visitor);
    _acceptSingle(cleon.bpmn.spec.organisational.javamodel.IOrganisational.class, cleon.bpmn.spec.SpecPackage.Bpmn_organisational, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.epm.spec.javamodel.IEnterpriseBusinessProcess selectToMeOperational(cleon.epm.spec.operational.javamodel.IOperational object) {
    return _getToMeSingle(object.getRepository(), cleon.epm.spec.javamodel.IEnterpriseBusinessProcess.class, cleon.epm.spec.SpecPackage.EnterpriseBusinessProcess_operational, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,037d0836-bb6a-11e3-bf59-6b10d9dd6d36,vyHAzfdPjrtGW2S4LUET3DatV4M=] */
