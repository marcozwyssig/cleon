package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSiteWithHosts extends DynamicResource implements IAbstractSiteWithHosts {

  // abstract implementation, only used for static method calls
  private AbstractSiteWithHosts() {
    super(IAbstractSiteWithHosts.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts selectToMeHosts(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractHost object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSiteWithHosts.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSiteWithHosts_hosts, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,aa0c9e25-936e-11e9-8139-e76b19cfb4bf,8/sYcMqVis+ELHDXwrjqNmns5MA=] */
