package cleon.arc42.spec._05_buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class UseBuildingBlock extends DynamicResource implements IUseBuildingBlock {

  // abstract implementation, only used for static method calls
  private UseBuildingBlock() {
    super(IUseBuildingBlock.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock> selectToMeUseDecompositions(cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.arc42.spec._05_buildingblockview.javamodel.IUseBuildingBlock.class, cleon.arc42.spec._05_buildingblockview._05_buildingblockviewPackage.UseBuildingBlock_useDecompositions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,53d51c49-7ad7-11e4-a6e2-23d949480f96,b8iihYAuOxOd6v0tkirf/cFxU1Q=] */
