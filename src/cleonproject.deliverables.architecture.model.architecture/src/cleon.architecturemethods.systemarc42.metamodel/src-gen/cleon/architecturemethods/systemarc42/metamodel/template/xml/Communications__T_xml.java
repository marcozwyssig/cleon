package cleon.architecturemethods.systemarc42.metamodel.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[46a3f5e0-87a3-11e9-bb4b-c57da735262b,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.Source;
/* End Protected Region   [[46a3f5e0-87a3-11e9-bb4b-c57da735262b,imports]] */

public class Communications__T_xml {

  /* Begin Protected Region [[46a3f5e0-87a3-11e9-bb4b-c57da735262b]] */

  /* End Protected Region   [[46a3f5e0-87a3-11e9-bb4b-c57da735262b]] */


  public static interface IImplementationStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b0f35d6f-204a-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

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
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

  }
  
  public static interface IImplementedStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("98d07593-2046-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedState implementedState);

  }
  
  public static class ImplementedStateFunctionsImpl implements IImplementedStateFunctionsImpl {

    public static final IImplementedStateFunctionsImpl INSTANCE = new ImplementedStateFunctionsImpl();

    private ImplementedStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedState implementedState) {
      /* Begin Protected Region [[98d07593-2046-11eb-88ac-6db033a610cb]] */
      if (implementedState.selectImplementationStateIn() == null || !implementedState.selectImplementationStateIn().containsKey(env.getResource())) {
      	return false;
      }
      return implementedState.selectImplementationStateIn().get(env.getResource()).extension(IImplementationStateForEnvironmentFunctions.class).IsImplemented();

      /* End Protected Region   [[98d07593-2046-11eb-88ac-6db033a610cb]] */
    }

  }
  
  public static class ImplementedStateFunctions {

    private ImplementedStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedState implementedState) {
      return DynamicResourceUtil.invoke(IImplementedStateFunctionsImpl.class, ImplementedStateFunctionsImpl.INSTANCE, implementedState).IsImplemented(env, implementedState);
    }

  }

  public static interface IImplementationStateForEnvironmentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("99a07a70-2047-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented();

  }
  
  public static interface IImplementationStateForEnvironmentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ImplementationStateForEnvironmentFunctionsImpl implements IImplementationStateForEnvironmentFunctionsImpl {

    public static final IImplementationStateForEnvironmentFunctionsImpl INSTANCE = new ImplementationStateForEnvironmentFunctionsImpl();

    private ImplementationStateForEnvironmentFunctionsImpl() {}

  }
  
  public static class ImplementationStateForEnvironmentFunctions {

    private ImplementationStateForEnvironmentFunctions() {}

  }

  public static interface IImplementedForEnvironmentStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fa52820b-2047-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented();

  }
  
  public static interface IImplementedForEnvironmentStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("fa52820b-2047-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.IImplementedForEnvironmentState implementedForEnvironmentState);

  }
  
  public static class ImplementedForEnvironmentStateFunctionsImpl implements IImplementedForEnvironmentStateFunctionsImpl {

    public static final IImplementedForEnvironmentStateFunctionsImpl INSTANCE = new ImplementedForEnvironmentStateFunctionsImpl();

    private ImplementedForEnvironmentStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.IImplementedForEnvironmentState implementedForEnvironmentState) {
      return true;
    }

  }
  
  public static class ImplementedForEnvironmentStateFunctions {

    private ImplementedForEnvironmentStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.IImplementedForEnvironmentState implementedForEnvironmentState) {
      return DynamicResourceUtil.invoke(IImplementedForEnvironmentStateFunctionsImpl.class, ImplementedForEnvironmentStateFunctionsImpl.INSTANCE, implementedForEnvironmentState).IsImplemented(implementedForEnvironmentState);
    }

  }

  public static interface IImplementedNotRequiredForEnvironmentStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("56e10b4f-0a3b-11ec-8912-0f9ef89df758")
    public java.lang.Boolean IsImplemented();

  }
  
  public static interface IImplementedNotRequiredForEnvironmentStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("56e10b4f-0a3b-11ec-8912-0f9ef89df758")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.IImplementedNotRequiredForEnvironmentState implementedNotRequiredForEnvironmentState);

  }
  
  public static class ImplementedNotRequiredForEnvironmentStateFunctionsImpl implements IImplementedNotRequiredForEnvironmentStateFunctionsImpl {

    public static final IImplementedNotRequiredForEnvironmentStateFunctionsImpl INSTANCE = new ImplementedNotRequiredForEnvironmentStateFunctionsImpl();

    private ImplementedNotRequiredForEnvironmentStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.IImplementedNotRequiredForEnvironmentState implementedNotRequiredForEnvironmentState) {
      return false;
    }

  }
  
  public static class ImplementedNotRequiredForEnvironmentStateFunctions {

    private ImplementedNotRequiredForEnvironmentStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.IImplementedNotRequiredForEnvironmentState implementedNotRequiredForEnvironmentState) {
      return DynamicResourceUtil.invoke(IImplementedNotRequiredForEnvironmentStateFunctionsImpl.class, ImplementedNotRequiredForEnvironmentStateFunctionsImpl.INSTANCE, implementedNotRequiredForEnvironmentState).IsImplemented(implementedNotRequiredForEnvironmentState);
    }

  }

  public static interface INotImplementedForEnvironmentStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("104e686d-2048-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented();

  }
  
  public static interface INotImplementedForEnvironmentStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("104e686d-2048-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.INotImplementedForEnvironmentState notImplementedForEnvironmentState);

  }
  
  public static class NotImplementedForEnvironmentStateFunctionsImpl implements INotImplementedForEnvironmentStateFunctionsImpl {

    public static final INotImplementedForEnvironmentStateFunctionsImpl INSTANCE = new NotImplementedForEnvironmentStateFunctionsImpl();

    private NotImplementedForEnvironmentStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.INotImplementedForEnvironmentState notImplementedForEnvironmentState) {
      return false;
    }

  }
  
  public static class NotImplementedForEnvironmentStateFunctions {

    private NotImplementedForEnvironmentStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.INotImplementedForEnvironmentState notImplementedForEnvironmentState) {
      return DynamicResourceUtil.invoke(INotImplementedForEnvironmentStateFunctionsImpl.class, NotImplementedForEnvironmentStateFunctionsImpl.INSTANCE, notImplementedForEnvironmentState).IsImplemented(notImplementedForEnvironmentState);
    }

  }

  public static interface IPlannedImplementationForEnvironmentStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c267b346-aaae-11ec-bac1-dba85299d623")
    public java.lang.Boolean IsImplemented();

  }
  
  public static interface IPlannedImplementationForEnvironmentStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("c267b346-aaae-11ec-bac1-dba85299d623")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.IPlannedImplementationForEnvironmentState plannedImplementationForEnvironmentState);

  }
  
  public static class PlannedImplementationForEnvironmentStateFunctionsImpl implements IPlannedImplementationForEnvironmentStateFunctionsImpl {

    public static final IPlannedImplementationForEnvironmentStateFunctionsImpl INSTANCE = new PlannedImplementationForEnvironmentStateFunctionsImpl();

    private PlannedImplementationForEnvironmentStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.IPlannedImplementationForEnvironmentState plannedImplementationForEnvironmentState) {
      return true;
    }

  }
  
  public static class PlannedImplementationForEnvironmentStateFunctions {

    private PlannedImplementationForEnvironmentStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.implementationstateforenvironment.javamodel.IPlannedImplementationForEnvironmentState plannedImplementationForEnvironmentState) {
      return DynamicResourceUtil.invoke(IPlannedImplementationForEnvironmentStateFunctionsImpl.class, PlannedImplementationForEnvironmentStateFunctionsImpl.INSTANCE, plannedImplementationForEnvironmentState).IsImplemented(plannedImplementationForEnvironmentState);
    }

  }

  public static interface IImplementedButNotRequiredOnFirewallStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cfd89ba6-204a-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

  }
  
  public static interface IImplementedButNotRequiredOnFirewallStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("cfd89ba6-204a-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedButNotRequiredOnFirewallState implementedButNotRequiredOnFirewallState);

  }
  
  public static class ImplementedButNotRequiredOnFirewallStateFunctionsImpl implements IImplementedButNotRequiredOnFirewallStateFunctionsImpl {

    public static final IImplementedButNotRequiredOnFirewallStateFunctionsImpl INSTANCE = new ImplementedButNotRequiredOnFirewallStateFunctionsImpl();

    private ImplementedButNotRequiredOnFirewallStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedButNotRequiredOnFirewallState implementedButNotRequiredOnFirewallState) {
      return true;
    }

  }
  
  public static class ImplementedButNotRequiredOnFirewallStateFunctions {

    private ImplementedButNotRequiredOnFirewallStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IImplementedButNotRequiredOnFirewallState implementedButNotRequiredOnFirewallState) {
      return DynamicResourceUtil.invoke(IImplementedButNotRequiredOnFirewallStateFunctionsImpl.class, ImplementedButNotRequiredOnFirewallStateFunctionsImpl.INSTANCE, implementedButNotRequiredOnFirewallState).IsImplemented(env, implementedButNotRequiredOnFirewallState);
    }

  }

  public static interface IPlannedmplementationStateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("da45fb1c-204a-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env);

  }
  
  public static interface IPlannedmplementationStateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("da45fb1c-204a-11eb-88ac-6db033a610cb")
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IPlannedmplementationState plannedmplementationState);

  }
  
  public static class PlannedmplementationStateFunctionsImpl implements IPlannedmplementationStateFunctionsImpl {

    public static final IPlannedmplementationStateFunctionsImpl INSTANCE = new PlannedmplementationStateFunctionsImpl();

    private PlannedmplementationStateFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IPlannedmplementationState plannedmplementationState) {
      return true;
    }

  }
  
  public static class PlannedmplementationStateFunctions {

    private PlannedmplementationStateFunctions() {}

    public static java.lang.Boolean IsImplemented(final cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode env, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.state.javamodel.IPlannedmplementationState plannedmplementationState) {
      return DynamicResourceUtil.invoke(IPlannedmplementationStateFunctionsImpl.class, PlannedmplementationStateFunctionsImpl.INSTANCE, plannedmplementationState).IsImplemented(env, plannedmplementationState);
    }

  }

  public static interface ISourceInSubSecurityZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("91af9411-5fe3-11eb-a5e0-e3983817e1e1")
    public java.lang.Boolean IsTemporary();

  }
  
  public static interface ISourceInSubSecurityZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("91af9411-5fe3-11eb-a5e0-e3983817e1e1")
    public java.lang.Boolean IsTemporary(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone);

  }
  
  public static class SourceInSubSecurityZoneFunctionsImpl implements ISourceInSubSecurityZoneFunctionsImpl {

    public static final ISourceInSubSecurityZoneFunctionsImpl INSTANCE = new SourceInSubSecurityZoneFunctionsImpl();

    private SourceInSubSecurityZoneFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsTemporary(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone) {
      /* Begin Protected Region [[91af9411-5fe3-11eb-a5e0-e3983817e1e1]] */
      if( sourceInSubSecurityZone.selectIsTemporary() != null) {
      	return sourceInSubSecurityZone.selectIsTemporary().booleanValue();
      }
      final var source = Source.selectToMeAccessAllowed(sourceInSubSecurityZone);    	
      if( source.selectIsTemporary() == null ) {
      	return false;
      }
      return source.selectIsTemporary().booleanValue();

      /* End Protected Region   [[91af9411-5fe3-11eb-a5e0-e3983817e1e1]] */
    }

  }
  
  public static class SourceInSubSecurityZoneFunctions {

    private SourceInSubSecurityZoneFunctions() {}

    public static java.lang.Boolean IsTemporary(final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISourceInSubSecurityZone sourceInSubSecurityZone) {
      return DynamicResourceUtil.invoke(ISourceInSubSecurityZoneFunctionsImpl.class, SourceInSubSecurityZoneFunctionsImpl.INSTANCE, sourceInSubSecurityZone).IsTemporary(sourceInSubSecurityZone);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,46a3f5e0-87a3-11e9-bb4b-c57da735262b,a0GFKZE0Bns2j+UzUo79kPJ4mV0=] */
