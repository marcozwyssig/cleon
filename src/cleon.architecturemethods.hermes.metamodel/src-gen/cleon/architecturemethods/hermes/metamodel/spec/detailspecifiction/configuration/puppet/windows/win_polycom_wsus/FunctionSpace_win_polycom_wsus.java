package cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[c861f839-8a6c-11f0-af5e-cd5d044ab02b,imports]] */

/* End Protected Region   [[c861f839-8a6c-11f0-af5e-cd5d044ab02b,imports]] */

public class FunctionSpace_win_polycom_wsus {

  /* Begin Protected Region [[c861f839-8a6c-11f0-af5e-cd5d044ab02b]] */
  
  /* End Protected Region   [[c861f839-8a6c-11f0-af5e-cd5d044ab02b]] */


  public static interface IKBFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("fbbf6254-8a6c-11f0-af5e-cd5d044ab02b")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Uninstall();

    @IDynamicResourceExtension.MethodId("27405085-8a6d-11f0-af5e-cd5d044ab02b")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> NotApproved();

    @IDynamicResourceExtension.MethodId("2e2dd87f-8a6d-11f0-af5e-cd5d044ab02b")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Denied();

    @IDynamicResourceExtension.MethodId("34ad5bea-8a6d-11f0-af5e-cd5d044ab02b")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Install();

  }
  
  public static interface IKBFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("fbbf6254-8a6c-11f0-af5e-cd5d044ab02b")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Uninstall(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList);

    @IDynamicResourceExtension.MethodId("27405085-8a6d-11f0-af5e-cd5d044ab02b")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> NotApproved(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList);

    @IDynamicResourceExtension.MethodId("2e2dd87f-8a6d-11f0-af5e-cd5d044ab02b")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Denied(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList);

    @IDynamicResourceExtension.MethodId("34ad5bea-8a6d-11f0-af5e-cd5d044ab02b")
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Install(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList);

  }
  
  public static class KBFunctionsImpl implements IKBFunctionsImpl {

    public static final IKBFunctionsImpl INSTANCE = new KBFunctionsImpl();

    private KBFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Uninstall(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList) {
      return kBList.stream().filter(x -> x.selectCommand().isUninstall()).toList();
    }

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> NotApproved(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList) {
      return kBList.stream().filter(x -> x.selectCommand().isNotApproved()).toList();
    }

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Denied(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList) {
      return kBList.stream().filter(x -> x.selectCommand().isDenied()).toList();
    }

    @Override
    public List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Install(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList) {
      return kBList.stream().filter(x -> x.selectCommand().isInstall()).toList();
    }

  }
  
  public static class KBFunctions {

    private KBFunctions() {}

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Uninstall(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList) {
      return DynamicResourceUtil.invoke(IKBFunctionsImpl.class, KBFunctionsImpl.INSTANCE, kBList).Uninstall(kBList);
    }

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> NotApproved(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList) {
      return DynamicResourceUtil.invoke(IKBFunctionsImpl.class, KBFunctionsImpl.INSTANCE, kBList).NotApproved(kBList);
    }

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Denied(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList) {
      return DynamicResourceUtil.invoke(IKBFunctionsImpl.class, KBFunctionsImpl.INSTANCE, kBList).Denied(kBList);
    }

    public static List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> Install(final List<cleon.architecturemethods.hermes.metamodel.spec.detailspecifiction.configuration.puppet.windows.win_polycom_wsus.javamodel.IKB> kBList) {
      return DynamicResourceUtil.invoke(IKBFunctionsImpl.class, KBFunctionsImpl.INSTANCE, kBList).Install(kBList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,c861f839-8a6c-11f0-af5e-cd5d044ab02b,uwOpfgAhMCli6A2PAxDCLoR7x+I=] */
