package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSite extends DynamicResource implements IAbstractSite {

  // abstract implementation, only used for static method calls
  private AbstractSite() {
    super(IAbstractSite.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> selectToMeAllowedToManage(cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ISite object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite.class, cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.TopologyPackage.AbstractSite_allowedToManage, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,119b879d-878b-11e9-a61b-279ebde48b48,AXDQFp/o3fxD57zReV+zy3ztC4o=] */
