package cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFeature extends cleon.modelinglanguages.uml.spec.uml2.structural.components.javamodel.INamedComponentComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("98431561-d40b-11e5-8556-8f55ceb91287");
  
  // relations
  
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.javamodel.IFeatureDependency> selectHasDependency();
  
  public cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IMetaModel selectMetamodel();
  
  public cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IDiagram selectDiagram();
  
  public cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.sample.javamodel.ISample selectSample();
  
  public java.util.List<? extends cleon.applications.actifsource.spec.actifsource.system.category.feature.plugin.javamodel.IModel> selectModels();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,98431561-d40b-11e5-8556-8f55ceb91287,8TWEBweqTtB7pD1VoVqwfseyNww=] */
