package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.nonfunctional.environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ComponentOfSubjectMatterAware extends DynamicResource implements IComponentOfSubjectMatterAware {

  // abstract implementation, only used for static method calls
  private ComponentOfSubjectMatterAware() {
    super(IComponentOfSubjectMatterAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.nonfunctional.environment.javamodel.IComponentOfSubjectMatterAware> selectToMeComponentOfSubjectMatter(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.nonfunctional.environment.javamodel.IComponentOfSubjectMatter object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.nonfunctional.environment.javamodel.IComponentOfSubjectMatterAware.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.nonfunctional.environment.EnvironmentPackage.ComponentOfSubjectMatterAware_componentOfSubjectMatter, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,55acb122-d6df-11e5-a98f-afca63b52e04,dIlkdCvhbS2ksdsB0vTfgn6BLEI=] */
