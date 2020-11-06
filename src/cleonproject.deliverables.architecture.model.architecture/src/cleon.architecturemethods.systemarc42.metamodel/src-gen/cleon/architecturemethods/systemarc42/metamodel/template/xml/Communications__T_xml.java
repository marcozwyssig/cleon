package cleon.architecturemethods.systemarc42.metamodel.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[46a3f5e0-87a3-11e9-bb4b-c57da735262b,imports]] */

/* End Protected Region   [[46a3f5e0-87a3-11e9-bb4b-c57da735262b,imports]] */

public class Communications__T_xml {

  /* Begin Protected Region [[46a3f5e0-87a3-11e9-bb4b-c57da735262b]] */

  /* End Protected Region   [[46a3f5e0-87a3-11e9-bb4b-c57da735262b]] */


  public static interface IImplementationStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b0f35d6f-204a-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env);

  }
  
  public static interface IImplementationStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImplementationStateFunctionsImpl implements IImplementationStateFunctionsImpl {

    public static final IImplementationStateFunctionsImpl INSTANCE = new ImplementationStateFunctionsImpl();

    private ImplementationStateFunctionsImpl() {}

  }
  
  public static class ImplementationStateFunctions {

    private ImplementationStateFunctions() {}

  }

  public static interface IImplementedStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("98d07593-2046-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env);

  }
  
  public static interface IImplementedStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("98d07593-2046-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedState implementedState);

  }
  
  public static class ImplementedStateFunctionsImpl implements IImplementedStateFunctionsImpl {

    public static final IImplementedStateFunctionsImpl INSTANCE = new ImplementedStateFunctionsImpl();

    private ImplementedStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedState implementedState) {
      /* Begin Protected Region [[98d07593-2046-11eb-88ac-6db033a610cb]] */
      if (implementedState.selectImplementationStateIn() == null || !implementedState.selectImplementationStateIn().containsKey(env.getResource())) {
      	return false;
      }
      return implementedState.selectImplementationStateIn().get(env.getResource()).extension(IImplentationStateForEnvironmentFunctions.class).IsImplemented();
      /* End Protected Region   [[98d07593-2046-11eb-88ac-6db033a610cb]] */
    }

  }
  
  public static class ImplementedStateFunctions {

    private ImplementedStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedState implementedState) {
      return DynamicResourceUtil.invoke(IImplementedStateFunctionsImpl.class, ImplementedStateFunctionsImpl.INSTANCE, implementedState).IsImplemented(env, implementedState);
    }

  }

  public static interface IImplentationStateForEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99a07a70-2047-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented();

  }
  
  public static interface IImplentationStateForEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImplentationStateForEnvironmentFunctionsImpl implements IImplentationStateForEnvironmentFunctionsImpl {

    public static final IImplentationStateForEnvironmentFunctionsImpl INSTANCE = new ImplentationStateForEnvironmentFunctionsImpl();

    private ImplentationStateForEnvironmentFunctionsImpl() {}

  }
  
  public static class ImplentationStateForEnvironmentFunctions {

    private ImplentationStateForEnvironmentFunctions() {}

  }

  public static interface IImplementedForEnvironmentStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fa52820b-2047-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented();

  }
  
  public static interface IImplementedForEnvironmentStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("fa52820b-2047-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedForEnvironmentState implementedForEnvironmentState);

  }
  
  public static class ImplementedForEnvironmentStateFunctionsImpl implements IImplementedForEnvironmentStateFunctionsImpl {

    public static final IImplementedForEnvironmentStateFunctionsImpl INSTANCE = new ImplementedForEnvironmentStateFunctionsImpl();

    private ImplementedForEnvironmentStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedForEnvironmentState implementedForEnvironmentState) {
      return true;
    }

  }
  
  public static class ImplementedForEnvironmentStateFunctions {

    private ImplementedForEnvironmentStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedForEnvironmentState implementedForEnvironmentState) {
      return DynamicResourceUtil.invoke(IImplementedForEnvironmentStateFunctionsImpl.class, ImplementedForEnvironmentStateFunctionsImpl.INSTANCE, implementedForEnvironmentState).IsImplemented(implementedForEnvironmentState);
    }

  }

  public static interface INotImplementedForEnvironmentStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("104e686d-2048-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented();

  }
  
  public static interface INotImplementedForEnvironmentStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("104e686d-2048-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.INotImplementedForEnvironmentState notImplementedForEnvironmentState);

  }
  
  public static class NotImplementedForEnvironmentStateFunctionsImpl implements INotImplementedForEnvironmentStateFunctionsImpl {

    public static final INotImplementedForEnvironmentStateFunctionsImpl INSTANCE = new NotImplementedForEnvironmentStateFunctionsImpl();

    private NotImplementedForEnvironmentStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.INotImplementedForEnvironmentState notImplementedForEnvironmentState) {
      return false;
    }

  }
  
  public static class NotImplementedForEnvironmentStateFunctions {

    private NotImplementedForEnvironmentStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.INotImplementedForEnvironmentState notImplementedForEnvironmentState) {
      return DynamicResourceUtil.invoke(INotImplementedForEnvironmentStateFunctionsImpl.class, NotImplementedForEnvironmentStateFunctionsImpl.INSTANCE, notImplementedForEnvironmentState).IsImplemented(notImplementedForEnvironmentState);
    }

  }

  public static interface IImplementedButNotRequiredOnFirewallStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cfd89ba6-204a-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env);

  }
  
  public static interface IImplementedButNotRequiredOnFirewallStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("cfd89ba6-204a-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedButNotRequiredOnFirewallState implementedButNotRequiredOnFirewallState);

  }
  
  public static class ImplementedButNotRequiredOnFirewallStateFunctionsImpl implements IImplementedButNotRequiredOnFirewallStateFunctionsImpl {

    public static final IImplementedButNotRequiredOnFirewallStateFunctionsImpl INSTANCE = new ImplementedButNotRequiredOnFirewallStateFunctionsImpl();

    private ImplementedButNotRequiredOnFirewallStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedButNotRequiredOnFirewallState implementedButNotRequiredOnFirewallState) {
      return true;
    }

  }
  
  public static class ImplementedButNotRequiredOnFirewallStateFunctions {

    private ImplementedButNotRequiredOnFirewallStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedButNotRequiredOnFirewallState implementedButNotRequiredOnFirewallState) {
      return DynamicResourceUtil.invoke(IImplementedButNotRequiredOnFirewallStateFunctionsImpl.class, ImplementedButNotRequiredOnFirewallStateFunctionsImpl.INSTANCE, implementedButNotRequiredOnFirewallState).IsImplemented(env, implementedButNotRequiredOnFirewallState);
    }

  }

  public static interface IUndefinedImplementationStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("da45fb1c-204a-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env);

  }
  
  public static interface IUndefinedImplementationStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("da45fb1c-204a-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IUndefinedImplementationState undefinedImplementationState);

  }
  
  public static class UndefinedImplementationStateFunctionsImpl implements IUndefinedImplementationStateFunctionsImpl {

    public static final IUndefinedImplementationStateFunctionsImpl INSTANCE = new UndefinedImplementationStateFunctionsImpl();

    private UndefinedImplementationStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IUndefinedImplementationState undefinedImplementationState) {
      return false;
    }

  }
  
  public static class UndefinedImplementationStateFunctions {

    private UndefinedImplementationStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IUndefinedImplementationState undefinedImplementationState) {
      return DynamicResourceUtil.invoke(IUndefinedImplementationStateFunctionsImpl.class, UndefinedImplementationStateFunctionsImpl.INSTANCE, undefinedImplementationState).IsImplemented(env, undefinedImplementationState);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,46a3f5e0-87a3-11e9-bb4b-c57da735262b,Z4IWGHz2XgOdphazQfYp7PMG2no=] */
