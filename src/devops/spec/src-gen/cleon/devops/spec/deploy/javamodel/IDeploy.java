package cleon.devops.spec.deploy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDeploy extends cleon.devops.spec.javamodel.IReleaseManagement {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6e7d700a-406f-11e5-b5f0-5b1ce9c3de3e");
  
  // relations
  
  public java.util.List<? extends cleon.devops.spec.deploy.javamodel.IEnvironment> selectEnvironments();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6e7d700a-406f-11e5-b5f0-5b1ce9c3de3e,RCMnSMd8LSBpPvZVHrgs1Hy4jQM=] */
