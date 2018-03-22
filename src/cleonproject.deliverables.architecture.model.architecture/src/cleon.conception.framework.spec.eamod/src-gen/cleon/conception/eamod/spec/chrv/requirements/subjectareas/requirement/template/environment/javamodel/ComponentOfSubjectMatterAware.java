package cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.environment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ComponentOfSubjectMatterAware extends DynamicResource implements IComponentOfSubjectMatterAware {

  // abstract implementation, only used for static method calls
  private ComponentOfSubjectMatterAware() {
    super(IComponentOfSubjectMatterAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.environment.javamodel.IComponentOfSubjectMatterAware> selectToMeComponentOfSubjectMatter(cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.environment.javamodel.IComponentOfSubjectMatter object) {
    return _getToMeList(object.getRepository(), cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.environment.javamodel.IComponentOfSubjectMatterAware.class, cleon.conception.eamod.spec.chrv.requirements.subjectareas.requirement.template.environment.EnvironmentPackage.ComponentOfSubjectMatterAware_componentOfSubjectMatter, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,55acb122-d6df-11e5-a98f-afca63b52e04,676AIsjnxRTP8HZnElQArtoyG44=] */
