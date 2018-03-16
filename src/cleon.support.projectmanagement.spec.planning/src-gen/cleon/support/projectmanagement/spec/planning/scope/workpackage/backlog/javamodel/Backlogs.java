package cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Backlogs extends DynamicResource implements IBacklogs {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklogs> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IBacklogs>() {
    
    @Override
    public IBacklogs create() {
      return new Backlogs();
    }
    
    @Override
    public IBacklogs create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Backlogs(resourceRepository, resource);
    }
  
  };

  public Backlogs() {
    super(IBacklogs.TYPE_ID);
  }
  
  public Backlogs(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IBacklogs.TYPE_ID);
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
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog> selectBacklog() {
    return _getMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlogs_backlog);
  }

  public Backlogs setBacklog(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog> backlog) {
    _setMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlogs_backlog, backlog);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Backlogs setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Backlogs setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptMap(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlogs_backlog, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklogs selectToMeBacklog(cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklog object) {
    return _getToMeSingle(object.getRepository(), cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.javamodel.IBacklogs.class, cleon.support.projectmanagement.spec.planning.scope.workpackage.backlog.BacklogPackage.Backlogs_backlog, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,451dafb7-b9c4-11e5-a5dc-db9071475fc6,hHsOOF/tDf791FQQ9DMZ0b+uqGM=] */
