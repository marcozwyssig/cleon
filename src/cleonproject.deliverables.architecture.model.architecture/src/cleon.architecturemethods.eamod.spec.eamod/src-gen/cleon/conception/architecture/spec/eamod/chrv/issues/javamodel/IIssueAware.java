package cleon.conception.architecture.spec.eamod.chrv.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIssueAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("92cfec9f-decd-11e5-bcfc-4385ab45a525");
  
  // relations
  
  public java.util.List<? extends cleon.conception.architecture.spec.eamod.chrv.issues.javamodel.IIssue> selectIssues();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,92cfec9f-decd-11e5-bcfc-4385ab45a525,zi4I+Jy8WmhV27NvQvHUjK8RoTI=] */
