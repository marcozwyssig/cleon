package cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAgendaItem extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cf7dbe8a-b461-11e5-a3f4-497fd75158dc");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.spec.projectmanagement.protocols.javamodel.IAgendaItem> selectSubItems();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cf7dbe8a-b461-11e5-a3f4-497fd75158dc,g6X9GlxN1ifTv1P+HHZ374s3/u4=] */
