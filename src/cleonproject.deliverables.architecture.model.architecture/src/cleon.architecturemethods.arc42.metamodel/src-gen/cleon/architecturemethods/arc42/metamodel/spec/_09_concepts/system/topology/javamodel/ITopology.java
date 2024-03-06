package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITopology extends cleon.common.doc.metamodel.spec.chapter.javamodel.IAbstractChapter {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("fca3a39b-878a-11e9-a61b-279ebde48b48");
  
  public java.lang.String selectDomainPrefix();
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ITopologyEnvironment> selectTopologyEnvironment();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,fca3a39b-878a-11e9-a61b-279ebde48b48,Qh1Zn4qqMevostPLOJfYI+62ovk=] */
