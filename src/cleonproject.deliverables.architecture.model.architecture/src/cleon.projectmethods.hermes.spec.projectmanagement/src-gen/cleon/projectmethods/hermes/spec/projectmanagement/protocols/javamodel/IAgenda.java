package cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAgenda extends cleon.common.doc.doc.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.doc.spec.javamodel.INoDocumentElementComposite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6f5a3bc3-b461-11e5-a3f4-497fd75158dc");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IAgendaItem> selectItems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6f5a3bc3-b461-11e5-a3f4-497fd75158dc,R6XFYmeldioxPvSvwTWm5ft8pbw=] */
