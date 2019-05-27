package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleSystemComponent extends ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.javamodel.IGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e33fb742-35e4-11e9-9d58-25409887bb2a");
  
  // relations
  
  public cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.javamodel.ISystemComponent selectSystemComponent();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission> selectHasActivities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e33fb742-35e4-11e9-9d58-25409887bb2a,8PMuwMC/863/6pOY/74GrHM8pWg=] */
