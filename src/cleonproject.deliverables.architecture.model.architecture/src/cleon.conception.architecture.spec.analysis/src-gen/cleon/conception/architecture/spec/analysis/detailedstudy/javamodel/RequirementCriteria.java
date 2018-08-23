package cleon.conception.architecture.spec.analysis.detailedstudy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementCriteria extends DynamicResource implements IRequirementCriteria {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementCriteria> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementCriteria>() {
    
    @Override
    public IRequirementCriteria create() {
      return new RequirementCriteria();
    }
    
    @Override
    public IRequirementCriteria create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementCriteria(resourceRepository, resource);
    }
  
  };

  public RequirementCriteria() {
    super(IRequirementCriteria.TYPE_ID);
  }
  
  public RequirementCriteria(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementCriteria.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectRequirement() {
    return _getSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.architecture.spec.analysis.detailedstudy.DetailedstudyPackage.RequirementCriteria_requirement);
  }

  public RequirementCriteria setRequirement(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
    _setSingle(cleon.conception.architecture.spec.analysis.detailedstudy.DetailedstudyPackage.RequirementCriteria_requirement, requirement);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RequirementCriteria setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementCriteria setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.conception.architecture.spec.analysis.detailedstudy.DetailedstudyPackage.RequirementCriteria_requirement, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementCriteria> selectToMeRequirement(cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.conception.architecture.spec.analysis.detailedstudy.javamodel.IRequirementCriteria.class, cleon.conception.architecture.spec.analysis.detailedstudy.DetailedstudyPackage.RequirementCriteria_requirement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5f0c4609-a6f8-11e8-9c81-8bd68c62e435,Kri6U3LCyANGCuYfhAkiMZYNt1o=] */
