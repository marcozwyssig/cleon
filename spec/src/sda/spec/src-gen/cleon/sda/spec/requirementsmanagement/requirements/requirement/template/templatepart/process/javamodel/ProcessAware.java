package cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ProcessAware extends DynamicResource implements IProcessAware {

  // abstract implementation, only used for static method calls
  private ProcessAware() {
    super(IProcessAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.javamodel.IProcessAware> selectToMeProcess(cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.javamodel.IProcess object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.javamodel.IProcessAware.class, cleon.sda.spec.requirementsmanagement.requirements.requirement.template.templatepart.process.ProcessPackage.ProcessAware_process, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,d47439c4-debd-11e5-bf7d-117d548070bb,gAAoFsLuIYLKX1JXL1zUB3k3S3Q=] */
