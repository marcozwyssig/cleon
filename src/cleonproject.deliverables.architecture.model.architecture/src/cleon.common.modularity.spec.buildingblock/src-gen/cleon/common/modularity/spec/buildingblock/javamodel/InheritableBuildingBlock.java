package cleon.common.modularity.spec.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class InheritableBuildingBlock extends DynamicResource implements IInheritableBuildingBlock {

  // abstract implementation, only used for static method calls
  private InheritableBuildingBlock() {
    super(IInheritableBuildingBlock.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.modularity.spec.buildingblock.javamodel.IInheritableBuildingBlock selectToMeInherits(cleon.common.modularity.spec.buildingblock.javamodel.IInheritance object) {
    return _getToMeSingle(object.getRepository(), cleon.common.modularity.spec.buildingblock.javamodel.IInheritableBuildingBlock.class, cleon.common.modularity.spec.buildingblock.BuildingblockPackage.InheritableBuildingBlock_inherits, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b9115cb9-ffba-11e4-ac0a-959b440f987f,Y/IZmYFwAHRiNm/LjAKLuij6xqk=] */
