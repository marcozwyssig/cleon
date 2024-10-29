package cleon.common.building.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IBuildingConfig extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("14cb197a-2eee-11ea-a393-0bc3b1f5682f");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.common.building.metamodel.spec.javamodel.IBuildingPluginConfiguration> selectBuildPlugins();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,14cb197a-2eee-11ea-a393-0bc3b1f5682f,UTPmgFgZHnHjlKtzc7mtCE1j5MY=] */
