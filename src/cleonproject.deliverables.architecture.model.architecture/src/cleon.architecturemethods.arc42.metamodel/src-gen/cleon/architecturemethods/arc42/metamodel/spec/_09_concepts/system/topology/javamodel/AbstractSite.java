package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSite extends DynamicResource implements IAbstractSite {

  // abstract implementation, only used for static method calls
  private AbstractSite() {
    super(IAbstractSite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectToMeAllowedToManage(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.ISite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSite_allowedToManage, object.getResource());
  }
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite> selectToMeAllowAccessWith(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractSite_allowAccessWith, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,119b879d-878b-11e9-a61b-279ebde48b48,JBjFaTnMWQ1I7bBhfpIe6VSiUmc=] */
