package cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISingleState extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IState, cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IClassifier, cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter, cleon.common.modularity.spec.buildingblock.javamodel.IInheritableBuildingBlock, cleon.modelinglanguages.uml.spec.uml2.structural.classes.javamodel.IIsAbstract {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f13ba82-b07c-11e4-bca8-71d5b3e72cd6");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.ITransition> selectTransition();
  
  public java.util.List<? extends cleon.modelinglanguages.uml.spec.uml2.behavioral.statemachine.javamodel.IStateInheritance> selectInherits();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f13ba82-b07c-11e4-bca8-71d5b3e72cd6,jHM0XME0sLteAMUXzvJ0iUdjLZQ=] */
