package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSiteWithHosts extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithZone {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("aa0c9e25-936e-11e9-8139-e76b19cfb4bf");
  
  // relations
  
  public IMultiMapOrdered<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost> selectHosts();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,aa0c9e25-936e-11e9-8139-e76b19cfb4bf,sngrf6y/e/UPLyGiIzTVLUoeQpY=] */
