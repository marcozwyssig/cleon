package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.remote_access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IPulseSecureApplianceSystemConfiguration extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.hardware.javamodel.IDeviceSystemConfiguration, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.remote_access.javamodel.IAbstractRemoteAccessSystemConfiguraiton {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("67e55025-0a7a-11e9-a59d-d7a0c53e291c");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.remote_access.javamodel.IAccess> selectAccesses();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,67e55025-0a7a-11e9-a59d-d7a0c53e291c,xw52bvwfNy8nxJYEWSMyPR0s+lc=] */
