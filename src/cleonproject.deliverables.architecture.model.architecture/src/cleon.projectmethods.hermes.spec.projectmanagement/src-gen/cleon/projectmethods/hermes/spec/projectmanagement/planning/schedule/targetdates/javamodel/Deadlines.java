package cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Deadlines extends DynamicResource implements IDeadlines {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeadlines> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeadlines>() {
    
    @Override
    public IDeadlines create() {
      return new Deadlines();
    }
    
    @Override
    public IDeadlines create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Deadlines(resourceRepository, resource);
    }
  
  };

  public Deadlines() {
    super(IDeadlines.TYPE_ID);
  }
  
  public Deadlines(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeadlines.TYPE_ID);
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
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline> selectDeadlines() {
    return _getList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.TargetdatesPackage.Deadlines_deadlines);
  }

  public Deadlines setDeadlines(java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline> deadlines) {
    _setList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.TargetdatesPackage.Deadlines_deadlines, deadlines);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public Deadlines setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Deadlines setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.TargetdatesPackage.Deadlines_deadlines, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadlines selectToMeDeadlines(cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadline object) {
    return _getToMeSingle(object.getRepository(), cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.javamodel.IDeadlines.class, cleon.projectmethods.hermes.spec.projectmanagement.planning.schedule.targetdates.TargetdatesPackage.Deadlines_deadlines, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,cf7f1e08-c1d4-11e5-bbf3-bdd12a9e2b3d,nwI3hiysiDDiSTqgvV1PQuyd1kA=] */
