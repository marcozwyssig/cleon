package cleon.initialization.projectmanagement.spec.planning.goals.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Goals extends DynamicResource implements IGoals {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoals> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IGoals>() {
    
    @Override
    public IGoals create() {
      return new Goals();
    }
    
    @Override
    public IGoals create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Goals(resourceRepository, resource);
    }
  
  };

  public Goals() {
    super(IGoals.TYPE_ID);
  }
  
  public Goals(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IGoals.TYPE_ID);
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

  public Goals setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IProjectGoals selectProjectGoals() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IProjectGoals.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.Goals_projectGoals);
  }

  public Goals setProjectGoals(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IProjectGoals projectGoals) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.Goals_projectGoals, projectGoals);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoals selectSystemGoals() {
    return _getSingle(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoals.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.Goals_systemGoals);
  }

  public Goals setSystemGoals(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoals systemGoals) {
    _setSingle(cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.Goals_systemGoals, systemGoals);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Goals setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IProjectGoals.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.Goals_projectGoals, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoals.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.Goals_systemGoals, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals selectToMeProjectGoals(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IProjectGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.Goals_projectGoals, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals selectToMeSystemGoals(cleon.initialization.projectmanagement.spec.planning.goals.javamodel.ISystemGoals object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.goals.javamodel.IGoals.class, cleon.initialization.projectmanagement.spec.planning.goals.GoalsPackage.Goals_systemGoals, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,84cb4681-bc87-11e6-b169-a12bde5a1c7c,HZy/pWNfD/tPUKl3cyUfHUiaWNM=] */
