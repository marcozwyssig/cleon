package cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWeightingRequirementManagementAggregate extends cleon.projectmethods.hermes.metamodel.spec.outcomes.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteriaAggregate {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("410eee3c-14be-11e9-8da6-cf576bcae0a4");
  
  // relations
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.javamodel.IRequirementsDocument selectRequirementsManagement();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingPriority> selectPriorityWeighting();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.metamodel.spec.chan.weighting.javamodel.IWeightingSubjectAreaAggregate> selectSubjectAreaAggregate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,410eee3c-14be-11e9-8da6-cf576bcae0a4,WfZmC77lSUzI+9zCiVlxjEpN1Uw=] */
