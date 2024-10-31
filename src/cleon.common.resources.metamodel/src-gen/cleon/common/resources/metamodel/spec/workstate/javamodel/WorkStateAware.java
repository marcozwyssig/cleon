package cleon.common.resources.metamodel.spec.workstate.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class WorkStateAware extends DynamicResource implements IWorkStateAware {

  // abstract implementation, only used for static method calls
  private WorkStateAware() {
    super(IWorkStateAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkStateAware> selectToMeState(cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkState object) {
    return _getToMeList(object.getRepository(), cleon.common.resources.metamodel.spec.workstate.javamodel.IWorkStateAware.class, cleon.common.resources.metamodel.spec.workstate.WorkstatePackage.WorkStateAware_state, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4ae61945-0d05-11e6-be97-7d1235599779,Vw/ZBJwPmjV+A1j6Ex5HBEctcfk=] */
