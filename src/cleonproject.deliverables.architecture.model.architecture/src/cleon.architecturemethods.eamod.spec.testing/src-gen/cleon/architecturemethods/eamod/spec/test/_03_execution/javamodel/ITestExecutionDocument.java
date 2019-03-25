package cleon.architecturemethods.eamod.spec.test._03_execution.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestExecutionDocument extends cleon.common.doc.spec.doc.document.javamodel.INamedDocument, cleon.common.resources.spec.resources.outcomes.javamodel.IDocumentation, cleon.common.doc.spec.doc.chapter.about.javamodel.IAboutAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e85c9091-4f02-11e9-ba59-f1daaff821cc");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.test._03_execution._09_test_execution.javamodel.ITestExecutions selectTestExecutions();
  
  public cleon.architecturemethods.eamod.spec.test._02_specification.javamodel.ITestSpecificationDocument selectTestSpecificationDocument();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e85c9091-4f02-11e9-ba59-f1daaff821cc,onIofUcgZwKwMa9hIqYqiUTwzb4=] */
