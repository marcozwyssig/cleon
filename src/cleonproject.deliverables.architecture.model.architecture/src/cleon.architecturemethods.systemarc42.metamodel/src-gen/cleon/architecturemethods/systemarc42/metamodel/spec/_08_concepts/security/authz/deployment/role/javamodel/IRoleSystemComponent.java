package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleSystemComponent extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e33fb742-35e4-11e9-9d58-25409887bb2a");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemComponent selectSystemComponent();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent> selectBasedOn();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityPermission> selectHasActivities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e33fb742-35e4-11e9-9d58-25409887bb2a,gzZEvX1QOkU0t+YI/XxIl6S9gSM=] */
