package cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class RequirementCoverage extends DynamicResource implements IRequirementCoverage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementCoverage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRequirementCoverage>() {
    
    @Override
    public IRequirementCoverage create() {
      return new RequirementCoverage();
    }
    
    @Override
    public IRequirementCoverage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new RequirementCoverage(resourceRepository, resource);
    }
  
  };

  public RequirementCoverage() {
    super(IRequirementCoverage.TYPE_ID);
  }
  
  public RequirementCoverage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRequirementCoverage.TYPE_ID);
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
    return _getListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions);
  }
    
  public void setDescriptions(java.util.List<java.lang.String> descriptions) {
     _setListAttribute(cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, descriptions);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectRequirement() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverage_requirement);
  }

  public RequirementCoverage setRequirement(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverage_requirement, requirement);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCover> selectRequirementCoverages() {
    return _getList(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCover.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverage_requirementCoverages);
  }

  public RequirementCoverage setRequirementCoverages(java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCover> requirementCoverages) {
    _setList(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverage_requirementCoverages, requirementCoverages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public RequirementCoverage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public RequirementCoverage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.metamodel.spec.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverage_requirement, visitor);
    _acceptList(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCover.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverage_requirementCoverages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverage> selectToMeRequirement(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverage.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverage_requirement, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverage> selectToMeRequirementCoverages(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCover object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCoverage.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverage_requirementCoverages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c9479b53-ece1-11e8-8149-8542373915bf,VxVZAkNCzgUIUrbHj9LR51ozVoo=] */
