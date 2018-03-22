package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IQualityRequirement extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.javamodel.INonFunctionalRequirement {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("66cfdfc4-a95d-11e5-bda2-a7fc3bd7c783");
  
  // relations
  
  public java.util.List<? extends cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.quality.iso_25000.spec.javamodel.ISoftwareQuality> selectCoverageQualities();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,66cfdfc4-a95d-11e5-bda2-a7fc3bd7c783,nYFiEaJUjyMVwRHgeOpW6lYK9LU=] */
