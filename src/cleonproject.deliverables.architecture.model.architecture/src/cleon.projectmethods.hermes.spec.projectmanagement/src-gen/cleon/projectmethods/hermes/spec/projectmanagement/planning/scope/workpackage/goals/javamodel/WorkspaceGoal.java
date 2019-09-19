package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WorkspaceGoal extends DynamicResource implements IWorkspaceGoal {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkspaceGoal> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkspaceGoal>() {
    
    @Override
    public IWorkspaceGoal create() {
      return new WorkspaceGoal();
    }
    
    @Override
    public IWorkspaceGoal create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WorkspaceGoal(resourceRepository, resource);
    }
  
  };

  public WorkspaceGoal() {
    super(IWorkspaceGoal.TYPE_ID);
  }
  
  public WorkspaceGoal(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWorkspaceGoal.TYPE_ID);
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
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoal selectGoal() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoal.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.goals.GoalsPackage.WorkspaceGoal_goal);
  }

  public WorkspaceGoal setGoal(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoal goal) {
    _setSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.goals.GoalsPackage.WorkspaceGoal_goal, goal);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public WorkspaceGoal setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WorkspaceGoal setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoal.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.goals.GoalsPackage.WorkspaceGoal_goal, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.goals.javamodel.IWorkspaceGoal> selectToMeGoal(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoal object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.goals.javamodel.IWorkspaceGoal.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.goals.GoalsPackage.WorkspaceGoal_goal, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,538b2189-bc93-11e6-904c-8bf6f8927ff0,oN8rF4diEET2uLg6Ga66cxK4fFo=] */
