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

  public static interface IStorageSystemConfigurationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("efb8c058-8c8a-11eb-a9c0-c3b95abf3470")
    public java.lang.Double Brutto_GB();

    @IDynamicResourceExtension.MethodId("fb9edce6-8c8a-11eb-a9c0-c3b95abf3470")
    public java.lang.Double Netto_GB();

    @IDynamicResourceExtension.MethodId("41bcad03-098f-11ec-b426-8bacb7070b3e")
    public java.lang.Double Reserve_GB();

  }
  
  public static interface IStorageSystemConfigurationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("efb8c058-8c8a-11eb-a9c0-c3b95abf3470")
    public java.lang.Double Brutto_GB(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration storageSystemConfiguration);

    @IDynamicResourceExtension.MethodId("fb9edce6-8c8a-11eb-a9c0-c3b95abf3470")
    public java.lang.Double Netto_GB(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration storageSystemConfiguration);

    @IDynamicResourceExtension.MethodId("41bcad03-098f-11ec-b426-8bacb7070b3e")
    public java.lang.Double Reserve_GB(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration storageSystemConfiguration);

  }
  
  public static class StorageSystemConfigurationFunctionsImpl implements IStorageSystemConfigurationFunctionsImpl {

    public static final IStorageSystemConfigurationFunctionsImpl INSTANCE = new StorageSystemConfigurationFunctionsImpl();

    private StorageSystemConfigurationFunctionsImpl() {}

    @Override
    public java.lang.Double Brutto_GB(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration storageSystemConfiguration) {
      /* Begin Protected Region [[efb8c058-8c8a-11eb-a9c0-c3b95abf3470]] */
    	return storageSystemConfiguration.selectShares().stream().mapToDouble( x -> x.selectCapacity().selectBrutto_aE__aA_GB_aC_()).sum();  
      /* End Protected Region   [[efb8c058-8c8a-11eb-a9c0-c3b95abf3470]] */
    }

    @Override
    public java.lang.Double Netto_GB(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration storageSystemConfiguration) {
      /* Begin Protected Region [[fb9edce6-8c8a-11eb-a9c0-c3b95abf3470]] */
    	return storageSystemConfiguration.selectShares().stream().mapToDouble( x -> {
    			final var capacity = x.selectCapacity().extension(ICapacityFunctions.class);
    			return capacity.Netto();
    		}).sum();
      /* End Protected Region   [[fb9edce6-8c8a-11eb-a9c0-c3b95abf3470]] */
    }

    @Override
    public java.lang.Double Reserve_GB(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration storageSystemConfiguration) {
      /* Begin Protected Region [[41bcad03-098f-11ec-b426-8bacb7070b3e]] */
		return storageSystemConfiguration.selectNetto_aE_capacity_aE__aA_GB_aC_()
				- Netto_GB(storageSystemConfiguration);
      /* End Protected Region   [[41bcad03-098f-11ec-b426-8bacb7070b3e]] */
    }

  }
  
  public static class StorageSystemConfigurationFunctions {

    private StorageSystemConfigurationFunctions() {}

    public static java.lang.Double Brutto_GB(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration storageSystemConfiguration) {
      return DynamicResourceUtil.invoke(IStorageSystemConfigurationFunctionsImpl.class, StorageSystemConfigurationFunctionsImpl.INSTANCE, storageSystemConfiguration).Brutto_GB(storageSystemConfiguration);
    }

    public static java.lang.Double Netto_GB(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration storageSystemConfiguration) {
      return DynamicResourceUtil.invoke(IStorageSystemConfigurationFunctionsImpl.class, StorageSystemConfigurationFunctionsImpl.INSTANCE, storageSystemConfiguration).Netto_GB(storageSystemConfiguration);
    }

    public static java.lang.Double Reserve_GB(final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.systemconfiguration.hardware.storage.javamodel.IStorageSystemConfiguration storageSystemConfiguration) {
      return DynamicResourceUtil.invoke(IStorageSystemConfigurationFunctionsImpl.class, StorageSystemConfigurationFunctionsImpl.INSTANCE, storageSystemConfiguration).Reserve_GB(storageSystemConfiguration);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,af925f8e-8c80-11eb-a9c0-c3b95abf3470,FKMAF6Vi5Iy6QFyZOPfH4Qu9nlA=] */
