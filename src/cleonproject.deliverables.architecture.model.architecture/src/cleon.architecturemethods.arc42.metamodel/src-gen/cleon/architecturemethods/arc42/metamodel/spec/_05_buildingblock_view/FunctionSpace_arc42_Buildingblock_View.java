package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f8000224-437a-11e6-a9d7-97cf4f7c398b,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox;

/* End Protected Region   [[f8000224-437a-11e6-a9d7-97cf4f7c398b,imports]] */

public class FunctionSpace_arc42_Buildingblock_View {

  /* Begin Protected Region [[f8000224-437a-11e6-a9d7-97cf4f7c398b]] */

  /* End Protected Region   [[f8000224-437a-11e6-a9d7-97cf4f7c398b]] */


  public static interface IBuildingBlockViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fc6a39f7-437a-11e6-a9d7-97cf4f7c398b")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem GetSystem();

    @IDynamicResourceExtension.MethodId("0726680c-83dd-11ea-bd03-8dee7901cd7f")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock> Level1();

  }
  
  public static interface IBuildingBlockViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockViewFunctionsImpl implements IBuildingBlockViewFunctionsImpl {

    public static final IBuildingBlockViewFunctionsImpl INSTANCE = new BuildingBlockViewFunctionsImpl();

    private BuildingBlockViewFunctionsImpl() {}

  }
  
  public static class BuildingBlockViewFunctions {

    private BuildingBlockViewFunctions() {}

  }

  public static interface IBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("604b9cc2-2b56-11e8-859c-c3075307fbcf")
    public cleon.common.modularity.metamodel.spec.javamodel.IBuildingBlock RootSystem();

    @IDynamicResourceExtension.MethodId("d366c3ba-3ec8-11ea-9af7-ad5bf30c585a")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42Document();

    @IDynamicResourceExtension.MethodId("b1271087-3ec8-11ea-9af7-ad5bf30c585a")
    public cleon.projectmethods.hermes.metamodel.spec.modules.projectmanagement.planning.scope.deliverable.javamodel.IDeliverableAware arc42DocumentFromRootOrExternal();

  }
  
  public static interface IBuildingBlockFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BuildingBlockFunctionsImpl implements IBuildingBlockFunctionsImpl {

    public static final IBuildingBlockFunctionsImpl INSTANCE = new BuildingBlockFunctionsImpl();

    private BuildingBlockFunctionsImpl() {}

  }
  
  public static class BuildingBlockFunctions {

    private BuildingBlockFunctions() {}

  }

  public static interface IWhiteboxFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e945b5c3-d187-11e8-b18f-df1540bb7a5c")
    public java.lang.Integer GetLevelNr();

    @IDynamicResourceExtension.MethodId("043e0c3c-ee36-11e8-9756-27a593be2ffb")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView GetBuildingBlockView();

    @IDynamicResourceExtension.MethodId("71cf2aa5-6dbd-11ea-98d4-4d756e6b7091")
    public java.lang.String Name();

    @IDynamicResourceExtension.MethodId("198fb09a-d56d-11ea-9bae-37ef2cb951a8")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox ParentWhiteBox();

  }
  
  public static interface IWhiteboxFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e945b5c3-d187-11e8-b18f-df1540bb7a5c")
    public java.lang.Integer GetLevelNr(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox whitebox);

  }
  
  public static class WhiteboxFunctionsImpl implements IWhiteboxFunctionsImpl {

    public static final IWhiteboxFunctionsImpl INSTANCE = new WhiteboxFunctionsImpl();

    private WhiteboxFunctionsImpl() {}

    @Override
    public java.lang.Integer GetLevelNr(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox whitebox) {
      /* Begin Protected Region [[e945b5c3-d187-11e8-b18f-df1540bb7a5c]] */
      if (whitebox == null) {
      	return null;
      }

      final IWhiteboxFunctions whiteboxFunctions = whitebox.extension(IWhiteboxFunctions.class);
      final IWhitebox parent = whiteboxFunctions.ParentWhiteBox();
      if (parent == null) {
      	return 1;
      } else {
      	final IWhiteboxFunctions parentWhiteboxFunctions = parent.extension(IWhiteboxFunctions.class);
      	return parentWhiteboxFunctions.GetLevelNr() + 1;
      }
      /* End Protected Region   [[e945b5c3-d187-11e8-b18f-df1540bb7a5c]] */
    }

  }
  
  public static class WhiteboxFunctions {

    private WhiteboxFunctions() {}

    public static java.lang.Integer GetLevelNr(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IWhitebox whitebox) {
      return DynamicResourceUtil.invoke(IWhiteboxFunctionsImpl.class, WhiteboxFunctionsImpl.INSTANCE, whitebox).GetLevelNr(whitebox);
    }

  }

  public static interface IBlackboxFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("78f21b45-0207-11e9-9c9d-8d52d6745026")
    public List<cleon.common.modularity.metamodel.spec.javamodel.IDependency> HasDependencies();

    @IDynamicResourceExtension.MethodId("fdd666c9-6dbb-11ea-98d4-4d756e6b7091")
    public java.lang.String Name();

  }
  
  public static interface IBlackboxFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class BlackboxFunctionsImpl implements IBlackboxFunctionsImpl {

    public static final IBlackboxFunctionsImpl INSTANCE = new BlackboxFunctionsImpl();

    private BlackboxFunctionsImpl() {}

  }
  
  public static class BlackboxFunctions {

    private BlackboxFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f8000224-437a-11e6-a9d7-97cf4f7c398b,UcwJJCqb/gm7tpYs2c6ZAbrcjIo=] */
