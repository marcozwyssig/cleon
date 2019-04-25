package cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[189e1c41-1e07-11e9-834d-77c41fccc6bf,imports]] */

/* End Protected Region   [[189e1c41-1e07-11e9-834d-77c41fccc6bf,imports]] */

public class FunctionSpace_RBAC {

  /* Begin Protected Region [[189e1c41-1e07-11e9-834d-77c41fccc6bf]] */
  
  /* End Protected Region   [[189e1c41-1e07-11e9-834d-77c41fccc6bf]] */


  public static interface IGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("213b009c-1e07-11e9-834d-77c41fccc6bf")
    public cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRBAC GetRBAC();

  }
  
  public static interface IGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GroupsFunctionsImpl implements IGroupsFunctionsImpl {

    public static final IGroupsFunctionsImpl INSTANCE = new GroupsFunctionsImpl();

    private GroupsFunctionsImpl() {}

  }
  
  public static class GroupsFunctions {

    private GroupsFunctions() {}

  }

  public static interface IRBACFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f538e63-1e07-11e9-834d-77c41fccc6bf")
    public cleon.projectmethods.hermes.spec.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware GetArc42_Document();

  }
  
  public static interface IRBACFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RBACFunctionsImpl implements IRBACFunctionsImpl {

    public static final IRBACFunctionsImpl INSTANCE = new RBACFunctionsImpl();

    private RBACFunctionsImpl() {}

  }
  
  public static class RBACFunctions {

    private RBACFunctions() {}

  }

  public static interface IActivityGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5e10c68a-1e08-11e9-834d-77c41fccc6bf")
    public cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRBAC GetRBAC();

  }
  
  public static interface IActivityGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ActivityGroupsFunctionsImpl implements IActivityGroupsFunctionsImpl {

    public static final IActivityGroupsFunctionsImpl INSTANCE = new ActivityGroupsFunctionsImpl();

    private ActivityGroupsFunctionsImpl() {}

  }
  
  public static class ActivityGroupsFunctions {

    private ActivityGroupsFunctions() {}

  }

  public static interface IRoleGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("683535d5-1e08-11e9-834d-77c41fccc6bf")
    public cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRBAC GetRBAC();

  }
  
  public static interface IRoleGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RoleGroupsFunctionsImpl implements IRoleGroupsFunctionsImpl {

    public static final IRoleGroupsFunctionsImpl INSTANCE = new RoleGroupsFunctionsImpl();

    private RoleGroupsFunctionsImpl() {}

  }
  
  public static class RoleGroupsFunctions {

    private RoleGroupsFunctions() {}

  }

  public static interface ISubnetGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9755ee05-1e0d-11e9-865e-41ef48a95f70")
    public cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRBAC GetRBAC();

    @IDynamicResourceExtension.MethodId("2ab68567-1e12-11e9-865e-41ef48a95f70")
    public cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups GetSecurityGroup();

    @IDynamicResourceExtension.MethodId("4ea436ac-1e12-11e9-865e-41ef48a95f70")
    public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode GetSubnetNode();

  }
  
  public static interface ISubnetGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SubnetGroupFunctionsImpl implements ISubnetGroupFunctionsImpl {

    public static final ISubnetGroupFunctionsImpl INSTANCE = new SubnetGroupFunctionsImpl();

    private SubnetGroupFunctionsImpl() {}

  }
  
  public static class SubnetGroupFunctions {

    private SubnetGroupFunctions() {}

  }

  public static interface ISecurityGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a904cb96-1e19-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetRange();

  }
  
  public static interface ISecurityGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a904cb96-1e19-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetRange(final cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups securityGroups);

  }
  
  public static class SecurityGroupsFunctionsImpl implements ISecurityGroupsFunctionsImpl {

    public static final ISecurityGroupsFunctionsImpl INSTANCE = new SecurityGroupsFunctionsImpl();

    private SecurityGroupsFunctionsImpl() {}

    @Override
    public java.lang.Integer GetRange(final cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups securityGroups) {
      /* Begin Protected Region [[a904cb96-1e19-11e9-865e-41ef48a95f70]] */
      return securityGroups.selectIdentifier() + 99;   
      /* End Protected Region   [[a904cb96-1e19-11e9-865e-41ef48a95f70]] */
    }

  }
  
  public static class SecurityGroupsFunctions {

    private SecurityGroupsFunctions() {}

    public static java.lang.Integer GetRange(final cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups securityGroups) {
      return DynamicResourceUtil.invoke(ISecurityGroupsFunctionsImpl.class, SecurityGroupsFunctionsImpl.INSTANCE, securityGroups).GetRange(securityGroups);
    }

  }

  public static interface IRoleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0410dad8-35ef-11e9-9d58-25409887bb2a")
    public java.lang.Integer GetId();

    @IDynamicResourceExtension.MethodId("da412972-35ef-11e9-9d58-25409887bb2a")
    public cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.ISecurityGroups GetSecurityGroup();

    @IDynamicResourceExtension.MethodId("da41297a-35ef-11e9-9d58-25409887bb2a")
    public cleon.architecturemethods.itarc42.spec.itarc42._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode GetSubnetNode();

    @IDynamicResourceExtension.MethodId("2e224bf8-35f5-11e9-9d58-25409887bb2a")
    public java.lang.String GetDescription();

  }
  
  public static interface IRoleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0410dad8-35ef-11e9-9d58-25409887bb2a")
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRole role);

  }
  
  public static class RoleFunctionsImpl implements IRoleFunctionsImpl {

    public static final IRoleFunctionsImpl INSTANCE = new RoleFunctionsImpl();

    private RoleFunctionsImpl() {}

    @Override
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRole role) {
      /* Begin Protected Region [[0410dad8-35ef-11e9-9d58-25409887bb2a]] */
    	IRoleFunctions functions = role.extension(IRoleFunctions.class);
    	Integer secGroupId = functions.GetSecurityGroup().selectIdentifier();
    	Integer supplyNetId = functions.GetSubnetNode().selectGroupId() * 30;
    	Integer cmpId = role.selectSystemComponent().selectIdentifier();
    	return secGroupId + supplyNetId + cmpId;      
      /* End Protected Region   [[0410dad8-35ef-11e9-9d58-25409887bb2a]] */
    }

  }
  
  public static class RoleFunctions {

    private RoleFunctions() {}

    public static java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IRole role) {
      return DynamicResourceUtil.invoke(IRoleFunctionsImpl.class, RoleFunctionsImpl.INSTANCE, role).GetId(role);
    }

  }

  public static interface IActivityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("228c5f41-1e12-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetId();

  }
  
  public static interface IActivityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("228c5f41-1e12-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IActivity activity);

  }
  
  public static class ActivityFunctionsImpl implements IActivityFunctionsImpl {

    public static final IActivityFunctionsImpl INSTANCE = new ActivityFunctionsImpl();

    private ActivityFunctionsImpl() {}

    @Override
    public java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IActivity activity) {
      /* Begin Protected Region [[228c5f41-1e12-11e9-865e-41ef48a95f70]] */
    	ISubnetGroupFunctions functions = activity.extension(ISubnetGroupFunctions.class);
    	Integer secGroupId = functions.GetSecurityGroup().selectIdentifier();
    	Integer supplyNetId = functions.GetSubnetNode().selectGroupId();
    	return secGroupId + supplyNetId; 
      // XXX implement template function here   
      /* End Protected Region   [[228c5f41-1e12-11e9-865e-41ef48a95f70]] */
    }

  }
  
  public static class ActivityFunctions {

    private ActivityFunctions() {}

    public static java.lang.Integer GetId(final cleon.architecturemethods.itarc42.spec.itarc42._08_concepts.security.rbac.javamodel.IActivity activity) {
      return DynamicResourceUtil.invoke(IActivityFunctionsImpl.class, ActivityFunctionsImpl.INSTANCE, activity).GetId(activity);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,189e1c41-1e07-11e9-834d-77c41fccc6bf,MTLObIDsYvo7qe0Y2hbrNIuUvJE=] */
