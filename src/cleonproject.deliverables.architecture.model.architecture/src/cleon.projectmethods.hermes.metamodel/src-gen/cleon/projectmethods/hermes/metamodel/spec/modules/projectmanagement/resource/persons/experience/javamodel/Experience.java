package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Experience extends DynamicResource implements IExperience {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExperience> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IExperience>() {
    
    @Override
    public IExperience create() {
      return new Experience();
    }
    
    @Override
    public IExperience create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Experience(resourceRepository, resource);
    }
  
  };

  public Experience() {
    super(IExperience.TYPE_ID);
  }
  
  public Experience(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IExperience.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel.IMaturity selectMaturity() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel.IMaturity.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.ExperiencePackage.Experience_maturity);
  }

  public Experience setMaturity(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel.IMaturity maturity) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.ExperiencePackage.Experience_maturity, maturity);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill selectSkill() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.ExperiencePackage.Experience_skill);
  }

  public Experience setSkill(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill skill) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.ExperiencePackage.Experience_skill, skill);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public Experience setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Experience setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel.IMaturity.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.ExperiencePackage.Experience_maturity, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.ExperiencePackage.Experience_skill, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel.IExperience> selectToMeSkill(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.skills.javamodel.ISkill object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel.IExperience.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.ExperiencePackage.Experience_skill, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel.IExperience> selectToMeMaturity(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel.IMaturity object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.javamodel.IExperience.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.experience.ExperiencePackage.Experience_maturity, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2ba27c0a-b509-11e5-aa95-235930e9af3d,MYb+VuXKVSYwwiMpFSUyoenTMyo=] */
