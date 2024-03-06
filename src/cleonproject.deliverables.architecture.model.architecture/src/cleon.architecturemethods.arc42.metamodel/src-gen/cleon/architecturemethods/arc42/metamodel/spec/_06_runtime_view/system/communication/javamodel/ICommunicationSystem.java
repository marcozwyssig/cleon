package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICommunicationSystem extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("91bc9aa9-8779-11e9-a61b-279ebde48b48");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystem selectCommunicationSystem();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.javamodel.IDestination> selectDestination();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,91bc9aa9-8779-11e9-a61b-279ebde48b48,Jd44arYsa8VPdMlVbjNLqR1e8ls=] */
