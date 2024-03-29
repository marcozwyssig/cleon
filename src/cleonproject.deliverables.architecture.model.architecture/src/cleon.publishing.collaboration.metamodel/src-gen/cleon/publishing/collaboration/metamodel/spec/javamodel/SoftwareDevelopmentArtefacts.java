package cleon.publishing.collaboration.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SoftwareDevelopmentArtefacts extends DynamicResource implements ISoftwareDevelopmentArtefacts {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareDevelopmentArtefacts> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISoftwareDevelopmentArtefacts>() {
    
    @Override
    public ISoftwareDevelopmentArtefacts create() {
      return new SoftwareDevelopmentArtefacts();
    }
    
    @Override
    public ISoftwareDevelopmentArtefacts create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SoftwareDevelopmentArtefacts(resourceRepository, resource);
    }
  
  };

  public SoftwareDevelopmentArtefacts() {
    super(ISoftwareDevelopmentArtefacts.TYPE_ID);
  }
  
  public SoftwareDevelopmentArtefacts(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISoftwareDevelopmentArtefacts.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning selectPlanning() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_planning);
  }

  public SoftwareDevelopmentArtefacts setPlanning(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning planning) {
    _setSingle(cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_planning, planning);
    return this;
  }
    
  @Override
  public cleon.publishing.collaboration.metamodel.spec.manuals.readme.javamodel.IReadme selectReadme() {
    return _getSingle(cleon.publishing.collaboration.metamodel.spec.manuals.readme.javamodel.IReadme.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_readme);
  }

  public SoftwareDevelopmentArtefacts setReadme(cleon.publishing.collaboration.metamodel.spec.manuals.readme.javamodel.IReadme readme) {
    _setSingle(cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_readme, readme);
    return this;
  }
    
  @Override
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectRequirementManagement() {
    return _getSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_requirementManagement);
  }

  public SoftwareDevelopmentArtefacts setRequirementManagement(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument requirementManagement) {
    _setSingle(cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_requirementManagement, requirementManagement);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy> selectSolutionAnalysis() {
    return _getList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_solutionAnalysis);
  }

  public SoftwareDevelopmentArtefacts setSolutionAnalysis(java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy> solutionAnalysis) {
    _setList(cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_solutionAnalysis, solutionAnalysis);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.javamodel.ITestConceptDocument selectTesting() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.javamodel.ITestConceptDocument.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_testing);
  }

  public SoftwareDevelopmentArtefacts setTesting(cleon.testingmethods.hermes.metamodel.spec._01_concept.javamodel.ITestConceptDocument testing) {
    _setSingle(cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_testing, testing);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SoftwareDevelopmentArtefacts setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_planning, visitor);
    _acceptSingle(cleon.publishing.collaboration.metamodel.spec.manuals.readme.javamodel.IReadme.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_readme, visitor);
    _acceptSingle(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_requirementManagement, visitor);
    _acceptList(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_solutionAnalysis, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._01_concept.javamodel.ITestConceptDocument.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_testing, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.publishing.collaboration.metamodel.spec.javamodel.ISoftwareDevelopmentArtefacts selectToMeRequirementManagement(cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.collaboration.metamodel.spec.javamodel.ISoftwareDevelopmentArtefacts.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_requirementManagement, object.getResource());
  }
  
  public static cleon.publishing.collaboration.metamodel.spec.javamodel.ISoftwareDevelopmentArtefacts selectToMePlanning(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.collaboration.metamodel.spec.javamodel.ISoftwareDevelopmentArtefacts.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_planning, object.getResource());
  }
  
  public static cleon.publishing.collaboration.metamodel.spec.javamodel.ISoftwareDevelopmentArtefacts selectToMeSolutionAnalysis(cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.javamodel.IDetailstudy object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.collaboration.metamodel.spec.javamodel.ISoftwareDevelopmentArtefacts.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_solutionAnalysis, object.getResource());
  }
  
  public static cleon.publishing.collaboration.metamodel.spec.javamodel.ISoftwareDevelopmentArtefacts selectToMeReadme(cleon.publishing.collaboration.metamodel.spec.manuals.readme.javamodel.IReadme object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.collaboration.metamodel.spec.javamodel.ISoftwareDevelopmentArtefacts.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_readme, object.getResource());
  }
  
  public static cleon.publishing.collaboration.metamodel.spec.javamodel.ISoftwareDevelopmentArtefacts selectToMeTesting(cleon.testingmethods.hermes.metamodel.spec._01_concept.javamodel.ITestConceptDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.publishing.collaboration.metamodel.spec.javamodel.ISoftwareDevelopmentArtefacts.class, cleon.publishing.collaboration.metamodel.spec.SpecPackage.SoftwareDevelopmentArtefacts_testing, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ea1700ac-ff9a-11e4-ac0a-959b440f987f,ar5xGGKtjVXeGtYkTsaiJI3q6lQ=] */
