package cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class WorkspaceGoals extends DynamicResource implements IWorkspaceGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkspaceGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IWorkspaceGoals>() {
    
    @Override
    public IWorkspaceGoals create() {
      return new WorkspaceGoals();
    }
    
    @Override
    public IWorkspaceGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new WorkspaceGoals(resourceRepository, resource);
    }
  
  };

  public WorkspaceGoals() {
    super(IWorkspaceGoals.TYPE_ID);
  }
  
  public WorkspaceGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IWorkspaceGoals.TYPE_ID);
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
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public WorkspaceGoals setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public WorkspaceGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.javamodel.IWorkspaceGoal> selectWorkpackageGoals() {
    return _getMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.javamodel.IWorkspaceGoal.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.GoalsPackage.WorkspaceGoals_workpackageGoals);
  }

  public WorkspaceGoals setWorkpackageGoals(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.javamodel.IWorkspaceGoal> workpackageGoals) {
    _setMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.GoalsPackage.WorkspaceGoals_workpackageGoals, workpackageGoals);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
    _acceptMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.javamodel.IWorkspaceGoal.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.GoalsPackage.WorkspaceGoals_workpackageGoals, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.javamodel.IWorkspaceGoals selectToMeWorkpackageGoals(cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.javamodel.IWorkspaceGoal object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.javamodel.IWorkspaceGoals.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.goals.GoalsPackage.WorkspaceGoals_workpackageGoals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1843ce27-bc93-11e6-904c-8bf6f8927ff0,/kF9iKP9APdZ2sgnjoq0p3V2hlU=] */
