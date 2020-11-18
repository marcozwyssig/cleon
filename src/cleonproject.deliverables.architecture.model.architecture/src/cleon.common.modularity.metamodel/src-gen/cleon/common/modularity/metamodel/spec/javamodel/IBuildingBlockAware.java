package cleon.common.modularity.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBuildingBlockAware extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("671019b3-299b-11eb-8baa-95d9107006e8");
  
  // relations
  
  public java.util.List<? extends cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> selectBuildingBlock();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,671019b3-299b-11eb-8baa-95d9107006e8,2H0L392eocXeSnQt1tInLxjHZao=] */
