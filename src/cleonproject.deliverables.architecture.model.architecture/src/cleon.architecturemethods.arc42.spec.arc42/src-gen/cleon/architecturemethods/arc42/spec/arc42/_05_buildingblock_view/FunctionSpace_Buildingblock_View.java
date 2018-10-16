package cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f8000224-437a-11e6-a9d7-97cf4f7c398b,imports]] */
import cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.__V_5_aE_BuildingBlockView;
/* End Protected Region   [[f8000224-437a-11e6-a9d7-97cf4f7c398b,imports]] */

public class FunctionSpace_Buildingblock_View {

  /* Begin Protected Region [[f8000224-437a-11e6-a9d7-97cf4f7c398b]] */
  
  /* End Protected Region   [[f8000224-437a-11e6-a9d7-97cf4f7c398b]] */


  public static interface I__V_5_aE_BuildingBlockViewFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fc6a39f7-437a-11e6-a9d7-97cf4f7c398b")
    public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem GetSystem();

  }
  
  public static interface I__V_5_aE_BuildingBlockViewFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class __V_5_aE_BuildingBlockViewFunctionsImpl implements I__V_5_aE_BuildingBlockViewFunctionsImpl {

    public static final I__V_5_aE_BuildingBlockViewFunctionsImpl INSTANCE = new __V_5_aE_BuildingBlockViewFunctionsImpl();

    private __V_5_aE_BuildingBlockViewFunctionsImpl() {}

  }
  
  public static class __V_5_aE_BuildingBlockViewFunctions {

    private __V_5_aE_BuildingBlockViewFunctions() {}

  }

  public static interface IBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("604b9cc2-2b56-11e8-859c-c3075307fbcf")
    public cleon.architecturemethods.arc42.spec.arc42._03_system_scope_and_context.javamodel.ISystem GetSystem();

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

  }
  
  public static interface ILevelFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("e945b5c3-d187-11e8-b18f-df1540bb7a5c")
    public java.lang.String GetLevelNr(final cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel level);

  }
  
  public static class LevelFunctionsImpl implements ILevelFunctionsImpl {

    public static final ILevelFunctionsImpl INSTANCE = new LevelFunctionsImpl();

    private LevelFunctionsImpl() {}

    @Override
    public java.lang.String GetLevelNr(final cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel level) {
      /* Begin Protected Region [[e945b5c3-d187-11e8-b18f-df1540bb7a5c]] */
    	if( __V_5_aE_BuildingBlockView.selectToMeLevel_1(level) != null)
    		return "1";

    	if( __V_5_aE_BuildingBlockView.selectToMeLevel_2(level) != null)
    		return "2";

    	if( __V_5_aE_BuildingBlockView.selectToMeLevel_3(level) != null)
    		return "3";

    	if( __V_5_aE_BuildingBlockView.selectToMeLevel_4(level) != null)
    		return "4";

    	if( __V_5_aE_BuildingBlockView.selectToMeLevel_5(level) != null)
    		return "5";
    	
    	return "";
      /* End Protected Region   [[e945b5c3-d187-11e8-b18f-df1540bb7a5c]] */
    }

  }
  
  public static class LevelFunctions {

    private LevelFunctions() {}

    public static java.lang.String GetLevelNr(final cleon.architecturemethods.arc42.spec.arc42._05_buildingblock_view.javamodel.ILevel level) {
      return DynamicResourceUtil.invoke(ILevelFunctionsImpl.class, LevelFunctionsImpl.INSTANCE, level).GetLevelNr(level);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f8000224-437a-11e6-a9d7-97cf4f7c398b,za/wO9gSXmAfApa+m7QehyUvQwI=] */
