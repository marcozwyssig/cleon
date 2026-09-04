package cleon.operationalmethods.hermes.metamodel.spec.installation_manual.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallationManualDocument extends cleon.common.doc.metamodel.spec.document.javamodel.IDocument, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("bfe8bdf4-23b3-11e9-9073-d1012347ccc5");
  
  // relations
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel.IInstallationmanualReference selectInstallationmanualReference();
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.introduction.javamodel.IIntroduction selectIntroduction();
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.installation.javamodel.IInstallation selectInstallation();
  
  public cleon.operationalmethods.hermes.metamodel.spec.installation_manual.reinstallation.javamodel.IReinstallation selectReinstallation();
  
  public cleon.architecturemethods.arc42.metamodel.spec.javamodel.ISystemArc42Document selectSystemArchitecture();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,bfe8bdf4-23b3-11e9-9073-d1012347ccc5,nYcBQZ6GqKDEms3oJRuALnzmr6k=] */
