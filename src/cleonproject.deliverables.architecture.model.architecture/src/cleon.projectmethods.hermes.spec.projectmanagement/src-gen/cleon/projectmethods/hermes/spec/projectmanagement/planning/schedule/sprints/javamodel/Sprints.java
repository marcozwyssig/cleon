package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Sprints extends DynamicResource implements ISprints {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprints> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISprints>() {
    
    @Override
    public ISprints create() {
      return new Sprints();
    }
    
    @Override
    public ISprints create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Sprints(resourceRepository, resource);
    }
  
  };

  public Sprints() {
    super(ISprints.TYPE_ID);
  }
  
  public Sprints(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISprints.TYPE_ID);
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
  public java.lang.Integer selectDaysPerSprint() {
    return _getSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprints_daysPerSprint);
  }
    
  public void setDaysPerSprint(java.lang.Integer daysPerSprint) {
     _setSingleAttribute(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprints_daysPerSprint, daysPerSprint);
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

  public Sprints setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint> selectSprints() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprints_sprints);
  }

  public Sprints setSprints(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint> sprints) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprints_sprints, sprints);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Sprints setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprints_daysPerSprint, visitor);
    _acceptListAttribute(java.lang.String.class, cleon.common.resources.spec.resources.descriptions.DescriptionsPackage.SimpleDescription_descriptions, visitor);
    // relations
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprints_sprints, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprints selectToMeSprints(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprint object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.javamodel.ISprints.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.sprints.SprintsPackage.Sprints_sprints, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,8fe47fd8-d122-11e8-882b-c9297140cb78,GI8TdrR6OFLnFry4VT6t7NNICu0=] */
