package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.template.role;

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


  public static interface IRoleTemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("92f96e6a-d5e1-11eb-b02a-03222c04a898")
    public java.lang.String CommonName();

    @IDynamicResourceExtension.MethodId("a40693a7-dd92-11eb-a588-852a91faee6e")
    public java.lang.String GetId();

    @IDynamicResourceExtension.MethodId("2ecc01de-de4a-11eb-b028-df36f0dc7b24")
    public List<ch.actifsource.core.javamodel.IDecorator> ToRoleSystemComponent(final ch.actifsource.core.javamodel.IDecorator roleSystemComponent);

    @IDynamicResourceExtension.MethodId("fc8c4789-de4a-11eb-b028-df36f0dc7b24")
    public List<ch.actifsource.core.javamodel.IDecorator> AllBasedOn();

    @IDynamicResourceExtension.MethodId("fcf9ee4b-de5b-11eb-b028-df36f0dc7b24")
    public List<ch.actifsource.core.javamodel.IDecorator> AllBasedOnReverse();

    @IDynamicResourceExtension.MethodId("dc189867-0fd7-11f0-999f-c7e64e984aff")
    public List<ch.actifsource.core.javamodel.INamedResource> GetSystemConfigurationDependencies();

  }
  
  public static interface IRoleTemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a40693a7-dd92-11eb-a588-852a91faee6e")
    public java.lang.String GetId(final ch.actifsource.core.javamodel.IDecorator roleTemplate);

    @IDynamicResourceExtension.MethodId("2ecc01de-de4a-11eb-b028-df36f0dc7b24")
    public List<ch.actifsource.core.javamodel.IDecorator> ToRoleSystemComponent(final ch.actifsource.core.javamodel.IDecorator roleSystemComponent, final List<ch.actifsource.core.javamodel.IDecorator> roleTemplateList);

  }
  
  public static class RoleTemplateFunctionsImpl implements IRoleTemplateFunctionsImpl {

    public static final IRoleTemplateFunctionsImpl INSTANCE = new RoleTemplateFunctionsImpl();

    private RoleTemplateFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final ch.actifsource.core.javamodel.IDecorator roleTemplate) {
      return String.format("%03d", roleTemplate.selectIdentifier());
    }

    @Override
    public List<ch.actifsource.core.javamodel.IDecorator> ToRoleSystemComponent(final ch.actifsource.core.javamodel.IDecorator roleSystemComponent, final List<ch.actifsource.core.javamodel.IDecorator> roleTemplateList) {
      /* Begin Protected Region [[2ecc01de-de4a-11eb-b028-df36f0dc7b24]] */
    	var roleSystemComponentResult = new ArrayList<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent>();
    	for( var roleTemplate : roleTemplateList ) {
    		var roleSystemComponents =  RoleSystemComponent.selectToMeSystemComponentRoleTemplate(roleTemplate);
    		roleSystemComponentResult.addAll(roleSystemComponents);    		
    	}
    	
    	return roleSystemComponentResult;
      /* End Protected Region   [[2ecc01de-de4a-11eb-b028-df36f0dc7b24]] */
    }

  }
  
  public static class RoleTemplateFunctions {

    private RoleTemplateFunctions() {}

    public static java.lang.String GetId(final ch.actifsource.core.javamodel.IDecorator roleTemplate) {
      return DynamicResourceUtil.invoke(IRoleTemplateFunctionsImpl.class, RoleTemplateFunctionsImpl.INSTANCE, roleTemplate).GetId(roleTemplate);
    }

    public static List<ch.actifsource.core.javamodel.IDecorator> ToRoleSystemComponent(final ch.actifsource.core.javamodel.IDecorator roleSystemComponent, final List<ch.actifsource.core.javamodel.IDecorator> roleTemplateList) {
      return DynamicResourceUtil.invoke(IRoleTemplateFunctionsImpl.class, RoleTemplateFunctionsImpl.INSTANCE, roleTemplateList).ToRoleSystemComponent(roleSystemComponent, roleTemplateList);
    }

  }

  public static interface IRoleSystemOrSystemTemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2607621f-4bc2-11ed-9983-274ab90bcd39")
    public List<ch.actifsource.core.javamodel.IResource> AllComponentsForAuthZBuildingBlock();

  }
  
  public static interface IRoleSystemOrSystemTemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class RoleSystemOrSystemTemplateFunctionsImpl implements IRoleSystemOrSystemTemplateFunctionsImpl {

    public static final IRoleSystemOrSystemTemplateFunctionsImpl INSTANCE = new RoleSystemOrSystemTemplateFunctionsImpl();

    private RoleSystemOrSystemTemplateFunctionsImpl() {}

  }
  
  public static class RoleSystemOrSystemTemplateFunctions {

    private RoleSystemOrSystemTemplateFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,7fae76bb-d5e1-11eb-b02a-03222c04a898,kMbVkMgGP7W+MsgewUJYlFQl/Fw=] */
