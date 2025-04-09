package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallChocoSoftware extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("1737a7ec-13bf-11f0-b664-c7b92124985d");
  
  // attributes
  
  public java.lang.String selectSourceLocation();
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software.javamodel.IChocoPackage> selectChocoPackages();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,1737a7ec-13bf-11f0-b664-c7b92124985d,gFEFH2wUAx+ZaUcOHndfsDLAZVE=] */
