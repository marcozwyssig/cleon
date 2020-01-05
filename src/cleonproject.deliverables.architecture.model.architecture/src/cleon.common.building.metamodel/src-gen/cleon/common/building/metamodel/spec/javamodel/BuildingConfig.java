package cleon.common.building.metamodel.spec.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class BuildingConfig extends DynamicResource implements IBuildingConfig {

  // abstract implementation, only used for static method calls
  private BuildingConfig() {
    super(IBuildingConfig.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.common.building.metamodel.spec.javamodel.IBuildingConfig selectToMeBuildPlugins(cleon.common.building.metamodel.spec.javamodel.IBuildingPluginConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.common.building.metamodel.spec.javamodel.IBuildingConfig.class, cleon.common.building.metamodel.spec.SpecPackage.BuildingConfig_buildPlugins, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,14cb197a-2eee-11ea-a393-0bc3b1f5682f,Lil5EC/+oqaMfp/G2/9NOleuFvg=] */
