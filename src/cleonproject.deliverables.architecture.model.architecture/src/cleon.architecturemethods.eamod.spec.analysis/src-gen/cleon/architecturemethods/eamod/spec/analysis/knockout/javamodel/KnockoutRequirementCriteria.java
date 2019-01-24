package cleon.architecturemethods.eamod.spec.analysis.knockout.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class KnockoutRequirementCriteria extends DynamicResource implements IKnockoutRequirementCriteria {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKnockoutRequirementCriteria> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IKnockoutRequirementCriteria>() {
    
    @Override
    public IKnockoutRequirementCriteria create() {
      return new KnockoutRequirementCriteria();
    }
    
    @Override
    public IKnockoutRequirementCriteria create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new KnockoutRequirementCriteria(resourceRepository, resource);
    }
  
  };

  public KnockoutRequirementCriteria() {
    super(IKnockoutRequirementCriteria.TYPE_ID);
  }
  
  public KnockoutRequirementCriteria(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IKnockoutRequirementCriteria.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement selectRequirement() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement.class, cleon.architecturemethods.eamod.spec.analysis.knockout.KnockoutPackage.KnockoutRequirementCriteria_requirement);
  }

  public KnockoutRequirementCriteria setRequirement(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement requirement) {
    _setSingle(cleon.architecturemethods.eamod.spec.analysis.knockout.KnockoutPackage.KnockoutRequirementCriteria_requirement, requirement);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public KnockoutRequirementCriteria setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public KnockoutRequirementCriteria setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement.class, cleon.architecturemethods.eamod.spec.analysis.knockout.KnockoutPackage.KnockoutRequirementCriteria_requirement, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.analysis.knockout.javamodel.IKnockoutRequirementCriteria> selectToMeRequirement(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.knockout.javamodel.IKnockoutRequirementCriteria.class, cleon.architecturemethods.eamod.spec.analysis.knockout.KnockoutPackage.KnockoutRequirementCriteria_requirement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3abda751-202f-11e9-83b3-a16e26b4cc59,ZQjJUK4V5rdcUAWnHE7rYI+NASM=] */
