package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractListOfSysCfgCategorySpecification extends DynamicResource implements IAbstractListOfSysCfgCategorySpecification {

  // abstract implementation, only used for static method calls
  private AbstractListOfSysCfgCategorySpecification() {
    super(IAbstractListOfSysCfgCategorySpecification.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.IAbstractListOfSysCfgCategorySpecification selectToMeHw(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.hardware.javamodel.ISysCfgHwCategorySpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.IAbstractListOfSysCfgCategorySpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.SyscfgPackage.AbstractListOfSysCfgCategorySpecification_hw, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.IAbstractListOfSysCfgCategorySpecification selectToMeOs(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.os.javamodel.ISysCfgOsCategorySpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.IAbstractListOfSysCfgCategorySpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.SyscfgPackage.AbstractListOfSysCfgCategorySpecification_os, object.getResource());
  }
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.IAbstractListOfSysCfgCategorySpecification selectToMeApp(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.application.javamodel.ISysCfgAppCategorySpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.IAbstractListOfSysCfgCategorySpecification.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.SyscfgPackage.AbstractListOfSysCfgCategorySpecification_app, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f3285f19-0023-11f0-945c-87b19aec41f4,WYyTnIfD4o/BU76GTQKRTXOFiy0=] */
