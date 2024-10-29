package cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[e2175e18-42b3-11e6-a9d7-97cf4f7c398b,imports]] */

/* End Protected Region   [[e2175e18-42b3-11e6-a9d7-97cf4f7c398b,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[e2175e18-42b3-11e6-a9d7-97cf4f7c398b]] */
  
  /* End Protected Region   [[e2175e18-42b3-11e6-a9d7-97cf4f7c398b]] */


  public static interface ISolutionBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e217852a-42b3-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetId();

  }
  
  public static interface ISolutionBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e217852a-42b3-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetId(final cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock solutionBuildingBlock);

  }
  
  public static class SolutionBuildingBlockFunctionsImpl implements ISolutionBuildingBlockFunctionsImpl {

    public static final ISolutionBuildingBlockFunctionsImpl INSTANCE = new SolutionBuildingBlockFunctionsImpl();

    private SolutionBuildingBlockFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock solutionBuildingBlock) {
      return java.lang.String.format("SBB-%03d", solutionBuildingBlock.selectIdentifier());
    }

  }
  
  public static class SolutionBuildingBlockFunctions {

    private SolutionBuildingBlockFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.togaf.metamodel.spec.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.javamodel.ISolutionBuildingBlock solutionBuildingBlock) {
      return DynamicResourceUtil.invoke(ISolutionBuildingBlockFunctionsImpl.class, SolutionBuildingBlockFunctionsImpl.INSTANCE, solutionBuildingBlock).GetId(solutionBuildingBlock);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,e2175e18-42b3-11e6-a9d7-97cf4f7c398b,dmmtcLk2f5XQx3MqEmIkB78khzQ=] */
