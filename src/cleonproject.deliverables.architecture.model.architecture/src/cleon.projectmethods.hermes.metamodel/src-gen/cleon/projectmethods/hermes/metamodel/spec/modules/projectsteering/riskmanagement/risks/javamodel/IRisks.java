package cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRisks extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("85df72cc-a7de-11e5-82dd-3b995d9c840c");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectsteering.riskmanagement.risks.javamodel.IRisk> selectRisks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,85df72cc-a7de-11e5-82dd-3b995d9c840c,bWNTLUDS6RMuiN274gMw7Ee5B0U=] */
