package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IChangeManagementSystemConfiguration extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IProcessSystemConfiguration {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("842b05eb-1b26-11e9-ad9a-a143a9cb74e7");
  
  // relations
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IStandardChangesSystemConfiguration selectStandard();
  
  public cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.INonStandardChangesSystemConfiguration selectNonStandard();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,842b05eb-1b26-11e9-ad9a-a143a9cb74e7,ik5lfBUrN9tIC99Fi2IwMPWQ9jw=] */
