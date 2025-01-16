package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IIntroduction extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("e8bad899-23b6-11e9-81dc-3f1abd72aee7");
  
  // relations
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPurpose selectPurpose();
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IAudience selectAudience();
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IPrerequisites selectPrerequisites();
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IRemarks selectRemarks();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,e8bad899-23b6-11e9-81dc-3f1abd72aee7,yHbKWPHNDW/GuTrGH+01kfOd6T8=] */
