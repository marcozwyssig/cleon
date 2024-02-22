package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemcomponent.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SystemComponentCompositionAware extends DynamicResource implements ISystemComponentCompositionAware {

  // abstract implementation, only used for static method calls
  private SystemComponentCompositionAware() {
    super(ISystemComponentCompositionAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemcomponent.javamodel.ISystemComponentCompositionAware selectToMeSystemComponents(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemcomponent.javamodel.ISystemComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemcomponent.javamodel.ISystemComponentCompositionAware.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemcomponent.SystemcomponentPackage.SystemComponentCompositionAware_systemComponents, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0acee12f-5ca9-11ea-9014-eb1fa518f623,jTonAxlMt/URM0swHkJQxT2+V10=] */
