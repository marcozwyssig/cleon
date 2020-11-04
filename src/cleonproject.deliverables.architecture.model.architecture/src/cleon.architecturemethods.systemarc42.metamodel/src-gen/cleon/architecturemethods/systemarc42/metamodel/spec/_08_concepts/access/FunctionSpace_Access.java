package cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.access;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[cffe4329-19c9-11eb-8585-65084a06c07f,imports]] */

/* End Protected Region   [[cffe4329-19c9-11eb-8585-65084a06c07f,imports]] */

public class FunctionSpace_Access {

  /* Begin Protected Region [[cffe4329-19c9-11eb-8585-65084a06c07f]] */
  
  /* End Protected Region   [[cffe4329-19c9-11eb-8585-65084a06c07f]] */


  public static interface ISystemConfigurationAccessFromFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f3bc8050-19c9-11eb-8585-65084a06c07f")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._06_runtime_view.communication.javamodel.ISource> Sources();

  }
  
  public static interface ISystemConfigurationAccessFromFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationAccessFromFunctionsImpl implements ISystemConfigurationAccessFromFunctionsImpl {

    public static final ISystemConfigurationAccessFromFunctionsImpl INSTANCE = new SystemConfigurationAccessFromFunctionsImpl();

    private SystemConfigurationAccessFromFunctionsImpl() {}

  }
  
  public static class SystemConfigurationAccessFromFunctions {

    private SystemConfigurationAccessFromFunctions() {}

  }

  public static interface IAccessConceptFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f5637eb3-1e99-11eb-9eef-0dadb2b460da")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> AllCommunicationServices();

  }
  
  public static interface IAccessConceptFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AccessConceptFunctionsImpl implements IAccessConceptFunctionsImpl {

    public static final IAccessConceptFunctionsImpl INSTANCE = new AccessConceptFunctionsImpl();

    private AccessConceptFunctionsImpl() {}

  }
  
  public static class AccessConceptFunctions {

    private AccessConceptFunctions() {}

  }

  public static interface ISystemConfigurationAccessToFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("1fa9ea98-1e9d-11eb-9eef-0dadb2b460da")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.services.javamodel.IPortService> AllCommunicationServices();

  }
  
  public static interface ISystemConfigurationAccessToFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SystemConfigurationAccessToFunctionsImpl implements ISystemConfigurationAccessToFunctionsImpl {

    public static final ISystemConfigurationAccessToFunctionsImpl INSTANCE = new SystemConfigurationAccessToFunctionsImpl();

    private SystemConfigurationAccessToFunctionsImpl() {}

  }
  
  public static class SystemConfigurationAccessToFunctions {

    private SystemConfigurationAccessToFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,cffe4329-19c9-11eb-8585-65084a06c07f,E36l4xTyuRv+GM1ig6xndViAA1Y=] */
