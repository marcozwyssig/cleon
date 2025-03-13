package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IMachineResource extends cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.ICfgResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c66f0428-f172-11e8-b3e7-15e2dd8d9b05");
  
  public java.lang.Integer selectMemoryGB();
  
  public java.lang.Integer selectDiskGB();
  
  // relations
  
  public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.machine.javamodel.ICPU selectCpu();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c66f0428-f172-11e8-b3e7-15e2dd8d9b05,5ZEK+TmsdTugLzsl0+Pa+GTlMe8=] */
