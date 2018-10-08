package cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SprintBacklog extends DynamicResource implements ISprintBacklog {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintBacklog> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintBacklog>() {
    
    @Override
    public ISprintBacklog create() {
      return new SprintBacklog();
    }
    
    @Override
    public ISprintBacklog create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SprintBacklog(resourceRepository, resource);
    }
  
  };

  public SprintBacklog() {
    super(ISprintBacklog.TYPE_ID);
  }
  
  public SprintBacklog(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprintBacklog.TYPE_ID);
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

  public SprintBacklog setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SprintBacklog setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemBase> selectWorkItems() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemBase.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintBacklog_workItems);
  }

  public SprintBacklog setWorkItems(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemBase> workItems) {
    _setList(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintBacklog_workItems, workItems);
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
    _acceptList(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemBase.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintBacklog_workItems, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog selectToMeWorkItems(cleon.initialization.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IWorkItemBase object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintBacklog.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintBacklog_workItems, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d13f5581-c00b-11e5-a165-d34765931e10,acJ9qSotXWvVqLvL7+aoLg2cF/k=] */