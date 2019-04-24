package cleon.testingmethods.hermes.spec.hermes5._02_specification.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestSpecificationDocument extends cleon.common.doc.spec.doc.document.javamodel.INamedDocument, cleon.common.doc.spec.doc.chapter.about.javamodel.IAboutAware, cleon.common.glossary.spec.glossary.javamodel.IGlossaryAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("88d35210-4f02-11e9-ba59-f1daaff821cc");
  
  // relations
  
  public cleon.testingmethods.hermes.spec.hermes5._01_concept.javamodel.ITestConceptDocument selectTestConceptDocument();
  
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_specification.javamodel.ITestSpecifications selectTestSpecifications();
  
  public cleon.testingmethods.hermes.spec.hermes5._02_specification.test_coverage.javamodel.ITestRequirementCoverages selectRequirements_coverage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,88d35210-4f02-11e9-ba59-f1daaff821cc,fAVHN7yc0vXNYAQ1daPlWH4ifec=] */
