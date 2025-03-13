package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class CfgAware extends DynamicResource implements ICfgAware {

  // abstract implementation, only used for static method calls
  private CfgAware() {
    super(ICfgAware.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.ICfgAware selectToMeConfiguration(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.ICfgClass object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.javamodel.ICfgAware.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfg.SyscfgPackage.CfgAware_configuration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,523628bd-ef3b-11e8-be8a-b748ff8f0a75,/vi5KJl2sZq1ntRFS8ZvcSMNlpg=] */
