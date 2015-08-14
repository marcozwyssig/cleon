package cleon.devops.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDevOps extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c6c94ef5-406e-11e5-b5f0-5b1ce9c3de3e");
  
  // relations
  
  public cleon.devops.spec.code.javamodel.ICode selectCode();
  
  public cleon.devops.spec.build.javamodel.IBuild selectBuild();
  
  public java.util.List<? extends cleon.devops.spec.test.javamodel.ITest> selectTest();
  
  public java.util.List<? extends cleon.devops.spec.release.javamodel.IRelease> selectRelease();
  
  public java.util.List<? extends cleon.devops.spec.deploy.javamodel.IDeploy> selectDeploy();
  
  public java.util.List<? extends cleon.devops.spec.operate.javamodel.IOperate> selectOperates();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c6c94ef5-406e-11e5-b5f0-5b1ce9c3de3e,7HDeUClj72kxkQ7tlQaSNTfYiwU=] */
