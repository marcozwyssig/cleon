package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[af925f8e-8c80-11eb-a9c0-c3b95abf3470,imports]] */

/* End Protected Region   [[af925f8e-8c80-11eb-a9c0-c3b95abf3470,imports]] */

public class FunctionSpace_Storage {

  /* Begin Protected Region [[af925f8e-8c80-11eb-a9c0-c3b95abf3470]] */
  
  /* End Protected Region   [[af925f8e-8c80-11eb-a9c0-c3b95abf3470]] */


  public static interface ICapacityFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dd339691-8c80-11eb-a9c0-c3b95abf3470")
    public java.lang.Double Netto();

  }
  
  public static interface ICapacityFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("dd339691-8c80-11eb-a9c0-c3b95abf3470")
    public java.lang.Double Netto(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.ICapacity capacity);

  }
  
  public static class CapacityFunctionsImpl implements ICapacityFunctionsImpl {

    public static final ICapacityFunctionsImpl INSTANCE = new CapacityFunctionsImpl();

    private CapacityFunctionsImpl() {}

    @Override
    public java.lang.Double Netto(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.ICapacity capacity) {
      /* Begin Protected Region [[dd339691-8c80-11eb-a9c0-c3b95abf3470]] */
    	return capacity.selectBrutto_aE__aA_GB_aC_() / capacity.selectDeduplication_rate();   
      /* End Protected Region   [[dd339691-8c80-11eb-a9c0-c3b95abf3470]] */
    }

  }
  
  public static class CapacityFunctions {

    private CapacityFunctions() {}

    public static java.lang.Double Netto(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.ICapacity capacity) {
      return DynamicResourceUtil.invoke(ICapacityFunctionsImpl.class, CapacityFunctionsImpl.INSTANCE, capacity).Netto(capacity);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,af925f8e-8c80-11eb-a9c0-c3b95abf3470,0e3SWdyHwq9vMJtFGPWCwumeB0A=] */
