package cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementCoverageDescription extends DynamicResource implements IRequirementCoverageDescription {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementCoverageDescription> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementCoverageDescription>() {
    
    @Override
    public IRequirementCoverageDescription create() {
      return new RequirementCoverageDescription();
    }
    
    @Override
    public IRequirementCoverageDescription create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementCoverageDescription(resourceRepository, resource);
    }
  
  };

  public RequirementCoverageDescription() {
    super(IRequirementCoverageDescription.TYPE_ID);
  }
  
  public RequirementCoverageDescription(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementCoverageDescription.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.List<java.lang.String> selectDescriptions() {
    return _getListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectRequirement() {
    return _getSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.RequirementCoverageDescription_requirement);
  }

  public RequirementCoverageDescription setRequirement(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
    _setSingle(cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.RequirementCoverageDescription_requirement, requirement);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RequirementCoverageDescription setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementCoverageDescription setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.RequirementCoverageDescription_requirement, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirementCoverageDescription> selectToMeRequirement(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage.javamodel.IRequirementCoverageDescription.class, cleon.architecturemethods.arc42.spec.arc42._12_requirements_coverage._12_requirements_coveragePackage.RequirementCoverageDescription_requirement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0562087c-01e5-11e9-9c9d-8d52d6745026,IffQKCU0FOjZ/v1LLMi3fUtQVyo=] */
