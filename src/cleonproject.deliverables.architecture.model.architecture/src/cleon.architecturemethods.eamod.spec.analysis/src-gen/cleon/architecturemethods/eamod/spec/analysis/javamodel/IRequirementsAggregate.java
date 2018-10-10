package cleon.architecturemethods.eamod.spec.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementsAggregate extends cleon.common.analysis.spec.analysis.solution.drivers.javamodel.ICriteriaAggregate {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1e2f32b0-a6f8-11e8-9c81-8bd68c62e435");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting> selectPriorityWeighting();
  
  public cleon.conception.architecture.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubjectArea selectSubjectArea();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IRequirementCriteria> selectRequirementCriterias();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1e2f32b0-a6f8-11e8-9c81-8bd68c62e435,LlJZu0BO2R8c9vP0Cc0g5RKUPP8=] */
