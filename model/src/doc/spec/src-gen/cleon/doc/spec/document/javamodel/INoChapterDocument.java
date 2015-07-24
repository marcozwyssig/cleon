package cleon.doc.spec.document.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface INoChapterDocument extends cleon.doc.spec.document.javamodel.IDocument {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("eaf1f7df-31f6-11e5-bd99-eda9ce254b0b");
  
  // relations
  
  public cleon.doc.spec.chapter.javamodel.IChapter selectNoChapters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,eaf1f7df-31f6-11e5-bd99-eda9ce254b0b,1x9BD/NdPwHd40Ymuh0wdw4hbJ4=] */
