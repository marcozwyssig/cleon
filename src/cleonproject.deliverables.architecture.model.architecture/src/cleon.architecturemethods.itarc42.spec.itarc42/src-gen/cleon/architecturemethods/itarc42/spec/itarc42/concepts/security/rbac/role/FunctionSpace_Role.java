package cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[20a523c3-7f08-11e9-98a3-b1bd805f0a31,imports]] */
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.FunctionSpace_RBAC.IAbstractGroupFunctions;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.FunctionSpace_Activity.IActivityPermissionFunctions;
import cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleRootGroups;
/* End Protected Region   [[20a523c3-7f08-11e9-98a3-b1bd805f0a31,imports]] */

public class FunctionSpace_Role {

  /* Begin Protected Region [[20a523c3-7f08-11e9-98a3-b1bd805f0a31]] */
  
  /* End Protected Region   [[20a523c3-7f08-11e9-98a3-b1bd805f0a31]] */


  public static interface IRoleSystemComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("da41297a-35ef-11e9-9d58-25409887bb2a")
    public cleon.architecturemethods.itarc42.spec.itarc42.deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode GetNetdomainNode();

    @IDynamicResourceExtension.MethodId("2e224bf8-35f5-11e9-9d58-25409887bb2a")
    public java.lang.String GetDescription();

    @IDynamicResourceExtension.MethodId("67e37348-9c10-11e9-9470-2178b598e9a4")
    public java.lang.Integer ActorNo();

    @IDynamicResourceExtension.MethodId("d1ce51c1-9c10-11e9-9470-2178b598e9a4")
    public java.lang.Integer SystemComponentNo();

    @IDynamicResourceExtension.MethodId("b7460617-9c10-11e9-9470-2178b598e9a4")
    public java.lang.Integer ResponsibilityNo();

    @IDynamicResourceExtension.MethodId("9eddbb3a-9cd1-11e9-9b32-35cf2fd07621")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("3de44671-9cd8-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.activity.javamodel.IActivityPermission> AllAvailalableActivityPermissions();

  }
  
  public static interface IRoleSystemComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RoleSystemComponentFunctionsImpl implements IRoleSystemComponentFunctionsImpl {

    public static final IRoleSystemComponentFunctionsImpl INSTANCE = new RoleSystemComponentFunctionsImpl();

    private RoleSystemComponentFunctionsImpl() {}

  }
  
  public static class RoleSystemComponentFunctions {

    private RoleSystemComponentFunctions() {}

  }

  public static interface IResponsibilitiesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bbd34741-809c-11e9-8e65-f3f639e40a34")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IResponsibilities> AllResponsibilities();

    @IDynamicResourceExtension.MethodId("d89b4a54-809c-11e9-8e65-f3f639e40a34")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IResponsibility> AllResponsibility();

    @IDynamicResourceExtension.MethodId("ee0f14dc-809c-11e9-8e65-f3f639e40a34")
    public java.lang.Integer AllCountResponsibility();

  }
  
  public static interface IResponsibilitiesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ResponsibilitiesFunctionsImpl implements IResponsibilitiesFunctionsImpl {

    public static final IResponsibilitiesFunctionsImpl INSTANCE = new ResponsibilitiesFunctionsImpl();

    private ResponsibilitiesFunctionsImpl() {}

  }
  
  public static class ResponsibilitiesFunctions {

    private ResponsibilitiesFunctions() {}

  }

  public static interface IRoleRootGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fe310a77-9c0f-11e9-9470-2178b598e9a4")
    public java.lang.Integer ActorCount();

    @IDynamicResourceExtension.MethodId("387ac324-9c10-11e9-9470-2178b598e9a4")
    public java.lang.Integer SystemComponentCount();

    @IDynamicResourceExtension.MethodId("1ad46ebf-9c10-11e9-9470-2178b598e9a4")
    public java.lang.Integer ResponsibilityCount();

    @IDynamicResourceExtension.MethodId("1f943bf7-9c17-11e9-9470-2178b598e9a4")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleNetDomainGroup> AllRoleNetDomaingroups();

  }
  
  public static interface IRoleRootGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RoleRootGroupsFunctionsImpl implements IRoleRootGroupsFunctionsImpl {

    public static final IRoleRootGroupsFunctionsImpl INSTANCE = new RoleRootGroupsFunctionsImpl();

    private RoleRootGroupsFunctionsImpl() {}

  }
  
  public static class RoleRootGroupsFunctions {

    private RoleRootGroupsFunctions() {}

  }

  public static interface IRoleNetDomainGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("cb248677-9c17-11e9-9470-2178b598e9a4")
    public List<cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleSystemComponent> AllRoleSystemComponents();

    @IDynamicResourceExtension.MethodId("79ca7b0b-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max();

  }
  
  public static interface IRoleNetDomainGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("79ca7b0b-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleNetDomainGroup roleNetDomainGroup);

  }
  
  public static class RoleNetDomainGroupFunctionsImpl implements IRoleNetDomainGroupFunctionsImpl {

    public static final IRoleNetDomainGroupFunctionsImpl INSTANCE = new RoleNetDomainGroupFunctionsImpl();

    private RoleNetDomainGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer Max(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleNetDomainGroup roleNetDomainGroup) {
      /* Begin Protected Region [[79ca7b0b-9c8f-11e9-9b32-35cf2fd07621]] */
    	IAbstractGroupFunctions groupFunctions = roleNetDomainGroup.extension(IAbstractGroupFunctions.class);
    	IRoleRootGroups roleRootGroups = groupFunctions.GetRootRoleGroup();   	
    	IRoleRootGroupsFunctions roleRootGroupsFunctions = roleRootGroups.extension(IRoleRootGroupsFunctions.class);
    	return roleRootGroupsFunctions.ActorCount() * roleRootGroupsFunctions.ResponsibilityCount() + roleRootGroupsFunctions.SystemComponentCount();
      /* End Protected Region   [[79ca7b0b-9c8f-11e9-9b32-35cf2fd07621]] */
    }

  }
  
  public static class RoleNetDomainGroupFunctions {

    private RoleNetDomainGroupFunctions() {}

    public static java.lang.Integer Max(final cleon.architecturemethods.itarc42.spec.itarc42.concepts.security.rbac.role.javamodel.IRoleNetDomainGroup roleNetDomainGroup) {
      return DynamicResourceUtil.invoke(IRoleNetDomainGroupFunctionsImpl.class, RoleNetDomainGroupFunctionsImpl.INSTANCE, roleNetDomainGroup).Max(roleNetDomainGroup);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,20a523c3-7f08-11e9-98a3-b1bd805f0a31,QEqJdRBoMbz+x74M7U8fw/dTZbo=] */
