package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISecuritySubZone extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INamedZone, cleon.common.resources.metamodel.spec.confidentiality.javamodel.IClassificationAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f40c131-0b75-11e9-a136-69d076e48ed1");
  
  public java.lang.Integer select__old__VLAN_No();
  
  public java.lang.Integer selectMask();
  
  public java.lang.Boolean selectExport();
  
  public java.lang.String selectHostGroupPrefix();
  
  // relations
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone selectNoZones();
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IAbstractVlan selectVLANs();
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan selectDefaultVlan();
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IVlan> selectAllVlans();
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectAllowedAccessToSecuritySubZone();
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectAllowedAccessFromSecuritySubZone();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f40c131-0b75-11e9-a136-69d076e48ed1,Z0yFaWjTqucdtd74Nn/avOxLmXw=] */
