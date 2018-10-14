package cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DeliverableLamp extends DynamicResource implements IDeliverableLamp {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeliverableLamp> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeliverableLamp>() {
    
    @Override
    public IDeliverableLamp create() {
      return new DeliverableLamp();
    }
    
    @Override
    public IDeliverableLamp create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DeliverableLamp(resourceRepository, resource);
    }
  
  };

  public DeliverableLamp() {
    super(IDeliverableLamp.TYPE_ID);
  }
  
  public DeliverableLamp(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeliverableLamp.TYPE_ID);
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
  public cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.javamodel.IDeliverableLampState selectState() {
    return _getSingle(cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.javamodel.IDeliverableLampState.class, cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.DeliverablePackage.DeliverableLamp_state);
  }

  public DeliverableLamp setState(cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.javamodel.IDeliverableLampState state) {
    _setSingle(cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.DeliverablePackage.DeliverableLamp_state, state);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DeliverableLamp setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptSingle(cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.javamodel.IDeliverableLampState.class, cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.DeliverablePackage.DeliverableLamp_state, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.javamodel.IDeliverableLamp> selectToMeState(cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.javamodel.IDeliverableLampState object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.javamodel.IDeliverableLamp.class, cleon.projectmethods.hermes.spec.projectsteering.controlling.deliverable.DeliverablePackage.DeliverableLamp_state, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,779caf13-3386-11e6-b251-57783f5929b3,V7V/ih+qO290arfo2UsLBxOHUSc=] */
