package cleon.common.resources.metamodel.spec.active;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5731c4e3-259b-11eb-b9ae-4df44b18aa9b,imports]] */
import java.util.stream.Collectors;
/* End Protected Region   [[5731c4e3-259b-11eb-b9ae-4df44b18aa9b,imports]] */

public class FunctionSpace_Active {

  /* Begin Protected Region [[5731c4e3-259b-11eb-b9ae-4df44b18aa9b]] */

  /* End Protected Region   [[5731c4e3-259b-11eb-b9ae-4df44b18aa9b]] */


  public static interface IEnabledWithDefaultTrueAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8922ce02-259b-11eb-b9ae-4df44b18aa9b")
    public java.lang.Boolean IsActiveOrDefaultTrue();

    @IDynamicResourceExtension.MethodId("7cc60bb8-27e5-11eb-b239-011c2d3c4f88")
    public <T extends cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware> List<T> OnlyActiveOrDefaultTrue();

  }
  
  public static interface IEnabledWithDefaultTrueAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8922ce02-259b-11eb-b9ae-4df44b18aa9b")
    public java.lang.Boolean IsActiveOrDefaultTrue(final cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware enabledWithDefaultTrueAware);

    @IDynamicResourceExtension.MethodId("7cc60bb8-27e5-11eb-b239-011c2d3c4f88")
    public <T extends cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware> List<T> OnlyActiveOrDefaultTrue(final List<T> enabledWithDefaultTrueAwareList);

  }
  
  public static class EnabledWithDefaultTrueAwareFunctionsImpl implements IEnabledWithDefaultTrueAwareFunctionsImpl {

    public static final IEnabledWithDefaultTrueAwareFunctionsImpl INSTANCE = new EnabledWithDefaultTrueAwareFunctionsImpl();

    private EnabledWithDefaultTrueAwareFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsActiveOrDefaultTrue(final cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware enabledWithDefaultTrueAware) {
      /* Begin Protected Region [[8922ce02-259b-11eb-b9ae-4df44b18aa9b]] */
      if (enabledWithDefaultTrueAware.selectIsEnabled() == null) {
      	return true;
      }
      return enabledWithDefaultTrueAware.selectIsEnabled().booleanValue();
      /* End Protected Region   [[8922ce02-259b-11eb-b9ae-4df44b18aa9b]] */
    }

    @Override
    public <T extends cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware> List<T> OnlyActiveOrDefaultTrue(final List<T> enabledWithDefaultTrueAwareList) {
      /* Begin Protected Region [[7cc60bb8-27e5-11eb-b239-011c2d3c4f88]] */
      return enabledWithDefaultTrueAwareList.stream().filter(this::IsActiveOrDefaultTrue)
      		.collect(Collectors.toList());
      /* End Protected Region   [[7cc60bb8-27e5-11eb-b239-011c2d3c4f88]] */
    }

  }
  
  public static class EnabledWithDefaultTrueAwareFunctions {

    private EnabledWithDefaultTrueAwareFunctions() {}

    public static java.lang.Boolean IsActiveOrDefaultTrue(final cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware enabledWithDefaultTrueAware) {
      return DynamicResourceUtil.invoke(IEnabledWithDefaultTrueAwareFunctionsImpl.class, EnabledWithDefaultTrueAwareFunctionsImpl.INSTANCE, enabledWithDefaultTrueAware).IsActiveOrDefaultTrue(enabledWithDefaultTrueAware);
    }

    public static <T extends cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultTrueAware> List<T> OnlyActiveOrDefaultTrue(final List<T> enabledWithDefaultTrueAwareList) {
      return DynamicResourceUtil.invoke(IEnabledWithDefaultTrueAwareFunctionsImpl.class, EnabledWithDefaultTrueAwareFunctionsImpl.INSTANCE, enabledWithDefaultTrueAwareList).OnlyActiveOrDefaultTrue(enabledWithDefaultTrueAwareList);
    }

  }

  public static interface IEnabledWithDefaultFalseAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dd3a23bc-259d-11eb-b9ae-4df44b18aa9b")
    public java.lang.Boolean IsActiveOrDefaultFalse();

  }
  
  public static interface IEnabledWithDefaultFalseAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("dd3a23bc-259d-11eb-b9ae-4df44b18aa9b")
    public java.lang.Boolean IsActiveOrDefaultFalse(final cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultFalseAware enabledWithDefaultFalseAware);

  }
  
  public static class EnabledWithDefaultFalseAwareFunctionsImpl implements IEnabledWithDefaultFalseAwareFunctionsImpl {

    public static final IEnabledWithDefaultFalseAwareFunctionsImpl INSTANCE = new EnabledWithDefaultFalseAwareFunctionsImpl();

    private EnabledWithDefaultFalseAwareFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsActiveOrDefaultFalse(final cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultFalseAware enabledWithDefaultFalseAware) {
      /* Begin Protected Region [[dd3a23bc-259d-11eb-b9ae-4df44b18aa9b]] */
      if (enabledWithDefaultFalseAware.selectIsEnabled() == null) {
      	return false;
      }
      return enabledWithDefaultFalseAware.selectIsEnabled().booleanValue();
      /* End Protected Region   [[dd3a23bc-259d-11eb-b9ae-4df44b18aa9b]] */
    }

  }
  
  public static class EnabledWithDefaultFalseAwareFunctions {

    private EnabledWithDefaultFalseAwareFunctions() {}

    public static java.lang.Boolean IsActiveOrDefaultFalse(final cleon.common.resources.metamodel.spec.active.javamodel.IEnabledWithDefaultFalseAware enabledWithDefaultFalseAware) {
      return DynamicResourceUtil.invoke(IEnabledWithDefaultFalseAwareFunctionsImpl.class, EnabledWithDefaultFalseAwareFunctionsImpl.INSTANCE, enabledWithDefaultFalseAware).IsActiveOrDefaultFalse(enabledWithDefaultFalseAware);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5731c4e3-259b-11eb-b9ae-4df44b18aa9b,01rcWLFhSipgTLa6dt/8Y9QOUEk=] */
