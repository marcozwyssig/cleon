package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c103e64f-273a-11f0-bc3e-fdd30b5cbdec,imports]] */

/* End Protected Region   [[c103e64f-273a-11f0-bc3e-fdd30b5cbdec,imports]] */

public class FunctionSpace_Test_Account {

  /* Begin Protected Region [[c103e64f-273a-11f0-bc3e-fdd30b5cbdec]] */
  
  /* End Protected Region   [[c103e64f-273a-11f0-bc3e-fdd30b5cbdec]] */


  public static interface ITestAccountFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("01dd32dc-273c-11f0-bc3e-fdd30b5cbdec")
    public java.lang.Integer Id();

    @IDynamicResourceExtension.MethodId("03a9679f-273c-11f0-bc3e-fdd30b5cbdec")
    public java.lang.String SimpleName();

    @IDynamicResourceExtension.MethodId("58f11140-273c-11f0-bc3e-fdd30b5cbdec")
    public java.lang.Integer RangeId();

  }
  
  public static interface ITestAccountFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("01dd32dc-273c-11f0-bc3e-fdd30b5cbdec")
    public java.lang.Integer Id(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccount testAccount);

  }
  
  public static class TestAccountFunctionsImpl implements ITestAccountFunctionsImpl {

    public static final ITestAccountFunctionsImpl INSTANCE = new TestAccountFunctionsImpl();

    private TestAccountFunctionsImpl() {}

    @Override
    public java.lang.Integer Id(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccount testAccount) {
      /* Begin Protected Region [[01dd32dc-273c-11f0-bc3e-fdd30b5cbdec]] */
	    final var testAccountFunctions = testAccount.extension(ITestAccountFunctions.class);
	    final var id = testAccountFunctions.RangeId();
	    return id + testAccount.selectIdentifier();
      /* End Protected Region   [[01dd32dc-273c-11f0-bc3e-fdd30b5cbdec]] */
    }

  }
  
  public static class TestAccountFunctions {

    private TestAccountFunctions() {}

    public static java.lang.Integer Id(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccount testAccount) {
      return DynamicResourceUtil.invoke(ITestAccountFunctionsImpl.class, TestAccountFunctionsImpl.INSTANCE, testAccount).Id(testAccount);
    }

  }

  public static interface IAbstractTestAccountTemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fdf0c9a7-9929-11f0-b89e-65f425c2dee1")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ListRoleSystemComponents();

  }
  
  public static interface IAbstractTestAccountTemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractTestAccountTemplateFunctionsImpl implements IAbstractTestAccountTemplateFunctionsImpl {

    public static final IAbstractTestAccountTemplateFunctionsImpl INSTANCE = new AbstractTestAccountTemplateFunctionsImpl();

    private AbstractTestAccountTemplateFunctionsImpl() {}

  }
  
  public static class AbstractTestAccountTemplateFunctions {

    private AbstractTestAccountTemplateFunctions() {}

  }

  public static interface ITestAccountTemplateFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("556f77b7-992a-11f0-b89e-65f425c2dee1")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ListRoleSystemComponents();

  }
  
  public static interface ITestAccountTemplateFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class TestAccountTemplateFunctionsImpl implements ITestAccountTemplateFunctionsImpl {

    public static final ITestAccountTemplateFunctionsImpl INSTANCE = new TestAccountTemplateFunctionsImpl();

    private TestAccountTemplateFunctionsImpl() {}

  }
  
  public static class TestAccountTemplateFunctions {

    private TestAccountTemplateFunctions() {}

  }

  public static interface ITestAccountTemplateNoRoleFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("721b670f-992a-11f0-b89e-65f425c2dee1")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ListRoleSystemComponents();

  }
  
  public static interface ITestAccountTemplateNoRoleFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("721b670f-992a-11f0-b89e-65f425c2dee1")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ListRoleSystemComponents(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccountTemplateNoRole testAccountTemplateNoRole);

  }
  
  public static class TestAccountTemplateNoRoleFunctionsImpl implements ITestAccountTemplateNoRoleFunctionsImpl {

    public static final ITestAccountTemplateNoRoleFunctionsImpl INSTANCE = new TestAccountTemplateNoRoleFunctionsImpl();

    private TestAccountTemplateNoRoleFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ListRoleSystemComponents(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccountTemplateNoRole testAccountTemplateNoRole) {
      return null;
    }

  }
  
  public static class TestAccountTemplateNoRoleFunctions {

    private TestAccountTemplateNoRoleFunctions() {}

    public static List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.authz.deployment.role.javamodel.IRoleSystemComponent> ListRoleSystemComponents(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.security.identity.accounts.testaccounts.javamodel.ITestAccountTemplateNoRole testAccountTemplateNoRole) {
      return DynamicResourceUtil.invoke(ITestAccountTemplateNoRoleFunctionsImpl.class, TestAccountTemplateNoRoleFunctionsImpl.INSTANCE, testAccountTemplateNoRole).ListRoleSystemComponents(testAccountTemplateNoRole);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c103e64f-273a-11f0-bc3e-fdd30b5cbdec,2MC3MqE0+OWN6UVLW94oa82bsGM=] */
