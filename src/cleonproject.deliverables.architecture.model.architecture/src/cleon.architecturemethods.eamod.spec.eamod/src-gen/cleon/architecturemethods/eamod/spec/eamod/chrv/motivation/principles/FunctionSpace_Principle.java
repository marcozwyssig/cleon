package cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4a0d89e2-c58d-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[4a0d89e2-c58d-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace_Principle {

  /* Begin Protected Region [[4a0d89e2-c58d-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[4a0d89e2-c58d-11e5-aeea-1db9268c0ee9]] */


  public static interface IPrincipleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4a0d89e4-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("f0aadd8a-c9a3-11e5-96e7-e5a5eee26591")
    public List<cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple> GetAllPrinciples();

  }
  
  public static interface IPrincipleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("4a0d89e4-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple principle);

  }
  
  public static class PrincipleFunctionsImpl implements IPrincipleFunctionsImpl {

    public static final IPrincipleFunctionsImpl INSTANCE = new PrincipleFunctionsImpl();

    private PrincipleFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple principle) {
      return String.format("P%03d", principle.selectIdentifier());   
    }

  }
  
  public static class PrincipleFunctions {

    private PrincipleFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple principle) {
      return DynamicResourceUtil.invoke(IPrincipleFunctionsImpl.class, PrincipleFunctionsImpl.INSTANCE, principle).GetId(principle);
    }

  }

  public static interface IPrinciplesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e4536160-c9a3-11e5-96e7-e5a5eee26591")
    public List<cleon.architecturemethods.eamod.spec.eamod.chrv.motivation.principles.javamodel.IPrinciple> GetAllPrinciples();

  }
  
  public static interface IPrinciplesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class PrinciplesFunctionsImpl implements IPrinciplesFunctionsImpl {

    public static final IPrinciplesFunctionsImpl INSTANCE = new PrinciplesFunctionsImpl();

    private PrinciplesFunctionsImpl() {}

  }
  
  public static class PrinciplesFunctions {

    private PrinciplesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4a0d89e2-c58d-11e5-aeea-1db9268c0ee9,ZVh+ME4FW83ihaBeK17cpVXAR8o=] */
