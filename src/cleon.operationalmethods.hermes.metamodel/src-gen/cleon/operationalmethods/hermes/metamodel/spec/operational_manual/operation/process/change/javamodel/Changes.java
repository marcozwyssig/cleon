package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class Changes extends DynamicResource implements IChanges {

  // abstract implementation, only used for static method calls
  private Changes() {
    super(IChanges.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChanges selectToMeChangeSteps(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChangeStep object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.javamodel.IChanges.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.change.ChangePackage.Changes_changeSteps, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,e766be11-1b4e-11e9-b995-3346f9ad0ebe,SXsaBo0LYbtO1BISAxe+fdB2I90=] */
