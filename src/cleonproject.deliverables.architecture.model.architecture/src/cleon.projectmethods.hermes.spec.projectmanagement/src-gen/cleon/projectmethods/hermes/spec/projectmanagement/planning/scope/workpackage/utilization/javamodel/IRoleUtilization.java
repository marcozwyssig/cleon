package cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.workpackage.utilization.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoleUtilization extends ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.spec.doc.chapter.javamodel.IAbstractChapter, cleon.common.resources.spec.resources.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("75e4e41e-c291-11e6-ba8e-05f5391bcda8");
  
  public java.lang.Integer selectFte();
  
  // relations
  
  public cleon.projectmethods.hermes.spec.projectmanagement.resource.roles.javamodel.IRole selectRole();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,75e4e41e-c291-11e6-ba8e-05f5391bcda8,x07u+O/Owr9w8wdtqUexF3ICoJ4=] */
