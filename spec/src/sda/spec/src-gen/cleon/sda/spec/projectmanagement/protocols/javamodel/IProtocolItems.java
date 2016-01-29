package cleon.sda.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IProtocolItems extends cleon.doc.spec.chapter.javamodel.IChapter, ch.actifsource.core.javamodel.IDecorator, cleon.doc.spec.chapter.javamodel.INoChapters, cleon.doc.spec.paragraph.javamodel.INoParagraph {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("35502e39-b462-11e5-a3f4-497fd75158dc");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItems> selectProtocolsAgenda();
  
  public cleon.sda.spec.projectmanagement.protocols.javamodel.IAgendaItem selectAgendaItem();
  
  public java.util.List<? extends cleon.sda.spec.projectmanagement.protocols.javamodel.IProtocolItem> selectProtocols();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,35502e39-b462-11e5-a3f4-497fd75158dc,V7kPcqfYoWrCSCYwGorDoRvqrws=] */
