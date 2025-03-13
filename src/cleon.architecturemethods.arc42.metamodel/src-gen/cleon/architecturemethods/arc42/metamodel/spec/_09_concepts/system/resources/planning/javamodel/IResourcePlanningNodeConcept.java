package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.planning.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IResourcePlanningNodeConcept extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter, ch.actifsource.core.javamodel.IDecorator, cleon.common.doc.metamodel.spec.chapter.javamodel.INoChapters {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("69dd239f-dfef-11eb-93d3-9f230e4bb32b");
  
  public java.lang.Integer selectBruttoMHz_CPU();
  
  public java.lang.Integer selectNettoMHz_CPU();
  
  public java.lang.Integer selectBruttoTotalMHz_CPU_Core();
  
  public java.lang.Integer selectNettoTotalMHz_CPU_Core();
  
  public java.lang.Integer selectCountOfVMs();
  
  public java.lang.Integer selectNettoMGHz_VM();
  
  public java.lang.Integer selectReserveMGHz_VM();
  
  public java.lang.Integer selectBruttoMemoryGB();
  
  public java.lang.Integer selectNettoMemoryGB();
  
  public java.lang.Integer selectTotalNettoMemoryGB_VM();
  
  public java.lang.Integer selectReserveNettoMemoryGB();
  
  public java.util.List<java.lang.Double> selectBruttoDiskGB();
  
  public java.lang.Integer selectTotalNettoDiskGB();
  
  public java.lang.Integer selectNettoDiskGB_VM();
  
  public java.lang.Integer selectReserveDiskGB();
  
  // relations
  
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deploy.environment.node.buildnode.javamodel.IBuildNode selectResourcePlanningForNode();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,69dd239f-dfef-11eb-93d3-9f230e4bb32b,PEhSdJa1ZuQZb6JGe3IKa1DIU6E=] */
