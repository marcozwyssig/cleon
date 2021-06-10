package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICapacitySystemConfigurationConcept extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("467d3cb7-c93e-11eb-adc4-d18d1353eb6e");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration selectSystemConfiguration();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.ICore> selectCoreUsage();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IMemory> selectMemoryUsage();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.capacityplanning.javamodel.IDisk> selectDiskUsage();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,467d3cb7-c93e-11eb-adc4-d18d1353eb6e,RbPH8j3jBkmhE8c/ypi1t9aP7a0=] */
