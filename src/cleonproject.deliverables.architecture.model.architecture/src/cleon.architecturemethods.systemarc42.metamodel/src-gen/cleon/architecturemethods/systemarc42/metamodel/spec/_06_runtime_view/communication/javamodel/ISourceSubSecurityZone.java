package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISourceSubSecurityZone extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("70b3c6f7-b218-11e9-b89e-1728aee30149");
  
  // relations
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy selectSubZoneAccessPolicy();
  
  public cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.IImplementationState selectState();
  
  public java.util.List<? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IAbstractService> selectOnlyCommunicatesWith();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,70b3c6f7-b218-11e9-b89e-1728aee30149,CPxqx8K16daLEYi9Pe60VS4lDOc=] */
