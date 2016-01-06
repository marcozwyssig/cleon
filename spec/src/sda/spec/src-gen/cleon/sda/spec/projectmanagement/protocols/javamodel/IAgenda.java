package cleon.sda.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAgenda extends cleon.doc.spec.chapter.javamodel.IChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6f5a3bc3-b461-11e5-a3f4-497fd75158dc");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IAgendaItem> selectItems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6f5a3bc3-b461-11e5-a3f4-497fd75158dc,C4qAz+G3h6lQyyjqOticqtcTzs8=] */
