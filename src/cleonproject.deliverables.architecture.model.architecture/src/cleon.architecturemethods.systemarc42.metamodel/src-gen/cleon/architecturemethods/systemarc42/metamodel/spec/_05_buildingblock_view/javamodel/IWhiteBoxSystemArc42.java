package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWhiteBoxSystemArc42 extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a296733a-fe57-11ea-abcb-bfad67a56d79");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IFunctionality selectFunctionality();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IDeploymentSystemArc42 selectDeployment();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAvailabilitySystemArc42 selectAvailability();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAuthenticationSystemArc42 selectAuthn();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.IAutorizationSystemArc42 selectAuthz();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a296733a-fe57-11ea-abcb-bfad67a56d79,T3e6r6fNf7I9Xp/6bHXKsgiBOj8=] */
