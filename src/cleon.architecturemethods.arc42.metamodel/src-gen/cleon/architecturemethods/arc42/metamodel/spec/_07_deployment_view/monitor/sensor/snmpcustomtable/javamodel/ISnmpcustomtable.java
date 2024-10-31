package cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISnmpcustomtable extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.javamodel.INamedSensor {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("db4b9480-c1eb-11ea-820f-9931558a898c");
  
  // attributes
  
  public java.lang.String selectIdent();
  
  public java.lang.String selectPuppet_qp();
  
  public java.lang.Boolean selectPuppet_ignore();
  
  public java.lang.String selectColumns_check();
  
  public java.lang.String selectIdentcolumn();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.monitor.sensor.snmpcustomtable.javamodel.ISnmpCustomTableChannel> selectSnmpCustomTableChannels();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,db4b9480-c1eb-11ea-820f-9931558a898c,VhQ+zaGUjQAOWpUnS/EuuHCs0RQ=] */
