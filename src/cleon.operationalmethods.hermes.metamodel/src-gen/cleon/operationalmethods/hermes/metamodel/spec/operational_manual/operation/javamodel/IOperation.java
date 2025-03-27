package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOperation extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("34e65236-1a61-11e9-b1cd-355f2e2f05a9");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor selectActor();
  
  public java.util.List<? extends cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystem> selectSystemsToOperate();
  
  public java.util.List<? extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter> selectCustomChapter();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemConfigurationOperation> selectOperationSystemConfiguration();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,34e65236-1a61-11e9-b1cd-355f2e2f05a9,xO0QNPIqJwOIuJvaQrkWmFUufTw=] */
