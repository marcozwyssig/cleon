package cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ProjectGoals extends DynamicResource implements IProjectGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProjectGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IProjectGoals>() {
    
    @Override
    public IProjectGoals create() {
      return new ProjectGoals();
    }
    
    @Override
    public IProjectGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ProjectGoals(resourceRepository, resource);
    }
  
  };

  public ProjectGoals() {
    super(IProjectGoals.TYPE_ID);
  }
  
  public ProjectGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IProjectGoals.TYPE_ID);
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

  public ProjectGoals setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoal> selectGoals() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoal.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.GoalsPackage.AbstractGoals_goals);
  }

  public ProjectGoals setGoals(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoal> goals) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.GoalsPackage.AbstractGoals_goals, goals);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IProjectGoal> selectProjectGoals() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IProjectGoal.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.GoalsPackage.ProjectGoals_projectGoals);
  }

  public ProjectGoals setProjectGoals(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IProjectGoal> projectGoals) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.GoalsPackage.ProjectGoals_projectGoals, projectGoals);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ProjectGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IGoal.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.GoalsPackage.AbstractGoals_goals, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IProjectGoal.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.GoalsPackage.ProjectGoals_projectGoals, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IProjectGoals selectToMeProjectGoals(cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IProjectGoal object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.javamodel.IProjectGoals.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.goals.GoalsPackage.ProjectGoals_projectGoals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f5d2463d-210d-11e8-9bf6-d910b575bad9,oJ3z6v/Qb3WQBgsewPeJnZ142SQ=] */