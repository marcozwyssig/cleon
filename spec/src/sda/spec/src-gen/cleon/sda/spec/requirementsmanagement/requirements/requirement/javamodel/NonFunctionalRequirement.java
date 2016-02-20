package cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NonFunctionalRequirement extends DynamicResource implements INonFunctionalRequirement {

  // abstract implementation, only used for static method calls
  private NonFunctionalRequirement() {
    super(INonFunctionalRequirement.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.INonFunctionalRequirement selectToMeTemplate(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.javamodel.INonFunctionalTemplate object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.javamodel.INonFunctionalRequirement.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.RequirementPackage.NonFunctionalRequirement_template, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,6f864020-a95d-11e5-bda2-a7fc3bd7c783,xAJJ+pLLYjyIvvcuAPCvbh16TB0=] */
