package cleon.operationalmethods.hermes.metamodel.spec.operational_manual.about;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[b569c1c9-1b3e-11e9-9c51-69666a8f1cf8,imports]] */

/* End Protected Region   [[b569c1c9-1b3e-11e9-9c51-69666a8f1cf8,imports]] */

public class FunctionSpace_Reference {

  /* Begin Protected Region [[b569c1c9-1b3e-11e9-9c51-69666a8f1cf8]] */
  
  /* End Protected Region   [[b569c1c9-1b3e-11e9-9c51-69666a8f1cf8]] */


  public static interface IInstallationmanualReferenceFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("c7c3a2af-1b3e-11e9-9c51-69666a8f1cf8")
    public java.lang.String GetName();

    @IDynamicResourceExtension.MethodId("041bf710-1f54-11ef-9692-a96c1fbdfab3")
    public java.lang.String GetNameWithUnderscore();

    @IDynamicResourceExtension.MethodId("95e426f1-1bf7-11e9-9d15-bdc420ac8f00")
    public java.lang.String GetFullName();

    @IDynamicResourceExtension.MethodId("8af15859-1bf9-11e9-8154-ebde4c10ca97")
    public java.lang.String GetSimpleName();

    @IDynamicResourceExtension.MethodId("cd198911-1bf9-11e9-8154-ebde4c10ca97")
    public ch.actifsource.core.javamodel.INamedResource GetSystemConfiguration();

    @IDynamicResourceExtension.MethodId("db8dcc41-e542-11ef-9a39-afe0dbb3ceb9")
    public java.lang.String GetDescription();

  }
  
  public static interface IInstallationmanualReferenceFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class InstallationmanualReferenceFunctionsImpl implements IInstallationmanualReferenceFunctionsImpl {

    public static final IInstallationmanualReferenceFunctionsImpl INSTANCE = new InstallationmanualReferenceFunctionsImpl();

    private InstallationmanualReferenceFunctionsImpl() {}

  }
  
  public static class InstallationmanualReferenceFunctions {

    private InstallationmanualReferenceFunctions() {}

  }

  public static interface IReferencesFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("eea3df72-1b3e-11e9-9c51-69666a8f1cf8")
    public List<ch.actifsource.core.javamodel.IResource> ReferenceOrder();

  }
  
  public static interface IReferencesFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ReferencesFunctionsImpl implements IReferencesFunctionsImpl {

    public static final IReferencesFunctionsImpl INSTANCE = new ReferencesFunctionsImpl();

    private ReferencesFunctionsImpl() {}

  }
  
  public static class ReferencesFunctions {

    private ReferencesFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,b569c1c9-1b3e-11e9-9c51-69666a8f1cf8,FwsK2U6dT2rJGvb1L+b01R10jfM=] */
