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
    public java.lang.Integer Id(final ch.actifsource.core.javamodel.IDecorator testAccount);

  }
  
  public static class TestAccountFunctionsImpl implements ITestAccountFunctionsImpl {

    public static final ITestAccountFunctionsImpl INSTANCE = new TestAccountFunctionsImpl();

    private TestAccountFunctionsImpl() {}

    @Override
    public java.lang.Integer Id(final ch.actifsource.core.javamodel.IDecorator testAccount) {
      /* Begin Protected Region [[01dd32dc-273c-11f0-bc3e-fdd30b5cbdec]] */
	    final var testAccountFunctions = testAccount.extension(ITestAccountFunctions.class);
	    final var id = testAccountFunctions.RangeId();
	    return id + testAccount.selectIdentifier();
      /* End Protected Region   [[01dd32dc-273c-11f0-bc3e-fdd30b5cbdec]] */
    }

  }
  
  public static class TestAccountFunctions {

    private TestAccountFunctions() {}

    public static java.lang.Integer Id(final ch.actifsource.core.javamodel.IDecorator testAccount) {
      return DynamicResourceUtil.invoke(ITestAccountFunctionsImpl.class, TestAccountFunctionsImpl.INSTANCE, testAccount).Id(testAccount);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c103e64f-273a-11f0-bc3e-fdd30b5cbdec,DEA6yRlmijFypCK7r+cm+6qddeg=] */
