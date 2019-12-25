package cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IHasAssets extends ch.actifsource.core.javamodel.IResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("c80d50de-bbd6-11e6-997f-d73ea5a3671c");
  
  // relations
  
  public java.util.List<? extends cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.resource.infrastructure.javamodel.IAsset> selectAssets();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,c80d50de-bbd6-11e6-997f-d73ea5a3671c,cEB7znSMRXiH5WF+SbcQj094Bkg=] */
