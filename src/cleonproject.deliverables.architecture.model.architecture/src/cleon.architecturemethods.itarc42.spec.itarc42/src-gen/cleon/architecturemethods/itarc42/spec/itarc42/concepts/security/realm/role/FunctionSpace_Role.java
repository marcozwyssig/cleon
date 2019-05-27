package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[20a523c3-7f08-11e9-98a3-b1bd805f0a31,imports]] */

/* End Protected Region   [[20a523c3-7f08-11e9-98a3-b1bd805f0a31,imports]] */

public class FunctionSpace_Role {

  /* Begin Protected Region [[20a523c3-7f08-11e9-98a3-b1bd805f0a31]] */
  
  /* End Protected Region   [[20a523c3-7f08-11e9-98a3-b1bd805f0a31]] */


  public static interface IRoleSystemComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0410dad8-35ef-11e9-9d58-25409887bb2a")
    public java.lang.Integer GetId();

    @IDynamicResourceExtension.MethodId("da41297a-35ef-11e9-9d58-25409887bb2a")
    public cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode GetNetdomainNode();

    @IDynamicResourceExtension.MethodId("2e224bf8-35f5-11e9-9d58-25409887bb2a")
    public java.lang.String GetDescription();

  }
  
  public static interface IRoleSystemComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0410dad8-35ef-11e9-9d58-25409887bb2a")
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel.IRoleSystemComponent roleSystemComponent);

  }
  
  public static class RoleSystemComponentFunctionsImpl implements IRoleSystemComponentFunctionsImpl {

    public static final IRoleSystemComponentFunctionsImpl INSTANCE = new RoleSystemComponentFunctionsImpl();

    private RoleSystemComponentFunctionsImpl() {}

    @Override
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel.IRoleSystemComponent roleSystemComponent) {
      /* Begin Protected Region [[0410dad8-35ef-11e9-9d58-25409887bb2a]] */
    	return 1;
      /* End Protected Region   [[0410dad8-35ef-11e9-9d58-25409887bb2a]] */
    }

  }
  
  public static class RoleSystemComponentFunctions {

    private RoleSystemComponentFunctions() {}

    public static java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.realm.role.javamodel.IRoleSystemComponent roleSystemComponent) {
      return DynamicResourceUtil.invoke(IRoleSystemComponentFunctionsImpl.class, RoleSystemComponentFunctionsImpl.INSTANCE, roleSystemComponent).GetId(roleSystemComponent);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,20a523c3-7f08-11e9-98a3-b1bd805f0a31,tX0a1i84wYlLLuaPrPoIsPhS2bA=] */
