package cleon.testingmethods.hermes.metamodel.spec._02_specification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestSpecificationDocument extends cleon.common.doc.metamodel.spec.document.javamodel.IDocument, cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAboutAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("88d35210-4f02-11e9-ba59-f1daaff821cc");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_precondition.javamodel.ITestGlobalPreconditions selectTestPreconditions();
  
  public cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification.javamodel.ITestSpecifications selectTestSpecifications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,88d35210-4f02-11e9-ba59-f1daaff821cc,1Tok4JycL+1JkFiQyk84QU4A4Ak=] */
