package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class FunctionalityTypeAware extends DynamicResource implements IFunctionalityTypeAware {

  // abstract implementation, only used for static method calls
  private FunctionalityTypeAware() {
    super(IFunctionalityTypeAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityTypeAware> selectToMeFunctionalityType(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityType object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.javamodel.IFunctionalityTypeAware.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.functionalitytype.FunctionalitytypePackage.FunctionalityTypeAware_functionalityType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ace08a98-debd-11e5-bf7d-117d548070bb,0XLHjYjlqo0T0OGHgaVyOl+Vs1o=] */
