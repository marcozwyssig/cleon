package cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[05e048cb-42b4-11e6-a9d7-97cf4f7c398b,imports]] */

/* End Protected Region   [[05e048cb-42b4-11e6-a9d7-97cf4f7c398b,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[05e048cb-42b4-11e6-a9d7-97cf4f7c398b]] */
  
  /* End Protected Region   [[05e048cb-42b4-11e6-a9d7-97cf4f7c398b]] */


  public static interface ISolutionBuildingBlockComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("05e048cd-42b4-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetId();

  }
  
  public static interface ISolutionBuildingBlockComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("05e048cd-42b4-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetId(final cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent solutionBuildingBlockComponent);

  }
  
  public static class SolutionBuildingBlockComponentFunctionsImpl implements ISolutionBuildingBlockComponentFunctionsImpl {

    public static final ISolutionBuildingBlockComponentFunctionsImpl INSTANCE = new SolutionBuildingBlockComponentFunctionsImpl();

    private SolutionBuildingBlockComponentFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent solutionBuildingBlockComponent) {
      return java.lang.String.format("SBBC-%03d", solutionBuildingBlockComponent.selectIdentifier());
    }

  }
  
  public static class SolutionBuildingBlockComponentFunctions {

    private SolutionBuildingBlockComponentFunctions() {}

    public static java.lang.String GetId(final cleon.architecturemethods.togaf.spec.togaf.solution._05_solutionbuildingblock_view.manufacturer.solutionbuildingblock.solutionbuildingblockcomponent.javamodel.ISolutionBuildingBlockComponent solutionBuildingBlockComponent) {
      return DynamicResourceUtil.invoke(ISolutionBuildingBlockComponentFunctionsImpl.class, SolutionBuildingBlockComponentFunctionsImpl.INSTANCE, solutionBuildingBlockComponent).GetId(solutionBuildingBlockComponent);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,05e048cb-42b4-11e6-a9d7-97cf4f7c398b,FFFRTCDAzpc+hriwTejy+9MVfXQ=] */
