package cleon.common.glossary.spec.glossary.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGlossary extends cleon.common.doc.spec.doc.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7cdaa198-0c87-11e6-86c5-87a8b520dd59");
  
  // relations
  
  public java.util.List<? extends cleon.common.glossary.spec.glossary.javamodel.ITerm> selectTerms();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7cdaa198-0c87-11e6-86c5-87a8b520dd59,5WW5iCqjFd+Q3JtNgTz1qj4gm50=] */
