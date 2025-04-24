package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_inst_software;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0fd7675e-1131-11f0-a4f9-b5f995a9e0fe,imports]] */

/* End Protected Region   [[0fd7675e-1131-11f0-a4f9-b5f995a9e0fe,imports]] */

public class FunctionSpace_Inst_Software {

  /* Begin Protected Region [[0fd7675e-1131-11f0-a4f9-b5f995a9e0fe]] */
  
  /* End Protected Region   [[0fd7675e-1131-11f0-a4f9-b5f995a9e0fe]] */


  public static interface ISoftwarePackageFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("17a00cac-1131-11f0-a4f9-b5f995a9e0fe")
    public java.lang.String FullPath();

  }
  
  public static interface ISoftwarePackageFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class SoftwarePackageFunctionsImpl implements ISoftwarePackageFunctionsImpl {

    public static final ISoftwarePackageFunctionsImpl INSTANCE = new SoftwarePackageFunctionsImpl();

    private SoftwarePackageFunctionsImpl() {}

  }
  
  public static class SoftwarePackageFunctions {

    private SoftwarePackageFunctions() {}

  }

  public static interface IAbstractCopyFileFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("dd5229fd-1b6d-11f0-9c3a-8502b2fb88fb")
    public java.lang.String Source();

    @IDynamicResourceExtension.MethodId("00cf18cf-1b6e-11f0-9c3a-8502b2fb88fb")
    public java.lang.String Ensure();

  }
  
  public static interface IAbstractCopyFileFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractCopyFileFunctionsImpl implements IAbstractCopyFileFunctionsImpl {

    public static final IAbstractCopyFileFunctionsImpl INSTANCE = new AbstractCopyFileFunctionsImpl();

    private AbstractCopyFileFunctionsImpl() {}

  }
  
  public static class AbstractCopyFileFunctions {

    private AbstractCopyFileFunctions() {}

  }

  public static interface ICopyFileFromNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("17966d30-1b60-11f0-9c3a-8502b2fb88fb")
    public java.lang.String FullPath();

    @IDynamicResourceExtension.MethodId("06403986-1b6e-11f0-9c3a-8502b2fb88fb")
    public java.lang.String Source();

    @IDynamicResourceExtension.MethodId("208031f8-1b6e-11f0-9c3a-8502b2fb88fb")
    public java.lang.String Ensure();

  }
  
  public static interface ICopyFileFromNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CopyFileFromNetworkFunctionsImpl implements ICopyFileFromNetworkFunctionsImpl {

    public static final ICopyFileFromNetworkFunctionsImpl INSTANCE = new CopyFileFromNetworkFunctionsImpl();

    private CopyFileFromNetworkFunctionsImpl() {}

  }
  
  public static class CopyFileFromNetworkFunctions {

    private CopyFileFromNetworkFunctions() {}

  }

  public static interface ICopyFileFromPuppetFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0cbfbc57-1b6e-11f0-9c3a-8502b2fb88fb")
    public java.lang.String Source();

    @IDynamicResourceExtension.MethodId("3b1c05de-1b6e-11f0-9c3a-8502b2fb88fb")
    public java.lang.String Ensure();

  }
  
  public static interface ICopyFileFromPuppetFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CopyFileFromPuppetFunctionsImpl implements ICopyFileFromPuppetFunctionsImpl {

    public static final ICopyFileFromPuppetFunctionsImpl INSTANCE = new CopyFileFromPuppetFunctionsImpl();

    private CopyFileFromPuppetFunctionsImpl() {}

  }
  
  public static class CopyFileFromPuppetFunctions {

    private CopyFileFromPuppetFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0fd7675e-1131-11f0-a4f9-b5f995a9e0fe,SAT1xz1wFkgtOMmFROG+6scPoNA=] */
