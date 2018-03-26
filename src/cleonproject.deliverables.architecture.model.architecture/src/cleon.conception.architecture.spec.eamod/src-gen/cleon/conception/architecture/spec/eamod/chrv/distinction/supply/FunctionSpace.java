package cleon.conception.architecture.spec.eamod.chrv.distinction.supply;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c733b4c8-0e17-11e6-ae01-ef640c578b9b,imports]] */

/* End Protected Region   [[c733b4c8-0e17-11e6-ae01-ef640c578b9b,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[c733b4c8-0e17-11e6-ae01-ef640c578b9b]] */
  
  /* End Protected Region   [[c733b4c8-0e17-11e6-ae01-ef640c578b9b]] */


  public static interface ISupplyFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("ce37d205-0e17-11e6-ae01-ef640c578b9b")
    public java.lang.String GetId();

  }
  
  public static interface ISupplyFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("ce37d205-0e17-11e6-ae01-ef640c578b9b")
    public java.lang.String GetId(final cleon.conception.architecture.spec.eamod.chrv.distinction.supply.javamodel.ISupply supply);

  }
  
  public static class SupplyFunctionsImpl implements ISupplyFunctionsImpl {

    public static final ISupplyFunctionsImpl INSTANCE = new SupplyFunctionsImpl();

    private SupplyFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.conception.architecture.spec.eamod.chrv.distinction.supply.javamodel.ISupply supply) {
      return String.format("SP%03d", supply.selectIdentifier());    
    }

  }
  
  public static class SupplyFunctions {

    private SupplyFunctions() {}

    public static java.lang.String GetId(final cleon.conception.architecture.spec.eamod.chrv.distinction.supply.javamodel.ISupply supply) {
      return DynamicResourceUtil.invoke(ISupplyFunctionsImpl.class, SupplyFunctionsImpl.INSTANCE, supply).GetId(supply);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c733b4c8-0e17-11e6-ae01-ef640c578b9b,4/Gz5Wq6bCRhbXq2JCaMlnxpiVw=] */
