package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISourceSubZone extends ch.actifsource.core.javamodel.IDecorator {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("19162783-b844-11e9-8760-2d4a9d15ec14");
  
  // relations
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone selectSourceSecuritySubZone();
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.segmentation.subzonepolicy.javamodel.ISubZoneAccessPolicy> selectTargetSubZonePolicy();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,19162783-b844-11e9-8760-2d4a9d15ec14,KTUBf15bfKUaWw4v1PTEIC+ctgQ=] */
