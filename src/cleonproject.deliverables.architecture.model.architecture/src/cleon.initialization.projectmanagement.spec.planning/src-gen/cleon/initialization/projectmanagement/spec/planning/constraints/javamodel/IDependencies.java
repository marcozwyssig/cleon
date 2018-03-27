package cleon.initialization.projectmanagement.spec.planning.constraints.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IDependencies extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a965eaa2-d436-11e6-8a1d-7fdd5d29730e");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.constraints.javamodel.IProjectDependency> selectProjectDependencies();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a965eaa2-d436-11e6-8a1d-7fdd5d29730e,cPcmZSSckcRr0tUAbwIN0qZEGWk=] */
