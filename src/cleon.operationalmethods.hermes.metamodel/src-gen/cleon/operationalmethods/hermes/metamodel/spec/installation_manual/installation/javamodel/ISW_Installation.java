package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISW_Installation extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8294ae9d-9535-11ec-9b36-7d300415c806");
  
  // relations
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IOS_Installation selectOs_installation();
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IApplication_Installation selectApplication_installation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8294ae9d-9535-11ec-9b36-7d300415c806,Z+NRgFRAgn1XUs1vEYJQqszdWiw=] */
