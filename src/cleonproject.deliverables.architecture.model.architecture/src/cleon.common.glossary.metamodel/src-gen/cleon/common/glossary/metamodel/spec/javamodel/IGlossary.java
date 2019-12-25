package cleon.common.glossary.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IGlossary extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7cdaa198-0c87-11e6-86c5-87a8b520dd59");
  
  // relations
  
  public java.util.List<? extends cleon.common.glossary.metamodel.spec.javamodel.ITerm> selectTerms();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7cdaa198-0c87-11e6-86c5-87a8b520dd59,Ku7JEg7LG04bOFOX7A3ohB+K+1s=] */
