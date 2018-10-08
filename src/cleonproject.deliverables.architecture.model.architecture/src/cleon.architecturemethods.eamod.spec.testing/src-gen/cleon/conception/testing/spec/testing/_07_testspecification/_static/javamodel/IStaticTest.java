package cleon.conception.testing.spec.testing._07_testspecification._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStaticTest extends ch.actifsource.core.javamodel.IDecorator, cleon.conception.testing.spec.testing._07_testspecification.javamodel.ITest {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7cffe5db-1cf1-11e6-aaba-9db7fdc64d7e");
  
  // relations
  
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectRequirement();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._09_test_execution.javamodel.ITestResult> selectTestResult();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest> selectTestRequirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7cffe5db-1cf1-11e6-aaba-9db7fdc64d7e,yemZRUtMYE1UxLyrmAlp4IVMFWU=] */
