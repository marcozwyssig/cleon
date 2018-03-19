package cleon.conception.modelinglanguage.spec.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DecompositionBuildingBlock extends DynamicResource implements IDecompositionBuildingBlock {

  // abstract implementation, only used for static method calls
  private DecompositionBuildingBlock() {
    super(IDecompositionBuildingBlock.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecompositionBuildingBlock selectToMeDecompose(cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.modelinglanguage.spec.buildingblock.javamodel.IDecompositionBuildingBlock.class, cleon.conception.modelinglanguage.spec.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b62f1413-174c-11e5-9ca7-d1bb57b73459,91JV6NkqiZxcs3rIl1MGD8p7lcg=] */
