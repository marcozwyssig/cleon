package cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class RequirementCoverageAware extends DynamicResource implements IRequirementCoverageAware {

  // abstract implementation, only used for static method calls
  private RequirementCoverageAware() {
    super(IRequirementCoverageAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage.javamodel.IRequirementCoverageAware> selectToMeCoveres(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IAbstractRequirement object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage.javamodel.IRequirementCoverageAware.class, cleon.architecturemethods.itarc42.spec.itarc42._13_requirements_coverage._13_requirements_coveragePackage.RequirementCoverageAware_coveres, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,95ab0636-e11b-11e8-a6f9-cbcd84294dea,4Rlp/jucX5IuoMreXnDgI8JujQo=] */
