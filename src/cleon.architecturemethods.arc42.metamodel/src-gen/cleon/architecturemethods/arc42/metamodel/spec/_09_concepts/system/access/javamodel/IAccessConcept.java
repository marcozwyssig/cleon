package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAccessConcept extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.javamodel.IAbstractConcept {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("d821c95b-19c0-11eb-8585-65084a06c07f");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration> selectSystemConfigurationForRemoting();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.IAccessCommunicationType> selectAccessCommunicationType();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.access.javamodel.ISystemConfigurationAccessFrom> selectAccessFrom();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,d821c95b-19c0-11eb-8585-65084a06c07f,7U17fILE0ApzkeMYtsor9ubeXkU=] */
