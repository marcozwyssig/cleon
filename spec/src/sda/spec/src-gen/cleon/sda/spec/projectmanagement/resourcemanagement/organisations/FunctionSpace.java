package cleon.sda.spec.projectmanagement.resourcemanagement.organisations;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[d45dab5c-c769-11e5-b3f9-43c5a0896ea1,imports]] */

/* End Protected Region   [[d45dab5c-c769-11e5-b3f9-43c5a0896ea1,imports]] */

public class FunctionSpace {

  /* Begin Protected Region [[d45dab5c-c769-11e5-b3f9-43c5a0896ea1]] */
  
  /* End Protected Region   [[d45dab5c-c769-11e5-b3f9-43c5a0896ea1]] */


  public static interface IOrganisationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("e2e17d9c-c769-11e5-b3f9-43c5a0896ea1")
    public java.lang.String GetName();

  }
  
  public static interface IOrganisationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class OrganisationFunctionsImpl implements IOrganisationFunctionsImpl {

    public static final IOrganisationFunctionsImpl INSTANCE = new OrganisationFunctionsImpl();

    private OrganisationFunctionsImpl() {}

  }
  
  public static class OrganisationFunctions {

    private OrganisationFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,d45dab5c-c769-11e5-b3f9-43c5a0896ea1,BCuuQGb5k+2b4ChK9II4jlPyw7I=] */
