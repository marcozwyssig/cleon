package cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IModuleUtilizationWithService extends cleon.support.projectmanagement.spec.planning.scope.workpackage.utilization.javamodel.IModuleUtilization {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("2f11960a-c6c4-11e6-8242-2f0ed6756d77");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.conception.architecture.spec.eamod.nsov.v1.nsov.usage.javamodel.IServiceUsage> selectRequiredDeliverable();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,2f11960a-c6c4-11e6-8242-2f0ed6756d77,Zj9eDcqDVE2Xdj58ElnYpDxZ2dU=] */
