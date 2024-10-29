package cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestSpecificationDocuments extends ch.actifsource.core.javamodel.INamedResource, cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6ca21176-914a-11eb-8aaa-87cf673e0c96");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestSpecification> selectDynamicTestSpecifications();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.IStaticTestSpecification> selectStaticTestSpecifications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6ca21176-914a-11eb-8aaa-87cf673e0c96,+sJZ7Zxiex7XcZM5jMMWglqOD2Y=] */
