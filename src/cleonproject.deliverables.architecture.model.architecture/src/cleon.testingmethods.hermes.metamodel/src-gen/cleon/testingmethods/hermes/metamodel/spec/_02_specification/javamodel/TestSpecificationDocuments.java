package cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestSpecificationDocuments extends DynamicResource implements ITestSpecificationDocuments {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSpecificationDocuments> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestSpecificationDocuments>() {
    
    @Override
    public ITestSpecificationDocuments create() {
      return new TestSpecificationDocuments();
    }
    
    @Override
    public ITestSpecificationDocuments create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestSpecificationDocuments(resourceRepository, resource);
    }
  
  };

  public TestSpecificationDocuments() {
    super(ITestSpecificationDocuments.TYPE_ID);
  }
  
  public TestSpecificationDocuments(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestSpecificationDocuments.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable selectDeliverable() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable);
  }

  public TestSpecificationDocuments setDeliverable(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable deliverable) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, deliverable);
    return this;
  }
    
  @Override
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning selectPlanning() {
    return _getSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning);
  }

  public TestSpecificationDocuments setPlanning(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning planning) {
    _setSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, planning);
    return this;
  }
    
  @Override
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument selectTestSpecificationDocuments() {
    return _getSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocuments_testSpecificationDocuments);
  }

  public TestSpecificationDocuments setTestSpecificationDocuments(cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument testSpecificationDocuments) {
    _setSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocuments_testSpecificationDocuments, testSpecificationDocuments);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public TestSpecificationDocuments setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverable.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_deliverable, visitor);
    _acceptSingle(cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.javamodel.IPlanning.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.DeliverablePackage.DeliverableAware_planning, visitor);
    _acceptSingle(cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocuments_testSpecificationDocuments, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocuments selectToMeTestSpecificationDocuments(cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocument object) {
    return _getToMeSingle(object.getRepository(), cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel.ITestSpecificationDocuments.class, cleon.testingmethods.hermes.metamodel.spec._02_specification._02_specificationPackage.TestSpecificationDocuments_testSpecificationDocuments, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6ca21176-914a-11eb-8aaa-87cf673e0c96,GR8TLhMMwu/Ji89XrfQnvS69gn0=] */
