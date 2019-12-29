package cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleSystemComponent extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.javamodel.IGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e33fb742-35e4-11e9-9d58-25409887bb2a");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemComponent selectSystemComponent();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.role.javamodel.IRoleSystemComponent> selectBasedOn();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityPermission> selectHasActivities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e33fb742-35e4-11e9-9d58-25409887bb2a,V2Yzb8J0w5w0vkCMUVayd8g4XOM=] */
