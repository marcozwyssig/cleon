package cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[8bc3420c-035a-11e9-a251-e3767b78f69f,imports]] */

/* End Protected Region   [[8bc3420c-035a-11e9-a251-e3767b78f69f,imports]] */

public class FunctionSpace_ItArc42_BuildingBlock {

  /* Begin Protected Region [[8bc3420c-035a-11e9-a251-e3767b78f69f]] */
  
  /* End Protected Region   [[8bc3420c-035a-11e9-a251-e3767b78f69f]] */


  public static interface ISystemComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3b7918e0-035b-11e9-a251-e3767b78f69f")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISystemComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemComponentFunctionsImpl implements ISystemComponentFunctionsImpl {

    public static final ISystemComponentFunctionsImpl INSTANCE = new SystemComponentFunctionsImpl();

    private SystemComponentFunctionsImpl() {}

  }
  
  public static class SystemComponentFunctions {

    private SystemComponentFunctions() {}

  }

  public static interface ISystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("76a90178-035d-11e9-a251-e3767b78f69f")
    public java.lang.String GetTypeName();

  }
  
  public static interface ISystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationFunctionsImpl implements ISystemConfigurationFunctionsImpl {

    public static final ISystemConfigurationFunctionsImpl INSTANCE = new SystemConfigurationFunctionsImpl();

    private SystemConfigurationFunctionsImpl() {}

  }
  
  public static class SystemConfigurationFunctions {

    private SystemConfigurationFunctions() {}

  }

  public static interface ISystemWithLayersFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("70bfbfae-9c97-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemComponent> AllSystemComponents();

    @IDynamicResourceExtension.MethodId("85e60694-9c97-11e9-9b32-35cf2fd07621")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec.buildingblock_view.javamodel.ISystemConfiguration> AllSystemConfigurations();

  }
  
  public static interface ISystemWithLayersFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemWithLayersFunctionsImpl implements ISystemWithLayersFunctionsImpl {

    public static final ISystemWithLayersFunctionsImpl INSTANCE = new SystemWithLayersFunctionsImpl();

    private SystemWithLayersFunctionsImpl() {}

  }
  
  public static class SystemWithLayersFunctions {

    private SystemWithLayersFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,8bc3420c-035a-11e9-a251-e3767b78f69f,n1TdfVMA++ZAL0fwDxbkg032cNQ=] */
