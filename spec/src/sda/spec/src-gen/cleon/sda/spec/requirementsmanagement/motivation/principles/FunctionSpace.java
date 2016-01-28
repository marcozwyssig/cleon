package cleon.sda.spec.requirementsmanagement.motivation.principles;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4a0d89e2-c58d-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[4a0d89e2-c58d-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[4a0d89e2-c58d-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[4a0d89e2-c58d-11e5-aeea-1db9268c0ee9]] */


  public static interface IPrincipleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4a0d89e4-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

  }
  
  public static interface IPrincipleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4a0d89e4-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple principle);

  }
  
  public static class PrincipleFunctionsImpl implements IPrincipleFunctionsImpl {

    public static final IPrincipleFunctionsImpl INSTANCE = new PrincipleFunctionsImpl();

    private PrincipleFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple principle) {
      /* Begin Protected Region [[4a0d89e4-c58d-11e5-aeea-1db9268c0ee9]] */
    	return String.format("PR-%03d", principle.selectIdentifier());      
      /* End Protected Region   [[4a0d89e4-c58d-11e5-aeea-1db9268c0ee9]] */
    }

  }
  
  public static class PrincipleFunctions {

    private PrincipleFunctions() {}

    public static java.lang.String GetId(final cleon.sda.spec.requirementsmanagement.motivation.principles.javamodel.IPrinciple principle) {
      return DynamicResourceUtil.invoke(IPrincipleFunctionsImpl.class, PrincipleFunctionsImpl.INSTANCE, principle).GetId(principle);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4a0d89e2-c58d-11e5-aeea-1db9268c0ee9,cWd+b+58mn3hkULxwxBBD9cvcns=] */
