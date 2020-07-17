package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISubZoneAccessPolicy extends ch.actifsource.core.javamodel.IResource, ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("80913edf-b844-11e9-8760-2d4a9d15ec14");
  
  // relations
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectPolicyForDestinationSecuritySubZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,80913edf-b844-11e9-8760-2d4a9d15ec14,S9zwzPaVTiXnwkCDqN1r10QvCQs=] */
