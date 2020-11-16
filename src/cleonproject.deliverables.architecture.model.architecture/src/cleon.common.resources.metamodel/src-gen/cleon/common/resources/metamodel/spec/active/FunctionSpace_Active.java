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


  public static interface IActiveWithDefaultTrueAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8922ce02-259b-11eb-b9ae-4df44b18aa9b")
    public java.lang.Boolean IsActiveOrDefaultTrue();

    @IDynamicResourceExtension.MethodId("7cc60bb8-27e5-11eb-b239-011c2d3c4f88")
    public <T extends cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultTrueAware> List<T> OnlyActiveOrDefaultTrue();

  }
  
  public static interface IActiveWithDefaultTrueAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("8922ce02-259b-11eb-b9ae-4df44b18aa9b")
    public java.lang.Boolean IsActiveOrDefaultTrue(final cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultTrueAware activeWithDefaultTrueAware);

    @IDynamicResourceExtension.MethodId("7cc60bb8-27e5-11eb-b239-011c2d3c4f88")
    public <T extends cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultTrueAware> List<T> OnlyActiveOrDefaultTrue(final List<T> activeWithDefaultTrueAwareList);

  }
  
  public static class ActiveWithDefaultTrueAwareFunctionsImpl implements IActiveWithDefaultTrueAwareFunctionsImpl {

    public static final IActiveWithDefaultTrueAwareFunctionsImpl INSTANCE = new ActiveWithDefaultTrueAwareFunctionsImpl();

    private ActiveWithDefaultTrueAwareFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsActiveOrDefaultTrue(final cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultTrueAware activeWithDefaultTrueAware) {
      /* Begin Protected Region [[8922ce02-259b-11eb-b9ae-4df44b18aa9b]] */
      if (activeWithDefaultTrueAware.selectIsActive() == null) {
      	return true;
      }
      return activeWithDefaultTrueAware.selectIsActive().booleanValue();
      /* End Protected Region   [[8922ce02-259b-11eb-b9ae-4df44b18aa9b]] */
    }

    @Override
    public <T extends cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultTrueAware> List<T> OnlyActiveOrDefaultTrue(final List<T> activeWithDefaultTrueAwareList) {
      /* Begin Protected Region [[7cc60bb8-27e5-11eb-b239-011c2d3c4f88]] */
      return activeWithDefaultTrueAwareList.stream().filter(this::IsActiveOrDefaultTrue)
      		.collect(Collectors.toList());
      /* End Protected Region   [[7cc60bb8-27e5-11eb-b239-011c2d3c4f88]] */
    }

  }
  
  public static class ActiveWithDefaultTrueAwareFunctions {

    private ActiveWithDefaultTrueAwareFunctions() {}

    public static java.lang.Boolean IsActiveOrDefaultTrue(final cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultTrueAware activeWithDefaultTrueAware) {
      return DynamicResourceUtil.invoke(IActiveWithDefaultTrueAwareFunctionsImpl.class, ActiveWithDefaultTrueAwareFunctionsImpl.INSTANCE, activeWithDefaultTrueAware).IsActiveOrDefaultTrue(activeWithDefaultTrueAware);
    }

    public static <T extends cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultTrueAware> List<T> OnlyActiveOrDefaultTrue(final List<T> activeWithDefaultTrueAwareList) {
      return DynamicResourceUtil.invoke(IActiveWithDefaultTrueAwareFunctionsImpl.class, ActiveWithDefaultTrueAwareFunctionsImpl.INSTANCE, activeWithDefaultTrueAwareList).OnlyActiveOrDefaultTrue(activeWithDefaultTrueAwareList);
    }

  }

  public static interface IActiveWithDefaultFalseAwareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dd3a23bc-259d-11eb-b9ae-4df44b18aa9b")
    public java.lang.Boolean IsActiveOrDefaultFalse();

  }
  
  public static interface IActiveWithDefaultFalseAwareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("dd3a23bc-259d-11eb-b9ae-4df44b18aa9b")
    public java.lang.Boolean IsActiveOrDefaultFalse(final cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultFalseAware activeWithDefaultFalseAware);

  }
  
  public static class ActiveWithDefaultFalseAwareFunctionsImpl implements IActiveWithDefaultFalseAwareFunctionsImpl {

    public static final IActiveWithDefaultFalseAwareFunctionsImpl INSTANCE = new ActiveWithDefaultFalseAwareFunctionsImpl();

    private ActiveWithDefaultFalseAwareFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsActiveOrDefaultFalse(final cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultFalseAware activeWithDefaultFalseAware) {
      /* Begin Protected Region [[dd3a23bc-259d-11eb-b9ae-4df44b18aa9b]] */
      if (activeWithDefaultFalseAware.selectIsActive() == null) {
      	return false;
      }
      return activeWithDefaultFalseAware.selectIsActive().booleanValue();
      /* End Protected Region   [[dd3a23bc-259d-11eb-b9ae-4df44b18aa9b]] */
    }

  }
  
  public static class ActiveWithDefaultFalseAwareFunctions {

    private ActiveWithDefaultFalseAwareFunctions() {}

    public static java.lang.Boolean IsActiveOrDefaultFalse(final cleon.common.resources.metamodel.spec.active.javamodel.IActiveWithDefaultFalseAware activeWithDefaultFalseAware) {
      return DynamicResourceUtil.invoke(IActiveWithDefaultFalseAwareFunctionsImpl.class, ActiveWithDefaultFalseAwareFunctionsImpl.INSTANCE, activeWithDefaultFalseAware).IsActiveOrDefaultFalse(activeWithDefaultFalseAware);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5731c4e3-259b-11eb-b9ae-4df44b18aa9b,1qtnfDeHLWFwFdb5i6j65ONJI8g=] */
