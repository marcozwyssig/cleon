package cleon.arc42.spec.buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BuildingBlock extends DynamicResource implements IBuildingBlock {

  // abstract implementation, only used for static method calls
  private BuildingBlock() {
    super(IBuildingBlock.TYPE_ID);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,243b1867-7973-11e4-a6e2-23d949480f96,Gl8A73GRciZWdV8kZGRZ2jHtD4U=] */
