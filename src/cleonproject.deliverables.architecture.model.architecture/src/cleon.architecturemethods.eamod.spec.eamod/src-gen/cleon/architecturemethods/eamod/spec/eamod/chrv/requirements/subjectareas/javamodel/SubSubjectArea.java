package cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SubSubjectArea extends DynamicResource implements ISubSubjectArea {

  // abstract implementation, only used for static method calls
  private SubSubjectArea() {
    super(ISubSubjectArea.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea selectToMeRequirements(cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.requirement.javamodel.IRequirement object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.javamodel.ISubSubjectArea.class, cleon.architecturemethods.eamod.spec.eamod.chrv.requirements.subjectareas.SubjectareasPackage.SubSubjectArea_requirements, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,15ded48f-3d33-11e6-ae46-774fb9bfeae7,XBxjt0DjF0ddmidClzyI7kOq4f4=] */
