package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractNumberedHostAware extends DynamicResource implements IAbstractNumberedHostAware {

  // abstract implementation, only used for static method calls
  private AbstractNumberedHostAware() {
    super(IAbstractNumberedHostAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractNumberedHostAware> selectToMeHost(cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.INumberedHost object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.javamodel.IAbstractNumberedHostAware.class, cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.topology.TopologyPackage.AbstractNumberedHostAware_host, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2fcaf1bb-6064-11ef-93d4-a95e039110df,ClQj4AsSP2XYiEbAodfnI/0Tw5w=] */
