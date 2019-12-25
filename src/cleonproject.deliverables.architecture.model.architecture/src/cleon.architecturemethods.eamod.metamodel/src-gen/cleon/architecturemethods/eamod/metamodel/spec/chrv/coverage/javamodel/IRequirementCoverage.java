package cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementCoverage extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c9479b53-ece1-11e8-8149-8542373915bf");
  
  // relations
  
  public cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.javamodel.IRequirement selectRequirement();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementCover> selectRequirementCoverages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c9479b53-ece1-11e8-8149-8542373915bf,T8lwxHSDGeB2RfDhiVblpDDVuSQ=] */
