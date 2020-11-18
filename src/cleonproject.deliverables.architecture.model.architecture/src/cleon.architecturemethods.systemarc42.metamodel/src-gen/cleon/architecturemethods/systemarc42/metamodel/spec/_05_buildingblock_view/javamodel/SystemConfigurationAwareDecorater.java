package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class SystemConfigurationAwareDecorater extends DynamicResource implements ISystemConfigurationAwareDecorater {

  // abstract implementation, only used for static method calls
  private SystemConfigurationAwareDecorater() {
    super(ISystemConfigurationAwareDecorater.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfigurationAwareDecorater> selectToMeTargetToSystemConfiguration(cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfigurationAwareDecorater.class, cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view._05_buildingblock_viewPackage.SystemConfigurationAwareDecorater_targetToSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f6167763-2997-11eb-9648-7bdf8dc8eaf2,1YrsI7MF2u9v/f63T/xXd5qgH+w=] */
