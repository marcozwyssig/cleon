package cleon.architecturemethods.eamod.spec.analysis.weighting.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWeightingSubjectAreaAggregate extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.weighting.javamodel.IWeightingCriteriaAggregate, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1e2f32b0-a6f8-11e8-9c81-8bd68c62e435");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.weighting.javamodel.IWeightingRequirementCriteria> selectRequirementCriterias();
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea selectSubSubjectArea();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1e2f32b0-a6f8-11e8-9c81-8bd68c62e435,iEocwUmPGnv39cgZK+p1hX4k3yw=] */
