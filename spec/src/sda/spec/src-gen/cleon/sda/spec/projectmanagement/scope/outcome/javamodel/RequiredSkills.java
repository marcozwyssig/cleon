package cleon.sda.spec.projectmanagement.scope.outcome.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequiredSkills extends DynamicResource implements IRequiredSkills {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequiredSkills> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequiredSkills>() {
    
    @Override
    public IRequiredSkills create() {
      return new RequiredSkills();
    }
    
    @Override
    public IRequiredSkills create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequiredSkills(resourceRepository, resource);
    }
  
  };

  public RequiredSkills() {
    super(IRequiredSkills.TYPE_ID);
  }
  
  public RequiredSkills(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequiredSkills.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance selectImportance() {
    return _getSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.RequiredSkills_importance);
  }

  public RequiredSkills setImportance(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance importance) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.RequiredSkills_importance, importance);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkill selectSkill() {
    return _getSingle(cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkill.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.RequiredSkills_skill);
  }

  public RequiredSkills setSkill(cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkill skill) {
    _setSingle(cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.RequiredSkills_skill, skill);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RequiredSkills setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequiredSkills setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.RequiredSkills_importance, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkill.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.RequiredSkills_skill, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IRequiredSkills> selectToMeSkill(cleon.sda.spec.projectmanagement.resourcemanagement.skills.javamodel.ISkill object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IRequiredSkills.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.RequiredSkills_skill, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IRequiredSkills> selectToMeImportance(cleon.sda.spec.analysis.solution.drivers.javamodel.IGoalImportance object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.outcome.javamodel.IRequiredSkills.class, cleon.sda.spec.projectmanagement.scope.outcome.OutcomePackage.RequiredSkills_importance, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d6b26118-b54a-11e5-bc0c-f35b68c3609a,F5bltRLybnQNrSTaJkvF1uNB64g=] */
