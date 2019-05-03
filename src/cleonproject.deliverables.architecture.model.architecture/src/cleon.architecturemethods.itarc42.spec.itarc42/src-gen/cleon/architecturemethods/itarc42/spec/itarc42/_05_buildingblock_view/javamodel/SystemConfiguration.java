package cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SystemConfiguration extends DynamicResource implements ISystemConfiguration {

  // abstract implementation, only used for static method calls
  private SystemConfiguration() {
    super(ISystemConfiguration.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel.ISystemConfiguration selectToMeHasDependency(cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel.ISystemConfigurationDependency object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view.javamodel.ISystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42._05_buildingblock_view._05_buildingblock_viewPackage.SystemConfiguration_hasDependency, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4e0a6f85-e0fb-11e8-8499-a3b0fb3cad90,saFEhbGlTuIkzPaigNYFnbpMUEM=] */
