package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISecurityZone extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INamedZone {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("32beba1e-0b75-11e9-a136-69d076e48ed1");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectSecuritySubZones();
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecurityZone> selectAllowedAccessTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,32beba1e-0b75-11e9-a136-69d076e48ed1,Sgmi3I2Xx4yWJAumq6ANbb1Y8u8=] */
