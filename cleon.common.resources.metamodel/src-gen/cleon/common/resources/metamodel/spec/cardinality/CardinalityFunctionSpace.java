package cleon.common.resources.metamodel.spec.cardinality;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4f929d97-26a8-11e8-a805-991f3ff583b7,imports]] */

/* End Protected Region   [[4f929d97-26a8-11e8-a805-991f3ff583b7,imports]] */

public class CardinalityFunctionSpace {

  /* Begin Protected Region [[4f929d97-26a8-11e8-a805-991f3ff583b7]] */
  
  /* End Protected Region   [[4f929d97-26a8-11e8-a805-991f3ff583b7]] */


  public static interface ICardinalityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("936c002d-26a8-11e8-a805-991f3ff583b7")
    public java.lang.Boolean isMandatory();

  }
  
  public static interface ICardinalityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("936c002d-26a8-11e8-a805-991f3ff583b7")
    public java.lang.Boolean isMandatory(final ch.actifsource.core.javamodel.ICardinality cardinality);

  }
  
  public static class CardinalityFunctionsImpl implements ICardinalityFunctionsImpl {

    public static final ICardinalityFunctionsImpl INSTANCE = new CardinalityFunctionsImpl();

    private CardinalityFunctionsImpl() {}

    @Override
    public java.lang.Boolean isMandatory(final ch.actifsource.core.javamodel.ICardinality cardinality) {
      /* Begin Protected Region [[936c002d-26a8-11e8-a805-991f3ff583b7]] */
      return cardinality.selectMinCardinality() == 1;
      /* End Protected Region   [[936c002d-26a8-11e8-a805-991f3ff583b7]] */
    }

  }
  
  public static class CardinalityFunctions {

    private CardinalityFunctions() {}

    public static java.lang.Boolean isMandatory(final ch.actifsource.core.javamodel.ICardinality cardinality) {
      return DynamicResourceUtil.invoke(ICardinalityFunctionsImpl.class, CardinalityFunctionsImpl.INSTANCE, cardinality).isMandatory(cardinality);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4f929d97-26a8-11e8-a805-991f3ff583b7,2xmUUq/caBYSA3s7AtGdwKBbwEI=] */
