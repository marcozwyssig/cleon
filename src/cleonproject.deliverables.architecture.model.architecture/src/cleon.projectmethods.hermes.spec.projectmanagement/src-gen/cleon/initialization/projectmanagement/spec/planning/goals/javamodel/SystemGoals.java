package cleon.initialization.projectmanagement.spec.planning.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SystemGoals extends DynamicResource implements ISystemGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISystemGoals>() {
    
    @Override
    public ISystemGoals create() {
      return new SystemGoals();
    }
    
    @Override
    public ISystemGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SystemGoals(resourceRepository, resource);
    }
  
  };

  public SystemGoals() {
    super(ISystemGoals.TYPE_ID);
  }
  
  public SystemGoals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISystemGoals.TYPE_ID);
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

  public SystemGoals setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoal> selectGoals() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoal.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.AbstractGoals_goals);
  }

  public SystemGoals setGoals(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoal> goals) {
    _setList(cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.AbstractGoals_goals, goals);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoal> selectSystemGoals() {
    return _getList(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoal.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.SystemGoals_systemGoals);
  }

  public SystemGoals setSystemGoals(java.util.List<? extends cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoal> systemGoals) {
    _setList(cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.SystemGoals_systemGoals, systemGoals);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SystemGoals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoal.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.AbstractGoals_goals, visitor);
    _acceptList(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoal.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.SystemGoals_systemGoals, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoals selectToMeSystemGoals(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoal object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoals.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.SystemGoals_systemGoals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,1fabee5e-210e-11e8-9bf6-d910b575bad9,BjbPaqq8CEMf+f4+cHfSQ6QbPmw=] */
