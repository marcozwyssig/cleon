package cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SprintCapacity extends DynamicResource implements ISprintCapacity {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintCapacity> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprintCapacity>() {
    
    @Override
    public ISprintCapacity create() {
      return new SprintCapacity();
    }
    
    @Override
    public ISprintCapacity create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SprintCapacity(resourceRepository, resource);
    }
  
  };

  public SprintCapacity() {
    super(ISprintCapacity.TYPE_ID);
  }
  
  public SprintCapacity(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprintCapacity.TYPE_ID);
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

  public SprintCapacity setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity> selectPersonCapacity() {
    return _getMap(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintCapacity_personCapacity);
  }

  public SprintCapacity setPersonCapacity(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity> personCapacity) {
    _setMap(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintCapacity_personCapacity, personCapacity);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SprintCapacity setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptMap(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintCapacity_personCapacity, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity selectToMePersonCapacity(cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.IPersonCapacity object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.javamodel.ISprintCapacity.class, cleon.initialization.projectmanagement.spec.planning.schedule.sprintplanning.SprintplanningPackage.SprintCapacity_personCapacity, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ff83f76d-c00b-11e5-a165-d34765931e10,zD1J+cEAxLFYx1OfJmF1BrdxJVU=] */