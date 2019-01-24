package cleon.architecturemethods.eamod.spec.analysis.knockout.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IKnockoutRequirementManagementAggregate extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.knockout.javamodel.IKnockoutCriteriaAggregate {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3abda764-202f-11e9-83b3-a16e26b4cc59");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement selectRequirementsManagement();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.knockout.javamodel.IKnockoutSubjectAreaAggregate> selectSubjectAreaAggregate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3abda764-202f-11e9-83b3-a16e26b4cc59,dLuGG30cSBJKYpvFac4wIj6uo5E=] */
