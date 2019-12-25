package cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IFeature extends cleon.modelinglanguages.uml.metamodel.spec.structural.components.javamodel.INamedComponentComposition {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("98431561-d40b-11e5-8556-8f55ceb91287");
  
  // relations
  
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.javamodel.IFeatureDependency> selectHasDependency();
  
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IMetaModel> selectMetamodel();
  
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IDiagram selectDiagram();
  
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.ITemplate> selectTemplates();
  
  public cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.sample.javamodel.ISample selectSample();
  
  public java.util.List<? extends cleon.applications.actifsource.metamodel.spec.system.category.feature.plugin.javamodel.IModel> selectModels();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,98431561-d40b-11e5-8556-8f55ceb91287,75/n/g7vUTPEa8LonPve9q2eGSI=] */
