package cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDynamicTestLevels extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6d73f012-5157-11e9-bb61-971a423d31e9");
  
  // relations
  
  public cleon.testingmethods.hermes.metamodel.spec._01_concept.test_types.javamodel.ITestLevelForDynamicObject selectTestLevelForDynamicObject();
  
  public java.util.List<? extends cleon.testingmethods.hermes.metamodel.spec._02_specification.test_specification._dynamic.javamodel.IDynamicTestGroup> selectGroups();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6d73f012-5157-11e9-bb61-971a423d31e9,gShmy9EYpqQ8hLfks+SfQyrdwpQ=] */
