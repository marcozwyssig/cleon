package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DetailSpecificationDocuments extends DynamicResource implements IDetailSpecificationDocuments {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDetailSpecificationDocuments> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDetailSpecificationDocuments>() {
    
    @Override
    public IDetailSpecificationDocuments create() {
      return new DetailSpecificationDocuments();
    }
    
    @Override
    public IDetailSpecificationDocuments create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DetailSpecificationDocuments(resourceRepository, resource);
    }
  
  };

  public DetailSpecificationDocuments() {
    super(IDetailSpecificationDocuments.TYPE_ID);
  }
  
  public DetailSpecificationDocuments(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDetailSpecificationDocuments.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable);
  }

  public DetailSpecificationDocuments setDeliverable(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, deliverable);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument> selectDetailSpecificationDocuments() {
    return _getMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocuments_detailSpecificationDocuments);
  }

  public DetailSpecificationDocuments setDetailSpecificationDocuments(java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument> detailSpecificationDocuments) {
    _setMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocuments_detailSpecificationDocuments, detailSpecificationDocuments);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning selectPlanning() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning);
  }

  public DetailSpecificationDocuments setPlanning(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning planning) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, planning);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DetailSpecificationDocuments setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, visitor);
    _acceptMap(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocuments_detailSpecificationDocuments, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocuments selectToMeDetailSpecificationDocuments(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.javamodel.IDetailSpecificationDocuments.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.DetailspecifictionPackage.DetailSpecificationDocuments_detailSpecificationDocuments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,05ebd109-2809-11ec-988b-e1826086c18c,fXFvToLcCvd6CRRZ95RM0rhjo9Q=] */
