package cleon.common.resources.metamodel.spec.literals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[94cc46da-f832-11ea-8aa5-7b39f57c0cbc,imports]] */

/* End Protected Region   [[94cc46da-f832-11ea-8aa5-7b39f57c0cbc,imports]] */

public class BooleanFunctionSpace {

  /* Begin Protected Region [[94cc46da-f832-11ea-8aa5-7b39f57c0cbc]] */
  
  /* End Protected Region   [[94cc46da-f832-11ea-8aa5-7b39f57c0cbc]] */


  public static interface IBooleanLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a0a0622a-f832-11ea-8aa5-7b39f57c0cbc")
    public java.lang.Boolean isTrue();

    @IDynamicResourceExtension.MethodId("a2c7035d-b939-11ee-a0d0-e953bcbfaeef")
    public java.lang.Boolean nullToFalse();

    @IDynamicResourceExtension.MethodId("c50c5cb5-b939-11ee-a0d0-e953bcbfaeef")
    public java.lang.Boolean nullToTrue();

  }
  
  public static interface IBooleanLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a2c7035d-b939-11ee-a0d0-e953bcbfaeef")
    public java.lang.Boolean nullToFalse(final java.lang.Boolean booleanLiteral);

    @IDynamicResourceExtension.MethodId("c50c5cb5-b939-11ee-a0d0-e953bcbfaeef")
    public java.lang.Boolean nullToTrue(final java.lang.Boolean booleanLiteral);

  }
  
  public static class BooleanLiteralFunctionsImpl implements IBooleanLiteralFunctionsImpl {

    public static final IBooleanLiteralFunctionsImpl INSTANCE = new BooleanLiteralFunctionsImpl();

    private BooleanLiteralFunctionsImpl() {}

    @Override
    public java.lang.Boolean nullToFalse(final java.lang.Boolean booleanLiteral) {
      /* Begin Protected Region [[a2c7035d-b939-11ee-a0d0-e953bcbfaeef]] */
    	if ( booleanLiteral == null) {
    		return false;
    	}
    	return booleanLiteral;   
      /* End Protected Region   [[a2c7035d-b939-11ee-a0d0-e953bcbfaeef]] */
    }

    @Override
    public java.lang.Boolean nullToTrue(final java.lang.Boolean booleanLiteral) {
      /* Begin Protected Region [[c50c5cb5-b939-11ee-a0d0-e953bcbfaeef]] */
    	if ( booleanLiteral == null) {
    		return true;
    	}
    	return booleanLiteral;     
      /* End Protected Region   [[c50c5cb5-b939-11ee-a0d0-e953bcbfaeef]] */
    }

  }
  
  public static class BooleanLiteralFunctions {

    private BooleanLiteralFunctions() {}

    public static java.lang.Boolean nullToFalse(final java.lang.Boolean booleanLiteral) {
      return DynamicResourceUtil.invoke(IBooleanLiteralFunctionsImpl.class, BooleanLiteralFunctionsImpl.INSTANCE, booleanLiteral).nullToFalse(booleanLiteral);
    }

    public static java.lang.Boolean nullToTrue(final java.lang.Boolean booleanLiteral) {
      return DynamicResourceUtil.invoke(IBooleanLiteralFunctionsImpl.class, BooleanLiteralFunctionsImpl.INSTANCE, booleanLiteral).nullToTrue(booleanLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,94cc46da-f832-11ea-8aa5-7b39f57c0cbc,gRyx3LWdtmSJ64dIt1Zx9m3KpOc=] */
