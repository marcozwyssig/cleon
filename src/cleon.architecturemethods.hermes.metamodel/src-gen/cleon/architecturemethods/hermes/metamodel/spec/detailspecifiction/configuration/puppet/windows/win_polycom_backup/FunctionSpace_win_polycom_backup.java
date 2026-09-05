package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[0a84893c-631b-11f0-8f89-fba3b99d3616,imports]] */

/* End Protected Region   [[0a84893c-631b-11f0-8f89-fba3b99d3616,imports]] */

public class FunctionSpace_win_polycom_backup {

  /* Begin Protected Region [[0a84893c-631b-11f0-8f89-fba3b99d3616]] */
  
  /* End Protected Region   [[0a84893c-631b-11f0-8f89-fba3b99d3616]] */


  public static interface IScheduledBackupFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("0d8e45fa-631b-11f0-8f89-fba3b99d3616")
    public java.lang.String LogonAs();

    @IDynamicResourceExtension.MethodId("197c1747-688f-11f0-a9ba-bb94c358e981")
    public java.lang.String ShareName();

  }
  
  public static interface IScheduledBackupFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ScheduledBackupFunctionsImpl implements IScheduledBackupFunctionsImpl {

    public static final IScheduledBackupFunctionsImpl INSTANCE = new ScheduledBackupFunctionsImpl();

    private ScheduledBackupFunctionsImpl() {}

  }
  
  public static class ScheduledBackupFunctions {

    private ScheduledBackupFunctions() {}

  }

  public static interface IShareAccessFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("9aa40e22-688f-11f0-a9ba-bb94c358e981")
    public java.lang.Boolean IsCluster();

    @IDynamicResourceExtension.MethodId("c1c65cf1-688f-11f0-a9ba-bb94c358e981")
    public java.lang.Boolean IsMember();

  }
  
  public static interface IShareAccessFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("9aa40e22-688f-11f0-a9ba-bb94c358e981")
    public java.lang.Boolean IsCluster(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.javamodel.IShareAccess shareAccess);

    @IDynamicResourceExtension.MethodId("c1c65cf1-688f-11f0-a9ba-bb94c358e981")
    public java.lang.Boolean IsMember(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.javamodel.IShareAccess shareAccess);

  }
  
  public static class ShareAccessFunctionsImpl implements IShareAccessFunctionsImpl {

    public static final IShareAccessFunctionsImpl INSTANCE = new ShareAccessFunctionsImpl();

    private ShareAccessFunctionsImpl() {}

    @Override
    public java.lang.Boolean IsCluster(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.javamodel.IShareAccess shareAccess) {
      return shareAccess.isCluster();
    }

    @Override
    public java.lang.Boolean IsMember(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.javamodel.IShareAccess shareAccess) {
      return shareAccess.isMember();
    }

  }
  
  public static class ShareAccessFunctions {

    private ShareAccessFunctions() {}

    public static java.lang.Boolean IsCluster(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.javamodel.IShareAccess shareAccess) {
      return DynamicResourceUtil.invoke(IShareAccessFunctionsImpl.class, ShareAccessFunctionsImpl.INSTANCE, shareAccess).IsCluster(shareAccess);
    }

    public static java.lang.Boolean IsMember(final cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_backup.javamodel.IShareAccess shareAccess) {
      return DynamicResourceUtil.invoke(IShareAccessFunctionsImpl.class, ShareAccessFunctionsImpl.INSTANCE, shareAccess).IsMember(shareAccess);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,0a84893c-631b-11f0-8f89-fba3b99d3616,nZs7kMoYFwc0tEHnPSBibQwFQeE=] */
