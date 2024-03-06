package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[7fae76bb-d5e1-11eb-b02a-03222c04a898,imports]] */
import java.util.ArrayList;
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.RoleSystemComponent;
/* End Protected Region   [[7fae76bb-d5e1-11eb-b02a-03222c04a898,imports]] */

public class FunctionSpace_AuthZBuildingBlockForSystemComponent_Actor {

  /* Begin Protected Region [[7fae76bb-d5e1-11eb-b02a-03222c04a898]] */
  
  /* End Protected Region   [[7fae76bb-d5e1-11eb-b02a-03222c04a898]] */


  public static interface IAuthZBuildingBlockForSystemComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("92f96e6a-d5e1-11eb-b02a-03222c04a898")
    public java.lang.String CommonName();

    @IDynamicResourceExtension.MethodId("a40693a7-dd92-11eb-a588-852a91faee6e")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("2ecc01de-de4a-11eb-b028-df36f0dc7b24")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ToRoleSystemComponent(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent);

    @IDynamicResourceExtension.MethodId("fc8c4789-de4a-11eb-b028-df36f0dc7b24")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent> AllBasedOn();

    @IDynamicResourceExtension.MethodId("fcf9ee4b-de5b-11eb-b028-df36f0dc7b24")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent> AllBasedOnReverse();

  }
  
  public static interface IAuthZBuildingBlockForSystemComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a40693a7-dd92-11eb-a588-852a91faee6e")
    public java.lang.String GetId(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent authZBuildingBlockForSystemComponent);

    @IDynamicResourceExtension.MethodId("2ecc01de-de4a-11eb-b028-df36f0dc7b24")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ToRoleSystemComponent(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent> authZBuildingBlockForSystemComponentList);

  }
  
  public static class AuthZBuildingBlockForSystemComponentFunctionsImpl implements IAuthZBuildingBlockForSystemComponentFunctionsImpl {

    public static final IAuthZBuildingBlockForSystemComponentFunctionsImpl INSTANCE = new AuthZBuildingBlockForSystemComponentFunctionsImpl();

    private AuthZBuildingBlockForSystemComponentFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent authZBuildingBlockForSystemComponent) {
      return String.format("%03d", authZBuildingBlockForSystemComponent.selectIdentifier());
    }

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ToRoleSystemComponent(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent> authZBuildingBlockForSystemComponentList) {
      /* Begin Protected Region [[2ecc01de-de4a-11eb-b028-df36f0dc7b24]] */
    	var roleSystemComponentResult = new ArrayList<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent>();
    	for( var authZBuildingBlockForSystemComponent : authZBuildingBlockForSystemComponentList ) {
    		var roleSystemComponents =  RoleSystemComponent.selectToMeSystemComponentRoleTemplate(authZBuildingBlockForSystemComponent);
    		roleSystemComponentResult.addAll(roleSystemComponents);    		
    	}
    	
    	return roleSystemComponentResult;
      /* End Protected Region   [[2ecc01de-de4a-11eb-b028-df36f0dc7b24]] */
    }

  }
  
  public static class AuthZBuildingBlockForSystemComponentFunctions {

    private AuthZBuildingBlockForSystemComponentFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent authZBuildingBlockForSystemComponent) {
      return DynamicResourceUtil.invoke(IAuthZBuildingBlockForSystemComponentFunctionsImpl.class, AuthZBuildingBlockForSystemComponentFunctionsImpl.INSTANCE, authZBuildingBlockForSystemComponent).GetId(authZBuildingBlockForSystemComponent);
    }

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ToRoleSystemComponent(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent roleSystemComponent, final List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.buildingblock.actor.javamodel.IAuthZBuildingBlockForSystemComponent> authZBuildingBlockForSystemComponentList) {
      return DynamicResourceUtil.invoke(IAuthZBuildingBlockForSystemComponentFunctionsImpl.class, AuthZBuildingBlockForSystemComponentFunctionsImpl.INSTANCE, authZBuildingBlockForSystemComponentList).ToRoleSystemComponent(roleSystemComponent, authZBuildingBlockForSystemComponentList);
    }

  }

  public static interface IAuthZBuildingBlockForResponsibilityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2607621f-4bc2-11ed-9983-274ab90bcd39")
    public List<cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.system.javamodel.IAbstractSystemOrSystemComponent> AllComponentsForAuthZBuildingBlock();

  }
  
  public static interface IAuthZBuildingBlockForResponsibilityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AuthZBuildingBlockForResponsibilityFunctionsImpl implements IAuthZBuildingBlockForResponsibilityFunctionsImpl {

    public static final IAuthZBuildingBlockForResponsibilityFunctionsImpl INSTANCE = new AuthZBuildingBlockForResponsibilityFunctionsImpl();

    private AuthZBuildingBlockForResponsibilityFunctionsImpl() {}

  }
  
  public static class AuthZBuildingBlockForResponsibilityFunctions {

    private AuthZBuildingBlockForResponsibilityFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7fae76bb-d5e1-11eb-b02a-03222c04a898,/0ghLjaAgkezze5sjqXOKK9yHxE=] */
