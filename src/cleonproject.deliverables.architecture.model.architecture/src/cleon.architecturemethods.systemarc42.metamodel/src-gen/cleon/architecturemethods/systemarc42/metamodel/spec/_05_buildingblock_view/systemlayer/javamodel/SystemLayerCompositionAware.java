package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemlayer.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SystemLayerCompositionAware extends DynamicResource implements ISystemLayerCompositionAware {

  // abstract implementation, only used for static method calls
  private SystemLayerCompositionAware() {
    super(ISystemLayerCompositionAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemlayer.javamodel.ISystemLayerCompositionAware selectToMeLayers(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemlayer.javamodel.ISystemLayer object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemlayer.javamodel.ISystemLayerCompositionAware.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemlayer.SystemlayerPackage.SystemLayerCompositionAware_layers, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,710765f1-d28b-11ec-90fa-eddb29a5483c,aRsLjX3FzdFd95FFvRqzdKOnHM0=] */
