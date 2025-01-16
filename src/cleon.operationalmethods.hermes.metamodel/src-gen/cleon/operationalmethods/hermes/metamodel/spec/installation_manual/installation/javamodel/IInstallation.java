package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallation extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b783c4be-94da-11ec-9b36-7d300415c806");
  
  // relations
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IHW_Installation selectHw_installation();
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.ISW_Installation selectSw_installation();
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IPost_Installation selectPost_installation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b783c4be-94da-11ec-9b36-7d300415c806,+vZ3+97uXyPB2Smp7Yl/PzgTcXI=] */
