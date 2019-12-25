package cleon.common.knowledge.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IKnowledgeComposition extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("012cc4cb-b7df-11e6-ab27-f74a954bc0f4");
  
  // relations
  
  public java.util.List<? extends cleon.common.knowledge.metamodel.spec.javamodel.IKnowledge> selectKnowledges();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,012cc4cb-b7df-11e6-ab27-f74a954bc0f4,zK28K1NwhXbUXazRSAa06EaNTU8=] */
