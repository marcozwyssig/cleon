package cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackupConfiguration extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("0713be48-1e42-11e9-865e-41ef48a95f70");
  
  // attributes
  
  public java.lang.String selectTool();
  
  public java.lang.Integer selectRTO_hours();
  
  public java.lang.Integer selectRPO_hours();
  
  public java.lang.Integer selectRetention_days();
  
  public cleon.architecturemethods.arc42.metamodel.spec._08_concepts.system.businesscontinuity.backup.javamodel.ISchedule selectSchedule();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,0713be48-1e42-11e9-865e-41ef48a95f70,1ritCwQxMQYqpIBNW4QBelRwX8I=] */
