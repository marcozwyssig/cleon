package cleon.collaboration.sample.togaf.reference._05_architecturebuildingblock_view.architecturelayerbuildingblock.architecturebuildingblock;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[690f0503-42b3-11e6-a9d7-97cf4f7c398b,imports]] */

/* End Protected Region   [[690f0503-42b3-11e6-a9d7-97cf4f7c398b,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[690f0503-42b3-11e6-a9d7-97cf4f7c398b]] */
  
  /* End Protected Region   [[690f0503-42b3-11e6-a9d7-97cf4f7c398b]] */


  public static interface IArchitectureBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("89455437-42b3-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetId();

  }
  
  public static interface IArchitectureBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("89455437-42b3-11e6-a9d7-97cf4f7c398b")
    public java.lang.String GetId(final cleon.common.resources.spec.resources.id.javamodel.IBusinessObjectId architectureBuildingBlock);

  }
  
  public static class ArchitectureBuildingBlockFunctionsImpl implements IArchitectureBuildingBlockFunctionsImpl {

    public static final IArchitectureBuildingBlockFunctionsImpl INSTANCE = new ArchitectureBuildingBlockFunctionsImpl();

    private ArchitectureBuildingBlockFunctionsImpl() {}

    @Override
    public java.lang.String GetId(final cleon.common.resources.spec.resources.id.javamodel.IBusinessObjectId architectureBuildingBlock) {
      return java.lang.String.format("ABB-%03d", architectureBuildingBlock.selectIdentifier());
    }

  }
  
  public static class ArchitectureBuildingBlockFunctions {

    private ArchitectureBuildingBlockFunctions() {}

    public static java.lang.String GetId(final cleon.common.resources.spec.resources.id.javamodel.IBusinessObjectId architectureBuildingBlock) {
      return DynamicResourceUtil.invoke(IArchitectureBuildingBlockFunctionsImpl.class, ArchitectureBuildingBlockFunctionsImpl.INSTANCE, architectureBuildingBlock).GetId(architectureBuildingBlock);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,690f0503-42b3-11e6-a9d7-97cf4f7c398b,RPOgxOCU/2mNxp8IajeFJLvQZOY=] */
