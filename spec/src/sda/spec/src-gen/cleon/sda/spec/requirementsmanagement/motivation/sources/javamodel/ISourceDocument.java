package cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISourceDocument extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0322fa0c-bb80-11e5-b2f7-f515c847fa35");
  
  // relations
  
  public java.util.List<? extends cleon.sda.spec.requirementsmanagement.motivation.sources.javamodel.ISourceChapter> selectChapters();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0322fa0c-bb80-11e5-b2f7-f515c847fa35,BZwvysdb7NHEm87FaO7vNDNP2vc=] */
