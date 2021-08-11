package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDynamicTestSpecification extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestSpecification {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("04d3d8a4-1cf0-11e6-aaba-9db7fdc64d7e");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.ITestDynamicTestLevelSpecificationDocument> selectDynamicTestLevelSpecification();
  
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_coverage.javamodel.ITestRequirementCoverages selectRequirements_coverage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,04d3d8a4-1cf0-11e6-aaba-9db7fdc64d7e,T2fbi7IWfPCAV2bOAOB1LSW+k+c=] */
