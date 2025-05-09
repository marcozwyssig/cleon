package cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0881f535-dff8-11eb-93d3-9f230e4bb32b,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.CPU;
/* End Protected Region   [[0881f535-dff8-11eb-93d3-9f230e4bb32b,imports]] */

public class FunctionSpace_BuildingBlock {

  /* Begin Protected Region [[0881f535-dff8-11eb-93d3-9f230e4bb32b]] */

  /* End Protected Region   [[0881f535-dff8-11eb-93d3-9f230e4bb32b]] */


  public static interface ICoreFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0e05b36b-dff8-11eb-93d3-9f230e4bb32b")
    public java.lang.Integer BruttoTotalMHz();

    @IDynamicResourceExtension.MethodId("a16aa1c9-dffa-11eb-93d3-9f230e4bb32b")
    public java.lang.Integer NettoTotalMHz();

  }
  
  public static interface ICoreFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("0e05b36b-dff8-11eb-93d3-9f230e4bb32b")
    public java.lang.Integer BruttoTotalMHz(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore core);

    @IDynamicResourceExtension.MethodId("a16aa1c9-dffa-11eb-93d3-9f230e4bb32b")
    public java.lang.Integer NettoTotalMHz(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore core);

  }
  
  public static class CoreFunctionsImpl implements ICoreFunctionsImpl {

    public static final ICoreFunctionsImpl INSTANCE = new CoreFunctionsImpl();

    private CoreFunctionsImpl() {}

    @Override
    public java.lang.Integer BruttoTotalMHz(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore core) {
      /* Begin Protected Region [[0e05b36b-dff8-11eb-93d3-9f230e4bb32b]] */
      final var cpuCount = CPU.selectToMeCores(core).selectAmount();
      final var coreCount = core.selectAmount();
      return cpuCount * coreCount * 2000;
      /* End Protected Region   [[0e05b36b-dff8-11eb-93d3-9f230e4bb32b]] */
    }

    @Override
    public java.lang.Integer NettoTotalMHz(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore core) {
      /* Begin Protected Region [[a16aa1c9-dffa-11eb-93d3-9f230e4bb32b]] */
      final Double value = BruttoTotalMHz(core) * 0.8;
      return value.intValue();
      /* End Protected Region   [[a16aa1c9-dffa-11eb-93d3-9f230e4bb32b]] */
    }

  }
  
  public static class CoreFunctions {

    private CoreFunctions() {}

    public static java.lang.Integer BruttoTotalMHz(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore core) {
      return DynamicResourceUtil.invoke(ICoreFunctionsImpl.class, CoreFunctionsImpl.INSTANCE, core).BruttoTotalMHz(core);
    }

    public static java.lang.Integer NettoTotalMHz(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.ICore core) {
      return DynamicResourceUtil.invoke(ICoreFunctionsImpl.class, CoreFunctionsImpl.INSTANCE, core).NettoTotalMHz(core);
    }

  }

  public static interface IMemoryFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("3b73f8a6-e07a-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer NettoTotalGB();

  }
  
  public static interface IMemoryFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("3b73f8a6-e07a-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer NettoTotalGB(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory memory);

  }
  
  public static class MemoryFunctionsImpl implements IMemoryFunctionsImpl {

    public static final IMemoryFunctionsImpl INSTANCE = new MemoryFunctionsImpl();

    private MemoryFunctionsImpl() {}

    @Override
    public java.lang.Integer NettoTotalGB(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory memory) {
      /* Begin Protected Region [[3b73f8a6-e07a-11eb-85ea-9f2d155d4de3]] */
      final Double memorSize = memory.selectSizeGB() * 0.7;
      return memorSize.intValue();
      /* End Protected Region   [[3b73f8a6-e07a-11eb-85ea-9f2d155d4de3]] */
    }

  }
  
  public static class MemoryFunctions {

    private MemoryFunctions() {}

    public static java.lang.Integer NettoTotalGB(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IMemory memory) {
      return DynamicResourceUtil.invoke(IMemoryFunctionsImpl.class, MemoryFunctionsImpl.INSTANCE, memory).NettoTotalGB(memory);
    }

  }

  public static interface IDiskFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("2d3a91d9-e084-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer NettoTotalGB_60();

  }
  
  public static interface IDiskFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("2d3a91d9-e084-11eb-85ea-9f2d155d4de3")
    public java.lang.Integer NettoTotalGB_60(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk disk);

  }
  
  public static class DiskFunctionsImpl implements IDiskFunctionsImpl {

    public static final IDiskFunctionsImpl INSTANCE = new DiskFunctionsImpl();

    private DiskFunctionsImpl() {}

    @Override
    public java.lang.Integer NettoTotalGB_60(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk disk) {
      /* Begin Protected Region [[2d3a91d9-e084-11eb-85ea-9f2d155d4de3]] */
      final Double diskSize = disk.selectCapacityGB() * 0.6;
      return diskSize.intValue();
      /* End Protected Region   [[2d3a91d9-e084-11eb-85ea-9f2d155d4de3]] */
    }

  }
  
  public static class DiskFunctions {

    private DiskFunctions() {}

    public static java.lang.Integer NettoTotalGB_60(final cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.resources.buildingblock.javamodel.IDisk disk) {
      return DynamicResourceUtil.invoke(IDiskFunctionsImpl.class, DiskFunctionsImpl.INSTANCE, disk).NettoTotalGB_60(disk);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0881f535-dff8-11eb-93d3-9f230e4bb32b,UCpxmjXJI246dwx9XEPnby3APf4=] */
