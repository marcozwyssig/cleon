package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IUsedTestGlobalPreconditionGroup extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b32136ac-67e9-11e9-9ec9-5fbc84faaeb1");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditionGroup selectTestGlobalPrecondition();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IOverrideTestPrecondition> selectTestOverridePrecondition();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b32136ac-67e9-11e9-9ec9-5fbc84faaeb1,7vPImVvCr4wzvo2YQR7/uRTgbuA=] */
