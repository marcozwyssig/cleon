package cleon.doc.spec.chapter.paragraph.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOrderedList extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph, cleon.doc.spec.javamodel.IUseDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1042ee35-d881-11e4-a5d6-b92b0ce88839");
  
  // relations
  
  public java.util.List<? extends cleon.doc.spec.chapter.paragraph.javamodel.IParagraph> selectParagraphs();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1042ee35-d881-11e4-a5d6-b92b0ce88839,J68J5F3Nv8ikMbHLkykTrWAuobA=] */
