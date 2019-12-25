package cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction.outofscope;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b1bd0458-0e17-11e6-ae01-ef640c578b9b,imports]] */

/* End Protected Region   [[b1bd0458-0e17-11e6-ae01-ef640c578b9b,imports]] */

public class FunctionSpace_OutOfScope {

  /* Begin Protected Region [[b1bd0458-0e17-11e6-ae01-ef640c578b9b]] */
  
  /* End Protected Region   [[b1bd0458-0e17-11e6-ae01-ef640c578b9b]] */


  public static interface IOutOfScopeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bf7d10a6-0e17-11e6-ae01-ef640c578b9b")
    public java.lang.String GetId();

  }
  
  public static interface IOutOfScopeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bf7d10a6-0e17-11e6-ae01-ef640c578b9b")
    public java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction.outofscope.javamodel.IOutOfScope outOfScope);

  }
  
  public static class OutOfScopeFunctionsImpl implements IOutOfScopeFunctionsImpl {

    public static final IOutOfScopeFunctionsImpl INSTANCE = new OutOfScopeFunctionsImpl();

    private OutOfScopeFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction.outofscope.javamodel.IOutOfScope outOfScope) {
      return String.format("OS%03d", outOfScope.selectIdentifier());
    }

  }
  
  public static class OutOfScopeFunctions {

    private OutOfScopeFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.distinction.outofscope.javamodel.IOutOfScope outOfScope) {
      return DynamicResourceUtil.invoke(IOutOfScopeFunctionsImpl.class, OutOfScopeFunctionsImpl.INSTANCE, outOfScope).GetId(outOfScope);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b1bd0458-0e17-11e6-ae01-ef640c578b9b,BOcPbSlNlted+eDnSL9lOIhmK5g=] */
