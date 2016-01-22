package cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class FeatureGroup extends DynamicResource implements IFeatureGroup {

  // abstract implementation, only used for static method calls
  private FeatureGroup() {
    super(IFeatureGroup.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup selectToMeWorkItems(cleon.sda.spec.projectmanagement.scope.backlog.javamodel.IWorkItem object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_workItems, object.getResource());
  }
  
  public static cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup selectToMeSubfeatureGroup(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_subfeatureGroup, object.getResource());
  }
  
  public static java.util.List<cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup> selectToMePreconditions(cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup object) {
    return _getToMeList(object.getRepository(), cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.javamodel.IFeatureGroup.class, cleon.sda.spec.projectmanagement.scope.backlog.featuregroup.FeaturegroupPackage.FeatureGroup_preconditions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,409913e6-369c-11e5-95d9-2b04d7ab02d9,a2IiWeysLmMuZKPTtDIHR5W6QMo=] */
