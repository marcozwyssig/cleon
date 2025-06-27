package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractConfiguration extends DynamicResource implements IAbstractConfiguration {

  // abstract implementation, only used for static method calls
  private AbstractConfiguration() {
    super(IAbstractConfiguration.TYPE_ID);
  }
  
  // toMeRelations
  
  public static java.util.List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration> selectToMeSpecifictionForSystemConfiguration(cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.systemconfiguration.javamodel.ISystemConfiguration object) {
    return _getToMeList(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractConfiguration_specifictionForSystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,637a66b7-0013-11f0-945c-87b19aec41f4,qMGolam2vJcc9b5V/ZjVmWL3/pk=] */
