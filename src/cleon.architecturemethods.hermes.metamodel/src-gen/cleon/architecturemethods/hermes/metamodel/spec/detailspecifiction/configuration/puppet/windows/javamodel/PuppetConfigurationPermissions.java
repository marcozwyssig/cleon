package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class PuppetConfigurationPermissions extends DynamicResource implements IPuppetConfigurationPermissions {

  // abstract implementation, only used for static method calls
  private PuppetConfigurationPermissions() {
    super(IPuppetConfigurationPermissions.TYPE_ID);
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IPuppetConfigurationPermissions selectToMeGroups(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IAbstractGroup object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.javamodel.IPuppetConfigurationPermissions.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.WindowsPackage.PuppetConfigurationPermissions_groups, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a98b05a5-106f-11f0-b378-11a495632127,Au7QvpvHM/M4TFmCzfv6t2Zj/as=] */
