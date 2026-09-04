package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISystemOperating extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("46b6647d-94c1-11ec-ab3a-174a15580942");
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.system.javamodel.IAbstractSystem selectSystem();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.javamodel.ISystemComponentOperating> selectOperatingSystemComponent();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,46b6647d-94c1-11ec-ab3a-174a15580942,SdXeU9HbGDSosI2l8GP/Mg4cubs=] */
