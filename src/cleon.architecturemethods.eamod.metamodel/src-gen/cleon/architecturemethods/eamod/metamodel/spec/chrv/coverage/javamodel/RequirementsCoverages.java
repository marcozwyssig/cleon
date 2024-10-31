package cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class RequirementsCoverages extends DynamicResource implements IRequirementsCoverages {

  // abstract implementation, only used for static method calls
  private RequirementsCoverages() {
    super(IRequirementsCoverages.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementsCoverages selectToMeSubjectAreaCoverage(cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.ISubjectAreaCoverage object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.javamodel.IRequirementsCoverages.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.coverage.CoveragePackage.RequirementsCoverages_subjectAreaCoverage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,875d278c-d183-11e8-b18f-df1540bb7a5c,Ss68msPiRkVYzT/yG/o4C+WxcfU=] */
