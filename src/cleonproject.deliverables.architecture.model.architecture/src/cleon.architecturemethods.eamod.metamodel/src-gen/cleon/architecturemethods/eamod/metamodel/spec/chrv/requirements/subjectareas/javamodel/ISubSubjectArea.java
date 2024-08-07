package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISubSubjectArea extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.javamodel.ISubjectArea, cleon.architecturemethods.eamod.metamodel.spec.chrv.goals.javamodel.IGoalAware, cleon.architecturemethods.eamod.metamodel.spec.chrv.stakeholder.javamodel.IStakeholderAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("15ded48f-3d33-11e6-ae46-774fb9bfeae7");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement> selectRequirements();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,15ded48f-3d33-11e6-ae46-774fb9bfeae7,7F0KIhhxgvXpkfCDny0Y/5/oZKU=] */
