package cleon.architecturemethods.systemarc42.metamodel.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[3395ea55-51b3-11ea-a946-13c393300b57,imports]] */

/* End Protected Region   [[3395ea55-51b3-11ea-a946-13c393300b57,imports]] */

public class HostGroups__T_xml {

  /* Begin Protected Region [[3395ea55-51b3-11ea-a946-13c393300b57]] */
  
  /* End Protected Region   [[3395ea55-51b3-11ea-a946-13c393300b57]] */


  public static interface IHostNodeFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("8c3697a5-523a-11ea-b38c-2b48248ef5b9")
    public java.lang.String GroupName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSiteWithHosts abstractSiteWithHosts, final cleon.architecturemethods.systemarc42.metamodel.spec._05_buildingblock_view.javamodel.ISystemConfiguration systemConfiguration, final cleon.modelinglanguages.segmentation.metamodel.spec.javamodel.ISecuritySubZone securitySubZone);

  }
  
  public static interface IHostNodeFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class HostNodeFunctionsImpl implements IHostNodeFunctionsImpl {

    public static final IHostNodeFunctionsImpl INSTANCE = new HostNodeFunctionsImpl();

    private HostNodeFunctionsImpl() {}

  }
  
  public static class HostNodeFunctions {

    private HostNodeFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,3395ea55-51b3-11ea-a946-13c393300b57,oDi6m3iIu1UlgKFmPjCQh7M/m04=] */
