package cleon.architecturemethods.arc42.metamodel.template.checkpoint;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[5a788301-9b0d-11ec-ab52-6fe59505f62a,imports]] */

/* End Protected Region   [[5a788301-9b0d-11ec-ab52-6fe59505f62a,imports]] */

public class add_aE_vlan_aE_group_aE_and_aE_set_aE_hosts__T_txt {

  /* Begin Protected Region [[5a788301-9b0d-11ec-ab52-6fe59505f62a]] */
  
  /* End Protected Region   [[5a788301-9b0d-11ec-ab52-6fe59505f62a]] */


  public static interface IAbstractSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("5a78838d-9b0d-11ec-ab52-6fe59505f62a")
    public List<cleon.architecturemethods.arc42.metamodel.spec._09_concepts.system.network.javamodel.INetworkHostNode> HostNodes(final cleon.architecturemethods.arc42.metamodel.spec._06_runtime_view.system.communication.domain.javamodel.IDomain domain);

  }
  
  public static interface IAbstractSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSiteFunctionsImpl implements IAbstractSiteFunctionsImpl {

    public static final IAbstractSiteFunctionsImpl INSTANCE = new AbstractSiteFunctionsImpl();

    private AbstractSiteFunctionsImpl() {}

  }
  
  public static class AbstractSiteFunctions {

    private AbstractSiteFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,5a788301-9b0d-11ec-ab52-6fe59505f62a,BVd3OQQyQIxlWO1PUT4UtGM2f9I=] */
