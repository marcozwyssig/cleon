package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWhiteBoxSystemConfiguration extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IWhiteboxSystem {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a296733a-fe57-11ea-abcb-bfad67a56d79");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IFunctionalityAspect selectFunctionality();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IDeploymentAspectSystemArc42 selectDeployment();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAvailabilityAspectSystemArc42 selectAvailability();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAuthenticationAspectSystemArc42 selectAuthn();
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAutorizationAspectSystemArc42Aspect selectAuthz();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a296733a-fe57-11ea-abcb-bfad67a56d79,0WUB9ldCeY8Z40D+ZYGkt50WXhI=] */
