package cleon.common.resources.spec.resources.priority;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[75cf7021-10a4-11e8-ab55-75346738d444,imports]] */

/* End Protected Region   [[75cf7021-10a4-11e8-ab55-75346738d444,imports]] */

public class PriorityFunctionSpace {

  /* Begin Protected Region [[75cf7021-10a4-11e8-ab55-75346738d444]] */
  
  /* End Protected Region   [[75cf7021-10a4-11e8-ab55-75346738d444]] */


  public static interface IPriorityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7f692ca3-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsShould();

    @IDynamicResourceExtension.MethodId("ad1b2b84-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsNice();

    @IDynamicResourceExtension.MethodId("c7e8226f-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsMust();

  }
  
  public static interface IPriorityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("7f692ca3-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsShould(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority);

    @IDynamicResourceExtension.MethodId("ad1b2b84-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsNice(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority);

    @IDynamicResourceExtension.MethodId("c7e8226f-10a4-11e8-ab55-75346738d444")
    public java.lang.Boolean IsMust(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority);

  }
  
  public static class PriorityFunctionsImpl implements IPriorityFunctionsImpl {

    public static final IPriorityFunctionsImpl INSTANCE = new PriorityFunctionsImpl();

    private PriorityFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsShould(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
      return priority.isShould__F_have();
    }

    @Override
    public java.lang.Boolean IsNice(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
      return priority.isNice__F_to__F_have();
    }

    @Override
    public java.lang.Boolean IsMust(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
      return priority.isMust__F_have();
    }

  }
  
  public static class PriorityFunctions {

    private PriorityFunctions() {}

    public static java.lang.Boolean IsShould(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).IsShould(priority);
    }

    public static java.lang.Boolean IsNice(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).IsNice(priority);
    }

    public static java.lang.Boolean IsMust(final cleon.common.resources.spec.resources.priority.javamodel.IPriority priority) {
      return DynamicResourceUtil.invoke(IPriorityFunctionsImpl.class, PriorityFunctionsImpl.INSTANCE, priority).IsMust(priority);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,75cf7021-10a4-11e8-ab55-75346738d444,QON2mh/vMxkYK4+JHnDPwddJ+k8=] */
