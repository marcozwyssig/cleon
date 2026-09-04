package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallationmanualReference extends cleon.common.doc.metamodel.spec.chapter.references.javamodel.IReference, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7996b5e3-1b34-11e9-ad9a-a143a9cb74e7");
  
  public java.lang.String selectDocId();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration selectInstallationManualForSystemConfiguration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7996b5e3-1b34-11e9-ad9a-a143a9cb74e7,EffLzQcv8fesVnYMDoCnx+Sydi0=] */
