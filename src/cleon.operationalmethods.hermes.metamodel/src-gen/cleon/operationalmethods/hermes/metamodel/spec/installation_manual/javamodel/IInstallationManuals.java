package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallationManuals extends ch.actifsource.core.javamodel.IResource, cleon.common.doc.metamodel.spec.chapter.about.javamodel.IAboutAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("a3123c6e-23b3-11e9-9073-d1012347ccc5");
  
  // relations
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.javamodel.IOperatingManual selectOperatingManual();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel.IInstallationManualDocument> selectInstallationManuals();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,a3123c6e-23b3-11e9-9073-d1012347ccc5,AeMAHa9AwYQlvCqixyouYcUdRjA=] */
