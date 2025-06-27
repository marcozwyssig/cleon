package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ConfigurationSpecificationAware extends DynamicResource implements IConfigurationSpecificationAware {

  // abstract implementation, only used for static method calls
  private ConfigurationSpecificationAware() {
    super(IConfigurationSpecificationAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IConfigurationSpecificationAware selectToMeConfiguration(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IConfigurationSpecificationAware.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.ConfigurationSpecificationAware_configuration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,ecabd13c-001d-11f0-945c-87b19aec41f4,dxi4NXPwWU1lsUsWIDovG23Zhx0=] */
