package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class AbstractListOfSysCfgSpecifications extends DynamicResource implements IAbstractListOfSysCfgSpecifications {

  // abstract implementation, only used for static method calls
  private AbstractListOfSysCfgSpecifications() {
    super(IAbstractListOfSysCfgSpecifications.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.IAbstractListOfSysCfgSpecifications selectToMeSystemConfigurationSpecifications(cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscfg.javamodel.ISysCfgSpecification object) {
    return _getToMeSingle(object.getRepository(), cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.javamodel.IAbstractListOfSysCfgSpecifications.class, cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.specification.cmp.syscmp.SyscmpPackage.AbstractListOfSysCfgSpecifications_systemConfigurationSpecifications, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7bd287b7-059b-11f0-a294-67d88c30f2e4,Nz3MLXxqjbZbxqB3C6CP3cqRxRM=] */
