package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class PlannedImplementationForEnvironmentState extends DynamicResource implements IPlannedImplementationForEnvironmentState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlannedImplementationForEnvironmentState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IPlannedImplementationForEnvironmentState>() {
    
    @Override
    public IPlannedImplementationForEnvironmentState create() {
      return new PlannedImplementationForEnvironmentState();
    }
    
    @Override
    public IPlannedImplementationForEnvironmentState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new PlannedImplementationForEnvironmentState(resourceRepository, resource);
    }
  
  };

  public PlannedImplementationForEnvironmentState() {
    super(IPlannedImplementationForEnvironmentState.TYPE_ID);
  }
  
  public PlannedImplementationForEnvironmentState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IPlannedImplementationForEnvironmentState.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment selectEnvironment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.ImplementationstateforenvironmentPackage.ImplementationStateForEnvironment_environment);
  }

  public PlannedImplementationForEnvironmentState setEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment environment) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.ImplementationstateforenvironmentPackage.ImplementationStateForEnvironment_environment, environment);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public PlannedImplementationForEnvironmentState setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public PlannedImplementationForEnvironmentState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.ImplementationstateforenvironmentPackage.ImplementationStateForEnvironment_environment, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,2760f694-aaae-11ec-bac1-dba85299d623,1D1/oyquZWx7m+7WJ8KPN5JSbYc=] */
