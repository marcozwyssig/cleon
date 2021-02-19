package cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[39e27138-c58d-11e5-aeea-1db9268c0ee9,imports]] */

/* End Protected Region   [[39e27138-c58d-11e5-aeea-1db9268c0ee9,imports]] */

public class FunctionSpace_Driver {

  /* Begin Protected Region [[39e27138-c58d-11e5-aeea-1db9268c0ee9]] */
  
  /* End Protected Region   [[39e27138-c58d-11e5-aeea-1db9268c0ee9]] */


  public static interface IDriverFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3ff7c055-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId();

  }
  
  public static interface IDriverFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("3ff7c055-c58d-11e5-aeea-1db9268c0ee9")
    public java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDriver driver);

  }
  
  public static class DriverFunctionsImpl implements IDriverFunctionsImpl {

    public static final IDriverFunctionsImpl INSTANCE = new DriverFunctionsImpl();

    private DriverFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDriver driver) {
      return String.format("DR-%03d", driver.selectIdentifier());
    }

  }
  
  public static class DriverFunctions {

    private DriverFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.eamod.metamodel.spec.chrv.drivers.javamodel.IDriver driver) {
      return DynamicResourceUtil.invoke(IDriverFunctionsImpl.class, DriverFunctionsImpl.INSTANCE, driver).GetId(driver);
    }

  }

  public static interface IDriversFunctions extends IDynamicResourceExtension {

  }
  
  public static interface IDriversFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DriversFunctionsImpl implements IDriversFunctionsImpl {

    public static final IDriversFunctionsImpl INSTANCE = new DriversFunctionsImpl();

    private DriversFunctionsImpl() {}

  }
  
  public static class DriversFunctions {

    private DriversFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,39e27138-c58d-11e5-aeea-1db9268c0ee9,/M2AtWSSQxwOWJEnHdF6Wxmdkgs=] */
