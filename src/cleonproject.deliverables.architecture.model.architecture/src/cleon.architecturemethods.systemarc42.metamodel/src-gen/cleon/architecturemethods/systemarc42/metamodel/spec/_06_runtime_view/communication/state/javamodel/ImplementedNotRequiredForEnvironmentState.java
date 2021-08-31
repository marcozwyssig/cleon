package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class ImplementedNotRequiredForEnvironmentState extends DynamicResource implements IImplementedNotRequiredForEnvironmentState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImplementedNotRequiredForEnvironmentState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IImplementedNotRequiredForEnvironmentState>() {
    
    @Override
    public IImplementedNotRequiredForEnvironmentState create() {
      return new ImplementedNotRequiredForEnvironmentState();
    }
    
    @Override
    public IImplementedNotRequiredForEnvironmentState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new ImplementedNotRequiredForEnvironmentState(resourceRepository, resource);
    }
  
  };

  public ImplementedNotRequiredForEnvironmentState() {
    super(IImplementedNotRequiredForEnvironmentState.TYPE_ID);
  }
  
  public ImplementedNotRequiredForEnvironmentState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IImplementedNotRequiredForEnvironmentState.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment selectEnvironment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplentationStateForEnvironment_environment);
  }

  public ImplementedNotRequiredForEnvironmentState setEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment environment) {
    _setSingle(cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplentationStateForEnvironment_environment, environment);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public ImplementedNotRequiredForEnvironmentState setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public ImplementedNotRequiredForEnvironmentState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment.class, cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.StatePackage.ImplentationStateForEnvironment_environment, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,a4d7cf37-0a2f-11ec-8912-0f9ef89df758,RSpm6Ghrs6WM5++cBbR2zsqfYiU=] */
