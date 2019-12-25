package cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIssueGroup extends ch.actifsource.core.javamodel.INamedResource, cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e33649ff-ce66-11e5-8041-092cb74c72f2");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.metamodel.spec.chrv.issues.javamodel.IIssue> selectIssues();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e33649ff-ce66-11e5-8041-092cb74c72f2,w9QZjKW91Myy0M8hPPSlUZWur0Y=] */
