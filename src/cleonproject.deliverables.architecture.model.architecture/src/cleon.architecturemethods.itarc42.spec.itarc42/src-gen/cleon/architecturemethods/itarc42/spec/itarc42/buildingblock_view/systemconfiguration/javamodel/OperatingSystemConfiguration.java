package cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class OperatingSystemConfiguration extends DynamicResource implements IOperatingSystemConfiguration {

  // abstract implementation, only used for static method calls
  private OperatingSystemConfiguration() {
    super(IOperatingSystemConfiguration.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.javamodel.IOperatingSystemConfiguration> selectToMeRuntime(cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.javamodel.IRuntime object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.javamodel.IOperatingSystemConfiguration.class, cleon.architecturemethods.itarc42.spec.itarc42.buildingblock_view.systemconfiguration.SystemconfigurationPackage.OperatingSystemConfiguration_runtime, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,75800d3e-1bfe-11e9-9896-651e5faa32a4,B8PjAXUtg3v7hQEKXVrDm5ANkuM=] */
