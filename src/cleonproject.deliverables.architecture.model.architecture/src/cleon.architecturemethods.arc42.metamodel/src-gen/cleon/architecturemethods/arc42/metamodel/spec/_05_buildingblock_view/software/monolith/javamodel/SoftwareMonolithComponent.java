package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.software.monolith.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SoftwareMonolithComponent extends DynamicResource implements ISoftwareMonolithComponent {

  // abstract implementation, only used for static method calls
  private SoftwareMonolithComponent() {
    super(ISoftwareMonolithComponent.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,60e64751-bf7f-11ee-b188-131fa688415c,2jLCex15TBIUhz/GpZzY91zC86g=] */
