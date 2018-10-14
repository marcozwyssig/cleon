package cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeliverableControlling extends DynamicResource implements IDeliverableControlling {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeliverableControlling> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeliverableControlling>() {
    
    @Override
    public IDeliverableControlling create() {
      return new DeliverableControlling();
    }
    
    @Override
    public IDeliverableControlling create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeliverableControlling(resourceRepository, resource);
    }
  
  };

  public DeliverableControlling() {
    super(IDeliverableControlling.TYPE_ID);
  }
  
  public DeliverableControlling(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeliverableControlling.TYPE_ID);
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
  public cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp selectDeadline() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_deadline);
  }

  public DeliverableControlling setDeadline(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp deadline) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_deadline, deadline);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_deliverable);
  }

  public DeliverableControlling setDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_deliverable, deliverable);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public DeliverableControlling setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableImpediments selectImpediments() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableImpediments.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_impediments);
  }

  public DeliverableControlling setImpediments(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableImpediments impediments) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_impediments, impediments);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp selectQuality() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_quality);
  }

  public DeliverableControlling setQuality(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp quality) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_quality, quality);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp selectRisk() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_risk);
  }

  public DeliverableControlling setRisk(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp risk) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_risk, risk);
    return this;
  }
    
  @Override
  public cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableRisks selectRisks() {
    return _getSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableRisks.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_risks);
  }

  public DeliverableControlling setRisks(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableRisks risks) {
    _setSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_risks, risks);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DeliverableControlling setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeliverableControlling setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_deadline, visitor);
    _acceptSingle(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_deliverable, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableImpediments.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_impediments, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_quality, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_risk, visitor);
    _acceptSingle(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableRisks.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_risks, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling> selectToMeDeliverable(cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable object) {
    return _getToMeList(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_deliverable, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling selectToMeRisks(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableRisks object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_risks, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling selectToMeImpediments(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableImpediments object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_impediments, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling selectToMeQuality(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_quality, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling selectToMeDeadline(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_deadline, object.getResource());
  }
  
  public static cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling selectToMeRisk(cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableLamp object) {
    return _getToMeSingle(object.getRepository(), cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.javamodel.IDeliverableControlling.class, cleon.initialization.projectmanagement.spec.steering.controlling.deliverable.DeliverablePackage.DeliverableControlling_risk, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2ad5f88a-bdfd-11e6-a3f0-c7681ee45a3f,0xZLo/0EvEPckWf0eVyoP5sdMkM=] */
