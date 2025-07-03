package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IInstallWSUS extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b7f35629-4c14-11f0-ab62-57f8f0b40f9d");
  
  // attributes
  
  public java.lang.String selectWsus_data_store();
  
  public java.util.List<java.lang.String> selectProducts();
  
  public java.util.List<java.lang.String> selectUpdate_languages();
  
  public java.lang.String selectSynchronize_time_of_day();
  
  public java.lang.Integer selectNumber_of_synchronizations_per_day();
  
  public java.lang.String selectWsusserver_computer_target_group();
  
  public java.util.List<? extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IUpdateClassification> selectUpdate_classifications();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectProxy_server();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IService selectProxy_port();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b7f35629-4c14-11f0-ab62-57f8f0b40f9d,E2U83y2OD+r1CJbAJr23snainx0=] */
