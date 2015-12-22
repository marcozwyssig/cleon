package cleon.arc42.spec._05_buildingblockview;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[3aea3d68-44bf-11e5-93ef-c50f9659357a,imports]] */

/* End Protected Region   [[3aea3d68-44bf-11e5-93ef-c50f9659357a,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[3aea3d68-44bf-11e5-93ef-c50f9659357a]] */
  
  /* End Protected Region   [[3aea3d68-44bf-11e5-93ef-c50f9659357a]] */


  public static interface IBuildingBlockFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("4713cc2d-44bf-11e5-93ef-c50f9659357a")
    public List<cleon.arc42.spec._05_buildingblockview.javamodel.IBuildingBlock> GetParent();

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

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,3aea3d68-44bf-11e5-93ef-c50f9659357a,i2EVF73ruowo3oyCsIOKnR2Cx8o=] */
