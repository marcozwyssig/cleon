package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[39a2b94c-07f6-11f0-bc12-1bbda1d7028e,imports]] */

/* End Protected Region   [[39a2b94c-07f6-11f0-bc12-1bbda1d7028e,imports]] */

public class FunctionSpace_win_polycom_manage_netdrives {

  /* Begin Protected Region [[39a2b94c-07f6-11f0-bc12-1bbda1d7028e]] */
  
  /* End Protected Region   [[39a2b94c-07f6-11f0-bc12-1bbda1d7028e]] */


  public static interface IAbstractShareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("f752694f-0804-11f0-8081-eb3f9417daa7")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IShares Parent();

  }
  
  public static interface IAbstractShareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractShareFunctionsImpl implements IAbstractShareFunctionsImpl {

    public static final IAbstractShareFunctionsImpl INSTANCE = new AbstractShareFunctionsImpl();

    private AbstractShareFunctionsImpl() {}

  }
  
  public static class AbstractShareFunctions {

    private AbstractShareFunctions() {}

  }

  public static interface INSShareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("404ca810-07f6-11f0-bc12-1bbda1d7028e")
    public java.lang.String ShareName();

  }
  
  public static interface INSShareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class NSShareFunctionsImpl implements INSShareFunctionsImpl {

    public static final INSShareFunctionsImpl INSTANCE = new NSShareFunctionsImpl();

    private NSShareFunctionsImpl() {}

  }
  
  public static class NSShareFunctions {

    private NSShareFunctions() {}

  }

  public static interface IShareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("46ce8d33-07fc-11f0-bc12-1bbda1d7028e")
    public java.lang.String Path();

    @IDynamicResourceExtension.MethodId("fd70e0fd-0804-11f0-8081-eb3f9417daa7")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IShares Parent();

  }
  
  public static interface IShareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ShareFunctionsImpl implements IShareFunctionsImpl {

    public static final IShareFunctionsImpl INSTANCE = new ShareFunctionsImpl();

    private ShareFunctionsImpl() {}

  }
  
  public static class ShareFunctions {

    private ShareFunctions() {}

  }

  public static interface IDfsRootShareFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("10509379-0805-11f0-8081-eb3f9417daa7")
    public cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_manage_netdrives.javamodel.IShares Parent();

    @IDynamicResourceExtension.MethodId("38d4dceb-0808-11f0-8081-eb3f9417daa7")
    public java.lang.String Path();

  }
  
  public static interface IDfsRootShareFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class DfsRootShareFunctionsImpl implements IDfsRootShareFunctionsImpl {

    public static final IDfsRootShareFunctionsImpl INSTANCE = new DfsRootShareFunctionsImpl();

    private DfsRootShareFunctionsImpl() {}

  }
  
  public static class DfsRootShareFunctions {

    private DfsRootShareFunctions() {}

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,39a2b94c-07f6-11f0-bc12-1bbda1d7028e,XoumU07ehCcJbID9bZxTgG+/Sjg=] */
