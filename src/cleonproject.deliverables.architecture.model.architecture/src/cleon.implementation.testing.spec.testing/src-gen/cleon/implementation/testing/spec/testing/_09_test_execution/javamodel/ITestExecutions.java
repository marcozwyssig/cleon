package cleon.implementation.testing.spec.testing._09_test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestExecutions extends cleon.implementation.testing.spec.testing.javamodel.ITestingDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("624c64dc-20d7-11e6-9368-9172b77c2cff");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.implementation.testing.spec.testing._09_test_execution._static.javamodel.IStaticTestExecution> selectStaticTestExecutions();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,624c64dc-20d7-11e6-9368-9172b77c2cff,fvCS+yq+sWuh46CIfDbGfNAhc2s=] */
