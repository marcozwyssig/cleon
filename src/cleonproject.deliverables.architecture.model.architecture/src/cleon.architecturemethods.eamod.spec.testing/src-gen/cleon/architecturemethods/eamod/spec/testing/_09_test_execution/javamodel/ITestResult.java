package cleon.architecturemethods.eamod.spec.testing._09_test_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestResult extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("62ca893d-1cf3-11e6-aaba-9db7fdc64d7e");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.testing._07_testspecification._static.javamodel.ITestQualityCriteria selectTestQualityCriteria();
  
  public cleon.common.doc.spec.doc.document.properties.member.javamodel.IMember selectTester();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,62ca893d-1cf3-11e6-aaba-9db7fdc64d7e,kwuCdogNOlIx6BiZdj40kK5XUF8=] */
