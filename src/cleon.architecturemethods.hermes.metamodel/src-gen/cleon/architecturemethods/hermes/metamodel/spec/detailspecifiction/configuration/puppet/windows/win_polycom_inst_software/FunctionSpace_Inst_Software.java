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

  public static interface ILocalFileFromNetworkFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("17966d30-1b60-11f0-9c3a-8502b2fb88fb")
    public java.lang.String FullPath();

    @IDynamicResourceExtension.MethodId("06403986-1b6e-11f0-9c3a-8502b2fb88fb")
    public java.lang.String Source();

    @IDynamicResourceExtension.MethodId("208031f8-1b6e-11f0-9c3a-8502b2fb88fb")
    public java.lang.String Ensure();

  }
  
  public static interface ILocalFileFromNetworkFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalFileFromNetworkFunctionsImpl implements ILocalFileFromNetworkFunctionsImpl {

    public static final ILocalFileFromNetworkFunctionsImpl INSTANCE = new LocalFileFromNetworkFunctionsImpl();

    private LocalFileFromNetworkFunctionsImpl() {}

  }
  
  public static class LocalFileFromNetworkFunctions {

    private LocalFileFromNetworkFunctions() {}

  }

  public static interface ILocalFileFromPuppetFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0cbfbc57-1b6e-11f0-9c3a-8502b2fb88fb")
    public java.lang.String Source();

    @IDynamicResourceExtension.MethodId("3b1c05de-1b6e-11f0-9c3a-8502b2fb88fb")
    public java.lang.String Ensure();

  }
  
  public static interface ILocalFileFromPuppetFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class LocalFileFromPuppetFunctionsImpl implements ILocalFileFromPuppetFunctionsImpl {

    public static final ILocalFileFromPuppetFunctionsImpl INSTANCE = new LocalFileFromPuppetFunctionsImpl();

    private LocalFileFromPuppetFunctionsImpl() {}

  }
  
  public static class LocalFileFromPuppetFunctions {

    private LocalFileFromPuppetFunctions() {}

  }

  public static interface IShortcutFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("d7606d3e-ba31-11f0-9349-73cfbb54b949")
    public java.lang.String TargetFullPath();

  }
  
  public static interface IShortcutFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ShortcutFunctionsImpl implements IShortcutFunctionsImpl {

    public static final IShortcutFunctionsImpl INSTANCE = new ShortcutFunctionsImpl();

    private ShortcutFunctionsImpl() {}

  }
  
  public static class ShortcutFunctions {

    private ShortcutFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0fd7675e-1131-11f0-a4f9-b5f995a9e0fe,x7Rk0jBfmgoi3Xsu0KfgCqYZHnA=] */
