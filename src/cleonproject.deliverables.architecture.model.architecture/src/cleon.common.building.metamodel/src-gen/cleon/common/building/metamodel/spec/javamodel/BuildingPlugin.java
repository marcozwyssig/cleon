package cleon.common.building.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BuildingPlugin extends DynamicResource implements IBuildingPlugin {

  // abstract implementation, only used for static method calls
  private BuildingPlugin() {
    super(IBuildingPlugin.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4dcd2f9b-2fb5-11ea-a393-0bc3b1f5682f,zXplQIbFOP7ZQ0j53g2Qu+f47bE=] */
