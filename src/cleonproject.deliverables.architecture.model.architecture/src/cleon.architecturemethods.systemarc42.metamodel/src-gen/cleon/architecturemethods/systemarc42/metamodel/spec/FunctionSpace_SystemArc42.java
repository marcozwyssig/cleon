package cleon.architecturemethods.systemarc42.metamodel.spec;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[1270d567-5d76-11ea-a17e-876aff2eba30,imports]] */

/* End Protected Region   [[1270d567-5d76-11ea-a17e-876aff2eba30,imports]] */

public class FunctionSpace_SystemArc42 {

  /* Begin Protected Region [[1270d567-5d76-11ea-a17e-876aff2eba30]] */
  
  /* End Protected Region   [[1270d567-5d76-11ea-a17e-876aff2eba30]] */


  public static interface Iarc42DocumentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("45c60299-5d76-11ea-a17e-876aff2eba30")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurations();

    @IDynamicResourceExtension.MethodId("da0e8af9-95ca-11ea-9744-7dd962dc1878")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> AllSystemComponents();

  }
  
  public static interface Iarc42DocumentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class arc42DocumentFunctionsImpl implements Iarc42DocumentFunctionsImpl {

    public static final Iarc42DocumentFunctionsImpl INSTANCE = new arc42DocumentFunctionsImpl();

    private arc42DocumentFunctionsImpl() {}

  }
  
  public static class arc42DocumentFunctions {

    private arc42DocumentFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,1270d567-5d76-11ea-a17e-876aff2eba30,zZZiPGcv9JcuYJPfTfkHpA8uug8=] */
