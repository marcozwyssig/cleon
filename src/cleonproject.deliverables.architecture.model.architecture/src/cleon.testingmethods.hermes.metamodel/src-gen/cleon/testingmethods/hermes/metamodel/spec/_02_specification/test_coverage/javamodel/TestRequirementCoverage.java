package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestRequirementCoverage extends DynamicResource implements ITestRequirementCoverage {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestRequirementCoverage> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestRequirementCoverage>() {
    
    @Override
    public ITestRequirementCoverage create() {
      return new TestRequirementCoverage();
    }
    
    @Override
    public ITestRequirementCoverage create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestRequirementCoverage(resourceRepository, resource);
    }
  
  };

  public TestRequirementCoverage() {
    super(ITestRequirementCoverage.TYPE_ID);
  }
  
  public TestRequirementCoverage(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestRequirementCoverage.TYPE_ID);
  }

  // attributes
  
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

  public TestRequirementCoverage setRequirement(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement requirement) {
    _setSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementCoverage_requirement, requirement);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITest> selectRequirementCoverages() {
    return _getList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITest.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.Test_coveragePackage.TestRequirementCoverage_requirementCoverages);
  }

  public TestRequirementCoverage setRequirementCoverages(java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITest> requirementCoverages) {
    _setList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.Test_coveragePackage.TestRequirementCoverage_requirementCoverages, requirementCoverages);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public TestRequirementCoverage setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestRequirementCoverage setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITest.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.Test_coveragePackage.TestRequirementCoverage_requirementCoverages, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverage> selectToMeRequirementCoverages(cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITest object) {
    return _getToMeList(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverage.class, cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.Test_coveragePackage.TestRequirementCoverage_requirementCoverages, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4f72f2a3-5169-11e9-bb61-971a423d31e9,BjPI8cK1fW0ctjlcUsxP6sQhpfw=] */
