package cleon.arc42.spec.buildingblockview.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class OwnBuildingBlock extends DynamicResource implements IOwnBuildingBlock {

  // abstract implementation, only used for static method calls
  private OwnBuildingBlock() {
    super(IOwnBuildingBlock.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.arc42.spec.buildingblockview.javamodel.IOwnBuildingBlock selectToMeOwnDecompositions(cleon.arc42.spec.buildingblockview.javamodel.IBuildingBlock object) {
    return _getToMeSingle(object.getRepository(), cleon.arc42.spec.buildingblockview.javamodel.IOwnBuildingBlock.class, cleon.arc42.spec.buildingblockview.BuildingblockviewPackage.OwnBuildingBlock_ownDecompositions, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,44745a10-7a47-11e4-a6e2-23d949480f96,l0knc5SWHXX/IIb7bStVoXwmnuY=] */
