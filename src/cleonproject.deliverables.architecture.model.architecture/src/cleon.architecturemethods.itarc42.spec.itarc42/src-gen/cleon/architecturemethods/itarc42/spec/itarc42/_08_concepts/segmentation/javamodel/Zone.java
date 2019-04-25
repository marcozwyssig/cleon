package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Zone extends DynamicResource implements IZone {

  // abstract implementation, only used for static method calls
  private Zone() {
    super(IZone.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.IZone selectToMeZones(cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.IZone object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.javamodel.IZone.class, cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.segmentation.SegmentationPackage.Zone_zones, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fb4a0fa3-0b73-11e9-a136-69d076e48ed1,cxu7Vq2BWRgniMSpGYt1yOqA76A=] */
