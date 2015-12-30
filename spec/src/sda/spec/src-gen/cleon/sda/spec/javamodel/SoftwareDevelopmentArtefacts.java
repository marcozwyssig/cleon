package cleon.sda.spec.javamodel;

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
  public cleon.sda.spec.projectmanagement.javamodel.IProject selectProject() {
    return _getSingle(cleon.sda.spec.projectmanagement.javamodel.IProject.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_project);
  }

  public SoftwareDevelopmentArtefacts setProject(cleon.sda.spec.projectmanagement.javamodel.IProject project) {
    _setSingle(cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_project, project);
    return this;
  }
    
  @Override
  public cleon.sda.spec.manuals.readme.javamodel.IReadme selectReadme() {
    return _getSingle(cleon.sda.spec.manuals.readme.javamodel.IReadme.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_readme);
  }

  public SoftwareDevelopmentArtefacts setReadme(cleon.sda.spec.manuals.readme.javamodel.IReadme readme) {
    _setSingle(cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_readme, readme);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.javamodel.IRequirementsManagement> selectRequirementManagement() {
    return _getList(cleon.sda.spec.requirementsmanagement.javamodel.IRequirementsManagement.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_requirementManagement);
  }

  public SoftwareDevelopmentArtefacts setRequirementManagement(java.util.List<? extends cleon.sda.spec.requirementsmanagement.javamodel.IRequirementsManagement> requirementManagement) {
    _setList(cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_requirementManagement, requirementManagement);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis> selectSolutionAnalysis() {
    return _getList(cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_solutionAnalysis);
  }

  public SoftwareDevelopmentArtefacts setSolutionAnalysis(java.util.List<? extends cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis> solutionAnalysis) {
    _setList(cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_solutionAnalysis, solutionAnalysis);
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
    _acceptSingle(cleon.sda.spec.projectmanagement.javamodel.IProject.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_project, visitor);
    _acceptSingle(cleon.sda.spec.manuals.readme.javamodel.IReadme.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_readme, visitor);
    _acceptList(cleon.sda.spec.requirementsmanagement.javamodel.IRequirementsManagement.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_requirementManagement, visitor);
    _acceptList(cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_solutionAnalysis, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.javamodel.ISoftwareDevelopmentArtefacts selectToMeRequirementManagement(cleon.sda.spec.requirementsmanagement.javamodel.IRequirementsManagement object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.javamodel.ISoftwareDevelopmentArtefacts.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_requirementManagement, object.getResource());
  }
  
  public static cleon.sda.spec.javamodel.ISoftwareDevelopmentArtefacts selectToMeProject(cleon.sda.spec.projectmanagement.javamodel.IProject object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.javamodel.ISoftwareDevelopmentArtefacts.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_project, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.javamodel.ISoftwareDevelopmentArtefacts> selectToMeSolutionAnalysis(cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.javamodel.ISoftwareDevelopmentArtefacts.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_solutionAnalysis, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.javamodel.ISoftwareDevelopmentArtefacts> selectToMeReadme(cleon.sda.spec.manuals.readme.javamodel.IReadme object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.javamodel.ISoftwareDevelopmentArtefacts.class, cleon.sda.spec.SpecPackage.SoftwareDevelopmentArtefacts_readme, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ea1700ac-ff9a-11e4-ac0a-959b440f987f,ed5vmtBONAu3QBcGCyY0fe359NU=] */
