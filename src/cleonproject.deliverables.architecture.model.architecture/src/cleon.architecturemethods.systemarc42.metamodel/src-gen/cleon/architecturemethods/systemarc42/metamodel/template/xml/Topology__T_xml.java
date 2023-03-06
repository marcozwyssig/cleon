package cleon.architecturemethods.systemarc42.metamodel.template.xml;

import ch.actifsource.util.Assert;
import java.util.List;
import ch.actifsource.core.dynamic.DynamicResourceUtil;
import ch.actifsource.core.dynamic.IDynamicResourceExtension;
import ch.actifsource.core.dynamic.IDynamicResourceExtensionJavaImpl;
import ch.actifsource.core.selector.typesystem.JavaFunctionUtil;

/* Begin Protected Region [[f140501e-ca57-11e9-83b0-559396620907,imports]] */
import cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IApplication;
import java.util.stream.Collectors;
/* End Protected Region   [[f140501e-ca57-11e9-83b0-559396620907,imports]] */

public class Topology__T_xml {

  /* Begin Protected Region [[f140501e-ca57-11e9-83b0-559396620907]] */

  /* End Protected Region   [[f140501e-ca57-11e9-83b0-559396620907]] */


  public static interface IAbstractHostFunctions extends IDynamicResourceExtension {

    @IDynamicResourceExtension.MethodId("531a3d99-a5cd-11ec-9968-b970a72504b8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> NoApplications();

    @IDynamicResourceExtension.MethodId("104650c1-b298-11ed-82e1-97f8ff4d3f62")
    public java.lang.String Hosts();

  }
  
  public static interface IAbstractHostFunctionsImpl extends IDynamicResourceExtensionJavaImpl {
    
    @IDynamicResourceExtension.MethodId("531a3d99-a5cd-11ec-9968-b970a72504b8")
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> NoApplications(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList);

  }
  
  public static class AbstractHostFunctionsImpl implements IAbstractHostFunctionsImpl {

    public static final IAbstractHostFunctionsImpl INSTANCE = new AbstractHostFunctionsImpl();

    private AbstractHostFunctionsImpl() {}

    @Override
    public List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> NoApplications(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      /* Begin Protected Region [[531a3d99-a5cd-11ec-9968-b970a72504b8]] */
      return abstractHostList.stream().filter( x -> !(x instanceof IApplication)).collect(Collectors.toList());
      /* End Protected Region   [[531a3d99-a5cd-11ec-9968-b970a72504b8]] */
    }

  }
  
  public static class AbstractHostFunctions {

    private AbstractHostFunctions() {}

    public static List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> NoApplications(final List<cleon.architecturemethods.systemarc42.metamodel.spec._08_concepts.topology.javamodel.IAbstractHost> abstractHostList) {
      return DynamicResourceUtil.invoke(IAbstractHostFunctionsImpl.class, AbstractHostFunctionsImpl.INSTANCE, abstractHostList).NoApplications(abstractHostList);
    }

  }

}

/* Actifsource ID=[5349246f-db37-11de-82b8-17be2e034a3b,f140501e-ca57-11e9-83b0-559396620907,gGqEnNqVc8Um71WS0p4J1I5wNe0=] */
