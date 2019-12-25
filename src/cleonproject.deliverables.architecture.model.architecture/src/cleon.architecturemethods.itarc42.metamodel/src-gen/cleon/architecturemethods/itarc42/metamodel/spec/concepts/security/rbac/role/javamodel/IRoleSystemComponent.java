package cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.role.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleSystemComponent extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, ch.actifsource.core.javamodel.IDecorator, cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.javamodel.IGroup {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e33fb742-35e4-11e9-9d58-25409887bb2a");
  
  // relations
  
  public cleon.architecturemethods.itarc42.metamodel.spec.buildingblock_view.javamodel.ISystemComponent selectSystemComponent();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.role.javamodel.IRoleSystemComponent> selectBasedOn();
  
  public java.util.List<? extends cleon.architecturemethods.itarc42.metamodel.spec.concepts.security.rbac.activity.javamodel.IActivityPermission> selectHasActivities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e33fb742-35e4-11e9-9d58-25409887bb2a,fUUawUd6yq55YqVNBA1SrH8hQCE=] */
