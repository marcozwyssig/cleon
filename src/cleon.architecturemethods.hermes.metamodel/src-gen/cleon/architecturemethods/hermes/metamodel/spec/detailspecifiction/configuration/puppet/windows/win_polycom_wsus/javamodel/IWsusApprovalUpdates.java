package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWsusApprovalUpdates extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("3ac66734-8a6b-11f0-af5e-cd5d044ab02b");
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> selectKBs();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> selectUninstall();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> selectNotApproved();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> selectDenied();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> selectInstall();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,3ac66734-8a6b-11f0-af5e-cd5d044ab02b,o6Wwd/uWoB5QwcmL1q3beEDGNGo=] */
