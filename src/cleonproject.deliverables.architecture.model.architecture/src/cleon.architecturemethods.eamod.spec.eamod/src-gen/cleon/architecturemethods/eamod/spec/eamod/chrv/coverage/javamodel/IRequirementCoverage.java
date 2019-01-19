package cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementCoverage extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c9479b53-ece1-11e8-8149-8542373915bf");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectRequirement();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.coverage.javamodel.IAbstractRequirementCoverage> selectRequirementCoverages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c9479b53-ece1-11e8-8149-8542373915bf,Im6VBy0KSXsVidXHeIVtEOUam4g=] */
