package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IWsusJoin extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.javamodel.IPuppetConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("6fdcbaac-5260-11f0-9c5a-35f303bb18a5");
  
  public java.lang.Integer selectScheduled_install_hour();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost selectWsus_host();
  
  public cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.services.javamodel.IService selectWsus_port();
  
  public cleon.common.calendar.metamodel.spec.javamodel.IWeekday selectScheduled_install_day();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,6fdcbaac-5260-11f0-9c5a-35f303bb18a5,hnj9CwJs6YxwAtq+pZVkt+SDOm0=] */
