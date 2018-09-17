package cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOutcomes extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fdf40175-b53c-11e5-bc0c-f35b68c3609a");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.initialization.projectmanagement.spec.planning.scope.outcomes.javamodel.IOutcome> selectOutcomes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fdf40175-b53c-11e5-bc0c-f35b68c3609a,Slrn5dOalr7Vw+HaxL6SwkOjX6E=] */
