package cleon.common.modularity.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BuildingBlockAware extends DynamicResource implements IBuildingBlockAware {

  // abstract implementation, only used for static method calls
  private BuildingBlockAware() {
    super(IBuildingBlockAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlockAware> selectToMeBuildingBlock(cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock object) {
    return _getToMeList(object.getRepository(), cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlockAware.class, cleon.common.modularity.metamodel.spec.SpecPackage.BuildingBlockAware_buildingBlock, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,671019b3-299b-11eb-8baa-95d9107006e8,ZHuCuLGw87qo+LD2/9cqUQvmQgU=] */
