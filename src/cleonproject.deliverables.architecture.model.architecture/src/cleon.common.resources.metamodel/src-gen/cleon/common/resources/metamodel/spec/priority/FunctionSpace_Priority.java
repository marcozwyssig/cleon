package cleon.common.resources.metamodel.spec.priority;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[75cf7021-10a4-11e8-ab55-75346738d444,imports]] */

/* End Protected Region   [[75cf7021-10a4-11e8-ab55-75346738d444,imports]] */

public class FunctionSpace_Priority {

  /* Begin Protected Region [[75cf7021-10a4-11e8-ab55-75346738d444]] */
  
  /* End Protected Region   [[75cf7021-10a4-11e8-ab55-75346738d444]] */


  public static interface IPriorityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7f692ca3-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsShould();

    @IDynamicResourceExtension.MethodId("ad1b2b84-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsNice();

    @IDynamicResourceExtension.MethodId("c7e8226f-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsMust();

    @IDynamicResourceExtension.MethodId("e2be9c10-8fe7-11e8-a5b5-191902fe097a")
    public java.lang.Boolean IsUrgent();

    @IDynamicResourceExtension.MethodId("ef006d66-8fe7-11e8-a5b5-191902fe097a")
    public java.lang.Boolean IsImportant();

    @IDynamicResourceExtension.MethodId("45609ac6-10a4-11e8-ab55-75346738d444")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("b0f089ee-1f1c-11e9-9b49-9d767b485444")
    public java.lang.Boolean IsKO();

  }
  
  public static interface IPriorityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7f692ca3-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsShould(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority);

    @IDynamicResourceExtension.MethodId("ad1b2b84-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsNice(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority);

    @IDynamicResourceExtension.MethodId("c7e8226f-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsMust(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority);

    @IDynamicResourceExtension.MethodId("e2be9c10-8fe7-11e8-a5b5-191902fe097a")
    public java.lang.Boolean IsUrgent(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority);

    @IDynamicResourceExtension.MethodId("ef006d66-8fe7-11e8-a5b5-191902fe097a")
    public java.lang.Boolean IsImportant(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority);

    @IDynamicResourceExtension.MethodId("b0f089ee-1f1c-11e9-9b49-9d767b485444")
    public java.lang.Boolean IsKO(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority);

  }
  
  public static class PriorityFunctionsImpl implements IPriorityFunctionsImpl {

    public static final IPriorityFunctionsImpl INSTANCE = new PriorityFunctionsImpl();

    private PriorityFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsShould(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return priority.isShould__F_have();
    }

    @Override
    public java.lang.Boolean IsNice(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return priority.isNice__F_to__F_have();
    }

    @Override
    public java.lang.Boolean IsMust(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return priority.isMust__F_have();
    }

    @Override
    public java.lang.Boolean IsUrgent(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return priority.isMust__F_have() || priority.isNice__F_to__F_have();
    }

    @Override
    public java.lang.Boolean IsImportant(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return priority.isMust__F_have() || priority.isShould__F_have();
    }

    @Override
    public java.lang.Boolean IsKO(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return priority.isMust__F_have(); 
    }

  }
  
  public static class PriorityFunctions {

    private PriorityFunctions() {}

    public static java.lang.Boolean IsShould(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).IsShould(priority);
    }

    public static java.lang.Boolean IsNice(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).IsNice(priority);
    }

    public static java.lang.Boolean IsMust(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).IsMust(priority);
    }

    public static java.lang.Boolean IsUrgent(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).IsUrgent(priority);
    }

    public static java.lang.Boolean IsImportant(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).IsImportant(priority);
    }

    public static java.lang.Boolean IsKO(final cleon.common.resources.metamodel.spec.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).IsKO(priority);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,75cf7021-10a4-11e8-ab55-75346738d444,c0C0Q7hkrfwIeLTzIAAgNNWvNq8=] */
