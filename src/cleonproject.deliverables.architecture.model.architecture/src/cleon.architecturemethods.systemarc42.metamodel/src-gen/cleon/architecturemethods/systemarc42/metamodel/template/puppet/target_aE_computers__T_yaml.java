package cleon.architecturemethods.systemarc42.metamodel.template.puppet;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[bfff7c17-c3fc-11ed-a679-b5536fa2b4b3,imports]] */

/* End Protected Region   [[bfff7c17-c3fc-11ed-a679-b5536fa2b4b3,imports]] */

public class target_aE_computers__T_yaml {

  /* Begin Protected Region [[bfff7c17-c3fc-11ed-a679-b5536fa2b4b3]] */
  
  /* End Protected Region   [[bfff7c17-c3fc-11ed-a679-b5536fa2b4b3]] */


  public static interface IAbstractHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfff7c19-c3fc-11ed-a679-b5536fa2b4b3")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyMonitored();

    @IDynamicResourceExtension.MethodId("bfff7c26-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String GetPath();

    @IDynamicResourceExtension.MethodId("bfff7c2a-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String RenderToText(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site);

    @IDynamicResourceExtension.MethodId("bfff7c2c-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String Entry();

    @IDynamicResourceExtension.MethodId("bfff7c33-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String SimpleName();

  }
  
  public static interface IAbstractHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bfff7c19-c3fc-11ed-a679-b5536fa2b4b3")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyMonitored(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList);

    @IDynamicResourceExtension.MethodId("bfff7c2a-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String RenderToText(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList);

  }
  
  public static class AbstractHostFunctionsImpl implements IAbstractHostFunctionsImpl {

    public static final IAbstractHostFunctionsImpl INSTANCE = new AbstractHostFunctionsImpl();

    private AbstractHostFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyMonitored(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      /* Begin Protected Region [[bfff7c19-c3fc-11ed-a679-b5536fa2b4b3]] */
      // XXX implement template function here   
      /* End Protected Region   [[bfff7c19-c3fc-11ed-a679-b5536fa2b4b3]] */
    }

    @Override
    public java.lang.String RenderToText(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      /* Begin Protected Region [[bfff7c2a-c3fc-11ed-a679-b5536fa2b4b3]] */
      // XXX implement template function here   
      /* End Protected Region   [[bfff7c2a-c3fc-11ed-a679-b5536fa2b4b3]] */
    }

  }
  
  public static class AbstractHostFunctions {

    private AbstractHostFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> OnlyMonitored(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHostList).OnlyMonitored(abstractHostList);
    }

    public static java.lang.String RenderToText(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite site, final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHostList).RenderToText(site, abstractHostList);
    }

  }

  public static interface IAbstractComponentFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfff7c4a-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String GetPath();

  }
  
  public static interface IAbstractComponentFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractComponentFunctionsImpl implements IAbstractComponentFunctionsImpl {

    public static final IAbstractComponentFunctionsImpl INSTANCE = new AbstractComponentFunctionsImpl();

    private AbstractComponentFunctionsImpl() {}

  }
  
  public static class AbstractComponentFunctions {

    private AbstractComponentFunctions() {}

  }

  public static interface IAbstractSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfff7c4d-c3fc-11ed-a679-b5536fa2b4b3")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> OnlyToGenerate();

    @IDynamicResourceExtension.MethodId("bfff7c51-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host);

  }
  
  public static interface IAbstractSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bfff7c4d-c3fc-11ed-a679-b5536fa2b4b3")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> OnlyToGenerate(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList);

    @IDynamicResourceExtension.MethodId("bfff7c51-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite);

  }
  
  public static class AbstractSiteFunctionsImpl implements IAbstractSiteFunctionsImpl {

    public static final IAbstractSiteFunctionsImpl INSTANCE = new AbstractSiteFunctionsImpl();

    private AbstractSiteFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> OnlyToGenerate(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList) {
      /* Begin Protected Region [[bfff7c4d-c3fc-11ed-a679-b5536fa2b4b3]] */
      // XXX implement template function here   
      /* End Protected Region   [[bfff7c4d-c3fc-11ed-a679-b5536fa2b4b3]] */
    }

    @Override
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite) {
      /* Begin Protected Region [[bfff7c51-c3fc-11ed-a679-b5536fa2b4b3]] */
      // XXX implement template function here   
      /* End Protected Region   [[bfff7c51-c3fc-11ed-a679-b5536fa2b4b3]] */
    }

  }
  
  public static class AbstractSiteFunctions {

    private AbstractSiteFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> OnlyToGenerate(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite> abstractSiteList) {
      return DynamicResourceUtil.invoke(IAbstractSiteFunctionsImpl.class, AbstractSiteFunctionsImpl.INSTANCE, abstractSiteList).OnlyToGenerate(abstractSiteList);
    }

    public static java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractSite abstractSite) {
      return DynamicResourceUtil.invoke(IAbstractSiteFunctionsImpl.class, AbstractSiteFunctionsImpl.INSTANCE, abstractSite).GetProbeName(host, abstractSite);
    }

  }

  public static interface IAbstractSingleHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfff7c60-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String Entry();

  }
  
  public static interface IAbstractSingleHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class AbstractSingleHostFunctionsImpl implements IAbstractSingleHostFunctionsImpl {

    public static final IAbstractSingleHostFunctionsImpl INSTANCE = new AbstractSingleHostFunctionsImpl();

    private AbstractSingleHostFunctionsImpl() {}

  }
  
  public static class AbstractSingleHostFunctions {

    private AbstractSingleHostFunctions() {}

  }

  public static interface IClusterHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfff7c6f-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String Entry();

  }
  
  public static interface IClusterHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
  }
  
  public static class ClusterHostFunctionsImpl implements IClusterHostFunctionsImpl {

    public static final IClusterHostFunctionsImpl INSTANCE = new ClusterHostFunctionsImpl();

    private ClusterHostFunctionsImpl() {}

  }
  
  public static class ClusterHostFunctions {

    private ClusterHostFunctions() {}

  }

  public static interface IAbstractClusterHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfff7c72-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String Entry();

  }
  
  public static interface IAbstractClusterHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bfff7c72-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String Entry(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractClusterHost abstractClusterHost);

  }
  
  public static class AbstractClusterHostFunctionsImpl implements IAbstractClusterHostFunctionsImpl {

    public static final IAbstractClusterHostFunctionsImpl INSTANCE = new AbstractClusterHostFunctionsImpl();

    private AbstractClusterHostFunctionsImpl() {}

    @Override
    public java.lang.String Entry(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractClusterHost abstractClusterHost) {
      return null;
    }

  }
  
  public static class AbstractClusterHostFunctions {

    private AbstractClusterHostFunctions() {}

    public static java.lang.String Entry(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractClusterHost abstractClusterHost) {
      return DynamicResourceUtil.invoke(IAbstractClusterHostFunctionsImpl.class, AbstractClusterHostFunctionsImpl.INSTANCE, abstractClusterHost).Entry(abstractClusterHost);
    }

  }

  public static interface ICentralSiteFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfff7c77-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host);

  }
  
  public static interface ICentralSiteFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bfff7c77-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ICentralSite centralSite);

  }
  
  public static class CentralSiteFunctionsImpl implements ICentralSiteFunctionsImpl {

    public static final ICentralSiteFunctionsImpl INSTANCE = new CentralSiteFunctionsImpl();

    private CentralSiteFunctionsImpl() {}

    @Override
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ICentralSite centralSite) {
      /* Begin Protected Region [[bfff7c77-c3fc-11ed-a679-b5536fa2b4b3]] */
      // XXX implement template function here   
      /* End Protected Region   [[bfff7c77-c3fc-11ed-a679-b5536fa2b4b3]] */
    }

  }
  
  public static class CentralSiteFunctions {

    private CentralSiteFunctions() {}

    public static java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ICentralSite centralSite) {
      return DynamicResourceUtil.invoke(ICentralSiteFunctionsImpl.class, CentralSiteFunctionsImpl.INSTANCE, centralSite).GetProbeName(host, centralSite);
    }

  }

  public static interface IMulti_TNFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfff7c7c-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host);

  }
  
  public static interface IMulti_TNFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bfff7c7c-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IMulti_TN multi_TN);

  }
  
  public static class Multi_TNFunctionsImpl implements IMulti_TNFunctionsImpl {

    public static final IMulti_TNFunctionsImpl INSTANCE = new Multi_TNFunctionsImpl();

    private Multi_TNFunctionsImpl() {}

    @Override
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IMulti_TN multi_TN) {
      /* Begin Protected Region [[bfff7c7c-c3fc-11ed-a679-b5536fa2b4b3]] */
      // XXX implement template function here   
      /* End Protected Region   [[bfff7c7c-c3fc-11ed-a679-b5536fa2b4b3]] */
    }

  }
  
  public static class Multi_TNFunctions {

    private Multi_TNFunctions() {}

    public static java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IMulti_TN multi_TN) {
      return DynamicResourceUtil.invoke(IMulti_TNFunctionsImpl.class, Multi_TNFunctionsImpl.INSTANCE, multi_TN).GetProbeName(host, multi_TN);
    }

  }

  public static interface ITNFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfff7c81-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host);

  }
  
  public static interface ITNFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bfff7c81-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITN tN);

  }
  
  public static class TNFunctionsImpl implements ITNFunctionsImpl {

    public static final ITNFunctionsImpl INSTANCE = new TNFunctionsImpl();

    private TNFunctionsImpl() {}

    @Override
    public java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITN tN) {
      /* Begin Protected Region [[bfff7c81-c3fc-11ed-a679-b5536fa2b4b3]] */
      // XXX implement template function here   
      /* End Protected Region   [[bfff7c81-c3fc-11ed-a679-b5536fa2b4b3]] */
    }

  }
  
  public static class TNFunctions {

    private TNFunctions() {}

    public static java.lang.String GetProbeName(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost host, final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.ITN tN) {
      return DynamicResourceUtil.invoke(ITNFunctionsImpl.class, TNFunctionsImpl.INSTANCE, tN).GetProbeName(host, tN);
    }

  }

  public static interface IApplicationFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("bfff7c84-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String Entry();

  }
  
  public static interface IApplicationFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("bfff7c84-c3fc-11ed-a679-b5536fa2b4b3")
    public java.lang.String Entry(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IApplication application);

  }
  
  public static class ApplicationFunctionsImpl implements IApplicationFunctionsImpl {

    public static final IApplicationFunctionsImpl INSTANCE = new ApplicationFunctionsImpl();

    private ApplicationFunctionsImpl() {}

    @Override
    public java.lang.String Entry(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IApplication application) {
      return null;
    }

  }
  
  public static class ApplicationFunctions {

    private ApplicationFunctions() {}

    public static java.lang.String Entry(final cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IApplication application) {
      return DynamicResourceUtil.invoke(IApplicationFunctionsImpl.class, ApplicationFunctionsImpl.INSTANCE, application).Entry(application);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,bfff7c17-c3fc-11ed-a679-b5536fa2b4b3,Tv9sxNyVAMSLiBwz+AWjqdS/Gjg=] */
