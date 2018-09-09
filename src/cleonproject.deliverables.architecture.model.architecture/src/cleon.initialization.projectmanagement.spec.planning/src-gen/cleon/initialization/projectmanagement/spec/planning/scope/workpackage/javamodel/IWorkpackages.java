package cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWorkpackages extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cdbd85be-1e1b-11e8-8938-5f8feacc30f1");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.scope.workpackage.javamodel.IWorkpackage> selectWorkpackages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cdbd85be-1e1b-11e8-8938-5f8feacc30f1,8XUYXI7YjNh0a1udEGbiamGtrF4=] */
