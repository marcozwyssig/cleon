package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActiveDirectoryManagerSystemConfiguration extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("15f0d90d-09ef-11e9-abef-3d869859c931");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.security.iam.javamodel.IActiveDirectoryManagingActor> selectManagingActor();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,15f0d90d-09ef-11e9-abef-3d869859c931,DL1RTPv0gg82Q9sFURu/XJOP9Hs=] */
