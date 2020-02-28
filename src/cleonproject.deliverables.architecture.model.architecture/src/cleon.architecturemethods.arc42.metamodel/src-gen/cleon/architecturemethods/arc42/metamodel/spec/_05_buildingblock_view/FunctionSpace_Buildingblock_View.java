package cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f8000224-437a-11e6-a9d7-97cf4f7c398b,imports]] */
import cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.BuildingBlockView;;
/* End Protected Region   [[f8000224-437a-11e6-a9d7-97cf4f7c398b,imports]] */

public class FunctionSpace_Buildingblock_View {

  /* Begin Protected Region [[f8000224-437a-11e6-a9d7-97cf4f7c398b]] */
  
  /* End Protected Region   [[f8000224-437a-11e6-a9d7-97cf4f7c398b]] */


  public static interface IBuildingBlockViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fc6a39f7-437a-11e6-a9d7-97cf4f7c398b")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IAbstractRootSystem GetSystem();

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

  public static interface ILevelFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e945b5c3-d187-11e8-b18f-df1540bb7a5c")
    public java.lang.String GetLevelNr();

    @IDynamicResourceExtension.MethodId("043e0c3c-ee36-11e8-9756-27a593be2ffb")
    public cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.IBuildingBlockView GetBuildingBlockView();

  }
  
  public static interface ILevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e945b5c3-d187-11e8-b18f-df1540bb7a5c")
    public java.lang.String GetLevelNr(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel level);

  }
  
  public static class LevelFunctionsImpl implements ILevelFunctionsImpl {

    public static final ILevelFunctionsImpl INSTANCE = new LevelFunctionsImpl();

    private LevelFunctionsImpl() {}

    @Override
    public java.lang.String GetLevelNr(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel level) {
      /* Begin Protected Region [[e945b5c3-d187-11e8-b18f-df1540bb7a5c]] */
    	if( level == null)
    		return "";
    	
    	if( BuildingBlockView.selectToMeLevel_1(level) != null)
    		return "1";

    	if( BuildingBlockView.selectToMeLevel_2(level) != null)
    		return "2";

    	if( BuildingBlockView.selectToMeLevel_3(level) != null)
    		return "3";

    	if( BuildingBlockView.selectToMeLevel_4(level) != null)
    		return "4";

    	if( BuildingBlockView.selectToMeLevel_5(level) != null)
    		return "5";
    	
    	return "";
      /* End Protected Region   [[e945b5c3-d187-11e8-b18f-df1540bb7a5c]] */
    }

  }
  
  public static class LevelFunctions {

    private LevelFunctions() {}

    public static java.lang.String GetLevelNr(final cleon.architecturemethods.arc42.metamodel.spec._05_buildingblock_view.javamodel.ILevel level) {
      return DynamicResourceUtil.invoke(ILevelFunctionsImpl.class, LevelFunctionsImpl.INSTANCE, level).GetLevelNr(level);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f8000224-437a-11e6-a9d7-97cf4f7c398b,wkx4fF6I0RIpMBZO5m8KuaIwB5Q=] */
