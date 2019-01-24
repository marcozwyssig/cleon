package cleon.architecturemethods.eamod.spec.analysis.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRequirementManagementAggregate extends cleon.projectmethods.hermes.spec.detailstudy.drivers.criterias.javamodel.ICriteriaAggregate {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("410eee3c-14be-11e9-8da6-cf576bcae0a4");
  
  // relations
  
  public cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementsManagement selectRequirementsManagement();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.IPriorityWeighting> selectPriorityWeighting();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.eamod.spec.analysis.javamodel.ISubjectAreaAggregate> selectSubjectAreaAggregate();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,410eee3c-14be-11e9-8da6-cf576bcae0a4,ZAZcOFBhc9Ay4WZPjOtOaj+bsEw=] */
