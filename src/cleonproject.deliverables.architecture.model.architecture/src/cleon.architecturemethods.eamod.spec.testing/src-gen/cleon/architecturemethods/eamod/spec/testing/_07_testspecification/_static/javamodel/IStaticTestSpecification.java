package cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IStaticTestSpecification extends cleon.architecturemethods.eamod.spec.testing._07_testspecification.javamodel.ITestSpecification, cleon.architecturemethods.eamod.spec.testing.javamodel.ITestingDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fa8377ef-1cef-11e6-aaba-9db7fdc64d7e");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.ITestSubjectArea> selectTestSubjectAreas();
  
  public cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.ITestQualityCriterias selectTestQualityCriteria();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fa8377ef-1cef-11e6-aaba-9db7fdc64d7e,K8DoD5e6ve7fberFa+Ew/QcOBBA=] */
