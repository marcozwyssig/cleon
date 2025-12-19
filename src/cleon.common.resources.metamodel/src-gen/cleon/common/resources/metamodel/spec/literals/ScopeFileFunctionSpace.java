package cleon.common.resources.metamodel.spec.literals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[99df7c99-dcbf-11f0-9b2d-7723ecc1ddbd,imports]] */

/* End Protected Region   [[99df7c99-dcbf-11f0-9b2d-7723ecc1ddbd,imports]] */

public class ScopeFileFunctionSpace {

  /* Begin Protected Region [[99df7c99-dcbf-11f0-9b2d-7723ecc1ddbd]] */
  
  /* End Protected Region   [[99df7c99-dcbf-11f0-9b2d-7723ecc1ddbd]] */


  public static interface IScopeFileLiteralFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("a90693ca-dcbf-11f0-9b2d-7723ecc1ddbd")
    public java.lang.String Filename();

  }
  
  public static interface IScopeFileLiteralFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("a90693ca-dcbf-11f0-9b2d-7723ecc1ddbd")
    public java.lang.String Filename(final java.lang.String scopeFileLiteral);

  }
  
  public static class ScopeFileLiteralFunctionsImpl implements IScopeFileLiteralFunctionsImpl {

    public static final IScopeFileLiteralFunctionsImpl INSTANCE = new ScopeFileLiteralFunctionsImpl();

    private ScopeFileLiteralFunctionsImpl() {}

    @Override
    public java.lang.String Filename(final java.lang.String scopeFileLiteral) {
      /* Begin Protected Region [[a90693ca-dcbf-11f0-9b2d-7723ecc1ddbd]] */
    	if (scopeFileLiteral == null || scopeFileLiteral.isEmpty()) {
            return "";
        }
        
        int lastSeparatorIndex = Math.max(
        		scopeFileLiteral.lastIndexOf('/'),
        		scopeFileLiteral.lastIndexOf('\\')
        );
        
        return lastSeparatorIndex >= 0 
            ? scopeFileLiteral.substring(lastSeparatorIndex + 1)
            : scopeFileLiteral;    	   
      /* End Protected Region   [[a90693ca-dcbf-11f0-9b2d-7723ecc1ddbd]] */
    }

  }
  
  public static class ScopeFileLiteralFunctions {

    private ScopeFileLiteralFunctions() {}

    public static java.lang.String Filename(final java.lang.String scopeFileLiteral) {
      return DynamicResourceUtil.invoke(IScopeFileLiteralFunctionsImpl.class, ScopeFileLiteralFunctionsImpl.INSTANCE, scopeFileLiteral).Filename(scopeFileLiteral);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,99df7c99-dcbf-11f0-9b2d-7723ecc1ddbd,8funxcvfDWO1rdRwQtEy/jEqNz0=] */
