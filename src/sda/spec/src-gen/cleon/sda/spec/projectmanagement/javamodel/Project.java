package cleon.sda.spec.projectmanagement.javamodel;

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
  public cleon.sda.spec.projectmanagement.controlling.javamodel.IControlling selectControlling() {
    return _getSingle(cleon.sda.spec.projectmanagement.controlling.javamodel.IControlling.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_controlling);
  }

  public Project setControlling(cleon.sda.spec.projectmanagement.controlling.javamodel.IControlling controlling) {
    _setSingle(cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_controlling, controlling);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning selectPlanning() {
    return _getSingle(cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_planning);
  }

  public Project setPlanning(cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning planning) {
    _setSingle(cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_planning, planning);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocols selectProtocols() {
    return _getSingle(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocols.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_protocols);
  }

  public Project setProtocols(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocols protocols) {
    _setSingle(cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_protocols, protocols);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.ressources.javamodel.IResources selectResources() {
    return _getSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IResources.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_resources);
  }

  public Project setResources(cleon.sda.spec.projectmanagement.ressources.javamodel.IResources resources) {
    _setSingle(cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_resources, resources);
    return this;
  }
    
  @Override
  public cleon.sda.spec.projectmanagement.scope.javamodel.IScope selectScope() {
    return _getSingle(cleon.sda.spec.projectmanagement.scope.javamodel.IScope.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_scope);
  }

  public Project setScope(cleon.sda.spec.projectmanagement.scope.javamodel.IScope scope) {
    _setSingle(cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_scope, scope);
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
    _acceptSingle(cleon.sda.spec.projectmanagement.controlling.javamodel.IControlling.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_controlling, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_planning, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocols.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_protocols, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.ressources.javamodel.IResources.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_resources, visitor);
    _acceptSingle(cleon.sda.spec.projectmanagement.scope.javamodel.IScope.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_scope, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.javamodel.IProject selectToMeScope(cleon.sda.spec.projectmanagement.scope.javamodel.IScope object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.javamodel.IProject.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_scope, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.javamodel.IProject selectToMeResources(cleon.sda.spec.projectmanagement.ressources.javamodel.IResources object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.javamodel.IProject.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_resources, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.javamodel.IProject selectToMePlanning(cleon.sda.spec.projectmanagement.planning.javamodel.IPlanning object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.javamodel.IProject.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_planning, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.javamodel.IProject selectToMeControlling(cleon.sda.spec.projectmanagement.controlling.javamodel.IControlling object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.javamodel.IProject.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_controlling, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.javamodel.IProject selectToMeProtocols(cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocols object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.javamodel.IProject.class, cleon.sda.spec.projectmanagement.ProjectmanagementPackage.Project_protocols, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,be3d7626-ff9b-11e4-ac0a-959b440f987f,fBg4AzGXteshrhJYX2nsduoS53U=] */
