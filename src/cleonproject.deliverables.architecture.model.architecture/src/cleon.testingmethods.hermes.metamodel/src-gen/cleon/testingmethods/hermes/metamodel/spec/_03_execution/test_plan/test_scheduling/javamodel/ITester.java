package cleon.testingmethods.hermes.metamodel.spec._03_execution.test_plan.test_scheduling.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITester extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3edf4b87-9190-11e9-85e6-a377d9035ee3");
  
  // relations
  
  public java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IAbstractDynamicTest> selectTests();
  
  public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.persons.javamodel.IPerson selectPerson();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3edf4b87-9190-11e9-85e6-a377d9035ee3,hCMdDFZGYpUPkUX1qtVt1w6El+c=] */
