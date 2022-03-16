package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSiteWithZone extends DynamicResource implements IAbstractSiteWithZone {

  // abstract implementation, only used for static method calls
  private AbstractSiteWithZone() {
    super(IAbstractSiteWithZone.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithZone> selectToMeZones(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetdomainZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithZone.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSiteWithZone_zones, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fd112c3e-ec15-11e9-8e1e-d59e76bdbf06,ygxMQUXgFn97DfalZjeTYW0m1aI=] */
