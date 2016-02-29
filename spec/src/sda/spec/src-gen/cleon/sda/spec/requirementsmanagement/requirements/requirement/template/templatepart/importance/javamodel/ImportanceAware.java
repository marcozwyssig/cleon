package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ImportanceAware extends DynamicResource implements IImportanceAware {

  // abstract implementation, only used for static method calls
  private ImportanceAware() {
    super(IImportanceAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportanceAware> selectToMeImportance(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportance object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.javamodel.IImportanceAware.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.importance.ImportancePackage.ImportanceAware_importance, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,eb3e8586-d657-11e5-beff-c5494779b7d9,/zlvqRWRZF50/boIHb7BtVICU2w=] */
