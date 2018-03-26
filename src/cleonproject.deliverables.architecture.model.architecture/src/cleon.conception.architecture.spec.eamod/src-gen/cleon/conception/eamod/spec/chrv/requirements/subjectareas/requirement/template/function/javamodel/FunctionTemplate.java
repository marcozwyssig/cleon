package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.function.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class FunctionTemplate extends DynamicResource implements IFunctionTemplate {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionTemplate> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IFunctionTemplate>() {
    
    @Override
    public IFunctionTemplate create() {
      return new FunctionTemplate();
    }
    
    @Override
    public IFunctionTemplate create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new FunctionTemplate(resourceRepository, resource);
    }
  
  };

  public FunctionTemplate() {
    super(IFunctionTemplate.TYPE_ID);
  }
  
  public FunctionTemplate(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IFunctionTemplate.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition selectCondition() {
    return _getSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.TemplatePackage.Template_condition);
  }

  public FunctionTemplate setCondition(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition condition) {
    _setSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.TemplatePackage.Template_condition, condition);
    return this;
  }
    
  @Override
  public cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityType selectFunctionalityType() {
    return _getSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityType.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.FunctionalitytypePackage.FunctionalityTypeAware_functionalityType);
  }

  public FunctionTemplate setFunctionalityType(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityType functionalityType) {
    _setSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.FunctionalitytypePackage.FunctionalityTypeAware_functionalityType, functionalityType);
    return this;
  }
    
  @Override
  public cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.javamodel.IObject selectObject() {
    return _getSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.javamodel.IObject.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.ObjectPackage.ObjectAware_object);
  }

  public FunctionTemplate setObject(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.javamodel.IObject object) {
    _setSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.ObjectPackage.ObjectAware_object, object);
    return this;
  }
    
  @Override
  public cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.javamodel.IProcess selectProcess() {
    return _getSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.javamodel.IProcess.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.ProcessPackage.ProcessAware_process);
  }

  public FunctionTemplate setProcess(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.javamodel.IProcess process) {
    _setSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.ProcessPackage.ProcessAware_process, process);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public FunctionTemplate setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.TemplatePackage.Template_condition, visitor);
    _acceptSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityType.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.functionalitytype.FunctionalitytypePackage.FunctionalityTypeAware_functionalityType, visitor);
    _acceptSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.javamodel.IObject.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.object.ObjectPackage.ObjectAware_object, visitor);
    _acceptSingle(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.javamodel.IProcess.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.templatepart.process.ProcessPackage.ProcessAware_process, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2ec24b51-d560-11e5-89ea-2d8d86e9ef89,fjvCjlMCYpuATeWhrV2BdCiAFUM=] */
