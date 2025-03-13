package cleon.common.resources.metamodel.spec.literals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[04454117-0001-11f0-a4b8-93f936374459,imports]] */

/* End Protected Region   [[04454117-0001-11f0-a4b8-93f936374459,imports]] */

public class IntegerFunctionSpace {

  /* Begin Protected Region [[04454117-0001-11f0-a4b8-93f936374459]] */
  
  /* End Protected Region   [[04454117-0001-11f0-a4b8-93f936374459]] */


  public static interface IIntegerLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("11bab02b-0001-11f0-a4b8-93f936374459")
    public java.lang.Integer zero();

  }
  
  public static interface IIntegerLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("11bab02b-0001-11f0-a4b8-93f936374459")
    public java.lang.Integer zero(final java.lang.Integer integerLiteral);

  }
  
  public static class IntegerLiteralFunctionsImpl implements IIntegerLiteralFunctionsImpl {

    public static final IIntegerLiteralFunctionsImpl INSTANCE = new IntegerLiteralFunctionsImpl();

    private IntegerLiteralFunctionsImpl() {}

    @Override
    public java.lang.Integer zero(final java.lang.Integer integerLiteral) {
      return 0;
    }

  }
  
  public static class IntegerLiteralFunctions {

    private IntegerLiteralFunctions() {}

    public static java.lang.Integer zero(final java.lang.Integer integerLiteral) {
      return DynamicResourceUtil.invoke(IIntegerLiteralFunctionsImpl.class, IntegerLiteralFunctionsImpl.INSTANCE, integerLiteral).zero(integerLiteral);
    }

  }

}

      /* Begin Protected Region [[04454119-0001-11f0-a4b8-93f936374459]] */
      // XXX implement template function here   
      /* End Protected Region   [[04454119-0001-11f0-a4b8-93f936374459]] */
      /* Begin Protected Region [[0445411b-0001-11f0-a4b8-93f936374459]] */
      // XXX implement template function here   
      /* End Protected Region   [[0445411b-0001-11f0-a4b8-93f936374459]] */
/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,04454117-0001-11f0-a4b8-93f936374459,X6kzK7Dbhg1Zp3e134TJCD9+xU0=] */
