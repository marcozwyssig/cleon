package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStaticTestSpecification extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestSpecification {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fa8377ef-1cef-11e6-aaba-9db7fdc64d7e");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestSubjectArea> selectTestSubjectAreas();
  
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._static.javamodel.ITestQualityCriterias selectTestQualityCriteria();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fa8377ef-1cef-11e6-aaba-9db7fdc64d7e,XPIlJkK2PTW235m7gAcxAShS0SM=] */
