package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAbstractSiteWithZone extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fd112c3e-ec15-11e9-8e1e-d59e76bdbf06");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetdomainZone> selectZones();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fd112c3e-ec15-11e9-8e1e-d59e76bdbf06,XCYXzMyVsQmketIJQaNv5Qylu+s=] */
