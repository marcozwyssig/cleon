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

  public static interface ICopyFileFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("17966d30-1b60-11f0-9c3a-8502b2fb88fb")
    public java.lang.String FullPath();

  }
  
  public static interface ICopyFileFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class CopyFileFunctionsImpl implements ICopyFileFunctionsImpl {

    public static final ICopyFileFunctionsImpl INSTANCE = new CopyFileFunctionsImpl();

    private CopyFileFunctionsImpl() {}

  }
  
  public static class CopyFileFunctions {

    private CopyFileFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0fd7675e-1131-11f0-a4f9-b5f995a9e0fe,QTEg99tdsnGQ3zfX8pzZ0Eggwhg=] */
