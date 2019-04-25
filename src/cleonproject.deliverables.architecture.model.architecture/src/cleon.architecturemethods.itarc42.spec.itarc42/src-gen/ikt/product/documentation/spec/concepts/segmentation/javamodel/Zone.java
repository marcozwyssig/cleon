package ikt.product.documentation.spec.concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Zone extends DynamicResource implements IZone {

  // abstract implementation, only used for static method calls
  private Zone() {
    super(IZone.TYPE_ID);
  }
  
  // toMeRelations
  
  public static ikt.product.documentation.spec.concepts.segmentation.javamodel.IZone selectToMeZones(ikt.product.documentation.spec.concepts.segmentation.javamodel.IZone object) {
    return _getToMeSingle(object.getRepository(), ikt.product.documentation.spec.concepts.segmentation.javamodel.IZone.class, ikt.product.documentation.spec.concepts.segmentation.SegmentationPackage.Zone_zones, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fb4a0fa3-0b73-11e9-a136-69d076e48ed1,ueaIAPZBKkoAtiZnL7SOrfBI55o=] */
