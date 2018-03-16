package cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class DecompositionBuildingBlock extends DynamicResource implements IDecompositionBuildingBlock {

  // abstract implementation, only used for static method calls
  private DecompositionBuildingBlock() {
    super(IDecompositionBuildingBlock.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecompositionBuildingBlock selectToMeDecompose(cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecomposite object) {
    return _getToMeSingle(object.getRepository(), cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.javamodel.IDecompositionBuildingBlock.class, cleon.conception.arc.spec.arc42._05_buildingblock_view.buildingblock.BuildingblockPackage.DecompositionBuildingBlock_decompose, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b62f1413-174c-11e5-9ca7-d1bb57b73459,Cjt2QEqO7gtWEdBZnxXSgbhOBLY=] */
