package cleon.arc42.spec.buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class InheritableBuildingBlock extends DynamicResource implements IInheritableBuildingBlock {

  // abstract implementation, only used for static method calls
  private InheritableBuildingBlock() {
    super(IInheritableBuildingBlock.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.arc42.spec.buildingblockview.javamodel.IInheritableBuildingBlock selectToMeInherits(cleon.arc42.spec.buildingblockview.javamodel.IInheritance object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec.buildingblockview.javamodel.IInheritableBuildingBlock.class, cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.InheritableBuildingBlock_inherits, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b9115cb9-ffba-11e4-ac0a-959b440f987f,Yj3ceHi9jbRh1uWCfJZeXqB5f4M=] */
