package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.availability.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IAvailabilityBuildingBlock extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator, cleon.common.resources.metamodel.spec.descriptions.javamodel.ISimpleDescription {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("8d626018-c93b-11eb-adc4-d18d1353eb6e");
  
  // relations
  
  public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock selectAvailabilityBuildingBlock();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.availability.businesscontinuity.availability.javamodel.IAvailabilityConfiguration selectAvailability();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,8d626018-c93b-11eb-adc4-d18d1353eb6e,KqH2Zgt4bzamXJzjGQZnpegeJWs=] */
