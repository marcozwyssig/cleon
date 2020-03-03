package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac;

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


  public static interface IRBACFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f538e63-1e07-11e9-834d-77c41fccc6bf")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware GetArc42_Document();

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

  public static interface IAbstractNetdomainGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a904cb96-1e19-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetRange();

    @IDynamicResourceExtension.MethodId("893ebfeb-7f21-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetId();

    @IDynamicResourceExtension.MethodId("63f0e9b9-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max();

    @IDynamicResourceExtension.MethodId("8f1d7786-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer MaxRounded();

  }
  
  public static interface IAbstractNetdomainGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a904cb96-1e19-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetRange(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup);

    @IDynamicResourceExtension.MethodId("893ebfeb-7f21-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup);

    @IDynamicResourceExtension.MethodId("8f1d7786-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer MaxRounded(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup);

  }
  
  public static class AbstractNetdomainGroupFunctionsImpl implements IAbstractNetdomainGroupFunctionsImpl {

    public static final IAbstractNetdomainGroupFunctionsImpl INSTANCE = new AbstractNetdomainGroupFunctionsImpl();

    private AbstractNetdomainGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer GetRange(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      /* Begin Protected Region [[a904cb96-1e19-11e9-865e-41ef48a95f70]] */
        return GetId(abstractNetdomainGroup) + MaxRounded(abstractNetdomainGroup) - 1;   
      /* End Protected Region   [[a904cb96-1e19-11e9-865e-41ef48a95f70]] */
    }

    @Override
    public java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      /* Begin Protected Region [[893ebfeb-7f21-11e9-9a52-07d4b074defc]] */
    	return (abstractNetdomainGroup.selectNetdomain().selectFunctionId() * MaxRounded(abstractNetdomainGroup)) + 2000;    		  
      /* End Protected Region   [[893ebfeb-7f21-11e9-9a52-07d4b074defc]] */
    }

    @Override
    public java.lang.Integer MaxRounded(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      /* Begin Protected Region [[8f1d7786-9c8f-11e9-9b32-35cf2fd07621]] */
    	IAbstractNetdomainGroupFunctions functions = abstractNetdomainGroup.extension(IAbstractNetdomainGroupFunctions.class);
    	return ((functions.Max() + 99) / 100 ) * 100;
      /* End Protected Region   [[8f1d7786-9c8f-11e9-9b32-35cf2fd07621]] */
    }

  }
  
  public static class AbstractNetdomainGroupFunctions {

    private AbstractNetdomainGroupFunctions() {}

    public static java.lang.Integer GetRange(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      return DynamicResourceUtil.invoke(IAbstractNetdomainGroupFunctionsImpl.class, AbstractNetdomainGroupFunctionsImpl.INSTANCE, abstractNetdomainGroup).GetRange(abstractNetdomainGroup);
    }

    public static java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      return DynamicResourceUtil.invoke(IAbstractNetdomainGroupFunctionsImpl.class, AbstractNetdomainGroupFunctionsImpl.INSTANCE, abstractNetdomainGroup).GetId(abstractNetdomainGroup);
    }

    public static java.lang.Integer MaxRounded(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup abstractNetdomainGroup) {
      return DynamicResourceUtil.invoke(IAbstractNetdomainGroupFunctionsImpl.class, AbstractNetdomainGroupFunctionsImpl.INSTANCE, abstractNetdomainGroup).MaxRounded(abstractNetdomainGroup);
    }

  }

  public static interface IAbstractGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4ea436ac-1e12-11e9-865e-41ef48a95f70")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode GetNetdomain();

    @IDynamicResourceExtension.MethodId("ac99f866-7f25-11e9-9a52-07d4b074defc")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractNetdomainGroup GetNetdomainGroup();

    @IDynamicResourceExtension.MethodId("cbe6c726-7f24-11e9-9a52-07d4b074defc")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractGroup> GetParents();

    @IDynamicResourceExtension.MethodId("9755ee05-1e0d-11e9-865e-41ef48a95f70")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IRBAC GetRBAC();

    @IDynamicResourceExtension.MethodId("0d13ebb7-7f19-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetNetdomainId();

    @IDynamicResourceExtension.MethodId("d9daba23-809a-11e9-8e65-f3f639e40a34")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityRootGroups GetRootActivityGroup();

    @IDynamicResourceExtension.MethodId("94ef12db-809c-11e9-8e65-f3f639e40a34")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleRootGroups GetRootRoleGroup();

    @IDynamicResourceExtension.MethodId("34e81fa9-c56f-11e9-9daa-cf9f9f7341e8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractGroup> GetAllChildren();

    @IDynamicResourceExtension.MethodId("b4566d55-0deb-11ea-91d3-b3e983305cb0")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleSystemComponent> GetAllRoleSystemComponents();

    @IDynamicResourceExtension.MethodId("d55df488-19b9-11ea-bc72-af84f3c76c84")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.node.supplynode.javamodel.ISupplyNetDomainNode GetNetdomainWithAllowedToManage();

  }
  
  public static interface IAbstractGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractGroupFunctionsImpl implements IAbstractGroupFunctionsImpl {

    public static final IAbstractGroupFunctionsImpl INSTANCE = new AbstractGroupFunctionsImpl();

    private AbstractGroupFunctionsImpl() {}

  }
  
  public static class AbstractGroupFunctions {

    private AbstractGroupFunctions() {}

  }

  public static interface IAbstractGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("792154d6-c56f-11e9-9daa-cf9f9f7341e8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.javamodel.IAbstractGroup> GetAllChildren();

  }
  
  public static interface IAbstractGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractGroupsFunctionsImpl implements IAbstractGroupsFunctionsImpl {

    public static final IAbstractGroupsFunctionsImpl INSTANCE = new AbstractGroupsFunctionsImpl();

    private AbstractGroupsFunctionsImpl() {}

  }
  
  public static class AbstractGroupsFunctions {

    private AbstractGroupsFunctions() {}

  }

  public static interface IAbstractRootGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("488c86a7-0172-11ea-83fa-05ea5175f4aa")
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironment GetEnvironment();

  }
  
  public static interface IAbstractRootGroupsFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractRootGroupsFunctionsImpl implements IAbstractRootGroupsFunctionsImpl {

    public static final IAbstractRootGroupsFunctionsImpl INSTANCE = new AbstractRootGroupsFunctionsImpl();

    private AbstractRootGroupsFunctionsImpl() {}

  }
  
  public static class AbstractRootGroupsFunctions {

    private AbstractRootGroupsFunctions() {}

  }

  public static interface IRoleSystemComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("7f1af57d-bff0-11e9-80a1-d5ff22ac3c31")
    public java.lang.String Description(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleNetDomainGroup roleNetdomainGroup);

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

  public static interface IActivityPermissionFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("05d1f501-bff1-11e9-80a1-d5ff22ac3c31")
    public java.lang.String Description(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityNetdomainGroup netDomainGroup);

    @IDynamicResourceExtension.MethodId("295e7d8e-bff2-11e9-80a1-d5ff22ac3c31")
    public java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleSystemComponent role);

  }
  
  public static interface IActivityPermissionFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("295e7d8e-bff2-11e9-80a1-d5ff22ac3c31")
    public java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleSystemComponent role, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityPermission activityPermission);

  }
  
  public static class ActivityPermissionFunctionsImpl implements IActivityPermissionFunctionsImpl {

    public static final IActivityPermissionFunctionsImpl INSTANCE = new ActivityPermissionFunctionsImpl();

    private ActivityPermissionFunctionsImpl() {}

    @Override
    public java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleSystemComponent role, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityPermission activityPermission) {
      /* Begin Protected Region [[295e7d8e-bff2-11e9-80a1-d5ff22ac3c31]] */
    	return role.selectHasActivities().contains(activityPermission);   
      /* End Protected Region   [[295e7d8e-bff2-11e9-80a1-d5ff22ac3c31]] */
    }

  }
  
  public static class ActivityPermissionFunctions {

    private ActivityPermissionFunctions() {}

    public static java.lang.Boolean HasAccess(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.role.javamodel.IRoleSystemComponent role, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.rbac.activity.javamodel.IActivityPermission activityPermission) {
      return DynamicResourceUtil.invoke(IActivityPermissionFunctionsImpl.class, ActivityPermissionFunctionsImpl.INSTANCE, activityPermission).HasAccess(role, activityPermission);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,189e1c41-1e07-11e9-834d-77c41fccc6bf,3jMiWVshkUD26d/4GdHFbZ6gFok=] */
