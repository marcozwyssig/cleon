package cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISingleState extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.IState, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IClassifier, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.modularity.metamodel.spec.javamodel.IInheritableBuildingBlock, cleon.modelinglanguages.uml.metamodel.spec.structural.classes.javamodel.IIsAbstract {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f13ba82-b07c-11e4-bca8-71d5b3e72cd6");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.ITransition> selectTransition();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.metamodel.spec.behavioral.statemachine.javamodel.IStateInheritance> selectInherits();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f13ba82-b07c-11e4-bca8-71d5b3e72cd6,Y5EmH4U8nNlaA7VddzqegGio6Pw=] */
