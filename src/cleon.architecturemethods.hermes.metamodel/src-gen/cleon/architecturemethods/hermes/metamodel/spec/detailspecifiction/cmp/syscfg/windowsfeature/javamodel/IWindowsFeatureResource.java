package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.windowsfeature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWindowsFeatureResource extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.ICfgResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("49801248-f18e-11e8-b3e7-15e2dd8d9b05");
  
  public java.lang.Boolean selectInstallmanagementtools();
  
  public java.lang.Boolean selectInstallsubfeatures();
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.IInstallationState selectEnsure();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,49801248-f18e-11e8-b3e7-15e2dd8d9b05,mbJ86sJ4wEzAqdEqt6gqwz96rK4=] */
