package cleon.architecturemethods.arc42.metamodel.template.checkpoint;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[6c649df8-9e8a-11ea-9f3e-ed1c2e923327,imports]] */

/* End Protected Region   [[6c649df8-9e8a-11ea-9f3e-ed1c2e923327,imports]] */

public class add_aE_hosts__T_txt {

  /* Begin Protected Region [[6c649df8-9e8a-11ea-9f3e-ed1c2e923327]] */
  
  /* End Protected Region   [[6c649df8-9e8a-11ea-9f3e-ed1c2e923327]] */


  public static interface IAbstractSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fbc21a57-9b0b-11ec-ab52-6fe59505f62a")
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

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,6c649df8-9e8a-11ea-9f3e-ed1c2e923327,Fwd+EwlPUyVw+XJtKkE5ajVb2Zg=] */
