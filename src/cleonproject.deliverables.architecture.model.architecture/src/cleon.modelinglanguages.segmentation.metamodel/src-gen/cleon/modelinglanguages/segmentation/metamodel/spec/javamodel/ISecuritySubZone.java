package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISecuritySubZone extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INamedZone, cleon.common.resources.metamodel.spec.confidentiality.javamodel.IClassificationAware {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7f40c131-0b75-11e9-a136-69d076e48ed1");
  
  public java.lang.Integer selectVLAN_No();
  
  public java.lang.Integer selectMask();
  
  public java.lang.Boolean selectExport();
  
  // relations
  
  public cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.IZone selectNoZones();
  
  public java.util.List<? extends cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone> selectAllowedAccessTo();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7f40c131-0b75-11e9-a136-69d076e48ed1,U3/3uRzNbXy4foJPfpXcKKYEH08=] */
