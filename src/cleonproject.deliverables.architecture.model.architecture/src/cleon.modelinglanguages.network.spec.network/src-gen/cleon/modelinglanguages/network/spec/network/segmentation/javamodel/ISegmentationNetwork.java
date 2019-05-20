package cleon.modelinglanguages.network.spec.network.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ISegmentationNetwork extends cleon.modelinglanguages.network.spec.network.javamodel.IAbstractNetworks {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("adb6ceb3-7ac7-11e9-a70f-4dc03941a024");
  
  // relations
  
  public java.util.List<? extends cleon.modelinglanguages.network.spec.segmentation.javamodel.IZone> selectZones();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,adb6ceb3-7ac7-11e9-a70f-4dc03941a024,/QMCg/icXhuCHwt/uiwtFMUVefQ=] */
