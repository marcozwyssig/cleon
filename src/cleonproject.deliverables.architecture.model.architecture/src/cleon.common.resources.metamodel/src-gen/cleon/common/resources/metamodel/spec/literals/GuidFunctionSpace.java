package cleon.common.resources.metamodel.spec.literals;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[687a9337-070f-11ec-a1d2-b10f798ffb28,imports]] */

/* End Protected Region   [[687a9337-070f-11ec-a1d2-b10f798ffb28,imports]] */

public class GuidFunctionSpace {

  /* Begin Protected Region [[687a9337-070f-11ec-a1d2-b10f798ffb28]] */
  
  /* End Protected Region   [[687a9337-070f-11ec-a1d2-b10f798ffb28]] */


  public static interface IGuidFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6")
    public java.lang.Integer id();

  }
  
  public static interface IGuidFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6")
    public java.lang.Integer id(final java.util.UUID guid);

  }
  
  public static class GuidFunctionsImpl implements IGuidFunctionsImpl {

    public static final IGuidFunctionsImpl INSTANCE = new GuidFunctionsImpl();

    private GuidFunctionsImpl() {}

    @Override
    public java.lang.Integer id(final java.util.UUID guid) {
      /* Begin Protected Region [[ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6]] */
        return guid.hashCode();   
      /* End Protected Region   [[ced062d0-cc4e-11ea-8b73-6b1c6b53a7a6]] */
    }

  }
  
  public static class GuidFunctions {

    private GuidFunctions() {}

    public static java.lang.Integer id(final java.util.UUID guid) {
      return DynamicResourceUtil.invoke(IGuidFunctionsImpl.class, GuidFunctionsImpl.INSTANCE, guid).id(guid);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,687a9337-070f-11ec-a1d2-b10f798ffb28,v7DP3oIjXHDYaYfkI71xdh3KZSc=] */
