package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICommunicationView extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6c796bef-8779-11e9-a61b-279ebde48b48");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ICommunication> selectDestinationSystemCommunications();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6c796bef-8779-11e9-a61b-279ebde48b48,T6i8wfGcTktcmk7Xgov5cOVULYQ=] */
