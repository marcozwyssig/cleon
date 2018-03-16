package cleon.conception.eamod.spec.chrv.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class IssueAware extends DynamicResource implements IIssueAware {

  // abstract implementation, only used for static method calls
  private IssueAware() {
    super(IIssueAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.conception.eamod.spec.chrv.issues.javamodel.IIssueAware> selectToMeIssues(cleon.conception.eamod.spec.chrv.issues.javamodel.IIssue object) {
    return _getToMeList(object.getRepository(), cleon.conception.eamod.spec.chrv.issues.javamodel.IIssueAware.class, cleon.conception.eamod.spec.chrv.issues.IssuesPackage.IssueAware_issues, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,92cfec9f-decd-11e5-bcfc-4385ab45a525,brln684j3dq5GGVIKkvSVkodOFs=] */
