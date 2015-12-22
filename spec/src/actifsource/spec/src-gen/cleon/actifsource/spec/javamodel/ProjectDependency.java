package cleon.actifsource.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ProjectDependency extends DynamicResource implements IProjectDependency {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProjectDependency> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProjectDependency>() {
    
    @Override
    public IProjectDependency create() {
      return new ProjectDependency();
    }
    
    @Override
    public IProjectDependency create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ProjectDependency(resourceRepository, resource);
    }
  
  };

  public ProjectDependency() {
    super(IProjectDependency.TYPE_ID);
  }
  
  public ProjectDependency(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProjectDependency.TYPE_ID);
  }

  // relations
  
  @Override
  public java.util.List<? extends cleon.actifsource.spec.javamodel.IProject> selectTo() {
    return _getList(cleon.actifsource.spec.javamodel.IProject.class, cleon.actifsource.spec.SpecPackage.ProjectDependency_to);
  }

  public ProjectDependency setTo(java.util.List<? extends cleon.actifsource.spec.javamodel.IProject> to) {
    _setList(cleon.actifsource.spec.SpecPackage.ProjectDependency_to, to);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ProjectDependency setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptList(cleon.actifsource.spec.javamodel.IProject.class, cleon.actifsource.spec.SpecPackage.ProjectDependency_to, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.actifsource.spec.javamodel.IProjectDependency> selectToMeTo(cleon.actifsource.spec.javamodel.IProject object) {
    return _getToMeList(object.getRepository(), cleon.actifsource.spec.javamodel.IProjectDependency.class, cleon.actifsource.spec.SpecPackage.ProjectDependency_to, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d8688469-4260-11e5-8a2d-599443ec8ff4,5Ay0tG+eHweLb/KsFvv8N8jnyqg=] */
