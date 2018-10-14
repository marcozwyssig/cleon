package cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b67048fe-42b3-11e6-a9d7-97cf4f7c398b,imports]] */

/* End Protected Region   [[b67048fe-42b3-11e6-a9d7-97cf4f7c398b,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[b67048fe-42b3-11e6-a9d7-97cf4f7c398b]] */
  
  /* End Protected Region   [[b67048fe-42b3-11e6-a9d7-97cf4f7c398b]] */


  public static interface IArchitectureSolutionBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("b6704900-42b3-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetId();

  }
  
  public static interface IArchitectureSolutionBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("b6704900-42b3-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetId(final cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlock architectureSolutionBuildingBlock);

  }
  
  public static class ArchitectureSolutionBuildingBlockFunctionsImpl implements IArchitectureSolutionBuildingBlockFunctionsImpl {

    public static final IArchitectureSolutionBuildingBlockFunctionsImpl INSTANCE = new ArchitectureSolutionBuildingBlockFunctionsImpl();

    private ArchitectureSolutionBuildingBlockFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlock architectureSolutionBuildingBlock) {
      return java.lang.String.format("ASBB-%03d", architectureSolutionBuildingBlock.selectIdentifier());
    }

  }
  
  public static class ArchitectureSolutionBuildingBlockFunctions {

    private ArchitectureSolutionBuildingBlockFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.togaf.spec.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock.architecturesolutionbuildingblock.javamodel.IArchitectureSolutionBuildingBlock architectureSolutionBuildingBlock) {
      return DynamicResourceUtil.invoke(IArchitectureSolutionBuildingBlockFunctionsImpl.class, ArchitectureSolutionBuildingBlockFunctionsImpl.INSTANCE, architectureSolutionBuildingBlock).GetId(architectureSolutionBuildingBlock);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b67048fe-42b3-11e6-a9d7-97cf4f7c398b,8u2opJ2tIRnHZDU1HcVWqUI2Jw8=] */
