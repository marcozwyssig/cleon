package cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ServiceProducers extends DynamicResource implements IServiceProducers {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceProducers> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IServiceProducers>() {
    
    @Override
    public IServiceProducers create() {
      return new ServiceProducers();
    }
    
    @Override
    public IServiceProducers create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ServiceProducers(resourceRepository, resource);
    }
  
  };

  public ServiceProducers() {
    super(IServiceProducers.TYPE_ID);
  }
  
  public ServiceProducers(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IServiceProducers.TYPE_ID);
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
  public java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable> selectDeliverables() {
    return _getList(cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.support.projectmanagement.spec.planning.scope.deliverable.DeliverablePackage.Deliverables_deliverables);
  }

  public ServiceProducers setDeliverables(java.util.List<? extends cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable> deliverables) {
    _setList(cleon.support.projectmanagement.spec.planning.scope.deliverable.DeliverablePackage.Deliverables_deliverables, deliverables);
    return this;
  }
    
  @Override
  public java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> selectDocumentElements() {
    return _getList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements);
  }

  public ServiceProducers setDocumentElements(java.util.List<? extends cleon.common.doc.spec.doc.javamodel.IDocumentElement> documentElements) {
    _setList(cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, documentElements);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage> selectServices() {
    return _getMap(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceProducers_services);
  }

  public ServiceProducers setServices(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage> services) {
    _setMap(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceProducers_services, services);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ServiceProducers setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
    _acceptList(cleon.support.projectmanagement.spec.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.support.projectmanagement.spec.planning.scope.deliverable.DeliverablePackage.Deliverables_deliverables, visitor);
    _acceptList(cleon.common.doc.spec.doc.javamodel.IDocumentElement.class, cleon.common.doc.spec.doc.DocPackage.DocumentElementComposite_documentElements, visitor);
    _acceptMap(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceProducers_services, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceProducers selectToMeServices(cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceProducers.class, cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.UsagePackage.ServiceProducers_services, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e164d2a6-c690-11e6-8242-2f0ed6756d77,9nmdUBXPxX2GToOM+QWOQBnoNdc=] */
