package cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.licensemgmt;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[4c6fda4b-168d-11ea-a824-b14e5c5cf5c3,imports]] */

/* End Protected Region   [[4c6fda4b-168d-11ea-a824-b14e5c5cf5c3,imports]] */

public class FunctionSpace_License_Mgmt {

  /* Begin Protected Region [[4c6fda4b-168d-11ea-a824-b14e5c5cf5c3]] */
  
  /* End Protected Region   [[4c6fda4b-168d-11ea-a824-b14e5c5cf5c3]] */


  public static interface IVolumeActionToolSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("73e860cc-168d-11ea-a824-b14e5c5cf5c3")
    public java.lang.String GetStereotypeName();

    @IDynamicResourceExtension.MethodId("73e860cf-168d-11ea-a824-b14e5c5cf5c3")
    public java.lang.String GetIncludePath();

  }
  
  public static interface IVolumeActionToolSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class VolumeActionToolSystemConfigurationFunctionsImpl implements IVolumeActionToolSystemConfigurationFunctionsImpl {

    public static final IVolumeActionToolSystemConfigurationFunctionsImpl INSTANCE = new VolumeActionToolSystemConfigurationFunctionsImpl();

    private VolumeActionToolSystemConfigurationFunctionsImpl() {}

  }
  
  public static class VolumeActionToolSystemConfigurationFunctions {

    private VolumeActionToolSystemConfigurationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,4c6fda4b-168d-11ea-a824-b14e5c5cf5c3,KPXVCGDE/xGt6y73iy9lQRXE03U=] */
