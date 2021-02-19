package cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IActifsource extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.javamodel.INature {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("cc2363fe-3fd7-11e8-bd50-b94594551673");
  
  public java.lang.Boolean selectUseSimpleNameForBinding();
  
  public java.lang.String selectPluginActivationClassName();
  
  public java.lang.String selectBuildFactoryClassName();
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.project.nature.actifsource.javamodel.ITargetPath> selectTargetPaths();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,cc2363fe-3fd7-11e8-bd50-b94594551673,0F2iBLK828lzit5B/NDRoDqv30w=] */
