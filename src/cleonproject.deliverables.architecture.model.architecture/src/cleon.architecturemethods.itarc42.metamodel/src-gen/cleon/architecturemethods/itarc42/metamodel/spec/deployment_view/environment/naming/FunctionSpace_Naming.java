package cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.naming;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d92c5522-11b3-11e9-9a7b-590a6369b499,imports]] */

/* End Protected Region   [[d92c5522-11b3-11e9-9a7b-590a6369b499,imports]] */

public class FunctionSpace_Naming {

  /* Begin Protected Region [[d92c5522-11b3-11e9-9a7b-590a6369b499]] */
  
  /* End Protected Region   [[d92c5522-11b3-11e9-9a7b-590a6369b499]] */


  public static interface INamingFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1aac5da3-11b4-11e9-9a7b-590a6369b499")
    public java.lang.String GetSimpleName(final cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode object);

  }
  
  public static interface INamingFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("1aac5da3-11b4-11e9-9a7b-590a6369b499")
    public java.lang.String GetSimpleName(final cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode object, final cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.naming.javamodel.INaming naming);

  }
  
  public static class NamingFunctionsImpl implements INamingFunctionsImpl {

    public static final INamingFunctionsImpl INSTANCE = new NamingFunctionsImpl();

    private NamingFunctionsImpl() {}

    @Override
    public java.lang.String GetSimpleName(final cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode object, final cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.naming.javamodel.INaming naming) {
      /* Begin Protected Region [[1aac5da3-11b4-11e9-9a7b-590a6369b499]] */
    	return "";
      /* End Protected Region   [[1aac5da3-11b4-11e9-9a7b-590a6369b499]] */
    }

  }
  
  public static class NamingFunctions {

    private NamingFunctions() {}

    public static java.lang.String GetSimpleName(final cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.node.javamodel.INode object, final cleon.architecturemethods.itarc42.metamodel.spec.deployment_view.environment.naming.javamodel.INaming naming) {
      return DynamicResourceUtil.invoke(INamingFunctionsImpl.class, NamingFunctionsImpl.INSTANCE, naming).GetSimpleName(object, naming);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d92c5522-11b3-11e9-9a7b-590a6369b499,pUYKJELG0ZhTgUB7xaQh8LQR8Ig=] */
