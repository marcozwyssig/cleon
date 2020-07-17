package cleon.architecturemethods.systemarc42.metamodel.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0355721a-9667-11e9-8b76-c3d78b95c27c,imports]] */

/* End Protected Region   [[0355721a-9667-11e9-8b76-c3d78b95c27c,imports]] */

public class Zones__T_xml {

  /* Begin Protected Region [[0355721a-9667-11e9-8b76-c3d78b95c27c]] */
  
  /* End Protected Region   [[0355721a-9667-11e9-8b76-c3d78b95c27c]] */


  public static interface ISecuritySubZoneFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e98a77ff-c856-11ea-b1f9-8da009c98a7a")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration> UsedInSystemConfiguration();

  }
  
  public static interface ISecuritySubZoneFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SecuritySubZoneFunctionsImpl implements ISecuritySubZoneFunctionsImpl {

    public static final ISecuritySubZoneFunctionsImpl INSTANCE = new SecuritySubZoneFunctionsImpl();

    private SecuritySubZoneFunctionsImpl() {}

  }
  
  public static class SecuritySubZoneFunctions {

    private SecuritySubZoneFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0355721a-9667-11e9-8b76-c3d78b95c27c,jwru6KOof1kPzVOLR21HvMligmg=] */
