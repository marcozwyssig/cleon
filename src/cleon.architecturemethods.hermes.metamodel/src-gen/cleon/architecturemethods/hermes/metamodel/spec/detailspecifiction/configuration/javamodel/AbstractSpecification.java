package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractSpecification extends DynamicResource implements IAbstractSpecification {

  // abstract implementation, only used for static method calls
  private AbstractSpecification() {
    super(IAbstractSpecification.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractSpecification selectToMeHw(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.hardware.javamodel.ISysCfgHwCategorySpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_hw, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractSpecification selectToMeOs(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.os.javamodel.ISysCfgOsCategorySpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_os, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractSpecification selectToMeApp(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.cmp.syscfgspec.application.javamodel.ISysCfgAppCategorySpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.javamodel.IAbstractSpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.ConfigurationPackage.AbstractSpecification_app, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f3285f19-0023-11f0-945c-87b19aec41f4,ad522wuBZfyc5avpCztTrXqWLLk=] */
