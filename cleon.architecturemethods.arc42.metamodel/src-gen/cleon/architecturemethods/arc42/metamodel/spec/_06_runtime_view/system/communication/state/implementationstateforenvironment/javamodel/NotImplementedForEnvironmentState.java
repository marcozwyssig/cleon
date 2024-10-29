package cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state.implementationstateforenvironment.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class NotImplementedForEnvironmentState extends DynamicResource implements INotImplementedForEnvironmentState {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<INotImplementedForEnvironmentState> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<INotImplementedForEnvironmentState>() {
    
    @Override
    public INotImplementedForEnvironmentState create() {
      return new NotImplementedForEnvironmentState();
    }
    
    @Override
    public INotImplementedForEnvironmentState create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new NotImplementedForEnvironmentState(resourceRepository, resource);
    }
  
  };

  public NotImplementedForEnvironmentState() {
    super(INotImplementedForEnvironmentState.TYPE_ID);
  }
  
  public NotImplementedForEnvironmentState(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, INotImplementedForEnvironmentState.TYPE_ID);
  }

  // relations
  
  @Override
  public cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment selectEnvironment() {
    return _getSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state.implementationstateforenvironment.ImplementationstateforenvironmentPackage.ImplementationStateForEnvironment_environment);
  }

  public NotImplementedForEnvironmentState setEnvironment(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment environment) {
    _setSingle(cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state.implementationstateforenvironment.ImplementationstateforenvironmentPackage.ImplementationStateForEnvironment_environment, environment);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public NotImplementedForEnvironmentState setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public NotImplementedForEnvironmentState setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(cleon.architecturemethods.arc42.metamodel.spec._07_deployment_view.deployview.javamodel.IEnvironment.class, cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.state.implementationstateforenvironment.ImplementationstateforenvironmentPackage.ImplementationStateForEnvironment_environment, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,78a45c59-1772-11eb-aff5-dd5c3dd3a631,l0l9TPZeocl/HspR9U4FBg5EDFY=] */
