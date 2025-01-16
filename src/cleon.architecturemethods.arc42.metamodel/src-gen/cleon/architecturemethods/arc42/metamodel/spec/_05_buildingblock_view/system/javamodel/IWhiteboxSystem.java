package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWhiteboxSystem extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1551fb66-2857-11e8-9af4-b7d7a3bbddc1");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IFunctionalityAspect selectFunctionality();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IDeploymentAspect selectDeployment();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAvailabilityAspect selectAvailability();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAuthenticationAspect selectAuthn();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAutorizationAspect selectAuthz();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IConfidentialityAspect selectConfidentialy();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IIntegrityAspect selectIntegrity();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.INonRepudiationAspect selectNonRepudiation();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IMonitoringAspect> selectMonitoring();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IBackupAndRecoveryAspect> selectBackup();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAccessAspect selectAccess();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IUsedProduct> selectUsedProducts();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBlackbox selectBlackbox();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1551fb66-2857-11e8-9af4-b7d7a3bbddc1,Tu3dq7VHjPzg0paHEvL7xCFD7dw=] */
