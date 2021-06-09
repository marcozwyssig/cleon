package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBackupConfiguration extends cleon.common.resources.metamodel.spec.id.javamodel.IIntegerBusinessObjectId, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8d62602e-c93b-11eb-adc4-d18d1353eb6e");
  
  // attributes
  
  public java.lang.String selectTool();
  
  public java.lang.Integer selectRTO_hours();
  
  public java.lang.Integer selectRPO_hours();
  
  public java.lang.Integer selectRetention_days();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.backup.javamodel.ISchedule selectSchedule();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8d62602e-c93b-11eb-adc4-d18d1353eb6e,g1NwCw3lQAsmWcrPH6kIHovBXkE=] */
