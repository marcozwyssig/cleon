package cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ConditionAware extends DynamicResource implements IConditionAware {

  // abstract implementation, only used for static method calls
  private ConditionAware() {
    super(IConditionAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.IConditionAware> selectToMeCondition(cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.ICondition object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.javamodel.IConditionAware.class, cleon.architecturemethods.eamod.metamodel.spec.chrv.requirements.subjectareas.requirement.template.templatepart.condition.ConditionPackage.ConditionAware_condition, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,31d38514-d658-11e5-beff-c5494779b7d9,fiyFZGcaYk1IALyYPfqsgdMRRPQ=] */
