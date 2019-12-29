package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class VirtualAppliance extends DynamicResource implements IVirtualAppliance {

  // abstract implementation, only used for static method calls
  private VirtualAppliance() {
    super(IVirtualAppliance.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,c0dc14c1-77b7-11e9-8094-13b915a38efa,+eIJvkOnZ4JzLLkZratSmxRuJeM=] */
