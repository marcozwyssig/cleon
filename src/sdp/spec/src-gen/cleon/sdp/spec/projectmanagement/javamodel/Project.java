package cleon.sdp.spec.projectmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Project extends DynamicResource implements IProject {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProject> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProject>() {
    
    @Override
    public IProject create() {
      return new Project();
    }
    
    @Override
    public IProject create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Project(resourceRepository, resource);
    }
  
  };

  public Project() {
    super(IProject.TYPE_ID);
  }
  
  public Project(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProject.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.sdp.spec.projectmanagement.backlog.javamodel.IBacklog selectProductPlanning() {
    return _getSingle(cleon.sdp.spec.projectmanagement.backlog.javamodel.IBacklog.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_productPlanning);
  }

  public Project setProductPlanning(cleon.sdp.spec.projectmanagement.backlog.javamodel.IBacklog productPlanning) {
    _setSingle(cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_productPlanning, productPlanning);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.sdp.spec.projectmanagement.release.javamodel.IRelease> selectReleasePlanning() {
    return _getList(cleon.sdp.spec.projectmanagement.release.javamodel.IRelease.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_releasePlanning);
  }

  public Project setReleasePlanning(java.util.List<? extends cleon.sdp.spec.projectmanagement.release.javamodel.IRelease> releasePlanning) {
    _setList(cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_releasePlanning, releasePlanning);
    return this;
  }
    
  @Override
  public cleon.sdp.spec.projectmanagement.javamodel.IResources selectResources() {
    return _getSingle(cleon.sdp.spec.projectmanagement.javamodel.IResources.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_resources);
  }

  public Project setResources(cleon.sdp.spec.projectmanagement.javamodel.IResources resources) {
    _setSingle(cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_resources, resources);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Project setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.sdp.spec.projectmanagement.backlog.javamodel.IBacklog.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_productPlanning, visitor);
    _acceptList(cleon.sdp.spec.projectmanagement.release.javamodel.IRelease.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_releasePlanning, visitor);
    _acceptSingle(cleon.sdp.spec.projectmanagement.javamodel.IResources.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_resources, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sdp.spec.projectmanagement.javamodel.IProject selectToMeProductPlanning(cleon.sdp.spec.projectmanagement.backlog.javamodel.IBacklog object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.projectmanagement.javamodel.IProject.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_productPlanning, object.getResource());
  }
  
  public static cleon.sdp.spec.projectmanagement.javamodel.IProject selectToMeResources(cleon.sdp.spec.projectmanagement.javamodel.IResources object) {
    return _getToMeSingle(object.getRepository(), cleon.sdp.spec.projectmanagement.javamodel.IProject.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_resources, object.getResource());
  }
  
  public static java.util.List<cleon.sdp.spec.projectmanagement.javamodel.IProject> selectToMeReleasePlanning(cleon.sdp.spec.projectmanagement.release.javamodel.IRelease object) {
    return _getToMeList(object.getRepository(), cleon.sdp.spec.projectmanagement.javamodel.IProject.class, cleon.sdp.spec.projectmanagement.ProjectmanagementPackage.Project_releasePlanning, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,be3d7626-ff9b-11e4-ac0a-959b440f987f,QAG3ztD3C2E6UyYDS/7r6lgNlZk=] */
