package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.linux.lin_polycom_git;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[032c61ad-ba52-11f0-9349-73cfbb54b949,imports]] */

/* End Protected Region   [[032c61ad-ba52-11f0-9349-73cfbb54b949,imports]] */

public class FunctionSpace_Lin_Polycom_Git {

  /* Begin Protected Region [[032c61ad-ba52-11f0-9349-73cfbb54b949]] */
  
  /* End Protected Region   [[032c61ad-ba52-11f0-9349-73cfbb54b949]] */


  public static interface IGitLabFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0d7485e6-ba52-11f0-9349-73cfbb54b949")
    public java.lang.String external_url();

  }
  
  public static interface IGitLabFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class GitLabFunctionsImpl implements IGitLabFunctionsImpl {

    public static final IGitLabFunctionsImpl INSTANCE = new GitLabFunctionsImpl();

    private GitLabFunctionsImpl() {}

  }
  
  public static class GitLabFunctions {

    private GitLabFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,032c61ad-ba52-11f0-9349-73cfbb54b949,bd8ODXtIZjAKY/rkoXIcyjsBLPs=] */
