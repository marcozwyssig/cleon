package cleon.modelinglanguages.segmentation.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class NetdomainZone extends DynamicResource implements INetdomainZone {

  // abstract implementation, only used for static method calls
  private NetdomainZone() {
    super(INetdomainZone.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetdomainZone selectToMeSegments(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISegmentZone object) {
    return _getToMeSingle(object.getRepository(), cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetdomainZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.NetdomainZone_segments, object.getResource());
  }
  
  public static java.util.List<cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetdomainZone> selectToMeAllowed(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetdomainZone object) {
    return _getToMeList(object.getRepository(), cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetdomainZone.class, cleon.modelinglanguages.segmentation.metamodel.spec.SpecPackage.NetdomainZone_allowed, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,da24cca3-0b73-11e9-a136-69d076e48ed1,7XYUVFKayMlcqoqsbCbBw/7SatU=] */
