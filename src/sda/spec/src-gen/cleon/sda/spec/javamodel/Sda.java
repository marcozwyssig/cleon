package cleon.sda.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Sda extends DynamicResource implements ISda {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISda> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISda>() {
    
    @Override
    public ISda create() {
      return new Sda();
    }
    
    @Override
    public ISda create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Sda(resourceRepository, resource);
    }
  
  };

  public Sda() {
    super(ISda.TYPE_ID);
  }
  
  public Sda(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISda.TYPE_ID);
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
    return _getSingle(cleon.sda.spec.projectmanagement.javamodel.IProject.class, cleon.sda.spec.SpecPackage.Sda_project);
  }

  public Sda setProject(cleon.sda.spec.projectmanagement.javamodel.IProject project) {
    _setSingle(cleon.sda.spec.SpecPackage.Sda_project, project);
    return this;
  }
    
  @Override
  public cleon.sda.spec.manuals.readme.javamodel.IReadme selectReadme() {
    return _getSingle(cleon.sda.spec.manuals.readme.javamodel.IReadme.class, cleon.sda.spec.SpecPackage.Sda_readme);
  }

  public Sda setReadme(cleon.sda.spec.manuals.readme.javamodel.IReadme readme) {
    _setSingle(cleon.sda.spec.SpecPackage.Sda_readme, readme);
    return this;
  }
    
  @Override
  public cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirements selectRequirements() {
    return _getSingle(cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirements.class, cleon.sda.spec.SpecPackage.Sda_requirements);
  }

  public Sda setRequirements(cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirements requirements) {
    _setSingle(cleon.sda.spec.SpecPackage.Sda_requirements, requirements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis> selectSolutionAnalysis() {
    return _getList(cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis.class, cleon.sda.spec.SpecPackage.Sda_solutionAnalysis);
  }

  public Sda setSolutionAnalysis(java.util.List<? extends cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis> solutionAnalysis) {
    _setList(cleon.sda.spec.SpecPackage.Sda_solutionAnalysis, solutionAnalysis);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Sda setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.sda.spec.projectmanagement.javamodel.IProject.class, cleon.sda.spec.SpecPackage.Sda_project, visitor);
    _acceptSingle(cleon.sda.spec.manuals.readme.javamodel.IReadme.class, cleon.sda.spec.SpecPackage.Sda_readme, visitor);
    _acceptSingle(cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirements.class, cleon.sda.spec.SpecPackage.Sda_requirements, visitor);
    _acceptList(cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis.class, cleon.sda.spec.SpecPackage.Sda_solutionAnalysis, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.javamodel.ISda selectToMeRequirements(cleon.sda.spec.requirementmanagement.requirements.javamodel.IRequirements object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.javamodel.ISda.class, cleon.sda.spec.SpecPackage.Sda_requirements, object.getResource());
  }
  
  public static cleon.sda.spec.javamodel.ISda selectToMeProject(cleon.sda.spec.projectmanagement.javamodel.IProject object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.javamodel.ISda.class, cleon.sda.spec.SpecPackage.Sda_project, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.javamodel.ISda> selectToMeSolutionAnalysis(cleon.sda.spec.analysis.solution.javamodel.ISolutionAnalysis object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.javamodel.ISda.class, cleon.sda.spec.SpecPackage.Sda_solutionAnalysis, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.javamodel.ISda> selectToMeReadme(cleon.sda.spec.manuals.readme.javamodel.IReadme object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.javamodel.ISda.class, cleon.sda.spec.SpecPackage.Sda_readme, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ea1700ac-ff9a-11e4-ac0a-959b440f987f,r264aM6F5Ta79ZhES0sZvdESpcs=] */
