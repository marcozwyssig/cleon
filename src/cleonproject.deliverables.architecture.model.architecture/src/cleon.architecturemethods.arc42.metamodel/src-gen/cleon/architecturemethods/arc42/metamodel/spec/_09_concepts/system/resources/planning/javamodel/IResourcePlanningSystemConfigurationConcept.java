package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourcePlanningSystemConfigurationConcept extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cfc55eeb-dfe7-11eb-aeba-a92c9a2e1772");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectResourcePlanningForSystemConfiguration();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel.IResourcePlanningEnvironmentConcept> selectResourcePlanningEnvironmentConcept();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cfc55eeb-dfe7-11eb-aeba-a92c9a2e1772,4OV0usHSQYTSYiEdHWqHe4UFdB0=] */
