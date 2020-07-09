package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHealthDeviceBehaviour extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8d68bcb5-8f5a-11e8-9cc3-93ddcbb0b144");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.rules.devicebehaviour.javamodel.IHealthComponentBehaviour> selectHealthComponent();
  
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectDevice();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8d68bcb5-8f5a-11e8-9cc3-93ddcbb0b144,eXIYawByAdYQMQI1NX29oLAUEsc=] */
