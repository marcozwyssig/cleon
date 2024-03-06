package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSiteWithZone extends DynamicResource implements IAbstractSiteWithZone {

  // abstract implementation, only used for static method calls
  private AbstractSiteWithZone() {
    super(IAbstractSiteWithZone.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithZone> selectToMeZones(cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.INetdomainZone object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithZone.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithZone_zones, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,fd112c3e-ec15-11e9-8e1e-d59e76bdbf06,auAGjeanF4iqnSP+Se0Mp8V9Wxg=] */
