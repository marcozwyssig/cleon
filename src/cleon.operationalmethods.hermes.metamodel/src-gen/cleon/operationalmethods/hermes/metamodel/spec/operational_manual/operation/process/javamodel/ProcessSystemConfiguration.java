package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public abstract class ProcessSystemConfiguration extends DynamicResource implements IProcessSystemConfiguration {

  // abstract implementation, only used for static method calls
  private ProcessSystemConfiguration() {
    super(IProcessSystemConfiguration.TYPE_ID);
  }
  
  // toMeRelations
  
  public static cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IProcessSystemConfiguration selectToMeActivitySystemConfiguration(cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IActivitySystemConfiguration object) {
    return _getToMeSingle(object.getRepository(), cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.javamodel.IProcessSystemConfiguration.class, cleon.operationalmethods.hermes.metamodel.spec.operational_manual.operation.process.ProcessPackage.ProcessSystemConfiguration_activitySystemConfiguration, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,542758bf-1a63-11e9-b1cd-355f2e2f05a9,+l/Z9V8J/aRdQnxDsQPtUbUk73Y=] */
