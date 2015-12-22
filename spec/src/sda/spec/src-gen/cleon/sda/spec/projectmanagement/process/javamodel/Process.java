package cleon.sda.spec.projectmanagement.process.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Process extends DynamicResource implements IProcess {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProcess> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProcess>() {
    
    @Override
    public IProcess create() {
      return new Process();
    }
    
    @Override
    public IProcess create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Process(resourceRepository, resource);
    }
  
  };

  public Process() {
    super(IProcess.TYPE_ID);
  }
  
  public Process(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProcess.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.bpmn.spec.organigram.javamodel.IOrganigram selectOrganigram() {
    return _getSingle(cleon.bpmn.spec.organigram.javamodel.IOrganigram.class, cleon.bpmn.spec.SpecPackage.Bpmn_organigram);
  }

  public Process setOrganigram(cleon.bpmn.spec.organigram.javamodel.IOrganigram organigram) {
    _setSingle(cleon.bpmn.spec.SpecPackage.Bpmn_organigram, organigram);
    return this;
  }
    
  @Override
  public cleon.bpmn.spec.organisational.javamodel.IOrganisational selectOrganisational() {
    return _getSingle(cleon.bpmn.spec.organisational.javamodel.IOrganisational.class, cleon.bpmn.spec.SpecPackage.Bpmn_organisational);
  }

  public Process setOrganisational(cleon.bpmn.spec.organisational.javamodel.IOrganisational organisational) {
    _setSingle(cleon.bpmn.spec.SpecPackage.Bpmn_organisational, organisational);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Process setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.bpmn.spec.organigram.javamodel.IOrganigram.class, cleon.bpmn.spec.SpecPackage.Bpmn_organigram, visitor);
    _acceptSingle(cleon.bpmn.spec.organisational.javamodel.IOrganisational.class, cleon.bpmn.spec.SpecPackage.Bpmn_organisational, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,77ac3176-a7de-11e5-82dd-3b995d9c840c,ArpKqAAp5ofUqZw0H9PR4uQMG64=] */
