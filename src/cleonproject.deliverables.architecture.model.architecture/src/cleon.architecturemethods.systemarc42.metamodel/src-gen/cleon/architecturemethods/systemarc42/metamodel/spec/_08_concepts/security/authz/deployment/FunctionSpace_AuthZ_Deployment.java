package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[189e1c41-1e07-11e9-834d-77c41fccc6bf,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleActorGroup;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleActorResponsibility;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSiteGroup;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithFunctionID;
import cleon.common.resources.metamodel.spec.active.FunctionSpace_Active.IEnabledWithDefaultTrueAwareFunctions;
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup;
import java.util.stream.Collectors;
/* End Protected Region   [[189e1c41-1e07-11e9-834d-77c41fccc6bf,imports]] */

public class FunctionSpace_AuthZ_Deployment {

  /* Begin Protected Region [[189e1c41-1e07-11e9-834d-77c41fccc6bf]] */

  /* End Protected Region   [[189e1c41-1e07-11e9-834d-77c41fccc6bf]] */


  public static interface IEnvironmentRBACFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2f538e63-1e07-11e9-834d-77c41fccc6bf")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware GetArc42_Document();

    @IDynamicResourceExtension.MethodId("f29d2896-78de-11ea-a009-ab381ce86597")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent GetRoleSystemComponent(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor actor, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IResponsibility responsibilty, final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemComponent systemComponent);

  }
  
  public static interface IEnvironmentRBACFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("f29d2896-78de-11ea-a009-ab381ce86597")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent GetRoleSystemComponent(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor actor, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IResponsibility responsibilty, final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemComponent systemComponent, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IEnvironmentRBAC environmentRBAC);

  }
  
  public static class EnvironmentRBACFunctionsImpl implements IEnvironmentRBACFunctionsImpl {

    public static final IEnvironmentRBACFunctionsImpl INSTANCE = new EnvironmentRBACFunctionsImpl();

    private EnvironmentRBACFunctionsImpl() {}

    @Override
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent GetRoleSystemComponent(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor actor, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IResponsibility responsibilty, final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemComponent systemComponent, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IEnvironmentRBAC environmentRBAC) {
      /* Begin Protected Region [[f29d2896-78de-11ea-a009-ab381ce86597]] */
      final IRoleSiteGroup roleNetDomainGroup = environmentRBAC.selectRoles().selectRoleForSite().values()
      		.stream().filter(x -> x.selectSite().selectName().equals(site.selectName())).findFirst()
      		.orElse(null);
      if (roleNetDomainGroup == null) {
      	return null;
      }

      final IRoleActorGroup roleActorGroup = roleNetDomainGroup.selectRoleforActors().get(actor.getResource());
      if (roleActorGroup == null) {
      	return null;
      }

      final IRoleActorResponsibility roleActorResponsiblity = roleActorGroup.selectRoleActorResponsibilities()
      		.get(responsibilty.getResource());
      if (roleActorResponsiblity == null) {
      	return null;
      }
      return roleActorResponsiblity.selectRolesForSystemComponents().get(systemComponent.getResource());
      /* End Protected Region   [[f29d2896-78de-11ea-a009-ab381ce86597]] */
    }

  }
  
  public static class EnvironmentRBACFunctions {

    private EnvironmentRBACFunctions() {}

    public static cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent GetRoleSystemComponent(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final cleon.architecturemethods.arc42.metamodel.spec._03_system_scope_and_context.domain.javamodel.IActor actor, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IResponsibility responsibilty, final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemComponent systemComponent, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IEnvironmentRBAC environmentRBAC) {
      return DynamicResourceUtil.invoke(IEnvironmentRBACFunctionsImpl.class, EnvironmentRBACFunctionsImpl.INSTANCE, environmentRBAC).GetRoleSystemComponent(site, actor, responsibilty, systemComponent, environmentRBAC);
    }

  }

  public static interface IAbstractSiteGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a904cb96-1e19-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetRange();

    @IDynamicResourceExtension.MethodId("893ebfeb-7f21-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetId();

    @IDynamicResourceExtension.MethodId("63f0e9b9-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer Max();

    @IDynamicResourceExtension.MethodId("8f1d7786-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer MaxRounded();

  }
  
  public static interface IAbstractSiteGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a904cb96-1e19-11e9-865e-41ef48a95f70")
    public java.lang.Integer GetRange(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup abstractSiteGroup);

    @IDynamicResourceExtension.MethodId("893ebfeb-7f21-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup abstractSiteGroup);

    @IDynamicResourceExtension.MethodId("8f1d7786-9c8f-11e9-9b32-35cf2fd07621")
    public java.lang.Integer MaxRounded(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup abstractSiteGroup);

  }
  
  public static class AbstractSiteGroupFunctionsImpl implements IAbstractSiteGroupFunctionsImpl {

    public static final IAbstractSiteGroupFunctionsImpl INSTANCE = new AbstractSiteGroupFunctionsImpl();

    private AbstractSiteGroupFunctionsImpl() {}

    @Override
    public java.lang.Integer GetRange(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup abstractSiteGroup) {
      /* Begin Protected Region [[a904cb96-1e19-11e9-865e-41ef48a95f70]] */
      return GetId(abstractSiteGroup) + MaxRounded(abstractSiteGroup) - 1;
      /* End Protected Region   [[a904cb96-1e19-11e9-865e-41ef48a95f70]] */
    }

    @Override
    public java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup abstractSiteGroup) {
      /* Begin Protected Region [[893ebfeb-7f21-11e9-9a52-07d4b074defc]] */
      final var abstractSite = abstractSiteGroup.selectSite();
      if (abstractSite instanceof IAbstractSiteWithFunctionID) {
      	final var functionID = (IAbstractSiteWithFunctionID) abstractSite;
      	return functionID.selectFunctionID();
      }
      return 0;
      /* End Protected Region   [[893ebfeb-7f21-11e9-9a52-07d4b074defc]] */
    }

    @Override
    public java.lang.Integer MaxRounded(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup abstractSiteGroup) {
      /* Begin Protected Region [[8f1d7786-9c8f-11e9-9b32-35cf2fd07621]] */
      final var functions = abstractSiteGroup.extension(IAbstractSiteGroupFunctions.class);
      return (functions.Max() + 99) / 100 * 100;
      /* End Protected Region   [[8f1d7786-9c8f-11e9-9b32-35cf2fd07621]] */
    }

  }
  
  public static class AbstractSiteGroupFunctions {

    private AbstractSiteGroupFunctions() {}

    public static java.lang.Integer GetRange(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup abstractSiteGroup) {
      return DynamicResourceUtil.invoke(IAbstractSiteGroupFunctionsImpl.class, AbstractSiteGroupFunctionsImpl.INSTANCE, abstractSiteGroup).GetRange(abstractSiteGroup);
    }

    public static java.lang.Integer GetId(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup abstractSiteGroup) {
      return DynamicResourceUtil.invoke(IAbstractSiteGroupFunctionsImpl.class, AbstractSiteGroupFunctionsImpl.INSTANCE, abstractSiteGroup).GetId(abstractSiteGroup);
    }

    public static java.lang.Integer MaxRounded(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup abstractSiteGroup) {
      return DynamicResourceUtil.invoke(IAbstractSiteGroupFunctionsImpl.class, AbstractSiteGroupFunctionsImpl.INSTANCE, abstractSiteGroup).MaxRounded(abstractSiteGroup);
    }

  }

  public static interface IAbstractGroupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f50d9215-b079-11ea-b791-9b401fd02359")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite GetSite();

    @IDynamicResourceExtension.MethodId("ac99f866-7f25-11e9-9a52-07d4b074defc")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractSiteGroup GetSiteGroup();

    @IDynamicResourceExtension.MethodId("cbe6c726-7f24-11e9-9a52-07d4b074defc")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> GetParents();

    @IDynamicResourceExtension.MethodId("9755ee05-1e0d-11e9-865e-41ef48a95f70")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IEnvironmentRBAC GetRBAC();

    @IDynamicResourceExtension.MethodId("0d13ebb7-7f19-11e9-9a52-07d4b074defc")
    public java.lang.Integer GetSiteId();

    @IDynamicResourceExtension.MethodId("d9daba23-809a-11e9-8e65-f3f639e40a34")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.activity.javamodel.IActivityRootGroups GetRootActivityGroup();

    @IDynamicResourceExtension.MethodId("94ef12db-809c-11e9-8e65-f3f639e40a34")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleRootGroups GetRootRoleGroup();

    @IDynamicResourceExtension.MethodId("34e81fa9-c56f-11e9-9daa-cf9f9f7341e8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> GetAllChildren();

    @IDynamicResourceExtension.MethodId("b4566d55-0deb-11ea-91d3-b3e983305cb0")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.role.javamodel.IRoleSystemComponent> GetAllRoleSystemComponents();

    @IDynamicResourceExtension.MethodId("d55df488-19b9-11ea-bc72-af84f3c76c84")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> GetSiteWithAllowedToManage();

    @IDynamicResourceExtension.MethodId("9a7fb20e-54ac-11eb-8ec7-9b1f37a1ee7d")
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> List<T> OnlyActiveOrDefaultTrueRecursive();

    @IDynamicResourceExtension.MethodId("ff9ba31b-54ac-11eb-8ec7-9b1f37a1ee7d")
    public java.lang.Boolean IsActiveOrDefaultTrueRecursive();

    @IDynamicResourceExtension.MethodId("ef96cb9e-621e-11eb-b695-271c721aa03b")
    public cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup GetParent();

    @IDynamicResourceExtension.MethodId("9e1f46dd-621f-11eb-b695-271c721aa03b")
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> List<T> IsEnabledList();

    @IDynamicResourceExtension.MethodId("9dc7296d-6221-11eb-b695-271c721aa03b")
    public java.lang.Boolean IsEnabled();

  }
  
  public static interface IAbstractGroupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9a7fb20e-54ac-11eb-8ec7-9b1f37a1ee7d")
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> List<T> OnlyActiveOrDefaultTrueRecursive(final List<T> abstractGroupList);

    @IDynamicResourceExtension.MethodId("9e1f46dd-621f-11eb-b695-271c721aa03b")
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> List<T> IsEnabledList(final List<T> abstractGroupList);

    @IDynamicResourceExtension.MethodId("9dc7296d-6221-11eb-b695-271c721aa03b")
    public java.lang.Boolean IsEnabled(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup abstractGroup);

  }
  
  public static class AbstractGroupFunctionsImpl implements IAbstractGroupFunctionsImpl {

    public static final IAbstractGroupFunctionsImpl INSTANCE = new AbstractGroupFunctionsImpl();

    private AbstractGroupFunctionsImpl() {}

    @Override
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> List<T> OnlyActiveOrDefaultTrueRecursive(final List<T> abstractGroupList) {
      /* Begin Protected Region [[9a7fb20e-54ac-11eb-8ec7-9b1f37a1ee7d]] */
      return abstractGroupList.stream().filter(x -> {
      	final var abstractGroupFunctions = x.extension(IAbstractGroupFunctions.class);
      	return abstractGroupFunctions.IsActiveOrDefaultTrueRecursive();
      }).collect(Collectors.toList());
      /* End Protected Region   [[9a7fb20e-54ac-11eb-8ec7-9b1f37a1ee7d]] */
    }

    @Override
    public <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> List<T> IsEnabledList(final List<T> abstractGroupList) {
      /* Begin Protected Region [[9e1f46dd-621f-11eb-b695-271c721aa03b]] */
    	return abstractGroupList.stream().filter( x -> {
    		return IsEnabled(x);
    	}).collect(Collectors.toList());   
      /* End Protected Region   [[9e1f46dd-621f-11eb-b695-271c721aa03b]] */
    }

    @Override
    public java.lang.Boolean IsEnabled(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup abstractGroup) {
      /* Begin Protected Region [[9dc7296d-6221-11eb-b695-271c721aa03b]] */
		IAbstractGroupFunctions functions = abstractGroup.extension(IAbstractGroupFunctions.class);
		IAbstractGroup parent = functions.GetParent();
		if( parent != null ) {					
			if (IsEnabled(parent) == false) {
				return false;
			}
		}
		IEnabledWithDefaultTrueAwareFunctions defaultTrueAwareFunctions = abstractGroup.extension(IEnabledWithDefaultTrueAwareFunctions.class);
		return defaultTrueAwareFunctions.IsActiveOrDefaultTrue();		
      /* End Protected Region   [[9dc7296d-6221-11eb-b695-271c721aa03b]] */
    }

  }
  
  public static class AbstractGroupFunctions {

    private AbstractGroupFunctions() {}

    public static <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> List<T> OnlyActiveOrDefaultTrueRecursive(final List<T> abstractGroupList) {
      return DynamicResourceUtil.invoke(IAbstractGroupFunctionsImpl.class, AbstractGroupFunctionsImpl.INSTANCE, abstractGroupList).OnlyActiveOrDefaultTrueRecursive(abstractGroupList);
    }

    public static <T extends cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> List<T> IsEnabledList(final List<T> abstractGroupList) {
      return DynamicResourceUtil.invoke(IAbstractGroupFunctionsImpl.class, AbstractGroupFunctionsImpl.INSTANCE, abstractGroupList).IsEnabledList(abstractGroupList);
    }

    public static java.lang.Boolean IsEnabled(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup abstractGroup) {
      return DynamicResourceUtil.invoke(IAbstractGroupFunctionsImpl.class, AbstractGroupFunctionsImpl.INSTANCE, abstractGroup).IsEnabled(abstractGroup);
    }

  }

  public static interface IAbstractGroupsFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("792154d6-c56f-11e9-9daa-cf9f9f7341e8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.security.authz.deployment.javamodel.IAbstractGroup> GetAllChildren();

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
    public cleon.architecturemethods.systemarc42.metamodel.spec._07_deployment_view.environment.javamodel.ISystemEnvironmentNode GetEnvironment();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,189e1c41-1e07-11e9-834d-77c41fccc6bf,jxLUxG7EWb43t6uT4hUrgVm2IOE=] */
