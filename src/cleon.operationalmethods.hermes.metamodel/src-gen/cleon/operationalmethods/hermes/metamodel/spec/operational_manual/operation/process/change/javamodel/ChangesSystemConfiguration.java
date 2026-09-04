package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ChangesSystemConfiguration extends DynamicResource implements IChangesSystemConfiguration {

  // abstract implementation, only used for static method calls
  private ChangesSystemConfiguration() {
    super(IChangesSystemConfiguration.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChangesSystemConfiguration selectToMeChanges(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChanges object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChangesSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.ChangePackage.ChangesSystemConfiguration_changes, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,00e0ce5d-1b4f-11e9-b995-3346f9ad0ebe,qfp1Erf0+r51jseHOmm14LJGqtM=] */
