package cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.restrict;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c678fea2-7258-11ed-8c7b-bf13a6bd0e0e,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.FunctionSpace_SystemArc42_BuildingBlockView.ISystemConfigurationFunctions;
/* End Protected Region   [[c678fea2-7258-11ed-8c7b-bf13a6bd0e0e,imports]] */

public class FunctionSpace_Restrict {

  /* Begin Protected Region [[c678fea2-7258-11ed-8c7b-bf13a6bd0e0e]] */

  /* End Protected Region   [[c678fea2-7258-11ed-8c7b-bf13a6bd0e0e]] */


  public static interface IAbstractOverrideHostGroupForDestinationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f23a5160-7258-11ed-8c7b-bf13a6bd0e0e")
    public java.lang.String GetValue(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration cfg, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone sz);

  }
  
  public static interface IAbstractOverrideHostGroupForDestinationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractOverrideHostGroupForDestinationFunctionsImpl implements IAbstractOverrideHostGroupForDestinationFunctionsImpl {

    public static final IAbstractOverrideHostGroupForDestinationFunctionsImpl INSTANCE = new AbstractOverrideHostGroupForDestinationFunctionsImpl();

    private AbstractOverrideHostGroupForDestinationFunctionsImpl() {}

  }
  
  public static class AbstractOverrideHostGroupForDestinationFunctions {

    private AbstractOverrideHostGroupForDestinationFunctions() {}

  }

  public static interface IOverrideCustomHostGroupForDestinationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("67d45de2-7259-11ed-8c7b-bf13a6bd0e0e")
    public java.lang.String GetValue(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration cfg, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone sz);

  }
  
  public static interface IOverrideCustomHostGroupForDestinationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OverrideCustomHostGroupForDestinationFunctionsImpl implements IOverrideCustomHostGroupForDestinationFunctionsImpl {

    public static final IOverrideCustomHostGroupForDestinationFunctionsImpl INSTANCE = new OverrideCustomHostGroupForDestinationFunctionsImpl();

    private OverrideCustomHostGroupForDestinationFunctionsImpl() {}

  }
  
  public static class OverrideCustomHostGroupForDestinationFunctions {

    private OverrideCustomHostGroupForDestinationFunctions() {}

  }

  public static interface IOverrideSiteOnHostGroupForDestinationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("71883184-7259-11ed-8c7b-bf13a6bd0e0e")
    public java.lang.String GetValue(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration cfg, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone sz);

  }
  
  public static interface IOverrideSiteOnHostGroupForDestinationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("71883184-7259-11ed-8c7b-bf13a6bd0e0e")
    public java.lang.String GetValue(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration cfg, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone sz, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.restrict.javamodel.IOverrideSiteOnHostGroupForDestination overrideSiteOnHostGroupForDestination);

  }
  
  public static class OverrideSiteOnHostGroupForDestinationFunctionsImpl implements IOverrideSiteOnHostGroupForDestinationFunctionsImpl {

    public static final IOverrideSiteOnHostGroupForDestinationFunctionsImpl INSTANCE = new OverrideSiteOnHostGroupForDestinationFunctionsImpl();

    private OverrideSiteOnHostGroupForDestinationFunctionsImpl() {}

    @Override
    public java.lang.String GetValue(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration cfg, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone sz, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.restrict.javamodel.IOverrideSiteOnHostGroupForDestination overrideSiteOnHostGroupForDestination) {
      /* Begin Protected Region [[71883184-7259-11ed-8c7b-bf13a6bd0e0e]] */
    	return cfg.extension(ISystemConfigurationFunctions.class).HostGroupName(overrideSiteOnHostGroupForDestination.selectValue(), sz);
      /* End Protected Region   [[71883184-7259-11ed-8c7b-bf13a6bd0e0e]] */
    }

  }
  
  public static class OverrideSiteOnHostGroupForDestinationFunctions {

    private OverrideSiteOnHostGroupForDestinationFunctions() {}

    public static java.lang.String GetValue(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.javamodel.ISystemConfiguration cfg, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone sz, final cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.restrict.javamodel.IOverrideSiteOnHostGroupForDestination overrideSiteOnHostGroupForDestination) {
      return DynamicResourceUtil.invoke(IOverrideSiteOnHostGroupForDestinationFunctionsImpl.class, OverrideSiteOnHostGroupForDestinationFunctionsImpl.INSTANCE, overrideSiteOnHostGroupForDestination).GetValue(cfg, sz, overrideSiteOnHostGroupForDestination);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c678fea2-7258-11ed-8c7b-bf13a6bd0e0e,Vck6gHM9dmiMky1vLmWWHMEj2VI=] */
