package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SystemComponentCompositionAware extends DynamicResource implements ISystemComponentCompositionAware {

  // abstract implementation, only used for static method calls
  private SystemComponentCompositionAware() {
    super(ISystemComponentCompositionAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponentCompositionAware selectToMeSystemComponents(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponent object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.javamodel.ISystemComponentCompositionAware.class, cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemcomponent.SystemcomponentPackage.SystemComponentCompositionAware_systemComponents, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,0acee12f-5ca9-11ea-9014-eb1fa518f623,CtllS8qG8wWOWgjUT6HJPJjQhXo=] */
