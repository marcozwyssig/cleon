package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.events.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IEvents extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0bbf19ba-8f32-11e8-90f3-6f51c1a0b373");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.events.javamodel.IEvent> selectEvent();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0bbf19ba-8f32-11e8-90f3-6f51c1a0b373,cp/YWpKpdBdQZ6vtg1w2EbHmZ6Y=] */
