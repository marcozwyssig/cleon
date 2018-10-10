package cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIssues extends cleon.architecturemethods.eamod.spec.eamod.chrv.javamodel.IRequirementDocument, cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("9fb6a044-bdee-11e5-965a-07bc81ea9ca9");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.IIssueGroup> selectIssueGroups();
  
  public java.util.List<? extends cleon.architecturemethods.eamod.spec.eamod.chrv.issues.javamodel.ICategory> selectCategories();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,9fb6a044-bdee-11e5-965a-07bc81ea9ca9,InbBrZlm7rn5YOfxN9Jiue/+suI=] */
