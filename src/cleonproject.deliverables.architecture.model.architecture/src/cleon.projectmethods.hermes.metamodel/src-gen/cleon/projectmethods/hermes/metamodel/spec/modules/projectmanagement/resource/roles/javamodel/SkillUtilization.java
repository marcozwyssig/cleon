package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SkillUtilization extends DynamicResource implements ISkillUtilization {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISkillUtilization> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISkillUtilization>() {
    
    @Override
    public ISkillUtilization create() {
      return new SkillUtilization();
    }
    
    @Override
    public ISkillUtilization create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SkillUtilization(resourceRepository, resource);
    }
  
  };

  public SkillUtilization() {
    super(ISkillUtilization.TYPE_ID);
  }
  
  public SkillUtilization(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISkillUtilization.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.common.resources.metamodel.spec.importance.javamodel.IImportance selectImportance() {
    return _getSingle(cleon.common.resources.metamodel.spec.importance.javamodel.IImportance.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.RolesPackage.SkillUtilization_importance);
  }

  public SkillUtilization setImportance(cleon.common.resources.metamodel.spec.importance.javamodel.IImportance importance) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.RolesPackage.SkillUtilization_importance, importance);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill selectSkill() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.RolesPackage.SkillUtilization_skill);
  }

  public SkillUtilization setSkill(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill skill) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.RolesPackage.SkillUtilization_skill, skill);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public SkillUtilization setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SkillUtilization setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.common.resources.metamodel.spec.importance.javamodel.IImportance.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.RolesPackage.SkillUtilization_importance, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.RolesPackage.SkillUtilization_skill, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.javamodel.ISkillUtilization> selectToMeSkill(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.javamodel.ISkillUtilization.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.RolesPackage.SkillUtilization_skill, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.javamodel.ISkillUtilization> selectToMeImportance(cleon.common.resources.metamodel.spec.importance.javamodel.IImportance object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.javamodel.ISkillUtilization.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.roles.RolesPackage.SkillUtilization_importance, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d6b26118-b54a-11e5-bc0c-f35b68c3609a,gwphkdwvlD60XNmuwxky6z/DN9Q=] */
