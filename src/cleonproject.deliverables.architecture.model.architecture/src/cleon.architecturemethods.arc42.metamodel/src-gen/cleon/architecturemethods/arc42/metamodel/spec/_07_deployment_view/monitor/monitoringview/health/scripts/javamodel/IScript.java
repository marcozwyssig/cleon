package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IScript extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractNamedChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("4ab16a4b-8fdf-11e8-85d9-314ddfdf57eb");
  
  public java.lang.Integer selectIntervalNormalMinutes();
  
  public java.lang.Integer selectIntervalIncidentMinutes();
  
  // relations
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IParameter> selectParameters();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IAlarmBehaviour select__W_stErrorBehaviour();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IAlarmBehaviour select__X_ndErrorBehaviour();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IAlarmBehaviour select__Y_rdErrorBehaviour();
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.monitoringview.health.scripts.javamodel.IAlarmBehaviour selectWarningBehaviour();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,4ab16a4b-8fdf-11e8-85d9-314ddfdf57eb,OfZASXJ4E+mMzaHZOU+c86ifWII=] */
