package cleon.sdp.spec.project.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class WorkItem extends DynamicResource implements IWorkItem {

  // abstract implementation, only used for static method calls
  private WorkItem() {
    super(IWorkItem.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.sdp.spec.project.javamodel.IWorkItem> selectToMeOwner(cleon.sdp.spec.project.javamodel.IPerson object) {
    return _getToMeList(object.getRepository(), cleon.sdp.spec.project.javamodel.IWorkItem.class, cleon.sdp.spec.project.ProjectPackage.WorkItem_owner, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4330cc63-ff9c-11e4-ac0a-959b440f987f,KP3XZ9eAmoGbiokzHz44lyutk/Q=] */
