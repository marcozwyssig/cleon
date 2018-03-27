package cleon.conception.testing.spec.testing._07_testspecification._static.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestSubjectArea extends ch.actifsource.core.javamodel.IDecorator, cleon.conception.testing.spec.testing.javamodel.ITestingDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cfa22ec4-1cf0-11e6-aaba-9db7fdc64d7e");
  
  // relations
  
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea selectSubjectArea();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.testing.spec.testing._07_testspecification._static.javamodel.IStaticTest> selectTestRequirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cfa22ec4-1cf0-11e6-aaba-9db7fdc64d7e,zshVqBSnDWJD/l++vOo658Q5tMc=] */
