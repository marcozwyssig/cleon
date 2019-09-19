package cleon.architecturemethods.eamod.spec.analysis.weighting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WeightingRequirementCriteria extends DynamicResource implements IWeightingRequirementCriteria {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeightingRequirementCriteria> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWeightingRequirementCriteria>() {
    
    @Override
    public IWeightingRequirementCriteria create() {
      return new WeightingRequirementCriteria();
    }
    
    @Override
    public IWeightingRequirementCriteria create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WeightingRequirementCriteria(resourceRepository, resource);
    }
  
  };

  public WeightingRequirementCriteria() {
    super(IWeightingRequirementCriteria.TYPE_ID);
  }
  
  public WeightingRequirementCriteria(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWeightingRequirementCriteria.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement selectRequirement() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement.class, cleon.architecturemethods.eamod.spec.analysis.weighting.WeightingPackage.WeightingRequirementCriteria_requirement);
  }

  public WeightingRequirementCriteria setRequirement(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement requirement) {
    _setSingle(cleon.architecturemethods.eamod.spec.analysis.weighting.WeightingPackage.WeightingRequirementCriteria_requirement, requirement);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public WeightingRequirementCriteria setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WeightingRequirementCriteria setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement.class, cleon.architecturemethods.eamod.spec.analysis.weighting.WeightingPackage.WeightingRequirementCriteria_requirement, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.spec.analysis.weighting.javamodel.IWeightingRequirementCriteria> selectToMeRequirement(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.spec.analysis.weighting.javamodel.IWeightingRequirementCriteria.class, cleon.architecturemethods.eamod.spec.analysis.weighting.WeightingPackage.WeightingRequirementCriteria_requirement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f0c4609-a6f8-11e8-9c81-8bd68c62e435,pNAPIxyCvviTtr8o9X1Ctrlhuug=] */
