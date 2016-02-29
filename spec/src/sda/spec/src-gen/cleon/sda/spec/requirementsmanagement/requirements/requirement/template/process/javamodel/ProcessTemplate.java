package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.process.javamodel;

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

  // relations
  
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IActor selectActor() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IActor.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.process.ProcessPackage.ProcessTemplate_actor);
  }

  public ProcessTemplate setActor(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IActor actor) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.process.ProcessPackage.ProcessTemplate_actor, actor);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition selectCondition() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_condition);
  }

  public ProcessTemplate setCondition(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition condition) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_condition, condition);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityType selectFunctionalityType() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityType.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.FunctionalitytypePackage.FunctionalityTypeAware_functionalityType);
  }

  public ProcessTemplate setFunctionalityType(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityType functionalityType) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.FunctionalitytypePackage.FunctionalityTypeAware_functionalityType, functionalityType);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance selectImportance() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.ImportancePackage.ImportanceAware_importance);
  }

  public ProcessTemplate setImportance(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance importance) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.ImportancePackage.ImportanceAware_importance, importance);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.javamodel.IObject selectObject() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.javamodel.IObject.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.ObjectPackage.ObjectAware_object);
  }

  public ProcessTemplate setObject(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.javamodel.IObject object) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.ObjectPackage.ObjectAware_object, object);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.javamodel.IProcess selectProcess() {
    return _getSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.javamodel.IProcess.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.ProcessPackage.ProcessAware_process);
  }

  public ProcessTemplate setProcess(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.javamodel.IProcess process) {
    _setSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.ProcessPackage.ProcessAware_process, process);
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
    // relations
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IActor.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.process.ProcessPackage.ProcessTemplate_actor, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.TemplatePackage.Template_condition, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityType.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.FunctionalitytypePackage.FunctionalityTypeAware_functionalityType, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.ImportancePackage.ImportanceAware_importance, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.javamodel.IObject.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.object.ObjectPackage.ObjectAware_object, visitor);
    _acceptSingle(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.javamodel.IProcess.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.ProcessPackage.ProcessAware_process, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.process.javamodel.IProcessTemplate> selectToMeActor(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IActor object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.process.javamodel.IProcessTemplate.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.process.ProcessPackage.ProcessTemplate_actor, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3ba6dcf0-debb-11e5-bf7d-117d548070bb,eEvOM7dwEiVg3SsxSq4Iohk2luI=] */
