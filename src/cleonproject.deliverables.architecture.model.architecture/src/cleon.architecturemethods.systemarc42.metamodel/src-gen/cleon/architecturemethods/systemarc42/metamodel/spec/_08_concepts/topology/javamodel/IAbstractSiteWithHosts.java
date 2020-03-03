package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSiteWithHosts extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithZone {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("aa0c9e25-936e-11e9-8139-e76b19cfb4bf");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> selectHosts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,aa0c9e25-936e-11e9-8139-e76b19cfb4bf,3DDYtR8u+iPai/xbN5NeNdr8bcU=] */
