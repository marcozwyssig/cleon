package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ProjectManagement extends DynamicResource implements IProjectManagement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProjectManagement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProjectManagement>() {
    
    @Override
    public IProjectManagement create() {
      return new ProjectManagement();
    }
    
    @Override
    public IProjectManagement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ProjectManagement(resourceRepository, resource);
    }
  
  };

  public ProjectManagement() {
    super(IProjectManagement.TYPE_ID);
  }
  
  public ProjectManagement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProjectManagement.TYPE_ID);
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
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_planning);
  }

  public ProjectManagement setPlanning(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning planning) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_planning, planning);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocols selectProtocols() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocols.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_protocols);
  }

  public ProjectManagement setProtocols(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocols protocols) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_protocols, protocols);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.javamodel.ISteering selectSteering() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.javamodel.ISteering.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_steering);
  }

  public ProjectManagement setSteering(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.javamodel.ISteering steering) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_steering, steering);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ProjectManagement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_planning, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocols.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_protocols, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.javamodel.ISteering.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_steering, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.javamodel.IProjectManagement selectToMeProtocols(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.protocols.javamodel.IProtocols object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.javamodel.IProjectManagement.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_protocols, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.javamodel.IProjectManagement selectToMePlanning(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.javamodel.IProjectManagement.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_planning, object.getResource());
  }
  
  public static cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.javamodel.IProjectManagement selectToMeSteering(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.javamodel.ISteering object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.javamodel.IProjectManagement.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.ProjectmanagementPackage.ProjectManagement_steering, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1ee9b306-bdf8-11e6-a3f0-c7681ee45a3f,w7gqhHqisEHSGyMQNiLJiV2ALNY=] */
