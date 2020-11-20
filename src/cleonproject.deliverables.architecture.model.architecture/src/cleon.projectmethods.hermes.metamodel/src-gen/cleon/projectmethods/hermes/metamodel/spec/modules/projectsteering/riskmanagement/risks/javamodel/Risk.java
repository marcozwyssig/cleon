package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Risk extends DynamicResource implements IRisk {

  // abstract implementation, only used for static method calls
  private Risk() {
    super(IRisk.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk> selectToMeEntryDate(cleon.common.calendar.metamodel.spec.javamodel.IDay object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_entryDate, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk> selectToMeImpactType(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.impactarea.javamodel.IImpactType object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_impactType, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk> selectToMeRiskState(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskState object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_riskState, object.getResource());
  }
  
  public static java.util.List<cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk> selectToMeType(cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRiskType object) {
    return _getToMeList(object.getRepository(), cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk.class, cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.RisksPackage.Risk_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,70f3fadf-2efd-11e6-8bd9-a77b8d2a3a0e,ql7WWFNcJZd3L8pFHyMrkdXnSAA=] */
