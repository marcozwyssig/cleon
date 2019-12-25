package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.process.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ProcessTemplate extends DynamicResource implements IProcessTemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProcessTemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProcessTemplate>() {
    
    @Override
    public IProcessTemplate create() {
      return new ProcessTemplate();
    }
    
    @Override
    public IProcessTemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ProcessTemplate(resourceRepository, resource);
    }
  
  };

  public ProcessTemplate() {
    super(IProcessTemplate.TYPE_ID);
  }
  
  public ProcessTemplate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProcessTemplate.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectActor() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.FunctionalitytypePackage.ActorAware_actor);
  }
    
  public void setActor(java.lang.String actor) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.FunctionalitytypePackage.ActorAware_actor, actor);
  }

  @Override
  public java.lang.String selectObject() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.ObjectPackage.ObjectAware_object);
  }
    
  public void setObject(java.lang.String object) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.ObjectPackage.ObjectAware_object, object);
  }

  @Override
  public java.lang.String selectProcess() {
    return _getSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.ProcessPackage.ProcessAware_process);
  }
    
  public void setProcess(java.lang.String process) {
     _setSingleAttribute(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.ProcessPackage.ProcessAware_process, process);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition selectCondition() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.ConditionPackage.ConditionAware_condition);
  }

  public ProcessTemplate setCondition(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition condition) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.ConditionPackage.ConditionAware_condition, condition);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ProcessTemplate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.FunctionalitytypePackage.ActorAware_actor, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.ObjectPackage.ObjectAware_object, visitor);
    _acceptSingleAttribute(java.lang.String.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.ProcessPackage.ProcessAware_process, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.ConditionPackage.ConditionAware_condition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3ba6dcf0-debb-11e5-bf7d-117d548070bb,9lr3rOzTAEalXIODvEt4fEYu8Zg=] */
