package cleon.modelinglanguages.network.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractPhysicalNetwork extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IGroupAware, cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetwork {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("679da3a6-7ac9-11e9-a70f-4dc03941a024");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.modelinglanguages.network.metamodel.spec.javamodel.IAbstractNetworkNode> selectNodes();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,679da3a6-7ac9-11e9-a70f-4dc03941a024,/V163qgO+jIrkdSE/BL+VtD4E2o=] */
