package cleon.applications.actifsource.metamodel.template.java;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[51f602fc-25dc-11e8-afb5-83603a67326a,imports]] */

/* End Protected Region   [[51f602fc-25dc-11e8-afb5-83603a67326a,imports]] */

public class FunctionSpace_Java {

  /* Begin Protected Region [[51f602fc-25dc-11e8-afb5-83603a67326a]] */
  
  /* End Protected Region   [[51f602fc-25dc-11e8-afb5-83603a67326a]] */


  public static interface ILiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("81edb9f3-25ec-11e8-afb5-83603a67326a")
    public java.lang.String onlyJavaType();

  }
  
  public static interface ILiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("81edb9f3-25ec-11e8-afb5-83603a67326a")
    public java.lang.String onlyJavaType(final ch.actifsource.core.javamodel.ILiteral literal);

  }
  
  public static class LiteralFunctionsImpl implements ILiteralFunctionsImpl {

    public static final ILiteralFunctionsImpl INSTANCE = new LiteralFunctionsImpl();

    private LiteralFunctionsImpl() {}

    @Override
    public java.lang.String onlyJavaType(final ch.actifsource.core.javamodel.ILiteral literal) {
      /* Begin Protected Region [[81edb9f3-25ec-11e8-afb5-83603a67326a]] */
    	String toJavaType = literal.extension(ch.actifsource.template.dataclass.FunctionSpace.ILiteralFunctions.class).toJavaType();
    	return toJavaType.substring(toJavaType.lastIndexOf(".")+1);   
      /* End Protected Region   [[81edb9f3-25ec-11e8-afb5-83603a67326a]] */
    }

  }
  
  public static class LiteralFunctions {

    private LiteralFunctions() {}

    public static java.lang.String onlyJavaType(final ch.actifsource.core.javamodel.ILiteral literal) {
      return DynamicResourceUtil.invoke(ILiteralFunctionsImpl.class, LiteralFunctionsImpl.INSTANCE, literal).onlyJavaType(literal);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,51f602fc-25dc-11e8-afb5-83603a67326a,ejc2son3aoCTvjfcHd50gzssW8Y=] */
