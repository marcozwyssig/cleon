package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDestination extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters, cleon.common.resources.metamodel.spec.descriptions.javamodel.INoDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("54bec968-877a-11e9-a61b-279ebde48b48");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectDestinationSystemConfiguration();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IDestinationSubSecurityZone> selectDestinationSubSecurityZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,54bec968-877a-11e9-a61b-279ebde48b48,tkAA4hAZFzOpR6GEaVxSg7zOCgg=] */
